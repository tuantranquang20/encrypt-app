# encrypt-app
1. run docker-compose up
2. go to container of mysql. access root@"ip-encrypt-app" 
``
CREATE USER 'root'@'%' IDENTIFIED BY 'some_pass';
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%';
``
