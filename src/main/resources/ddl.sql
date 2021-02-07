CREATE TABLE book (
   id INT NOT NULL primary key auto_increment,
   name VARCHAR(255) NOT NULL,
   isbn VARCHAR(50) NOT NULL,
   year VARCHAR(4) NOT NULL,
   topic VARCHAR(255) NOT NULL
);
