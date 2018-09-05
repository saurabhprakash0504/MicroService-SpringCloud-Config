The client will take some time to fetch the details from the server.......

http://localhost:8003/countryFruit

http://localhost:8002/capitalCountry

-----------------------------------------------------
SPRING CLOUD BUS

Spring cloud bus is used for dynamic configuration change. We dont have to restart the server if we are changing anything in the configuration file.

POST Request - sample url inorder to refresh. We can hit the request from POSTMAN 

 http://localhost:8003/actuator/bus-refresh (POST REQUEST)
