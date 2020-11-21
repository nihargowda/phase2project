DATABASE

CREATE TABLE `airaway`.`airlinedetails` ( `id` VARCHAR(10) NOT NULL , `airline` VARCHAR(20) NOT NULL , `source` VARCHAR(20) NOT NULL , `destination` VARCHAR(20) NOT NULL , `price` VARCHAR(20) NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;






next




INSERT INTO `airlinedetails` (`id`, `airline`, `source`, `destination`, `price`) VALUES ('1', 'airbangalore', 'bangalore', 'hyderbadh', '4000'), ('2', 'airbangalore', 'hyderbadh', 'bangalore', '4000'), ('3', 'airway', 'bangalore', 'chennai', '3500'), ('4', 'airway', 'chennai', 'bangalore', '3500'), ('5', 'airbangalore', 'bangalore', 'kolkata', '6000'), ('6', 'airway', 'kolkata', 'bangalore', '6000'), ('7', 'airway', 'hyderbadh', 'chennai', '5000'), ('8', 'airway', 'chennai', 'hyderbadh', '5000'), ('9', 'airway', 'kolkata', 'chennai', '8000'), ('10', 'airway', 'chennai', 'kolkata', '8000'), ('11', 'airway', 'hyderbadh', 'kolkata', '7500'), ('12', 'airway', 'kolkata', 'hyderbadh', '6000'), ('13', 'airbangalore', 'bangalore', 'delhi', '9000'), ('14', 'airbangalore', 'delhi', 'bangalore', '9000'), ('15', 'airway', 'delhi', 'chennai', '10000'), ('16', 'airway', 'chennai', 'delhi', '10000'), ('17', 'airway', 'hyderbadh', 'delhi', '8000'), ('18', 'airway', 'delhi', 'hyderbadh', '8000')

 



next 


CREATE TABLE `airaway`.`adminlogin` ( `username` VARCHAR(20) NOT NULL , `password` VARCHAR(30) NOT NULL , PRIMARY KEY (`username`)) ENGINE = InnoDB;



next

INSERT INTO `adminlogin` ( `username`, `password`) VALUES ( 'admin', 'admin');
