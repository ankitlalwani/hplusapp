<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Tennis Store</title>
    <link rel="stylesheet" href="css/style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<header id="home" class="header">
    <nav class="nav" role="navigation">
        <div class="container nav-elements">
            <div class="branding">
                <a href="home"><img src="images/tennis-store-logo.jpg"
                                    alt="Logo - tennis-store"></a>
            </div>
            <!-- branding -->
            <ul class="navbar">
                <li><a href="/home">home</a></li>
                <li><a href="/goToLoginin">login</a></li>
                <li><a href="/goToSearch">search</a></li>
                <li><a href="/redirectToLinkedin">linkedin</a></li>
            </ul><!-- navbar -->
            <!-- navbar -->
        </div>
        <!-- container nav-elements -->
    </nav>
    <div class="container tagline">
        <h1 class="headline">Our Mission</h1>
        <p>We pride ourself in our <em>expert knowledge</em> and love towards the game of <em>Tennis</em> We have the <em>best selection</em> of products with varieties ranging from <em>economical</em> to <em>luxury</em> products.</p>
    </div><!-- container tagline -->
</header>
<section id="error" class="section">
    <div class="container tagline">
        <h1 class="headline">Error!!!</h1>
        <p>You have reached the default error page</p>
    </div><!-- container tagline -->
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