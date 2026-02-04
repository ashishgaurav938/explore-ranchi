package com.exploreranchi.explore_ranchi.model;

public enum Category {
    WATERFALL("Waterfalls"),
    GARDEN("Gardens"),
    TEMPLE("Temples"),
    NATURE_VIEWS("Nature & Views");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
