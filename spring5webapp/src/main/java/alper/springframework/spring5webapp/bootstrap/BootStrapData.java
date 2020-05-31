package alper.springframework.spring5webapp.bootstrap;
import  org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import alper.springframework.spring5webapp.domain.Author;
import alper.springframework.spring5webapp.domain.Book;
import alper.springframework.spring5webapp.domain.Publisher;
import alper.springframework.spring5webapp.repositories.AuthorRepository;
import alper.springframework.spring5webapp.repositories.BookRepository;
import alper.springframework.spring5webapp.repositories.PublisherRepository;
@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	

	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		System.out.println("Started in Boostrap");
		
		Publisher publisher = new Publisher();
		publisher.setName("SFG PUBLISHER");
		publisher.setCity("St petersburg");
		publisher.setState("FL");
		
		publisherRepository.save(publisher);
		System.out.println("publisher count"+ publisherRepository.count());
		
		Author eric = new Author("Eric","Evans");
		Book ddd= new Book("domain driven design","123123");
		eric.getBook().add(ddd);
		ddd.getAuthors().add(eric);
		authorRepository.save(eric);
		bookRepository.save(ddd);
		
		
		
		Author rod  = new Author("Rod","Johnson");
		Book noEJB= new Book("JEE Development without EJB","39393939");
		rod.getBook().add(noEJB);
		noEJB.getAuthors().add(rod);
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		
	
		System.out.println("Number of Books "+bookRepository.count());
		
	}

}
