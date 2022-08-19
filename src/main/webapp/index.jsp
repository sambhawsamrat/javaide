<jsp:include page="/commons/header.jsp"></jsp:include>
<jsp:include page="/commons/navigation.jsp"></jsp:include>

<%@ page import="com.website.javaide.controller.FormType"%>

<div class="container-fluid pb-lg-5" style="display: flex; flex-direction: row; justify-content: space-between">
    <div class="container">
        <header>About The Website</header>
        <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin in nibh rhoncus, ultricies quam pretium, mattis lorem. Aenean vitae tincidunt dolor. Aenean non nulla magna. Aliquam ut ullamcorper magna. Mauris a dolor vel eros feugiat sodales et a urna. Mauris mi ipsum, placerat id elit vel, posuere pellentesque tellus. Etiam augue libero, faucibus ac luctus vitae, imperdiet non ipsum. Morbi non lacus sed turpis tristique viverra ut in mi. Ut mollis suscipit mi, et facilisis sapien ultricies ut. Donec varius fermentum mi. Mauris sed ultricies libero. Nunc massa lacus, tempor non enim sed, viverra elementum erat. Nulla justo ex, imperdiet id venenatis ac, consequat et odio. In dolor purus, tincidunt eget malesuada eget, consectetur id dui.
        </p>
    </div>
    <div class="container">
        <div class="form-modal">
            <div class="form-toggle">
                <button id="login-toggle" onclick="toggleLogin()">log in</button>
                <button id="signup-toggle" onclick="toggleSignup()">sign up</button>
            </div>
            <div id="login-form">
                <form method="post" action="/authentication">
                    <input type="text" placeholder="Enter email"/>
                    <input type="password" placeholder="Enter password"/>
                    <input type="hidden" name="form-type" value="<%=FormType.LOGIN%>" readonly="readonly">
                    <button type="button" class="btn login">login</button>
                    <br>
                    <p><a href="javascript:void(0)">Forgot Password?</a></p>
                </form>
            </div>
            <div id="signup-form">
                <form method="post" action="/authentication">
                    <input type="text" placeholder="Your name"/>
                    <input type="email" placeholder="Your email address"/>
                    <input type="password" placeholder="Password"/>
                    <input type="hidden" name="form-type" value="<%=FormType.SIGNUP%>" readonly="readonly">
                    <button type="button" class="btn signup">create account</button>
                </form>
            </div>
        </div>
    </div>
</div>

<%--<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel1">Login</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <div id="login-form">
                    <form method="post" action="/authentication">
                        <input type="text" placeholder="Enter email"/>
                        <input type="password" placeholder="Enter password"/>
                        <input type="hidden" name="form-type" value="<%=FormType.LOGIN%>" readonly="readonly">
                        &lt;%&ndash;<button type="button" class="btn login">login</button>&ndash;%&gt;
                        <br>
                        <p><a href="javascript:void(0)">Forgot Password?</a></p>
                    </form>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-outline-primary" data-bs-dismiss="modal">login</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel2">Signup</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <div id="signup-form">
                    <form method="post" action="/authentication">
                        <input type="name" placeholder="Enter name"/>
                        <input type="email" placeholder="Enter email"/>
                        <input type="password" placeholder="Create password"/>
                        <input type="hidden" name="form-type" value="<%=FormType.SIGNUP%>" readonly="readonly">
                        &lt;%&ndash;<button type="button" class="btn signup">create account</button>&ndash;%&gt;
                        <hr/>
                        <p>Clicking <strong>create account</strong> means that you are agree to our <a href="javascript:void(0)">terms of services</a>.</p>
                    </form>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-outline-primary" data-bs-dismiss="modal">create account</button>
            </div>
        </div>
    </div>
</div>--%>

<div>
    <a href="editor.jsp">Editor</a>
    <a href="account.jsp">Account</a>
</div>

<jsp:include page="/commons/footer.jsp"></jsp:include>