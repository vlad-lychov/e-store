<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<jsp:include page="header.jsp"/>
<div class="login">
	<div class="wrap">
		<div class="col_1_of_login span_1_of_login">
			<h4 class="title"><spring:message code="label.new.customers"/></h4>
			<p></p>
			<div class="button1">
			   <a href="register.html"><input type="submit" name="Submit" value="<spring:message code="label.create.account"/>"></a>
			 </div>
			 <div class="clear"></div>
		</div>
		<div class="col_1_of_login span_1_of_login">
		<div class="login-title">
	   		<h4 class="title"><spring:message code="label.registered.customers"/></h4>
			<div id="loginbox" class="loginbox">
			<form action="" method="post" name="login" id="login-form">
	   	    <fieldset class="input">
			 <p id="login-form-username">
			   <label for="modlgn_username"><spring:message code="label.email"/></label>
		       <input id="modlgn_username" type="text" name="email" class="inputbox" size="18" autocomplete="off">
			 </p>
						    
			 <p id="login-form-password">
			 	<label for="modlgn_passwd"><spring:message code="label.password"/></label>
				<input id="modlgn_passwd" type="password" name="password" class="inputbox" size="18" autocomplete="off">
			 </p>
			 <div class="remember">
				<p id="login-form-remember">
					<label for="modlgn_remember"><a href="#"><spring:message code="label.forget.password"/></a></label>
				</p>
				<input type="submit" name="Submit" class="button" value="<spring:message code="label.login"/>"><div class="clear"></div>
			 </div>
			</fieldset>
			</form>
			</div>
		</div>
		</div>
		<div class="clear"></div>
</div>
</div>
<jsp:include page="footer.jsp"/>
