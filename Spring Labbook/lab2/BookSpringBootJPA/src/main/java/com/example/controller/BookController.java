package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Books;
import com.example.service.BookServiceI;

@RestController
@RequestMapping("/book")
public class BookController 
{
	@Autowired
	private BookServiceI bookService;
	
	@PostMapping("/book") //insert the data to database
	public ResponseEntity<Books> saveBook(@RequestBody Books b) 
	{
		Books book=bookService.save(b);	
		return new ResponseEntity<Books>(book,HttpStatus.NO_CONTENT);
	}
	
	/*@PutMapping("/updateBook/{bookId}") // update the data in database
	public ResponseEntity<Books> updateBook(@PathVariable("bookId") int id,@RequestBody Books b)
	{
		if (bookService.existsById(id))
		{
	    	 return new ResponseEntity<Books>(HttpStatus.NOT_FOUND);
		}
		bookService.updateData(b);
	    return new ResponseEntity<Books>(b,HttpStatus.OK);	
	}*/
	
	@GetMapping("/getBook/{bookId}") // retrieve the data in database
    public ResponseEntity<Books> getId(@PathVariable("bookId") int id) 
	{
		if(bookService.existsById(id) != null) 
		{
			Books bk = bookService.findById(id);
			return new ResponseEntity<Books>(bk,HttpStatus.OK);
		}
		return new ResponseEntity<Books>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/deleteBook/{bookId}") // delete the data in database
    public ResponseEntity<Books> deleteId(@PathVariable("bookId") int id) {
		if(bookService.existsById(id) != null)
		{
			bookService.deleteById(id);
		return new ResponseEntity<Books>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Books>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/getBookDetails") // retrieve all data present in database
    public ResponseEntity<List<Books>> getAllBookDetails() 
	{
			List<Books> bookList = bookService.findAll();
			return new ResponseEntity<List<Books>>(bookList,HttpStatus.OK);
	}
}
