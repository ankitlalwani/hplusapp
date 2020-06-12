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
                <li><a href="/logout">logout</a></li>
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
<!-- #home -->
<c:if test="${empty(products)}">
    <section id="search" class="section">
        <header class="imageheader"></header>
        <div class="container">
            <h2 class="headline">Hello, ${username}</h2>
            <h2 class="headline">Search Products</h2>
            <form action="/search" method="get">
                <label class="card-title">Search your product</label>
                <input path="search" name="search" value="">
                <input type="submit" value="Search">
            </form>
        </div>
    </section>
</c:if>
<!-- guarantee -->
<c:if test="${!empty(products)}">
    <section id="products" class="section">

        <div class="productContainer">
            <c:forEach var = "product" items = "${products}">
                <div class="productContainerItem">
                    <img id="pic1" src="${product.imagePath}">
                    <input type="text" name="product"
                           value="${product.name}">

                </div>
            </c:forEach>
        </div>
    </section>
</c:if>

<section id="history" class="section">
    <div class="container">
        <div class="text-content">
            <h2 class="headline">About us</h2>
            <p>We offer the latest technologies in tennis equipment with 7 Master Racquet Technicians on staff. Our <em>professionals</em> have highest <em>certification in Charlotte</em> or comprehensive racquet stringing services. We believe in <em>trust and accountability</em>.</p>
            <p>For over a decade we have welcomed customers from <em>all over the world</em>to our store based in <em>Charlotte, NC</em> We were recently named Retailer of the Year by the Tennis Industry . we yearn for <em>customer satisfaction</em>
                instead of profit making corporate. Our mission is to inspire and nurture your inner champion by delivering the <em>best consumer experience</em> and providing a broad selection of tennis products and <em>innovative game improvement gear</em>. We will set new standards that others will seek to match. Each day, we set our focus on consumers and strive to be the most preferred online tennis retailer and the best local retailer in Charlotte.</p>
        </div>
    </div><!-- container text -->
</section><!-- #history -->

<section id="guarantee" class="section">
    <header class="imageheader"></header>
    <div class="container">
        <h2 class="headline">Our Guarantee &amp; Ideals</h2>
        <p>We’re committed to creating products that <em>defy convention</em>, and inspire our customers with pride and trust. In fact, we guarantee <a href="#products">every product</a> we sell. If you’re not 100 percent happy with your purchase, you can return it during the first 60 days, <em>no questions asked</em>.</p>
        <p>Philanthropy is extremely important to us. In fact, <em>each employee volunteers</em> for organization of his or her choice, on the clock, for two hours each week. We know that doing good, breeds more doing good, and we’re happy to <em>promote a cycle</em> of volunteerism that just keeps on giving.</p>
    </div>
</section><!-- guarantee -->
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