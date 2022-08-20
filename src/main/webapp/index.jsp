<jsp:include page="/commons/header.jsp"></jsp:include>
<jsp:include page="/commons/navigation.jsp"></jsp:include>

<%@ page import="com.website.javaide.constants.FormType"%>

<div class="container-fluid pb-lg-5" style="display: flex; flex-direction: row; justify-content: space-between">
    <div class="container-fluid">
        <header>About The Website</header>
        <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin in nibh rhoncus, ultricies quam pretium, mattis lorem. Aenean vitae tincidunt dolor. Aenean non nulla magna. Aliquam ut ullamcorper magna. Mauris a dolor vel eros feugiat sodales et a urna. Mauris mi ipsum, placerat id elit vel, posuere pellentesque tellus. Etiam augue libero, faucibus ac luctus vitae, imperdiet non ipsum. Morbi non lacus sed turpis tristique viverra ut in mi. Ut mollis suscipit mi, et facilisis sapien ultricies ut. Donec varius fermentum mi. Mauris sed ultricies libero. Nunc massa lacus, tempor non enim sed, viverra elementum erat. Nulla justo ex, imperdiet id venenatis ac, consequat et odio. In dolor purus, tincidunt eget malesuada eget, consectetur id dui.
        </p>
    </div>
    <div class="container-fluid">
        <div class="form-modal" id="modal">
            <div class="form-toggle">
                <button id="login-toggle" onclick="toggleLogin()"><i class="fas fa-sign-in-alt"></i>&nbsp;&nbsp;log in</button>
                <button id="signup-toggle" onclick="toggleSignup()"><i class="fas fa-user-plus"></i>&nbsp;&nbsp;sign up</button>
            </div>
            <div id="login-form">
                <form method="post" action="/user">
                    <input type="text" placeholder="Enter email"/>
                    <input type="password" placeholder="Enter password"/>
                    <input type="hidden" name="form-type" value="<%=FormType.LOGIN_USER%>" readonly="readonly">
                    <button type="button" class="btn login">login</button>
                    <br>
                    <p><a href="javascript:void(0)">Forgot Password?</a></p>
                </form>
            </div>
            <div id="signup-form">
                <form method="post" action="/user">
                    <input type="text" placeholder="Your name"/>
                    <input type="email" placeholder="Your email address"/>
                    <input type="password" placeholder="Password"/>
                    <input type="hidden" name="form-type" value="<%=FormType.SIGNUP_USER%>" readonly="readonly">
                    <button type="button" class="btn signup">create account</button>
                    <hr/>
                    <p>Clicking <strong>create account</strong> means that you are agree to our <a href="javascript:void(0)">terms of services</a>.</p>
                </form>
            </div>
        </div>
    </div>
</div>


<div>
    <a href="editor.jsp">Editor</a>
    <a href="account.jsp">Account</a>
</div>

<jsp:include page="/commons/footer.jsp"></jsp:include>