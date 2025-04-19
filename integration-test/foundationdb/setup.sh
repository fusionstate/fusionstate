#! /bin/bash

echo "initiating foundationdb"

FDB_CLUSTER_FILE="${FDB_CLUSTER_FILE:-foundationdb/docker.cluster}"
FDB_PORT="${FDB_PORT:-4550}"
echo "docker:docker@127.0.0.1:$FDB_PORT" > $FDB_CLUSTER_FILE

if ! fdbcli -C $FDB_CLUSTER_FILE --exec status --timeout 1 ; then
    if ! fdbcli -C $FDB_CLUSTER_FILE --exec "configure new single memory ; status" --timeout 10 ; then
        echo "Unable to configure new FDB cluster."
        exit 1
    fi
fi

echo "Can now connect to docker-based FDB cluster using $FDB_CLUSTER_FILE."
