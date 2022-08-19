<jsp:include page="commons/header.jsp"></jsp:include>
<jsp:include page="commons/navigation.jsp"></jsp:include>
<div class="container-fluid mt-2 mb-5">
    <div class="container">
        <div id="account">
            <div>
                <h4>Account <button class="btn btn-outline-primary btn-sm" type="button"><i class="fas fa-trash"></i></button></h4>
            </div>

            <div class="input-group mb-3">
                    <label class="input-group-text">Name</label>
                    <input type="text" class="form-control" placeholder="Name" aria-label="Username" aria-describedby="addon-wrapping" disabled><button class="btn btn-outline-primary btn-sm" type="button"><i class="fas fa-edit"></i></button>
            </div>
            <div class="input-group mb-3">
                    <label class="input-group-text">Email</label>
                    <input type="text" class="form-control" placeholder="Email" aria-label="Email" aria-describedby="addon-wrapping" disabled>
            </div>
            <div class="input-group mb-3">
                    <label class="input-group-text">Password</label>
                    <input type="text" class="form-control" placeholder="Password" aria-label="Password" aria-describedby="addon-wrapping" disabled><button class="btn btn-outline-primary btn-sm" type="button"><i class="fas fa-edit"></i></button>
            </div>
<%--                <a href="#" class="delete-account">Delete account</a>--%>
        </div>
        <br>
        <div class="mt-2" id="snippets">
            <div>
                <h4>Public snippets <button class="btn btn-outline-primary btn-sm" type="button"><i class="fas fa-trash"></i></button></h4>
            </div>
            <div id="public">
                <ul class="list-group">
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        Public 1
                        <span><button class="btn btn-outline-primary btn-sm" type="button"><i class="fas fa-edit"></i></button>&nbsp;&nbsp;<button class="btn btn-outline-primary btn-sm" type="button"><i class="fas fa-trash"></i></button>&nbsp;&nbsp;<button class="btn btn-outline-primary btn-sm" type="button"><i class="fas fa-share"></i></button></span>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        Public 2
                        <span><button class="btn btn-outline-primary btn-sm" type="button"><i class="fas fa-edit"></i></button>&nbsp;&nbsp;<button class="btn btn-outline-primary btn-sm" type="button"><i class="fas fa-trash"></i></button>&nbsp;&nbsp;<button class="btn btn-outline-primary btn-sm" type="button"><i class="fas fa-share"></i></button></span>
                    </li>
                </ul>
            </div>
            <br>
            <div>
                <h4>Private snippets <button class="btn btn-outline-primary btn-sm" type="button"><i class="fas fa-trash"></i></button></h4>
            </div>
            <div class="mt-2" id="private">
                <ul class="list-group">
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        Private 1
                        <span><button class="btn btn-outline-primary btn-sm" type="button"><i class="fas fa-edit"></i></button>&nbsp;&nbsp;<button class="btn btn-outline-primary btn-sm" type="button"><i class="fas fa-trash"></i></button>&nbsp;&nbsp;<button class="btn btn-outline-primary btn-sm" type="button"><i class="fas fa-share"></i></button></span>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        Private 2
                        <span><button class="btn btn-outline-primary btn-sm" type="button"><i class="fas fa-edit"></i></button>&nbsp;&nbsp;<button class="btn btn-outline-primary btn-sm" type="button"><i class="fas fa-trash"></i></button>&nbsp;&nbsp;<button class="btn btn-outline-primary btn-sm" type="button"><i class="fas fa-share"></i></button></span>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>

<jsp:include page="commons/footer.jsp"></jsp:include>