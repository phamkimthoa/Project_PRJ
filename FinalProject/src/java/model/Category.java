/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Category {
     int cateID ; 
     String cateName ; 

    public Category() {
    }

    public Category(int cateID, String cateName) {
        this.cateID = cateID;
        this.cateName = cateName;
    }

    public int getcateID() {
        return cateID;
    }

    public void setcateID(int cateID) {
        this.cateID = cateID;
    }

    public String getcateName() {
        return cateName;
    }

    public void setcateName(String cateName) {
        this.cateName = cateName;
    }

    @Override
    public String toString() {
        return "category{" + "cateID=" + cateID + ", cateName=" + cateName + '}';
    }
     
     
}
