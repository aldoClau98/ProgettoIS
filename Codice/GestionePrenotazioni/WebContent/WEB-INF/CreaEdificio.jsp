<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="Header.jsp" />

<div class="container" style="padding-top: 200px;">
	<p>Creazione edificio</p>
</div>

<!--INIZIO CONTAINER CENTRALE-->
<div id="container-centrale">
    <div class="login-clean">
        <form method="GET" action="">
            <div class="illustration">
                <img src="edificio.png" width="50%">
            </div>
            <div class="form-group">
                <input class="form-control" name="name" placeholder="Nome" />
            </div>
            <div class="form-group">
                <a class="btn btn-secondary btn-block" href=>Crea</a>
            </div>
        </form>
    </div>
</div>
<!--FINE CONTAINER CENTRALE-->

<jsp:include page="Footer.jsp" />