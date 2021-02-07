package httpsspringboot.service;

import httpsspringboot.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookImpl implements IBook {

    JdbcTemplate jdbcTemplate;

    @Autowired
    public BookImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Book> getBookList() {
        String sql = "select * from book";
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Book.class));
        return books;
    }
}
