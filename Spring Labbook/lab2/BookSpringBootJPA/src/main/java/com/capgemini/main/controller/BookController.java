package com.capgemini.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.main.entity.Books;
import com.capgemini.main.service.BookServiceI;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookServiceI bookService;
	
	@PostMapping("/book") //insert the data to database
	public ResponseEntity<Books> saveBook(@RequestBody Books b) 
	{
		Books tk = bookService.save(b);
		return new ResponseEntity<Books>(tk,HttpStatus.OK);
	}
	
	@PutMapping("/updateBook/{BookId}")
	public ResponseEntity<Books> updateBook(@PathVariable("BookId") int id,@RequestBody Books b)
	{
	    if (bookService.existsById(id)==false)
		{
	    	 return new ResponseEntity<Books>(HttpStatus.NOT_FOUND);

		}
	    bookService.updateData(b);
	    return new ResponseEntity<Books>(b,HttpStatus.OK);	
	}
	
	@GetMapping("/getBook/{BookId}")
    public ResponseEntity<Books> getBook(@PathVariable("TranieeId") int id) 
	{	
		if(bookService.existsById(id)) 
		{
			Books bk = bookService.findById(id);
			return new ResponseEntity<Books>(bk,HttpStatus.OK);
		}
		return new ResponseEntity<Books>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/deleteBook/{BookId}")
    public ResponseEntity<Books> deleteBookId(@PathVariable("BookId") int id) 
	{
		if(bookService.existsById(id))
		{
			bookService.deleteById(id);
			return new ResponseEntity<Books>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Books>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/getBookDetails")
    public ResponseEntity<List<Books>> getAllBookDetails() 
	{
		List<Books> bookList = bookService.findAll();
		return new ResponseEntity<List<Books>>(bookList,HttpStatus.OK);
	}
	
	/*@GetMapping("/data")
    public ResponseEntity<String> data() 
    {
		String s="data";
		return new ResponseEntity<String>(s,HttpStatus.OK);
	}*/
	
}
