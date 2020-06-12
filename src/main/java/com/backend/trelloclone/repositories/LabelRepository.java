package com.backend.trelloclone.repositories;

import com.backend.trelloclone.models.Label;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabelRepository extends JpaRepository<Label, Long> {
}
