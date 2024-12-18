# Advanced User Management Microservices

This is an advanced-level microservices project for user management, built using Spring Boot and Docker.

## Features
- Authentication (JWT-based)
- Role-Based Access Control (RBAC)
- CRUD operations for users
- Kubernetes support with Kustomize
- Centralized API definition
- Dockerized application with CI/CD support

## Running Locally
1. Build and run the application:
   ```bash
   docker-compose up --build
   ```

2. Access the API at:
   - `http://localhost:8080/api`

## Kubernetes Deployment

### Prerequisites
- A Kubernetes cluster (Minikube, AKS, EKS, GKE, etc.)
- `kubectl` installed and configured
- Docker image pushed to a registry accessible by the cluster (e.g., Docker Hub)

### Steps
1. Apply the base configuration:
   ```bash
   kubectl apply -k k8s/base
   ```

2. Access the application through the Kubernetes service:
   ```bash
   kubectl port-forward service/user-management 8080:80
   ```

3. Open the API at `http://localhost:8080/api`.

## CI/CD
The project includes a GitHub Actions pipeline for continuous integration.
