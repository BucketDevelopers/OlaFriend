<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
if (isset($_GET["regId"]) && isset($_GET["message"])) {
    $regId = $_GET["regId"];
    $message = $_GET["message"];
    
    include_once './GCM.php';
    
    $gcm = new GCM();

    $registatoin_ids = array($regId);
    $message = array("price" => $message);

    $result = $gcm->send_notification($registatoin_ids, $message);

    echo $result;
}
else if (isset($_GET["phone"]) && isset($_GET["message"])){

	$phone = $_GET["phone"];
    $message = $_GET["message"];
    
    include_once './db_functions.php';
    include_once './GCM.php';
    
    $gcm = new GCM();
	$db = new DB_Functions();

	$regId = $db->getUserfromNum($phone);
    $registatoin_ids = array($regId);
    $message = array("price" => $message);

    $result = $gcm->send_notification($registatoin_ids, $message);

    echo $result;
}
?>
