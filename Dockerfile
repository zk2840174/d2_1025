FROM ubuntu:latest
LABEL authors="cooki"

ENTRYPOINT ["top", "-b"]