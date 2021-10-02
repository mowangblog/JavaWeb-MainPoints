package top.mowangblog.pojo;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * JavaWeb-MainPoints
 * 书类
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021-10-02 22:33
 **/
public class Book {
    private String id;
    private String name;
    private String  author;
    private Double price;

    public Book(String id, String name, String author, Double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
