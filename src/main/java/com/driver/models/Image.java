package com.driver.models;

import javax.persistence.*;
import java.util.Optional;

@Entity
public class Image{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private String dimensions;

    @JoinColumn
    @ManyToOne
    private Blog blog;

    public Image() {
    }

    public Image(String description, String dimensions, Optional<Blog> blog) {
    }

    public Image(String description, String dimensions, Blog blog) {
        this.description = description;
        this.dimensions = dimensions;
        this.blog = blog;
    }

    public Integer getImageId() {
        return id;
    }

    public void setImageId(Integer imageId) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}