package com.backend.trelloclone.repositories;

import com.backend.trelloclone.models.Checklist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChecklistRepository extends JpaRepository<Checklist, Long> {
    public java.util.List<Checklist> findByCardId(Long cardId);
    public Long deleteByCardId(Long cardId);
}
