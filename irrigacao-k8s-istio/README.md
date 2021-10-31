## Base para o kubernetes com o Istio

### Nesta pasta contém os arquivos para execução dos containers no Kubernetes com o Istio

### Instalação Istio
curl -L http://istio.io/downloadIstio | sh -

### Instalar o Istio no Kubernetes
istioctl install --set profile=demo -y

### Verificar namespace 'istio-system' no Kubernetes
kubectl get namespace

### Verificar pods do Kubernetes
kubectl get pods

### Habilitar o Istio no pod default do kubernetes
kubectl label namespace default istio-injection=enabled

### Subir aplicação para o kubernetes
kubectl apply -f deployment.yaml

### Verificar services do Kubernetes
kubectl get service

### Criar service de gateway
kubectl apply -f gateway.yaml

### Verificar gateway
kubectl get service istio-ingressgateway -n istio-system

### Aplicar regras do circuit breaker
kubectl apply -f destinationrules.yaml
