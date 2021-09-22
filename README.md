# Simple Spring Boot API + Docker + Kubernetes

The aim of this project is to create a simple spring boot application , dockerize it and manage with Kubernetes

# Summary
1. Created a spring boot app using * [spring initilzr](https://reactjs.org/docs/create-a-new-react-app.html).
2. Made a simple endpoint "/main" to return "Hello" + environment variable "name"
3. Built and packaged jar
4. Created a deployment , service , configmap and ingress yaml files

### Prerequisite
The requirements to run this project are as follows:

* Java >= 8
* Maven
* Docker
* Kubernetes(Minikube)


### Steps To Run This Application

1. cd into application directory
   
2. Set environment variable && Build java application
```bash
export name=Stakater && ./mvnw package && java -jar target/stakater-backend-0.0.1-SNAPSHOT.jar
```

3. Call endpoint
```bash
curl localhost:8077/main
```

4. Dockerize application && push to DockerHub 
   ( This step assumes you have logged in to dockerHub)
    * Build && Push
```bash
docker build -t {{dockerHubUsername}/stakater-backend} .
docker push {{dockerHubUsername}/stakater-backend}
```

5. Start minikube
```bash
minikube start
```

5. Retrieve minikube ip
```bash
minikube ip
```

6. Retrieve domain from ingress && add to /etc/hosts
```bash
 cat kubernetes/stakater-backend-ingress.yaml
```

7. Run the helm charts
```bash
helm create stakater-backend-chart stakater-backend-chart --values stakater-backend-chart/values.yaml
```
