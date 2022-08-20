/*document.getElementById("login-signup").addEventListener("click", function (){
    document.getElementById("modal").style.display = "block";
})

window.onclick = function(event) {
    if (event.target == modal-container) {
        document.getElementById("modal").style.display = "none";
    }
}*/

function toggleSignup(){
    document.getElementById("login-toggle").style.backgroundColor="#fff";
    document.getElementById("login-toggle").style.color="#000";
    document.getElementById("signup-toggle").style.backgroundColor="#0d6efd";
    document.getElementById("signup-toggle").style.color="#fff";
    document.getElementById("login-form").style.display="none";
    document.getElementById("signup-form").style.display="block";
}

function toggleLogin(){
    document.getElementById("login-toggle").style.backgroundColor="#0d6efd";
    document.getElementById("login-toggle").style.color="#fff";
    document.getElementById("signup-toggle").style.backgroundColor="#fff";
    document.getElementById("signup-toggle").style.color="#000";
    document.getElementById("signup-form").style.display="none";
    document.getElementById("login-form").style.display="block";
}

