package com.hexagon.demo.infrastructure.configuration;

import com.hexagon.demo.infrastructure.repository.mongo.SpringDataMongoOrderRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;



@EnableMongoRepositories(basePackageClasses = SpringDataMongoOrderRepository.class)
public class MongoDBConfiguration {
}
