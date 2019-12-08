package com.library.user.userApp;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class user_controller {
	
	private repository resp;
	@RequestMapping(value="/get_user/{id}")
	public String getName(@PathVariable("id") ObjectId id) {
		user us=resp.findBy_id(id);
		return us.name;
	}
	@RequestMapping(value="/get_users")
	public List<user> getusers(){
		return resp.findAll();
	}
}
