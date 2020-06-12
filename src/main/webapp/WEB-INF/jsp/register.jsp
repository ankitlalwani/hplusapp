<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
	<meta charset="UTF-8">
	<title>Tennis Store</title>
	<link rel="stylesheet" href="css/style.css" type="text/css"/>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<header id="home" class="header">
	<nav class="nav" role="navigation">
		<div class="container nav-elements">
			<div class="branding">
				<a href="#home"><img src="images/tennis-store-logo.jpg" alt="tennis-store-logo"></a>
			</div><!-- branding -->
			<ul class="navbar">
				<li><a href="/home">home</a></li>
				<li><a href="/goToLogin">login</a></li>
				<li><a href="/goToSearch">search</a></li>
				<li><a href="/redirectToLinkedin">linkedin</a></li>
			</ul><!-- navbar -->
		</div><!-- container nav-elements -->
	</nav>
	<div class="container tagline">
		<h1 class="headline">Our Mission</h1>
		<p>We pride ourself in our <em>expert knowledge</em> and love towards the game of <em>Tennis</em> We have the <em>best selection</em> of products with varieties ranging from <em>economical</em> to <em>luxury</em> products.</p>
	</div><!-- container tagline -->
</header><!-- #home -->


	<section id="registration" class="section">
	 <div class="container tagline">
	 <em>Register User</em><br/>
    		 <form:form method="post" action="/registeruser" modelAttribute="newUser">
    			<label>Username</label> <form:input path="username" type="text" /><form:errors path="username" cssClass="error"/> <br/>
    			<label>Password</label> <form:input path="password" type="password" /><form:errors path="password" cssClass="error"/><br/>
    			<label>First Name</label> <form:input path="firstName" type="text" /><form:errors path="firstName" cssClass="error"/><br/>
    			<label>Last Name</label> <form:input path="lastName" type="text" /><form:errors path="lastName" cssClass="error"/><br/>
    			<label>What do you want to do? </label> 
				<form:radiobutton path="activity" id="activity1" value="sport"/>Play a Sport?
				<form:radiobutton path="activity" id="activity2" value="gym"/>Hit the Gym?
				 <form:errors path="activity" cssClass="error"/>
				 <br/>
				 <label>Date of birth</label>
    			<form:input path="dateOfBirth" type="date" />
				 <form:errors path="dateOfBirth" cssClass="error"/>
				 <br/>
    			<label>Gender</label>
				 <form:select path="gender" items="${genderItems}"/>
				</br>
    			<input type="submit" value="Submit" id="submit">
    		</form:form>
		</div>
	</section>
<footer class="footer">
	<div class="container">
		<nav class="nav" role="navigation">
			<div class="container nav-elements">
				<div class="branding">
					<a href="#home"><img src="images/tennis-store-logo.jpg" alt="tennis-store-logo"></a>
					<p class="address">100 Main Street<br>
						Charlotte, NC 28262
					</p>
				</div>
			</div>
		</nav>
		<p class="legal">Tennis Store is a fictitious brand created by ankitlalwani solely for the purpose of practice. All products and people associated with Tennis Store are also fictitious. Any resemblance to real brands, products, or people is purely coincidental. Information provided about the product is also fictitious and should not be construed to be representative of actual products on the market in a similar product category.</p>
	</div><!-- container -->
</footer><!-- footer -->

</body>
</html>