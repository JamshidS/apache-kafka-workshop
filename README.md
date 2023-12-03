# Apache Kafka with Spring Boot Workshop

## Overview

This repository contains the code and resources for a two-day workshop on Apache Kafka with Spring Boot using Gradle as the build tool. The workshop focuses on the basics of Kafka and demonstrates how to integrate it into a Spring Boot application.

## Prerequisites

Before you begin, make sure you have the following installed:

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html) (version 17 or higher)
- [Apache Kafka](https://kafka.apache.org/downloads)
- [Apache ZooKeeper](https://zookeeper.apache.org/releases.html) (required by Kafka)

## Getting Started

1. **Clone the repository:**

   ```bash
   git@github.com:JamshidS/apache-kafka-workshop.git

2. Navigate to the project folder:
  ```bash
    cd apache-kafka-workshop
  ```
3. Run Kafka and ZooKeeper:
 ### Start ZooKeeper:
  - for windows
    ```bash
    zookeeper-server-start.bat config\zookeeper.properties
    ```
  - for mac
  ```bash
    bin/zookeeper-server-start.sh config/zookeeper.properties
  ```
### Start Kafka
 - for windows
 ```bash
  kafka-server-start.bat config\server.properties
 ```
- for mac
 ```bash  
  bin/kafka-server-start.sh config/server.properties
 ```
4. Run the Spring Boot application:
  ```bash
    ./gradlew bootRun
  ```
The application will be available at http://localhost:8080.

## Workshop Content
### Day 1
 - Module 1: Introduction to Apache Kafka
Understanding the fundamental concepts of Kafka
Installation and setup of Kafka and ZooKeeper
Creating topics and understanding partitions
- Module 2: Producing Messages with Terminal
Setting up a Apache Kafka into our Machine
Implementing a Kafka producer to send messages
Implementing a kafka consumer to receive messages

### Day 2
- Module 3: Seeting up Kafka with Spring Boot
Consuming Messages with Spring Boot
Implementing a Kafka consumer to receive and process messages
Handling different message formats and deserialization
- Module 4: Advanced Topics
Exploring Kafka configurations
