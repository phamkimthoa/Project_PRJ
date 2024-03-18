/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Account {
    int accountID ; 
    String email ; 
    String password ;
    String accName ; 
    String accPhone ; 
    String accAdress ;
    int role ; 

    public Account() {
    }

    public Account(int accountID, String email, String password, String accName, String accPhone, String accAdress, int role) {
        this.accountID = accountID;
        this.email = email;
        this.password = password;
        this.accName = accName;
        this.accPhone = accPhone;
        this.accAdress = accAdress;
        this.role = role;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccPhone() {
        return accPhone;
    }

    public void setAccPhone(String accPhone) {
        this.accPhone = accPhone;
    }

    public String getAccAdress() {
        return accAdress;
    }

    public void setAccAdress(String accAdress) {
        this.accAdress = accAdress;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Account{" + "accountID=" + accountID + ", email=" + email + ", password=" + password + ", accName=" + accName + ", accPhone=" + accPhone + ", accAdress=" + accAdress + ", role=" + role + '}';
    }
    
    
}
