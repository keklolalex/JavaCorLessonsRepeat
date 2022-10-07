package ru.itmo.lessons.lesson6; //всегда надо прописать вручную если не отобразился
//класс находится в структуре пакета по ссылке выше

import ru.itmo.lessons.lesson6.books.Author; //импорт класса Author
import ru.itmo.lessons.lesson6.books.Book;
import ru.itmo.lessons.lesson6.books.Shelf;


//полное имя класса: ru.itmo.lessons.lesson6 + Application
public class Application {
    public static void main(String[] args) {
        //создаем обьект класса Author или экземпляр класса Author
        //вызов конструктора типаДанных имяПеременной = new вызовКонструктора();
        //разные обьекты
        Author author1 = new Author();
        Author author2 = new Author();

        //обращение к свойствам полям и атрибутам осуществляется через точку .
        author1.name = "Петр";
        author1.surname = "Смит";

        System.out.println(author2.name); //null
        System.out.println(author2.surname); //null

        author2.name = "Коля";
        author2.surname = "Джой";

        System.out.println(author2.name);
        System.out.println(author2.surname);

        System.out.println(author1);
        System.out.println(author2);

        //вызов метода через точку
        //но в программе мы не можем использовать
        author1.printFullName(); //void
        String fullName = author1.getFullName();
        System.out.println(fullName);

        Book book1 = new Book();
        System.out.println(book1);
        book1.setPageCount(30); // копируется в переменную count и проверяется на < 10 и выводит результат
        //присваивается валидное значение

        System.out.println(book1.getPageCount());

        book1.setAuthor(author1);

        // вызов метода осуществляется через .
        author1.printFullName(); // void
        String fullName = author2.getFullName();

        System.out.println(fullName);


        Book book1 = new Book();
        book1.setPageCount(22);
        System.out.println(book1.getPageCount());
        book1.setAuthor(author1);

        System.out.println(book1);

        Book book2 = new Book();
        book2.setPageCount(1300);
        System.out.println(book2.getPageCount());
        book2.setAuthor(author1);

        Book book3 = new Book();
        book3.setPageCount(670);
        System.out.println(book3.getPageCount());
        book3.setAuthor(author2);

        Book book4 = new Book();
        book4.setPageCount(670);
        System.out.println(book4.getPageCount());
        book4.setAuthor(author2);

        Shelf shelf = new Shelf();
        shelf.addBook(book1);
        shelf.addBook(book2);
        shelf.addBook(book3);
        shelf.addBook(book4);

        System.out.println(shelf);






    }
}
