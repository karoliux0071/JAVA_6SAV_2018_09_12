<?php
try {
    $db = new PDO('mysql:host=localhost;dbname=cryptoworld.org;charset=utf8mb4', 'root', '');
    $email = $_REQUEST['email'];
    $name = $_REQUEST['name'];
    $message = $_REQUEST['message'];
    $result = $db->exec("INSERT INTO `cryptoworld.org`(`email`, `name`, `message`) VALUES ('".$name."', '".$email."', '".$message."')");
    $insertId = $db->lastInsertId();

} catch (PDOException $ex) {
    echo "An Error occured!" . $ex->getMessage(); //user friendly message
}

