https://www.youtube.com/watch?v=KPLJ0i5Ocws&t=56s&ab_channel=jusaf
1)
docker-compose -f compose-env.yaml -d
dockerFile

FROM alpine:3.17

RUN apk add openjdk11

./gradlew clean build

 psql -U postgres
=root !!!!!!!!!!!!!!
if(
docker run -ti --rm -e DATASOURCE_HOST=192.168.0.1 arigelis/kuber-api:1.0.0
)=
Suppressed: org.postgresql.util.PSQLException: �����: � pg_hba.conf ��� ������ ��� ���������� "172.23.208.1", ������������ "postgres", ���� "postgres", ��� ����������
2).\build_and_push.sh

3) docker run -ti --rm -e DATASOURCE_HOST=192.168.1.15 -p 8081:8080 arigelis/kuber-api:1.0.0
--------------------------------------------------------------------------------------------
flow:	START
.\kind delete cluster
.\kind create cluster --config .\kind-config.yaml
kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/main/deploy/static/provider/kind/deploy.yaml
kubectl wait --namespace ingress-nginx --for=condition=ready pod --selector=app.kubernetes.io/component=controller --timeout=90s
kubectl apply -f .\k8s\deployment.yaml
check local: kubectl port-forward kuber-api-65c4b99b47-58582  8899:8080
kubectl apply -f .\k8s\service.yaml
kubectl apply -f .\k8s\ingress.yaml
	END
-------------------------------------------------------------------------------------------

