package com.backend.trelloclone.controllers;

import com.backend.trelloclone.models.Label;
import com.backend.trelloclone.repositories.LabelRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/labels")
public class LabelController {
    @Autowired
    LabelRepository labelRepository;

    @GetMapping
    public List<Label> getAll() {
        return labelRepository.findAll();
    }

    @GetMapping("{id}")
    public Label getById(@PathVariable Long id) {
        return labelRepository.getOne(id);
    }

    @PostMapping
    public Label create(@RequestBody Label label){
        return labelRepository.saveAndFlush(label);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Label update(@RequestBody Label label){
        Label old=labelRepository.getOne(label.getId());
        BeanUtils.copyProperties(label, old, "id");
        return labelRepository.saveAndFlush(old);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        labelRepository.deleteById(id);
    }
}
