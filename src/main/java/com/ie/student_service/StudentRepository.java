package com.ie.student_service;

import org.springframework.boot.autoconfigure.mongo.MongoConnectionDetails;
import org.springframework.stereotype.Service;

@Service
public interface StudentRepository extends MongoConnectionDetails {
}
