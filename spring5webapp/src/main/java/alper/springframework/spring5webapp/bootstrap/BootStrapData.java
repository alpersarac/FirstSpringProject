package alper.springframework.spring5webapp.bootstrap;
import  org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import alper.springframework.spring5webapp.repositories.AuthorRepository;
import alper.springframework.spring5webapp.repositories.BookRepository;
@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	
	public BootStrapData(BookRepository bookRepository,AuthorRepository authorRepository) {
		
		this.bookRepository = bookRepository;
		this.authorRepository=authorRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
