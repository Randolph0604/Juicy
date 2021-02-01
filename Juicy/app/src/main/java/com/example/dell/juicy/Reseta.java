package com.example.dell.juicy;

public class Reseta {

    private String Tittle;
    private String Category;
    private String Description;
    private int Thumbanail;
    public String link_conect="";

    public Reseta(String tittle, String category, String description, int thumbanail,  String linkconected) {
        Tittle = tittle;
        Category = category;
        Description = description;
        Thumbanail = thumbanail;
        link_conect=linkconected;
    }

    public Reseta() {


    }

    public  String getLink_conect() {
        return link_conect;
    }

    public void setLink_conect(String link_conect) {
        this.link_conect = link_conect;
    }

    public String getTittle() {
        return Tittle;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbanail() {
        return Thumbanail;
    }

    public void setTittle(String tittle) {
        Tittle = tittle;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbanail(int thumbanail) {
        Thumbanail = thumbanail;
    }
}
