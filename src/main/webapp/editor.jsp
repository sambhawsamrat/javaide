<jsp:include page="/commons/header.jsp"></jsp:include>
<jsp:include page="/commons/navigation.jsp"></jsp:include>

<div class="container-fluid w-100 p-0 m-0" style="display: flex; flex-direction: row">
  <div class="mw-50 w-50 m-0 p-0 float-left" id="code-input-box">
    <nav class="navbar navbar-expand-lg bg-light col-lg-12 px-3 py-1 inner-nav">
      <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1" checked>
        <label class="form-check-label" for="inlineRadio1">Code</label>
<%--        <sup><span><a title="info" href="#" id="myBtn"><i class="fas fa-info-circle"></i></a></span></sup>--%>
      </div>
      <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
        <label class="form-check-label" for="inlineRadio2">Input</label>
      </div>
      <div class="float-right">
        <%--<button class="btn btn-outline-primary btn-sm" id="myBtn">
          <i class="fas fa-info"></i>&nbsp;&nbsp;&nbsp;Info
        </button>--%>
            <button type="button" class="btn btn-outline-primary btn-sm" data-bs-toggle="modal" data-bs-target="#exampleModal">
                <i class="fas fa-info"></i>&nbsp;&nbsp;&nbsp;Info
            </button>
      </div>
    </nav>
    <div id="code" class="mw-100 w-100 m-0 p-3">// Type your code here...</div>
    <textarea name="input" id="input" class="mw-100 w-100 m-0 p-3 d-none" placeholder="Input to the code goes here..."></textarea>
  </div>

  <div class="mw-50 w-50 m-0 p-0 float-right" id="output-box">
    <nav class="navbar navbar-expand-lg bg-light col-lg-12 px-3 py-1 inner-nav">
<%--      <div class="form-check">--%>
<%--        <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1" checked>--%>
<%--        <label class="form-check-label" for="exampleRadios1">--%>
<%--          Output--%>
<%--        </label>--%>
<%--      </div>--%>
<%--    </nav>--%>
      <div style="padding: 4px">Output</div>
    </nav>
    <div id="output" class="mw-100 w-100 m-0 p-3 text-muted">Output of the code will be displayed here...</div>
  </div>
</div>

</div>

<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Constraints</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <ul>
                <li>Time Limit: 5 seconds</li>
                <li>Memory Limit: 128 MB</li>
                <li>Maximum Code Size: 51200 characters</li>
                <li>Maximum Input Size: 51200 characters</li>
                <li>Maximum Output Size: 51200 characters</li>
                <li>Class with <strong>Main Method</strong> must be named as <strong>Main</strong>.</li>
                <li>Your code can contain multiple classes.</li>
                <li>But there should be only one <strong>public class</strong>.</li>
                <li>Your <strong>Main</strong> class should be the <strong>public class</strong>.</li>
            </ul>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-outline-primary" data-bs-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>


<jsp:include page="/commons/footer.jsp"></jsp:include>
