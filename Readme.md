# Talk Floripa 2023
## Palestra: Como publicar minha aplicação Kubernetes com menos preocupação com o Azure Container Apps

### Build do container Docker
```
docker build -t waltercoan/contapptalkfloripa23:latest .
```

### Execução local no docker
```
docker-compose up -d
```

### Imagem docker no Docker Hub
[waltercoan/contapptalkfloripa23:latest](https://hub.docker.com/repository/docker/waltercoan/contapptalkfloripa23/general)


## Deploy de aplicações com Container Apps

### Direto do Dockerfile
```
az containerapp up -n contapp-talkfloripa-github-001 --resource-group rg-talkfloripa2023-brazilsouth-002 --source .
```

### Utilizando arquivo Docker Componse
```
az containerapp compose create -g rg-talkfloripa2023-brazilsouth-002 --environment contapp-talkfloripa-github-001-env --compose-file-path docker-compose.yaml
```

### Direto do repositório do Github e Github Actions
```
az containerapp up -n contapp-talkfloripa-github --environment contapp-talkfloripa-github-001-env --resource-group rg-talkfloripa2023-brazilsouth-002 --repo https://github.com/waltercoan/talkfloripa2023-containerapps
```

### Configuração escalabilidade com o Keda 

[KEDA CPU Scale](https://keda.sh/docs/2.11/scalers/cpu/)

```
ab -n 200 https://<containerapp>.azurecontainerapps.io/api/v1/users
```

