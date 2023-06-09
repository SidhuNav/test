package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// entity is a class in orm which is mapped to a table in the db
// mapping is done through annotations

@Entity // inform hiberante that this class is an entity
@Table(name="book_details") // mapping the entity class in java to the table book_details in the DB
public class BookEntity {
	
	@Id // informs the framework that this is the primary key column
	@GeneratedValue(strategy = GenerationType.IDENTITY) // informs the framework that it is an autogenerated identity column
	@Column(name="book_id") // maps the property id to the column book_id of the DB
	private int id;
	
	@Column(name="book_title")
	private String bookTitle;
	
	@Column(name="book_genre")
	private String bookGenre;
	
	@Column(name="book_author")
	private String bookAuthor;
	
	@Column(name="book_cost")
	private int bookCost;
	
	@Column(name="book_image_url")
	private String bookImage;

	// association mappings - for foreign key columns
	
	// framework expects you to provide a default constructor
	public BookEntity() {
	
	}

	public BookEntity(String bookTitle, String bookGenre, String bookAuthor, int bookCost, String bookImage) {
		super();
		this.bookTitle = bookTitle;
		this.bookGenre = bookGenre;
		this.bookAuthor = bookAuthor;
		this.bookCost = bookCost;
		this.bookImage = bookImage;
	}

	public BookEntity(int id, String bookTitle, String bookGenre, String bookAuthor, int bookCost, String bookImage) {
		super();
		this.id = id;
		this.bookTitle = bookTitle;
		this.bookGenre = bookGenre;
		this.bookAuthor = bookAuthor;
		this.bookCost = bookCost;
		this.bookImage = bookImage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookCost() {
		return bookCost;
	}

	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}

	public String getBookImage() {
		return bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}

	@Override
	public String toString() {
		return "BookEntity [id=" + id + ", bookTitle=" + bookTitle + ", bookGenre=" + bookGenre + ", bookAuthor="
				+ bookAuthor + ", bookCost=" + bookCost + ", bookImage=" + bookImage + "]";
	}
	
}
