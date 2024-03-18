<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Đăng nhập</title>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">
        <link rel="stylesheet" href="https://mdbootstrap.com/previews/ecommerce-demo/css/mdb-pro.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
        <script src="https://mdbootstrap.com/previews/ecommerce-demo/js/jquery-3.4.1.min.js"></script>
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
            <c:if test="${error!=null }">
                <div class="alert alert-danger" role="alert">${error}</div>
            </c:if>
            <c:if test="${mess!=null }">
                <div class="alert alert-danger" role="alert">${mess}</div>
            </c:if>
            <c:if test="${mess1!=null }">
                <div class="alert alert-danger" role="alert">${mess1}</div>
            </c:if>

            <form class="form-signin" action="login" method="post">
                <h3 style="text-align: center"> LOG IN </h3>  
                <p><input name="email" value="${email}" type="text" class="form-control" placeholder="Email">
                <p><input name="pass" value="${password}" type="password" class="form-control" placeholder="Password">
                <div class="form-group form-check">
                    <input name="remember" value="1" type="checkbox" class="form-check-input" id="check">
                    <label for="check"> SAVE </label>
                </div>
                <a href="forgotpassword">Forget password ?</a>
                <button class="btn btn-success btn-sm btn-block" type="submit"><i class="fas fa-sign-in-alt"></i>LOG IN</button>
                <hr>
                <a href="#signUp"  data-toggle="modal">
                    <button class="btn btn-primary btn-sm btn-block"><i class="fas fa-user-plus"></i> REGISTER </button>
                </a>  

            </form>

        </div>
        <div id="signUp" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content small-modal">
                    <form action="signup" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">NEW ACCOUNT</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">	
                            <p>AccountName <input name="user" type="text" class="form-control" required>
                                <p>Phone <input name="phone" type="text" class="form-control" required>
                                    <p>Address <input name="address" type="text" class="form-control" required>
                            <p>Password<input name="pass" type="password" class="form-control" required>
                            <p>Re-enter password <input name="repass" type="password" class="form-control" required>
                            <p>Email<input name="email" type="text" class="form-control" required>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Hủy">
                            <input type="submit" class="btn btn-success" value="Thêm">
                        </div>
                       
                    </form>
                </div>
            </div>
        </div>
             
                          
                      
        <div class="container">
            <button class="styled-button"><a style="color: white" href="homecontrol">BACK TO HOME</a></button>
        </div>
    </body>
</html>