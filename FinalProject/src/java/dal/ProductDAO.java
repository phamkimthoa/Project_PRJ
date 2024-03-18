/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dal;

import model.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.Category;
import model.Invoice;
import model.Review;

/**
 *
 * @author Lenovo
 */
public class ProductDAO extends  DBContext {

    /**
     * @param args the command line arguments
     */
    // ham doc du lieu tu sql 
    PreparedStatement stm;
    ResultSet rs;
   

    public List<Product> getAll() {
         List<Product> list = new ArrayList<>();
        try {
            String strSelect = "select * from Product";
            stm = connection.prepareStatement(strSelect);
            rs = stm.executeQuery();
            while (rs.next()) {
                Product pr = new Product(rs.getInt("ProductID"), rs.getString("Name"), rs.getInt("Price"), rs.getString("Description"),rs.getString("Image"),rs.getInt("CategoryID"),rs.getInt("Inventoryproduct"),rs.getInt("Soldproduct"),rs.getInt("Status"),rs.getString("ReviewId"));
                list.add(pr);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
public List<Product> getProductByCID(String cid) {
         List<Product> list = new ArrayList<>();
        try {
            String strSelect = "select * from Product\n" +
"where CategoryID = ? ";
            stm = connection.prepareStatement(strSelect);
            stm.setString(1, cid);
            rs = stm.executeQuery();
            while (rs.next()) {
                Product pr = new Product(rs.getInt("ProductID"), rs.getString("Name"), rs.getInt("Price"), rs.getString("Description"),rs.getString("Image"),rs.getInt("CategoryID"),rs.getInt("Inventoryproduct"),rs.getInt("Soldproduct"),rs.getInt("Status"),rs.getString("ReviewId"));
                list.add(pr);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

public Product getProductByPID(String pid) {
        
        try {
            String strSelect = "select * from Product\n" +
"where ProductID = ? ";
            stm = connection.prepareStatement(strSelect);
            stm.setString(1, pid);
            rs = stm.executeQuery();
            while (rs.next()) {
                Product pr = new Product(rs.getInt("ProductID"), rs.getString("Name"), rs.getInt("Price"), rs.getString("Description"),rs.getString("Image"),rs.getInt("CategoryID"),rs.getInt("Inventoryproduct"),rs.getInt("Soldproduct"),rs.getInt("Status"),rs.getString("ReviewId"));
               return pr ; 
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

public List<Product> searchByName (String txtSearch) {
         List<Product> list = new ArrayList<>();
        try {
            String strSelect = "select * from Product \n" +
"where [name] like ?";
            stm = connection.prepareStatement(strSelect);
            stm.setString(1, "%"+txtSearch+"%");
            rs = stm.executeQuery();
            while (rs.next()) {
                Product pr = new Product(rs.getInt("ProductID"), rs.getString("Name"), rs.getInt("Price"), rs.getString("Description"),rs.getString("Image"),rs.getInt("CategoryID"),rs.getInt("Inventoryproduct"),rs.getInt("Soldproduct"),rs.getInt("Status"),rs.getString("ReviewId"));
                list.add(pr);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
       public List<Category> getAllCategory() {
            List<Category> listCate = new ArrayList<>();
        try {
            String strSelect = "select * from Category";
            stm = connection.prepareStatement(strSelect);
            rs = stm.executeQuery();
            while (rs.next()) {
                Category pr = new Category(rs.getInt("CategoryID"), rs.getString("Name"));
                listCate.add(pr);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return listCate;
    }
       
       public Product getLast() {
    Product pr = null; // Khởi tạo biến pr ở ngoài vòng lặp
    try {
        String strSelect = "SELECT TOP 1 * FROM Product ORDER BY ProductID DESC";
        stm = connection.prepareStatement(strSelect);
        rs = stm.executeQuery();
        while (rs.next()) {
            // Gán giá trị cho biến pr trong vòng lặp
            pr = new Product(rs.getInt("ProductID"), rs.getString("Name"), rs.getInt("Price"), rs.getString("Description"), rs.getString("Image"), rs.getInt("CategoryID"), rs.getInt("Inventoryproduct"), rs.getInt("Soldproduct"), rs.getInt("Status"), rs.getString("ReviewId"));
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
    return pr; // Trả về biến pr
}

           public List<Product> getBestSeller() {
                List<Product> list = new ArrayList<>();
        try {
            String strSelect = "SELECT TOP 6 * FROM Product ORDER BY Soldproduct DESC";
            stm = connection.prepareStatement(strSelect);
            rs = stm.executeQuery();
            while (rs.next()) {
                Product pr = new Product(rs.getInt("ProductID"), rs.getString("Name"), rs.getInt("Price"), rs.getString("Description"),rs.getString("Image"),rs.getInt("CategoryID"),rs.getInt("Inventoryproduct"),rs.getInt("Soldproduct"),rs.getInt("Status"),rs.getString("ReviewId"));
                list.add(pr);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
          
          
       public List<Account> getAllAccount() {
            List<Account> listAcc = new ArrayList<>();
        try {
            String strSelect = "select * from Account";
            stm = connection.prepareStatement(strSelect);
            rs = stm.executeQuery();
            while (rs.next()) {
                Account acc = new Account(rs.getInt("AccountID"), rs.getString("Email"), rs.getString("Password"), rs.getString("Name"), rs.getString("Phone"), rs.getString("Address"), rs.getInt("Role"));
                listAcc.add(acc);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return listAcc;
    }
       
           public Account checkAccountExistByEmail( String email) {
       
        try {
             String strSelect = "select * from Account where  [email]=?";
           stm = connection.prepareStatement(strSelect);
            stm.setString(1, email);
            rs = stm.executeQuery();
            while (rs.next()) {
                Account acc = new Account(rs.getInt("AccountID"), rs.getString("Email"), rs.getString("Password"), rs.getString("Name"), rs.getString("Phone"), rs.getString("Address"), rs.getInt("Role"));
               return acc ; 
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null ;
    }
           
              public Account  loginAccount ( String email , String password) {
       
        try {
             String strSelect = "select * from Account where  [Email]=? and [Password] = ?";
           stm = connection.prepareStatement(strSelect);
            stm.setString(1, email);
             stm.setString(2, password);
            rs = stm.executeQuery();
            while (rs.next()) {
                Account acc = new Account(rs.getInt("AccountID"), rs.getString("Email"), rs.getString("Password"), rs.getString("Name"), rs.getString("Phone"), rs.getString("Address"), rs.getInt("Role"));
               return acc ; 
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null ;
    }
       
              public void insertAccount (String name , String pass , String email , String phone , String address) {
                 try {
             String strSelect = "INSERT INTO [Account]"+
"VALUES (?, ?, ?, ?, ?, 2)" ; 
           stm = connection.prepareStatement(strSelect);
            stm.setString(1, email);
             stm.setString(2, pass);
               stm.setString(3, name);
               stm.setString(4, phone);
                 stm.setString(5, address);
               
               
             stm.executeUpdate();
        
        } catch (SQLException e) {
            System.out.println(e);
        }
       
              }

          public List<Invoice> getAllInvoice() {
            List<Invoice> listInvo = new ArrayList<>();
        try {
            String strSelect = "select * from Invoice";
            stm = connection.prepareStatement(strSelect);
            rs = stm.executeQuery();
            while (rs.next()) {
                Invoice invo = new Invoice(rs.getInt("InvoiceID"), rs.getInt("AccountID"),rs.getDate("OrderDate"), rs.getString("Address"), rs.getInt("TotalPrice"), rs.getInt("ProductID"), rs.getInt("Quantity"),rs.getInt("Status"));
                listInvo.add(invo);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return listInvo;
    }     
          
              public List<Review> getAllReview() {
            List<Review> listReview = new ArrayList<>();
        try {
            String strSelect = "select * from Review";
            stm = connection.prepareStatement(strSelect);
            rs = stm.executeQuery();
            while (rs.next()) {
                Review revi = new Review(rs.getInt("ReviewID"), rs.getDate("ReviewDate"), rs.getString("ReviewDetail"), rs.getInt("AccountID"));
                listReview.add(revi);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return listReview;
    }
        
              
              
              
    // insert 
   public void insert( String name , String image , int price , int invenum , int category, String des) {
        String sql = "INSERT INTO [dbo].[Product]\n" +
"  VALUES(?,?,?,?,?,?,0,1,null)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

           
            st.setString(1, name);
            st.setInt(2, price);
            st.setString(3,des );
             st.setString(4,image );
             
             st.setInt(5,category );
        
            st.setInt(6, invenum);

            st.executeUpdate();
        } catch (SQLException f) {
            System.out.println(f);
        }
    }
/*
    public Employees getEmployeesById(int id) {
        try {
            String strSelect = "select * from Employees where id = ?";
            stm = connection.prepareStatement(strSelect);
            stm.setInt(1, id);
            rs = stm.executeQuery();
            if (rs.next()) {
                Employees pr = new Employees(rs.getInt("Id"), rs.getString("last"), rs.getString("first"), rs.getInt("age"));
                return pr;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    //delete 

    public void delete(int id) {
        String sql = "DELETE FROM [dbo].[Employees]\n"
                + "      WHERE  id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
*/
    // update 
    public void update(String name , String image , int price , int invenum , int category, String des, int id ) {
        String sql = "UPDATE [dbo].[Product]\n" +
"   SET [Name] = ?  \n" +
"      ,[Price] = ? \n" +
"      ,[Description] = ? \n" +
"      ,[Image] = ? \n" +
"      ,[CategoryID] = ? \n" +
"      ,[Inventoryproduct] = ? \n" +
"      ,[Soldproduct] = 0 \n" +
"      ,[Status] = 1 \n" +
"      ,[ReviewID] = null \n" +
" WHERE [ProductID] = ?" ;
        try {
            
        PreparedStatement st = connection.prepareStatement(sql);
        st.setString(1, name);
        st.setString(3, des);
        st.setString(4, image);
        st.setInt(2,price);
            st.setInt(5,category);
            st.setInt(6,invenum);
             st.setInt(7,id);
            st.executeUpdate();
        } catch (SQLException f) {
         
        }
    }

               public void delete(String id ) {
        String sql = "DELETE FROM [dbo].[Product]\n"
                + "      WHERE  ProductID=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1,id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    } 
               
               
    public static void main(String[] args) {
        ProductDAO objP = new ProductDAO();
      
     objP.update("Grapes", "you", 37, 67, 1, "ngon", 5);
 
             }

    
}
