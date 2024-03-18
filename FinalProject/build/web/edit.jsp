<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Edit</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">
        <link rel="stylesheet" href="https://mdbootstrap.com/previews/ecommerce-demo/css/mdb-pro.min.css">
    <body>
        <div id="editEmployeeModal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="edit" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Chỉnh sửa thông tin sản phẩm</h4>
                            <button type="button" class="close" onclick="window.history.back()">&times;</button>
                        </div>

                        <div class="modal-body">					
                            <input value="${detail.id}" name="mid" type="hidden" class="form-control" readonly required>
                           <p>Product Name<input value="${detail.name}" name="name" type="text" class="form-control" required>
                        <p>Product Image<input value="${detail.image}" name="image" type="text" class="form-control" required>
                        
                        <p>Product Price<input value="${detail.price}" name="price" type="number" class="form-control" required>
                        <p>Inventory Product <input value="${detail.invenpro}" name="invenum" type="number" class="form-control">
                        <p>Product Description<textarea  name="description" class="form-control" >${detail.description}</textarea>
                        <p>Category
                            <select name="category" class="form-select">
                                <c:forEach items="${listC}" var="o">
                                    <option  value="${o.cateID}">${o.cateName}</option>
                                </c:forEach>
                            </select>
                        </div>

                        <div class="modal-footer">
                            <input type="submit" class="btn btn-success" value="Edit">
                        </div>
                </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>