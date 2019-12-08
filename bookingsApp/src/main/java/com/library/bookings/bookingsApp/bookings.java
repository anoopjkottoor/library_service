package com.library.bookings.bookingsApp;
import org.springframework.data.mongodb.core.mapping.Document;			
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Document(collection="bookings")
public class bookings {
	@Id
	public ObjectId bookingid;
	public ObjectId userid;
	public ObjectId bookid;
	public String dateIssue;
	public String dateReturn;
	
	public bookings() {}
	public bookings(ObjectId bookingid,ObjectId userid,ObjectId bookid, String dateIssue,String dateReturn) {
		this.bookingid=bookingid;
		this.userid=userid;
		this.bookid=bookid;
		this.dateIssue=dateIssue;
		this.dateReturn=dateReturn;
	}
	public ObjectId getBookingid() {
		return bookingid;
	}
	public void setBookingid(ObjectId bookingid) {
		this.bookingid = bookingid;
	}
	public ObjectId getUserid() {
		return userid;
	}
	public void setUserid(ObjectId userid) {
		this.userid = userid;
	}
	public ObjectId getBookid() {
		return bookid;
	}
	public void setBookid(ObjectId bookid) {
		this.bookid = bookid;
	}
	public String getDateIssue() {
		return dateIssue;
	}
	public void setDateIssue(String dateIssue) {
		this.dateIssue = dateIssue;
	}
	public String getDateReturn() {
		return dateReturn;
	}
	public void setDateReturn(String dateReturn) {
		this.dateReturn = dateReturn;
	}
	
}
