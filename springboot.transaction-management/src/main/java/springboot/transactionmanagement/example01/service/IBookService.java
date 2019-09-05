package springboot.transactionmanagement.example01.service;

import org.springframework.stereotype.Service;

import springboot.transactionmanagement.example01.entity.BookEntity;

@Service
public interface IBookService {
	
	public BookEntity findByBookId(int bookId);
	public BookEntity saveBook(BookEntity bookEntity);
	
}
