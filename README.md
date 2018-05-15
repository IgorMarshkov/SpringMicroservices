# SpringMicroservices
TODO: Need to add the Docker to simplify deploying microservices

The app includes following services,
* Zuul proxy service is available under the 8765 port. The proxy service provides access to the Shop service by following path,
http://YOUR_HOST:8765/api/shop/
* Eureka discovery service is available under the 8761 port
* Zipkin tracing service is available under the 9411 port
* Shop service is available under the 2222 port
* Store service is available under the 1111 port 
