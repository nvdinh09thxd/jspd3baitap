<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Vinaenter - Register</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png" href="images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body>
	<div class="bg-contact3"
		style="background-image: url('images/bg-01.jpg');">
		<div class="container-contact3">
			<div class="wrap-contact3">

				<form class="contact3-form validate-form"
					action="<%=request.getContextPath()%>/RegisterUserController2"
					method="post">
					<span class="contact3-form-title"> Register User </span>
					<%
						String name = (String) request.getAttribute("name");
						String pass = (String) request.getAttribute("pass");
						String repass = (String) request.getAttribute("repass");
						String address = (String) request.getAttribute("address");
						String check = (String) request.getAttribute("check");
					
					%>
					<div class="wrap-input3 validate-input">
						<input class="input3" type="text" name="name"
							placeholder="Your Username" value="<%=name%>"> <span
							class="focus-input3"></span>
					</div>

					<div class="wrap-input3 validate-input">
						<input class="input3" type="password" name="pass"
							placeholder="Your Password" value="<%=pass%>"> <span
							class="focus-input3"></span>
					</div>

					<div class="wrap-input3 validate-input">
						<input class="input3" type="password" name="repass"
							placeholder="Your RePassword" value="<%=repass%>"> <span
							class="focus-input3"></span>
					</div>

					<div class="wrap-input3 validate-input">
						<input class="input3" type="text" name="address"
							placeholder="Your address" value="<%=address%>"> <span
							class="focus-input3"></span>
					</div>
					<div class="container-contact3-form-btn">
						<button class="contact3-form-btn">Submit</button>
					</div>
					<label style="color: red"><%=check%></label>
				</form>
			</div>
		</div>
	</div>


	<div id="dropDownSelect1"></div>

	<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
	<script>
		$(".selection-2").select2({
			minimumResultsForSearch : 20,
			dropdownParent : $('#dropDownSelect1')
		});
	</script>
	<!--===============================================================================================-->
	<script src="js/main.js"></script>

	<!-- Global site tag (gtag.js) - Google Analytics -->
	<script async
		src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
	<script>
		window.dataLayer = window.dataLayer || [];
		function gtag() {
			dataLayer.push(arguments);
		}
		gtag('js', new Date());

		gtag('config', 'UA-23581568-13');
	</script>

</body>
</html>
