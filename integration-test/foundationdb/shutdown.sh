#! /bin/bash

echo "cleaning up foundationdb"

FDB_CLUSTER_FILE="${FDB_CLUSTER_FILE:-foundationdb/docker.cluster}"

fdbcli -C $FDB_CLUSTER_FILE --exec "writemode on ; clearrange \x00 \xff" --timeout 10
