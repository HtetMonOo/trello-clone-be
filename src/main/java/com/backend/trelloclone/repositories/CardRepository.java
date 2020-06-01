package com.backend.trelloclone.repositories;

import com.backend.trelloclone.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
