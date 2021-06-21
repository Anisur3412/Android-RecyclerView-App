package com.example.recycalerviewapp;

public class ModelClass {
    private String textView,textView2;
    private  int imgss;



    public ModelClass(String textView, String textView2, int imgss) {
        this.textView = textView;
        this.textView2 = textView2;
        this.imgss = imgss;
    }

    public String getTextView() {
        return textView;
    }

    public void setTextView(String textView) {
        this.textView = textView;
    }

    public String getTextView2() {
        return textView2;
    }

    public void setTextView2(String textView2) {
        this.textView2 = textView2;
    }

    public int getImgss() {
        return imgss;
    }

    public void setImgss(int imgss) {
        this.imgss = imgss;
    }
}
