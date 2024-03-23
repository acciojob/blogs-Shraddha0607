package com.driver.models;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
public class Blog{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer blogId;
    private String title;
    private String content;
    private LocalTime time;

    @JoinColumn
    @ManyToOne
    private User user;

    public Blog() {
    }

    public Blog(String title, String content, User user) {
        this.title = title;
        this.content = content;
        this.time = LocalTime.now();
        this.user = user;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalTime getTime() {
        return time;
    }

    public User getUser() {
        return user;
    }
}
