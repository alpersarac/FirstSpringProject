package alper.springframework.spring5webapp.domain;
import java.util.HashSet;
import  java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	private String firstName;
	private String lastName;
	@ManyToMany(mappedBy = "authors")
	private Set<Book> book = new HashSet<Book>();
	
	public Author() {
	}

	public Author(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", book=" + book + "]";
	}

	@Override
	public boolean equals(Object o) {
		if(this==o)return true;
		if(o==null||getClass()!=o.getClass())return false;
		Author author = (Author) o ;
		return id!=null? id.equals(author.id):author.id==null;
		
		
	}
	@Override
	public int hashCode() {
		return id != null? id.hashCode():0;
	}
	

}
