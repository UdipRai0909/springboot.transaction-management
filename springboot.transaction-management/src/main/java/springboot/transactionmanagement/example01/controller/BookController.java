package springboot.transactionmanagement.example01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.transactionmanagement.example01.entity.BookEntity;
import springboot.transactionmanagement.example01.service.IBookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private IBookService bookService;
	
	@RequestMapping(value="/getBook", method=RequestMethod.GET)
	public BookEntity getBookDetails(int bookId) {
		BookEntity bookResponse = bookService.findByBookId(bookId);
		return bookResponse;
	}
	
	@RequestMapping(value="/saveBook", method=RequestMethod.POST)
	@ResponseBody
	public BookEntity saveBook(@RequestBody BookEntity bookEntity) {
		BookEntity bookResponse = bookService.saveBook(bookEntity);
		return bookResponse;
	}
}
