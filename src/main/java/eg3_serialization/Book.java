package eg3_serialization;

import java.io.Serializable;
/**
 * Serializable is a marker interface which has no methods
 * 
 *
 */
public class Book implements Serializable {

	private String title;
	
	//During Serialization, transient fields are not saved. It would be null.
	transient private Integer price;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	public Book(String title, Integer price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	
}
