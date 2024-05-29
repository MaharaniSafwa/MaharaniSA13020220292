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
    <title>Teknologi Cloud</title>
    <link rel="stylesheet" href="style.css">
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-image: url('background.jpg');
            background-size: cover;
            background-position: center;
            color: #fff;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }
    </style>
</head>
<body>
    <div class="container">
        <header>
            <h1>Selamat Datang, <?php echo $username; ?>!</h1>
            <h1>Teknologi Cloud</h1>
        </header>
        <main>
            <p>Teknologi cloud merupakan salah satu teknologi yang paling berkembang pesat dalam dunia IT saat ini. Dengan menggunakan teknologi cloud, perusahaan dan individu dapat menyimpan dan mengelola data serta aplikasi mereka di server yang berlokasi di internet, daripada di komputer atau server lokal mereka.</p>
            <p>Beberapa keuntungan utama dari teknologi cloud antara lain:</p>
            <ul>
                <li>**Skalabilitas**: Pengguna dapat dengan mudah menambah atau mengurangi sumber daya sesuai kebutuhan.</li>
                <li>**Biaya Efektif**: Mengurangi kebutuhan investasi awal untuk perangkat keras dan perangkat lunak.</li>
                <li>**Aksesibilitas**: Data dan aplikasi dapat diakses dari mana saja dengan koneksi internet.</li>
                <li>**Pemulihan Bencana**: Menyediakan solusi pemulihan bencana yang lebih efisien dan terjangkau.</li>
            </ul>
            <p>Beberapa penyedia layanan cloud terkemuka termasuk Amazon Web Services (AWS), Google Cloud Platform (GCP), dan Microsoft Azure. Setiap penyedia layanan menawarkan berbagai layanan dan alat untuk membantu pengguna memanfaatkan teknologi cloud dengan cara yang paling efektif.</p>
            <a href="informasi.php" class="button">Kembali ke Beranda</a>
        </main>
        <footer>
            <p>&copy; 2024 Informasi IT. All rights reserved.</p>
        </footer>
    </div>
</body>
</html>
