package com.example.uas_piksi_2020;

public class Users {
    String title;
    int photo;
    String date;

    public Users(String title, String date, int photo) {
        this.title = title;
        this.photo = photo;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
