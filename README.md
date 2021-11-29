# RabbitMQ-SpringBoot
Integration of Rabbit MQ with Spring Boot application

## RabbitMQ Docker Installation and Run Command
```docker
docker pull rabbitmq:3-management
docker run -d --hostname my-rabbit --name some-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management
```
RabbitMQ Management tool can be accessible at http://localhost:15672/.
