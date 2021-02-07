package httpsspringboot.controller;


import httpsspringboot.service.BookImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    BookImpl bookService;

    @GetMapping("/list")
    public ResponseEntity<?> getBookList() {

//        return ResponseEntity.ok(Arrays.asList("1", "2", "3"));
        return ResponseEntity.ok(bookService.getBookList());
    }
}
