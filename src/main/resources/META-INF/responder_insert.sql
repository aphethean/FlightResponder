#
# Populate your responder inmemory database with some test values
#
# For example:
INSERT INTO `Airport`(`name` , `code` , `country`) VALUES('abc' , 'abc' , 'abc');
INSERT INTO `Flight`(`flightID` , `takeoffTime`) VALUES('1' , '2012-08-15 00:00:00');	
INSERT INTO `Flight`(`flightID` , `takeoffTime`) VALUES('2' , '2012-08-15 00:00:00');   
INSERT INTO `Flight`(`flightID` , `takeoffTime`) VALUES('3' , '2012-08-15 00:00:00');   
INSERT INTO `FlightSchedule`(`flightNo` , `arrivalAirportCode` , `arrivalTime` , `departureTime` , `departureAirportCode` , `flightScheduleID` , `firstDeparture` , `lastDeparture`) VALUES('abc' , 'abc' , '05:45:30' , '05:45:30' , 'abc' , '1' , '2012-08-15 00:00:00' , '2012-08-15 00:00:00');	
