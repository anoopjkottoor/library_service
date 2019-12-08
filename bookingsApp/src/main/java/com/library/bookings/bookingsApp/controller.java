package com.library.bookings.bookingsApp;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.ribbon.proxy.annotation.Http.HttpMethod;

@RestController
@RequestMapping(value="/bookings")
public class controller {
	@Autowired
	RestTemplate restTemplate;
	bookings bk=new bookings();
	@RequestMapping(value="/newbooking",method= RequestMethod.POST)
	public String newbooking(@RequestBody ObjectId user,@RequestBody ObjectId book,@RequestBody String dateIssue,@RequestBody String dateReturn) {
		
		String username=restTemplate.exchange("https://library_service/get_user/{user}",
				HttpMethod.GET,null,new ParameterizedTypeReference<String>() {},user).getBody();
		String bookname=restTemplate.exchange("https://library_service/get_bookname/{book}",
				HttpMethod.GET,null,new ParameterizedTypeReference<String>() {},book).getBody();
		bk.bookid=ObjectId.get();
		bk.userid=user;restTemplate.
		bk.bookid=book;
		bk.dateIssue=dateIssue;
		bk.dateReturn=dateReturn;
		String s=bookname+" Issued to "+ username;
		return s;
		}
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
        return new RestTemplate();
	}
}
