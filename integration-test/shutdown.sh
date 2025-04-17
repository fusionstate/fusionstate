#! /bin/bash

./foundationdb/shutdown.sh
./kafka/shutdown.sh

docker-compose down
