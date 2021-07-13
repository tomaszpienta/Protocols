<?php
//Fill with your creditiencials
$user = "";    
$password = "";    
$host ="";    
$db_name ="";    

$date = $_POST['date'];    
$pd_number = $_POST['pd_number'];  
$field = $_POST['field'];
$sr_num_dm9225 = $_POST['sr_num_dm9225'];	
$comments_dm9225 = $_POST['comments_dm9225'];    
$sr_num_switch = $_POST['sr_num_switch'];  
$comments_switch = $_POST['comments_switch'];
$sr_num_p0g = $_POST['sr_num_p0g'];	
$comments_p0g = $_POST['comments_p0g'];    
$sr_num_p1g = $_POST['sr_num_p1g'];  
$comments_p1g = $_POST['comments_p1g'];
$sr_num_p2g = $_POST['sr_num_p2g'];	
$comments_p2g = $_POST['comments_p2g'];    
$sr_num_p3g = $_POST['sr_num_p3g'];  
$comments_p3g = $_POST['comments_p3g'];
$ups = $_POST['ups'];	
$battery_pack = $_POST['battery_pack'];    
$rout_switch_media = $_POST['rout_switch_media'];  
$foreign_devic = $_POST['foreign_devic'];
$comments_others = $_POST['comments_others'];	
$switch1 = $_POST['switch1'];  
$switch2 = $_POST['switch2'];
$switch3 = $_POST['switch3'];	
$switch4 = $_POST['switch4'];    
$switch5 = $_POST['switch5'];  
$cleaning_filters = $_POST['cleaning_filters'];
$replacement_filter = $_POST['replacement_filter'];	
$study_ups = $_POST['study_ups'];    
$cleaning_cabinet = $_POST['cleaning_cabinet'];  
$efficiency_of_the_cabinet = $_POST['efficiency_of_the_cabinet'];

$conn = mysqli_connect($host,$user,$password,$db_name);

$sql = "insert into protokoly 	(Date , pd_number , field ,sr_num_dm9225 ,comments_dm9225  ,
	sr_num_switch  , comments_switch  , sr_num_p0g  ,comments_p0g  , sr_num_p1g  , comments_p1g , 
	sr_num_p2g  ,comments_p2g  , sr_num_p3g  ,comments_p3g  ,ups  ,battery_pack  ,rout_switch_media ,
	foreign_devic  ,comments_others  ,switch1  ,switch2  ,switch3  ,switch4  ,switch5  ,cleaning_filters , 
	replacement_filter  ,study_ups  ,cleaning_cabinet  ,efficiency_of_the_cabinet) values 	('$date' , '$pd_number' , '$field' ,'$sr_num_dm9225' ,
	'$comments_dm9225'  ,'$sr_num_switch'  , '$comments_switch'  , '$sr_num_p0g'  ,'$comments_p0g'  , '$sr_num_p1g'  , 
	'$comments_p1g'  , '$sr_num_p2g'  ,'$comments_p2g'  , '$sr_num_p3g'  ,'$comments_p3g'  ,'$ups'  ,'$battery_pack'  ,
	'$rout_switch_media'  ,'$foreign_devic'  ,
	'$comments_others'  ,'$switch1'  ,'$switch2'  ,'$switch3','$switch4'  ,'$switch5'  ,'$cleaning_filters'  , 
	'$replacement_filter'  ,'$study_ups'  ,'$cleaning_cabinet'  ,'$efficiency_of_the_cabinet');";

if (mysqli_query($conn, $sql)) {
  echo "New record created successfully";
} 
else{
     echo "Connection could not be established.<br />";
	 die("Connection failed: " . mysqli_connect_error());
}
mysqli_close($conn);
?>
