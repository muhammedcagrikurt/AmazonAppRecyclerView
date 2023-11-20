package com.kurt.amazonapp.data.entity;

import java.util.List;

public class Kategori {
    private int id;
    private List<CardResim> cardResimList;

    public Kategori() {
    }

    public Kategori(int id, List<CardResim> cardResimList) {
        this.id = id;
        this.cardResimList = cardResimList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<CardResim> getCardResimList() {
        return cardResimList;
    }

    public void setCardResimList(List<CardResim> cardResimList) {
        this.cardResimList = cardResimList;
    }
}
