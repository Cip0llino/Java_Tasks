package ru.tasks.netology.structure_class;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Learn Java", 500, 2018, "Educational", "Neotology.ru", 100);
        Book book2 = new Book("Java", 350, 2019, "Educational", "Neotology.ru", 2000);
        Book book3 = new Book("Learn Java", 500, 2018, "Educational", "Neotology.ru", 10_000);
        Book book4 = new Book("Harry Potter", 750, 2015, "fantasy", "Joanne Rowling", 100_000);

        System.out.println("Book1 " + book1.toString());
        System.out.println("Book2 " + book2.toString());

        if (book1.compareBooksByTitle(book1, book3)) {
            System.out.println("Одинаковое название книг");
        } else
            System.out.println("Название у книг разное");

        System.out.println("Тираж книги " + book1.getName() + " составляет " + book1.getPrintRun());
        book1.setPrintRun(1500);
        System.out.println("Тираж книги " + book1.getName() + " составляет " + book1.getPrintRun());

        Book[] books = {book1, book2, book3, book4};

        book1.searchByGenre(books);

    }
}