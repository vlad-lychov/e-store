<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<title>E-store</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="resources/css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="resources/css/form.css" rel="stylesheet" type="text/css" media="all" />
<link href='http://fonts.googleapis.com/css?family=Exo+2' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="resources/js/jquery1.min.js"></script>
	<!-- start menu -->
	<link href="resources/css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
	<script type="text/javascript" src="resources/js/megamenu.js"></script>
	<script>$(document).ready(function(){$(".megamenu").megamenu();});</script>
	<script src="resources/js/jquery.easydropdown.js"></script>
</head>
 <div class="header-top">
	   <div class="wrap"> 
			  <div class="header-top-left">
			  	   <div class="box">
   				      <select tabindex="4" class="dropdown">
							<option value="" class="label" value="">Language :</option>
							<option>English</option>
    						<option>Russian</option>
							
							
					  </select>
   				    </div>
   				    <div class="box1">
   				        <select tabindex="4" class="dropdown">
							<option value="" class="label" value="">Currency :</option>
							<option value="1">$ Dollar</option>
							<option value="2">Euro</option>
						</select>
   				    </div>
   				    <div class="clear"></div>
   			 </div>
			 <div class="cssmenu">
				<ul>
					<li class="active"><a href="login.html"><spring:message code="label.account"/></a></li>
					<li><a href="checkout.html"><spring:message code="label.wishlist"/></a></li>
					<li><a href="checkout.html"><spring:message code="label.checkout"/></a></li> 
					<li><a href="login"><spring:message code="label.login"/></a></li> 
					<li><a href="registration"><spring:message code="label.signup"/></a></li>
				</ul>
			</div>
			<div class="clear"></div>
 		</div>
	</div>

<div class="header-bottom">
	 <div class="wrap">
		<jsp:include page="menu.jsp"/>
		<jsp:include page="cartPanel.jsp"/>
   		 <div class="clear"></div>
     </div>
</div>