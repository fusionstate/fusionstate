#! /bin/bash

docker-compose up -d

./foundationdb/setup.sh
./kafka/setup.sh
./postgres/setup.sh
