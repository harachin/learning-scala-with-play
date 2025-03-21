FROM harachin/learning-api-base:1.0.1

USER root

# Install packages
RUN apt-get update && apt-get install -y \
    default-mysql-client \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

USER maintainer

WORKDIR /api

EXPOSE 3000
