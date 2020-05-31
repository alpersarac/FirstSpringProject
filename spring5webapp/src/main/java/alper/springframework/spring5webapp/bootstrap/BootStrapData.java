package alper.springframework.spring5webapp.bootstrap;
import  org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import alper.springframework.spring5webapp.domain.Author;
import alper.springframework.spring5webapp.domain.Book;
import alper.springframework.spring5webapp.repositories.AuthorRepository;
import alper.springframework.spring5webapp.repositories.BookRepository;
@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	
	public BootStrapData(AuthorRepository authorRepository,BookRepository bookRepository) {
		
		this.bookRepository = bookRepository;
		this.authorRepository=authorRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Author eric = new Author("Eric","Evans");
		Book ddd= new Book("domain driven design","123123");
		eric.getBook().add(ddd);
		ddd.getAuthors().add(eric);
		
		
		Author rod  = new Author("Rod","Johnson");
		Book noEJB= new Book("JEE Development without EJB","39393939");
		rod.getBook().add(noEJB);
		noEJB.getAuthors().add(rod);
		
		rod.getBook().add(noEJB);
		noEJB.getAuthors().add(rod);
		
		System.out.println("Started in Boostrap");
		System.out.println("Number of Books "+bookRepository.count());
		
	}

}
