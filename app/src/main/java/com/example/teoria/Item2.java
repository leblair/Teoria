package com.example.teoria;

public class Item2 {
    private int image;
    private String title;
    private String subtitle;
    private String price;

    public Item2(int image, String title, String subtitle, String price) {
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
