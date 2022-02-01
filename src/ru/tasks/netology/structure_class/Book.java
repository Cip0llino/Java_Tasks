package ru.tasks.netology.structure_class;

public class Book {
    int numberOfPages, yearOfPublication;
    String name, genre;
    String author;
    int printRun;

    public Book(String name, int numberOfPages, int yearOfPublication, String genre, String author, int printRun) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
        this.author = author;
        this.printRun = printRun;

    }

    public void setPrintRun(int printRun) {
        this.printRun = printRun;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrintRun() {
        return printRun;
    }

    public String toString() {
        return "name: " + getName() + ", genre: " + getGenre() + ", author: " + getAuthor()
                + ", number of pages: " + getNumberOfPages() + ", year of publication: "
                + getYearOfPublication() + ", print run book; " + getPrintRun();
    }

    public static boolean compareBooksByTitle(Book book1, Book book2) {
        if (book1.getName().equals(book2.getName())) return true;
        return false;
    }

    public void searchByGenre(Book[] books) {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getGenre().equals("Educational")) {
                System.out.println("Книга: " + books[i].getName() + " относится к жанру - " + books[i].getGenre());
                count++;
            }
        }
        System.out.println("Всего найдено - " + count + " книги в этом жанре");
    }
}
