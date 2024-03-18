<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <jsp:include page="menu.jsp" ></jsp:include>

        <!-- Modal Search Start -->
        <div class="modal fade" id="searchModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-fullscreen">
                <div class="modal-content rounded-0">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Search by keyword</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body d-flex align-items-center">
                        <div class="input-group w-75 mx-auto d-flex">
                            <input type="search" class="form-control p-3" placeholder="keywords" aria-describedby="search-icon-1">
                            <span id="search-icon-1" class="input-group-text p-3"><i class="fa fa-search"></i></span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Modal Search End -->


        <!-- Single Page Header start -->
        <div class="container-fluid page-header py-5">
            <h1 class="text-center text-white display-6">Cart Management</h1>
            <ol class="breadcrumb justify-content-center mb-0">
                <li class="breadcrumb-item"><a href="homecontrol">Home</a></li>


            </ol>
        </div>
        <!-- Single Page Header End -->


        <!-- Cart Page Start -->
        <div class="container-fluid py-5">
            <div class="container py-5">
                <div class="table-responsive">
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">Products</th>
                                <th scope="col">Name</th>
                                <th scope="col">Price</th>
                                <th scope="col">~~~~~Manage~~~~~</th>


                            </tr>
                        </thead>
                        <tbody>
                             <c:forEach items="${listP}" var="c">
                            <tr>
                       
                                <th scope="row">
                                    <div class="d-flex align-items-center">
                                        <img src="${c.image}" class="img-fluid me-5 rounded-circle" style="width: 80px; height: 80px;" alt="">
                                    </div>
                                </th>
                                <td>
                                    <p class="mb-0 mt-4">${c.name}</p>
                                </td>
                                <td>
                                    <p class="mb-0 mt-4">${c.price} $</p>
                                </td>

                                <td>
                                    <a href="update?pid=${c.id}"><button type="button" class="">Update</button></a>
                                    <a href="delete?pid=${c.id}"><button type="button" class="">Delete</button></a>
                                </td>

                            </tr>
                            </c:forEach>
                            
                           
                        </tbody>
                    </table>
                </div>

            </div>
        </div>
        <!-- Cart Page End -->
        
        <div class="mt-5" style="display: flex ; justify-content: center">
        <button class="btn border-secondary rounded-pill px-4 py-3 text-primary" type="button" data-toggle="modal" data-target="#addProductModal">INSERT ITEMS</button>
         </div>
        
    <div id="addProductModal" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <form action="add" method="post">
                    <div class="modal-header">						
                        <h4 class="modal-title">INSERT NEW ITEM</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    </div>
                    <div class="modal-body">					
                        <p>Product Name<input name="name" type="text" class="form-control" required>
                        <p>Product Image<input name="image" type="text" class="form-control" required>
                        
                        <p>Product Price<input name="price" type="number" class="form-control" required>
                        <p>Inventory Product <input name="invenum" type="number" class="form-control">
                        <p>Product Description<textarea name="description" class="form-control" ></textarea>
                        <p>Category
                            <select name="category" class="form-select">
                                <c:forEach items="${listC}" var="o">
                                    <option value="${o.cateID}">${o.cateName}</option>
                                </c:forEach>
                            </select>
                    </div>
                    <div class="modal-footer">  
                        <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                        <input type="submit" class="btn btn-success" value="Add">
                    </div>
                </form>
            </div>
        </div>
    </div>
                                
                                
    <jsp:include page="footer.jsp"></jsp:include>

    <!-- Back to Top -->
    <a href="#" class="btn btn-primary border-3 border-primary rounded-circle back-to-top"><i class="fa fa-arrow-up"></i></a>   


    <!-- JavaScript Libraries -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="lib/easing/easing.min.js"></script>
    <script src="lib/waypoints/waypoints.min.js"></script>
    <script src="lib/lightbox/js/lightbox.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="https://mdbootstrap.com/previews/ecommerce-demo/js/jquery-3.4.1.min.js"></script>
        <script type="text/javascript" src="https://mdbootstrap.com/previews/ecommerce-demo/js/bootstrap.js"></script>

    <!-- Template Javascript -->
    <script src="js/main.js"></script>
</body>

</html>