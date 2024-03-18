/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Product {
        public int id ; 
        public String name ; 
        public int price ; 
        public String description ; 
        public String image ; 
        public int cateid ; 
        public int invenpro ; 
        public int soldpro ; 
        public int status ; 
        public String reviewid ; 

    public Product() {
    }

    public Product(int id, String name, int price, String description, String image, int cateid, int invenpro, int soldpro, int status, String reviewid) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
        this.cateid = cateid;
        this.invenpro = invenpro;
        this.soldpro = soldpro;
        this.status = status;
        this.reviewid = reviewid;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCateid() {
        return cateid;
    }

    public void setCateid(int cateid) {
        this.cateid = cateid;
    }

    public int getInvenpro() {
        return invenpro;
    }

    public void setInvenpro(int invenpro) {
        this.invenpro = invenpro;
    }

    public int getSoldpro() {
        return soldpro;
    }

    public void setSoldpro(int soldpro) {
        this.soldpro = soldpro;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReviewid() {
        return reviewid;
    }

    public void setReviewid(String reviewid) {
        this.reviewid = reviewid;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + ", image=" + image + ", cateid=" + cateid + ", invenpro=" + invenpro + ", soldpro=" + soldpro + ", status=" + status + ", reviewid=" + reviewid + '}';
    }
        
        
}

