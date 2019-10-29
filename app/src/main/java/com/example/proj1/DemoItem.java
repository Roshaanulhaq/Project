package com.example.proj1;

public class DemoItem {
    private String Name;
    private int img;
    private String review;
    public DemoItem(String Name,String review,int img) {
        this.Name = Name;
        this.review=review;
        this.img=img;
    }

    public int getphoto()
    {
        return img;
    }
    public String getName(){return Name;}
    public String getReview(){return review;}


}


