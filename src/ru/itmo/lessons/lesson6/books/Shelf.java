package ru.itmo.lessons.lesson6.books;

import java.util.Arrays;

public class Shelf {
    private String color = "белый";
    private Book[] books = new Book[3]; // книги на полке

    public Shelf(int booksCount){ //new Shelf для точного указания массива для книги
        if (booksCount <= 0){
            throw new IllegalArgumentException("booksCount дб положительным");
        }
            books = new Book[booksCount];
    }

    // МОЖНО ЛИ РЕАЛИЗОВАТЬ ПОСЛЕДОВАТЕЛЬНОЕ ДОБАВЛЕНИЕ В МАССИВ БЕЗ ЦИКЛА?
    public void addBook(Book book){
        for (int i = 0; i < books.length; i += 1) { // перебираем массив книг на полке
            if (books[i] == null) { // если элемент равен null,
                books[i] = book; // значит в массив можно передать ссылку на книгу
                return; // и прервать метод, чтобы ссылка не заполнила весь массив //только если мы добавим элемент
                //и return прерывает метод
            }
        }
        System.out.println("Книге автора " + book.getAuthor().getFullName() + " не хватило места на полке ");
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "color='" + color + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}