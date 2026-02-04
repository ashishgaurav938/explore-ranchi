package com.exploreranchi.explore_ranchi.exception;

public class AttractionNotFoundException
        extends RuntimeException {

    public AttractionNotFoundException(int id) {
        super("Attraction not found with id " + id);
    }
}
