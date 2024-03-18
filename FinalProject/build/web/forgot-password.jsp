<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Quên mật khẩu</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">
        <link rel="stylesheet" href="https://mdbootstrap.com/previews/ecommerce-demo/css/mdb-pro.min.css">
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script type="text/javascript" src="https://mdbootstrap.com/previews/ecommerce-demo/js/bootstrap.js"></script>
 
        <style>
            .small-modal {
                max-width: 80%;
                z-index: 1050;
                margin-top: 50vh;
                position: fixed;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
            }
           
    /* CSS để căn giữa nút */
    .container {
        display: flex;
        justify-content: center;
    }
    
    /* CSS để tạo nút */
    .styled-button {
        background-color: #2E8B57; /* Màu xanh rêu */
        color: white; /* Màu chữ */
        padding: 10px 20px; /* Độ lớn của nút */
        border: none; /* Loại bỏ viền */
        border-radius: 10px; /* Bo góc 10px */
        text-decoration: none; /* Loại bỏ gạch chân dưới của liên kết */
        display: inline-block;
        transition: background-color 0.3s ease;
    }
    
    /* CSS để thay đổi màu nút khi di chuột qua */
    .styled-button:hover {
        background-color: #3CB371; /* Màu xanh biển */
    }
</style>
      
    </head>
    <body>
        
            <div class="container py-3"></div>
            <div id="logreg-forms">
                <form class="form-signin" action="forgotpassword" method="post">
                <c:if test="${error!=null }">
                    <div class="alert alert-danger" role="alert">${error}</div>
                </c:if>
                <c:if test="${mess!=null}">
                    <div class="alert alert-success" role="alert">${mess}</div>
                </c:if>
                <h3 style="text-align: center">Forgot password</h3>
                
                <p><input name="email" type="text" class="form-control" placeholder="Email" >
                    <button class="btn btn-success btn-block" type="submit"><i class="fas fa-sign-in-alt"></i>SEND</button> 
            </form>
                <div class="container">
    <button class="styled-button"><a style="color: white" href="homecontrol">BACK TO HOME</a></button>
</div>
        </div>
    </body>
</html>