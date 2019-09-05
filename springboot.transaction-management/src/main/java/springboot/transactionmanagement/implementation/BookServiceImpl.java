package springboot.transactionmanagement.implementation;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.transactionmanagement.example01.entity.BookEntity;
import springboot.transactionmanagement.example01.repository.IBookRepository;
import springboot.transactionmanagement.example01.service.IBookService;

@Service("bookServiceImpl")
public class BookServiceImpl implements IBookService{
	
	@Autowired
	private IBookRepository bookRepository;
	
	public BookEntity findByBookId(int bookId) {
		BookEntity bookEntity = bookRepository.findByBookId(bookId);
		return bookEntity;
	}
	
	@Transactional
	public BookEntity saveBook(BookEntity bookEntity) {
		BookEntity bookEntity01 = bookRepository.save(bookEntity);
		return bookEntity01;
	}
}
