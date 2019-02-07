#!/usr/bin/env bash

cd microservices/core/stock-service;                ./gradlew clean publishToMavenLocal; cd -

cd microservices/support/discovery-server;            ./gradlew clean build; cd -
cd microservices/support/edge-server;                 ./gradlew clean build; cd -

