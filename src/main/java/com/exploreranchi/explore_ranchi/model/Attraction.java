package com.exploreranchi.explore_ranchi.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "attraction")
public class Attraction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(length = 1000)
    private String description;

    private String category;

    private String coverImage;
    @Column(name = "most_visited")
    private boolean mostVisited;


    @ElementCollection
    @CollectionTable(
            name = "attraction_images",
            joinColumns = @JoinColumn(name = "attraction_id")
    )
    @Column(name = "image_url")
    private List<String> images;

    private String mapUrl;

    @Column(length = 500)
    private String funFact;

    public String getSlug() {
        return slug;
    }

    @Column(unique = true, nullable = false)
    private String slug;

    // ✅ REQUIRED by JPA
    public Attraction() {}

    // ✅ SAFE constructor (NO ID)
    public Attraction(
            String name,
            String description,
            String category,
            String coverImage,
            List<String> images,
            String mapUrl,
            String funFact
    ) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.coverImage = coverImage;
        this.images = images;
        this.mapUrl = mapUrl;
        this.funFact = funFact;
    }

    // GETTERS ONLY
    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public String getCoverImage() { return coverImage; }
    public List<String> getImages() { return images; }
    public String getMapUrl() { return mapUrl; }
    public String getFunFact() { return funFact; }
    public boolean isMostVisited() {
        return mostVisited;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setMostVisited(boolean mostVisited) {
        this.mostVisited = mostVisited;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }

    public void setFunFact(String funFact) {
        this.funFact = funFact;
    }

    @PrePersist
    @PreUpdate
    private void generateSlug() {
        this.slug = name.toLowerCase()
                .replaceAll("[^a-z0-9]+", "-")
                .replaceAll("(^-|-$)", "");
    }
}

