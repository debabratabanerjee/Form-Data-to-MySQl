<?php
  //server details created in XAMPP if in localhost server
    $host = "localhost";  
    $user = "root";  //common details
    $password = "";  
    $db_name = "login_database";  
      
    $conn=mysqli_connect($host,$user,$password,"$db_name");
    if(!$conn){
        die('Could not Connect MySql Server:' .mysql_error());
      }

      if(isset($_POST['save']))
      {    
           $username = $_POST['username'];
           $password = $_POST['password'];
           
           $sql = "INSERT INTO login (username,pass)
           VALUES ('$username','$password')";
           if (mysqli_query($conn, $sql)) {
              echo "New record has been added successfully !";
           } else {
              echo "Error: " . $sql . ":-" . mysqli_error($conn);
           }
           mysqli_close($conn);
      }
?>
