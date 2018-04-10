package xidian.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import xidian.jersey.BookEntity;

@Path("/Books")
public class Books {
	@GET
	@Path("/getBook")
	@Produces(MediaType.APPLICATION_JSON)
	public BookEntity getBooksJson() {
		BookEntity book = new BookEntity("������񿪷�����", 123456789L, 50.00, "��");
		return book;
	}
}
