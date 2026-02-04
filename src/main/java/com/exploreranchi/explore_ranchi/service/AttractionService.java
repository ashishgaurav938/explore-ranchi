package com.exploreranchi.explore_ranchi.service;

import com.exploreranchi.explore_ranchi.exception.AttractionNotFoundException;
import com.exploreranchi.explore_ranchi.model.Attraction;
import com.exploreranchi.explore_ranchi.repository.AttractionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AttractionService {

    private final AttractionRepository repository;

    public AttractionService(AttractionRepository repository) {
        this.repository = repository;
    }

    public Optional<Attraction> getAttractionById(Integer id) {
        return repository.findById(id);
    }

    public List<Attraction> getAllAttractions() {
        return repository.findAll();
    }

    public List<Attraction> search(String keyword) {
        return repository.findByNameContainingIgnoreCase(keyword);
    }

    public List<Attraction> filterByCategory(String category) {
        return repository.findByCategoryIgnoreCase(category);
    }

    public List<Attraction> search(String keyword, String category) {

        boolean hasKeyword = keyword != null && !keyword.isBlank();
        boolean hasCategory = category != null && !category.isBlank();

        if (hasKeyword && hasCategory) {
            return repository
                    .findByNameContainingIgnoreCaseAndCategoryIgnoreCase(
                            keyword, category
                    );
        }

        if (hasKeyword) {
            return repository.findByNameContainingIgnoreCase(keyword);
        }

        if (hasCategory) {
            return repository.findByCategoryIgnoreCase(category);
        }

        return repository.findAll();
    }

    public List<Attraction> getMostVisitedAttractions() {
        return repository.findByMostVisitedTrue();
    }

    public Attraction getBySlug(String slug) {
        return repository.findBySlug(slug)
                .orElseThrow(() -> new RuntimeException("Attraction not found"));
    }
}


