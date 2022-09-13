package seanx63.SimpleBookSite.Domain;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "ISBN")
    private String isbn;
    @Column(name = "ISBN-13")
    private String isbn13;
    private String author, name, publisher, ddname; // ddname = dewey decimal name
    private short year;
    private float ddc; // dewey decimal classification

    public Book() {
    }

    public Book(String isbn, String isbn13, String author, String name, String publisher, String ddname, short year, float ddc) {
        this.isbn = isbn;
        this.isbn13 = isbn13;
        this.author = author;
        this.name = name;
        this.publisher = publisher;
        this.ddname = ddname;
        this.year = year;
        this.ddc = ddc;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public float getDdc() {
        return ddc;
    }

    public void setDdc(float ddc) {
        this.ddc = ddc;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDdname() {
        return ddname;
    }

    public void setDdname(String ddname) {
        this.ddname = ddname;
    }
}
