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
public class Invoice {
    int invoiceID ; 
    int accountID ; 
    Date orderDate ; 
    String address ; 
    int totalPrice ; 
    int proID ; 
    int quantity ; 
    int status ; 

    public Invoice() {
    }

    public Invoice(int invoiceID, int accountID, Date orderDate, String address, int totalPrice, int proID, int quantity, int status) {
        this.invoiceID = invoiceID;
        this.accountID = accountID;
        this.orderDate = orderDate;
        this.address = address;
        this.totalPrice = totalPrice;
        this.proID = proID;
        this.quantity = quantity;
        this.status = status;
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getProID() {
        return proID;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Invoice{" + "invoiceID=" + invoiceID + ", accountID=" + accountID + ", orderDate=" + orderDate + ", address=" + address + ", totalPrice=" + totalPrice + ", proID=" + proID + ", quantity=" + quantity + ", status=" + status + '}';
    }
    
    
}
