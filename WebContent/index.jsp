<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
* {
  box-sizing: border-box;
}
.menu {
  float: left;
  width: 20%;
}
.menuitem {
  padding: 8px;
  margin-top: 7px;
  border-bottom: 1px solid #f1f1f1;
}
.main {
  float: left;
  width: 60%;
  padding: 0 20px;
  overflow: hidden;
}
.right {
  background-color: lightblue;
  float: left;
  width: 20%;
  padding: 10px 15px;
  margin-top: 7px;
}

@media only screen and (max-width:800px) {
  /* For tablets: */
  .main {
    width: 80%;
    padding: 0;
  }
  .right {
    width: 100%;
  }
}
@media only screen and (max-width:500px) {
  /* For mobile phones: */
  .menu, .main, .right {
    width: 100%;
  }
}
</style>
<style>
* {box-sizing: border-box;}

body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.header {
  overflow: hidden;
  background-color: #666;
  padding: 20px 10px;
}
.footer {
  overflow: hidden;
  background-color: #666;
  padding: 20px 10px;
}
.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px; 
  line-height: 25px;
  border-radius: 4px;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header a:hover {
  background-color: #ddd;
  color: black;
}

.header a.active {
  background-color: dodgerblue;
  color: white;
}

.header-right {
  float: right;
}

@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  
  .header-right {
    float: none;
  }
}
</style>

</head>
<div class="header">
  <a href="#default" class="logo">Images@Me</a>
  <div class="header-right">
    <a class="active" href="#home">Home</a>
    <a href="#contact">Contact</a>
    <a href="#about">About</a>
  </div>
</div>
<body style="font-family:Verdana;">
<div style="overflow:auto">
  <div class="menu">
    <div class="menuitem">The Nature</div>
    <div class="menuitem">Technology</div>
    <div class="menuitem">Paintings</div>
    <div class="menuitem">Paintings</div>
    <div class="menuitem">Gallery</div>
  </div>

  <div class="main">
    <h2>The Nature</h2>
    <p>The most scenic view of Sunrise from Tiger Hill.</p>
    <img src="IMG_0952.JPG" style="width:100%">
  </div>

  <div class="right">
    <h2>Contributor:</h2>
    <p>Samar Ghosh</p>
    <h2>Downloads:</h2>
    <p>100</p>
    <h2>Price</h2>
    <p>It is free! Let's download now.</p>
  </div>
</div>
<footer>
 <div class="footer">
 <p style="text-align:center;"><b>Copyright and copy 2021 Images@Me. All Rights Reserved.</b></p>
 </div>
 </footer>
</body>
</html>
