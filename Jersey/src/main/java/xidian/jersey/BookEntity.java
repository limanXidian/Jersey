package xidian.jersey;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BookEntity {
	private String name;
	private Long isbn;
	private double price;
	private String author;
	
	public BookEntity() {
		super();
	}

	public BookEntity(String name, Long isbn, double price, String author) {
		super();
		this.name = name;
		this.isbn = isbn;
		this.price = price;
		this.author = author;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the isbn
	 */
	public Long getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BookEntity{" + "name='" + name + '\''
				+ ", isbn='" + isbn + '\'' + ", price='" + price + '\''
				+ ", author='" + author + '\'' + '}';
	}
}
