./gradlew clean build
docker build . -t arigelis/kuber-api:1.0.0
docker push arigelis/kuber-api:1.0.0