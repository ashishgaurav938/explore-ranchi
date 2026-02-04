package com.exploreranchi.explore_ranchi.repository;

import com.exploreranchi.explore_ranchi.model.PlaceSuggestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaceSuggestionRepository
        extends JpaRepository<PlaceSuggestion, Long> {

    List<PlaceSuggestion> findByStatusOrderByCreatedAtDesc(String status);

}
