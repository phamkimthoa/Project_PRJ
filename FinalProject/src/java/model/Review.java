/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Review {
    int reviewID ; 
    Date reviewDate ; 
    String reviewDetail ; 
    int accountID ; 

    public Review() {
    }

    public Review(int reviewID, Date reviewDate, String reviewDetail, int accountID) {
        this.reviewID = reviewID;
        this.reviewDate = reviewDate;
        this.reviewDetail = reviewDetail;
        this.accountID = accountID;
    }

    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getReviewDetail() {
        return reviewDetail;
    }

    public void setReviewDetail(String reviewDetail) {
        this.reviewDetail = reviewDetail;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    @Override
    public String toString() {
        return "Review{" + "reviewID=" + reviewID + ", reviewDate=" + reviewDate + ", reviewDetail=" + reviewDetail + ", accountID=" + accountID + '}';
    }
    
    
}
