package com.qing.domain;

/**
 * @author 卿
 * @create 2020-12-23 9:55
 */
public class Books {
//    id int primary key auto_increment,
//    book_name varchar (255),
//    book_price int,
//    book_details varchar (255)
    private int id;
    private String bookName;
    private int bookPrice;
    private String bookDetails;

    public Books(int id, String bookName, int bookPrice, String bookDetails) {
        this.id = id;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookDetails = bookDetails;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookDetails='" + bookDetails + '\'' +
                '}';
    }

    public Books() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(String bookDetails) {
        this.bookDetails = bookDetails;
    }
}
