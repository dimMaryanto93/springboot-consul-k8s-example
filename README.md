# Springboot discovery service with consul

Discovery service is a part of microservices architecture, to run it this is system required:

- VirtualBox
- Docker
- minikube (kubernate platform)

## Configure minikube

start the kubernate platform with this command:

```bash
minikube start -p springboot2-discovery-service-consul
```

The output will show like this:

```bash
➜  ~ minikube start -p springboot2-discovery-service-consul
😄  minikube v1.0.0 on darwin (amd64)
🤹  Downloading Kubernetes v1.14.0 images in the background ...
🔥  Creating virtualbox VM (CPUs=2, Memory=2048MB, Disk=20000MB) ...
📶  "springboot2-discovery-service-consul" IP address is 192.168.99.111
🐳  Configuring Docker as the container runtime ...
🐳  Version of container runtime is 18.06.2-ce
⌛  Waiting for image downloads to complete ...
✨  Preparing Kubernetes environment ...
🚜  Pulling images required by Kubernetes v1.14.0 ...
🚀  Launching Kubernetes v1.14.0 using kubeadm ... 
⌛  Waiting for pods: apiserver proxy etcd scheduler controller dns
🔑  Configuring cluster permissions ...
🤔  Verifying component health .....
💗  kubectl is now configured to use "springboot2-discovery-service-consul"
🏄  Done! Thank you for using minikube!
```

checking status:

```bash
minikube -p springboot2-discovery-service-consul status
```

dashboard minikube:

```bash
minikube -p springboot2-discovery-service-consul dashboard
```
