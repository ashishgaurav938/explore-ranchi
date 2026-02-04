package com.exploreranchi.explore_ranchi.repository;

import com.exploreranchi.explore_ranchi.model.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AttractionRepository extends JpaRepository<Attraction, Integer> {

    List<Attraction> findByNameContainingIgnoreCase(String keyword);

    List<Attraction> findByCategoryIgnoreCase(String category);

    List<Attraction> findByNameContainingIgnoreCaseAndCategoryIgnoreCase(
            String keyword, String category);
    List<Attraction> findByMostVisitedTrue();

    boolean existsByNameIgnoreCase(String name);

    Optional<Attraction> findBySlug(String slug);

}
