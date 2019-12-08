package com.library.user.userApp;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class user {
	@Id
	public ObjectId _id;
	public String name;
	public String sex;
	
	
	public user() {}
	public user(ObjectId _id, String name, String sex) {
		this._id=_id;
		this.name=name;
		this.sex=sex;
		
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	

}
