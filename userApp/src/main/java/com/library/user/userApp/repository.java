package com.library.user.userApp;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends MongoRepository<user, String> {
	 user findBy_id(ObjectId _id);
}
