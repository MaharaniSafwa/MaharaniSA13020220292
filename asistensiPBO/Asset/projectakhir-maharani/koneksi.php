<?php
$host = "localhost";
$username = "root";
$password = "";
$dbname = "Modul7";

$koneksi = mysqli_connect($host, $username, $password, $dbname);

if (!$koneksi) {
    die("Koneksi gagal: " . mysqli_connect_error());
}
?>
