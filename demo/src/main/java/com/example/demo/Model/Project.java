package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer id;
    private String title;
    private String description;
    private String githubLink;
    private String techStack;

    public Integer getId() { return id; } 
    public void setId(Integer id) { this.id = id; }   

    public String getTitle() { return title; }   
    public void setTitle(String title) { this.title = title; }   

    public String getDescription() { return description; }   
    public void setDescription(String description) { this.description = description; }   

    public String getGithubLink() { return githubLink; }   
    public void setGithubLink(String githubLink) { this.githubLink = githubLink; }   

    public String getTechStack() { return techStack; }   
    public void setTechStack(String techStack) { this.techStack = techStack; }   
}