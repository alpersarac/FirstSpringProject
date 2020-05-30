package alper.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import alper.springframework.spring5webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
