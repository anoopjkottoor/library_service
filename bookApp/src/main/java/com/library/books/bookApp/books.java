package com.library.books.bookApp;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="books")
public class books {
	@Id
	public ObjectId _id;
	public String name;
	public String author;
	public ObjectId current_user;
	public books() {}
	public books(ObjectId _id,String name,String author,ObjectId current_user) {
		this._id=_id;
		this.name=name;
		this.author=author;
		this.current_user=current_user;
	}
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public ObjectId getCurrent_user() {
		return current_user;
	}
	public void setCurrent_user(ObjectId current_user) {
		this.current_user = current_user;
	}
	
	

}
