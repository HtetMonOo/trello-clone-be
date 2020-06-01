package com.backend.trelloclone.controllers;

import com.backend.trelloclone.models.Account;
import com.backend.trelloclone.models.Card;
import com.backend.trelloclone.repositories.AccountRepository;
import com.backend.trelloclone.repositories.CardRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1/cards")
public class CardController {
//    @Autowired
//    private CardRepository cardRepository;
//
//    @Autowired
//    private AccountRepository accountRepository;
//
//    @GetMapping
//    public List<Card> List(){
//        return cardRepository.findAll();
//    }

//    @GetMapping
//    @RequestMapping("{id}")
//    public Card get(@PathVariable Long id){
//        return cardRepository.getOne(id);
//    }
//
//    @PostMapping
//    public Card create(@RequestBody final Card card){
//        return cardRepository.saveAndFlush(card);
//    }
//
//    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
//    public void delete(@PathVariable Long id){
//        cardRepository.deleteById(id);
//    }
//
//    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
//    public Card update(@PathVariable Long id, @RequestBody Card card){
//        Card existingCard = cardRepository.getOne(id);
//        BeanUtils.copyProperties(card, existingCard, "id","position","status");
//        return cardRepository.saveAndFlush(existingCard);
//    }
//
//    @PostMapping(value = "add-member")
//    public Card addMember(@RequestBody Map<String, Object> payload){
//        Card card = cardRepository.getOne(Long.parseLong(payload.get("accountUsername").toString()));
//        List<Account> members = card.getMembers();
//        if(members == null){
//            members = new ArrayList<>();
//        }
//        members.add(accountRepository.getOne(Long.parseLong(payload.get("accountUsername").toString())));
//        card.setMembers(members);
//        return cardRepository.saveAndFlush(card);
//    }
}
