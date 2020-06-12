package com.backend.trelloclone.controllers;

import com.backend.trelloclone.models.Checklist;
import com.backend.trelloclone.repositories.ChecklistRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/checklists")
public class ChecklistController {
    @Autowired
    ChecklistRepository checklistRepository;

    @PostMapping
    public Checklist create(@RequestBody Checklist checklist){
        return checklistRepository.saveAndFlush(checklist);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        checklistRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Checklist update(@RequestBody Checklist checklist){
        Checklist old = checklistRepository.getOne(checklist.getId());
        BeanUtils.copyProperties(checklist, old, "id", "cardId", "position", "title");
        return checklistRepository.saveAndFlush(old);
    }

    @GetMapping("{card_id}")
    public List<Checklist> getByCardId(@PathVariable Long card_id){
        return checklistRepository.findByCardId(card_id);
    }

    @PostMapping("{card_id}")
    public List<Checklist> createAll(@RequestBody List<Checklist> checklists){
        return checklistRepository.saveAll(checklists);
    }
}
