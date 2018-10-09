<?php
try {
    $db = new PDO('mysql:host=localhost;dbname=zinute;charset=utf8mb4', 'root', '');
    $name = $_POST['fullName'];
    $email = $_POST['email'];
    $message = $_POST['message'];

    $result = $db->exec("INSERT INTO `zinutes`(`name`, `email`, `message`) VALUES ('".$name."', '".$email."', '".$message."')");
    $insertId = $db->lastInsertId();

    foreach ($db->query('SELECT * FROM zinutes') as $row) {
        echo $row['name'] . ' ' . $row['email'] . ' ' . $row['message'].'<br>'; //etc...
    }

} catch (PDOException $ex) {
    echo "An Error occured!" . $ex->getMessage(); //user friendly message

}