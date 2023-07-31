package com.manager.smartcontactmanager.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String nickName;
    private String phone;
    private String email;
    private String work;
    private String about;
    private String profileUrl;
    
    @ManyToOne
    private User user;

    public Contact() {
    }
    public Contact(int id, String name, String nickName, String phone, String email, String work, String about,
            String profileUrl) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.phone = phone;
        this.email = email;
        this.work = work;
        this.about = about;
        this.profileUrl = profileUrl;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }
    public String getAbout() {
        return about;
    }
    public void setAbout(String about) {
        this.about = about;
    }
    public String getProfileUrl() {
        return profileUrl;
    }
    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    @Override
    public String toString() {
        return "Contact [id=" + id + ", name=" + name + ", nickName=" + nickName + ", phone=" + phone + ", email="
                + email + ", work=" + work + ", about=" + about + ", profileUrl=" + profileUrl + "]";
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
