package POJO;

public class BookingPOJO {
	private  String bookdsc;
	private String bookid;
	private String booktype;
	private double cost;
	private room room;
	public String getBookdsc() {
		return bookdsc;
	}
	public void setBookdsc(String bookdsc) {
		this.bookdsc = bookdsc;
	}
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getBooktype() {
		return booktype;
	}
	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public room getRoom() {
		return room;
	}
	public void setRoom(room room) {
		this.room = room;
	}

}
