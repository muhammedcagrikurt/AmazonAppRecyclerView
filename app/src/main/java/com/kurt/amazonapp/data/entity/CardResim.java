package com.kurt.amazonapp.data.entity;

public class CardResim {
    private  int id;
    private String resim;

    public CardResim() {
    }

    public CardResim(int id, String resim) {
        this.id = id;
        this.resim = resim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }
}
