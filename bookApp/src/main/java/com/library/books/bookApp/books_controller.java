package com.library.books.bookApp;

import java.util.List;	

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class books_controller {
	@Autowired
	private repository resp;
	@RequestMapping(value="/get_bookname/{id}")
	public String getname(@PathVariable("id") ObjectId id) {
		books bk=resp.findBy_id(id);
		return bk.name;
		
	}
	@RequestMapping(value="/get_bookss")
	public List<books> getusers(){
		return resp.findAll();

}
}
