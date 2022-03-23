### Use next command in terminal to use and see profile `dev`:
1) mvn clean package -Pdev 
2) java -cp target/task1-1.0-SNAPSHOT.jar by.it.academy.App

* db.password=password
* db.driverClassName=com.mysql.jdbc.Driver
* db.username=test
* db.url=jdbc:mysql://localhost:3306/dev


### Use next command in terminal to use and see profile `prod`:
1) mvn clean package -Pprod
2) java -cp target/task1-1.0-SNAPSHOT.jar by.it.academy.App

* db.password=32459fdgfkd0345l345d7g
* db.driverClassName=org.postgresql.Driver
* db.username=s_khomiakov
* db.url=jdbc:postgresql://194.195.241.62:5432/s_khomiakov_db

