package com.library.bookings.bookingsApp;

import org.bson.types.ObjectId;	
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends MongoRepository<bookings, String> {
	 bookings findBy_id(ObjectId _id);
}
