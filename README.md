### Application Overview

This application intends to demonstrate the Hexagonal architecture by separating the domain, application & infrastructure layer.

* Application layer exposes Rest APIs to interact with the application.
* Domain layer has the core business fucntions like creating incomplete orders, adding products etc
* Infrastructure layer has the Spring configurations to create the service beans and implementations for repositories


### Testing the application

Build & run the application

Create orders with the below:
```agsl
curl --location 'http://localhost:8080/orders' \
--header 'Content-Type: application/json' \
--data '{
    "product" : {
        "id" : "fdb93fc0-8938-11ee-b9d1-0242ac120002",
        "price" : 30,
        "name" : "Ladder"
    }
}'
```

Grab the order UUID in response and use it to add product
```agsl
curl --location 'http://localhost:8080/orders/<ORDER_UUID>/products' \
--header 'Content-Type: application/json' \
--data '{
    "product" : {
        "id" : "4bb6cedc-8938-11ee-b9d1-0242ac120002",
        "price" : 25.5,
        "name" : "Big Hammer"
    }
}'
```
