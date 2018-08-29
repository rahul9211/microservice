#!/bin/bash
sudo mvn clean install
sudo docker-compose -d down
sudo docker-compose up
