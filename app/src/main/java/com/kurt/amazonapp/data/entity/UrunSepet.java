package com.kurt.amazonapp.data.entity;

public class UrunSepet {
    private  int id;
    private String ad;
    private String fiyat;
    private String resim;

    public UrunSepet() {
    }

    public UrunSepet(int id, String ad, String fiyat, String resim) {
        this.id = id;
        this.ad = ad;
        this.fiyat = fiyat;
        this.resim = resim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }
}
