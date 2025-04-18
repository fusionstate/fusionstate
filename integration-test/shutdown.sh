#! /bin/bash

./foundationdb/shutdown.sh
./kafka/shutdown.sh
./postgres/shutdown.sh

docker-compose down
