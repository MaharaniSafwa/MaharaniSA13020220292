<?php
session_start();
include "koneksi.php";

$username = isset($_SESSION['username']) ? $_SESSION['username'] : "Pengguna";

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Informasi IT</title>
    <link rel="stylesheet" href="style.css">
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-image: url('background.jpg');
            background-size: cover;
            background-position: center;
            color: #fff;
        }
    </style>
</head>
<body>
    <div class="container">
        <header>
            <h1>Selamat Datang, <?php echo $username; ?>!</h1>
            <h1>Ini adalah halaman utama website informasi tentang IT.</h1>
            <nav>
                <ul>
                    <li><a href="informasi.php">Beranda</a></li>
                    <p></p>
                    <li><a href="konten1.php">Teknologi Cloud</a></li>
                    <li><a href="konten2.php">Keamanan Informasi</a></li>
                    <li><a href="konten3.php">Pemrograman Web</a></li>
                    <p></p>
                    <li><a href="logout.php" class="button">Logout</a></li>
                </ul>
            </nav>
        </header>
    </div>
</body>
</html>
