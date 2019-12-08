package com.library.books.bookApp;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repository extends MongoRepository<books, String> {
	 books findBy_id(ObjectId _id);
}
