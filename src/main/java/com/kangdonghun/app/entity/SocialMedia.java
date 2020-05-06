package com.kangdonghun.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// SocialMedia 클래스
@Entity
public class SocialMedia {
    @Id
    @GeneratedValue
    private Long id;
    private String github;
    private String twitter;

    public  SocialMedia(){
    }

    public  SocialMedia(String github, String twitter) {
        this.github = github;
        this.twitter = twitter;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public  String getGithub() { return  github; }

    public void setGithub() { this.github=github; }

    public  String getTwitter() { return  twitter; }

    public void setTwitter() { this.twitter=twitter; }
}