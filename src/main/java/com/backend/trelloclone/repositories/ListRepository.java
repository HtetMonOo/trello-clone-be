package com.backend.trelloclone.repositories;

import com.backend.trelloclone.models.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<List, Long> {
    public java.util.List<List> findByPositionGreaterThanEqual(Integer position);
    public java.util.List<List> findByTitleContaining(String searchTerm);

}
