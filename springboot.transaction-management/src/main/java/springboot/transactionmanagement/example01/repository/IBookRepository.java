package springboot.transactionmanagement.example01.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springboot.transactionmanagement.example01.entity.BookEntity;

@Repository
public interface IBookRepository extends CrudRepository<BookEntity,Serializable> {
	
	public BookEntity findByBookId(int bookId);
	
}
