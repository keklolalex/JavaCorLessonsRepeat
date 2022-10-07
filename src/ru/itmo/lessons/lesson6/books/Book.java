package ru.itmo.lessons.lesson6.books;

public class Book {
    //свойства, характеристики

    //private модификатор - позволяет обратиться к свойствам и методам только из текущего класса
    //{} вне фигурных скобок обращаться к свойствам нельзя

    private String title;
    private int pageCount;
    private Author author;


    //конструктор есть в каждом классе, конструктор по умолчанию public Book () {}
    //позволяет создать обьекты new Book()

    public Book () {}

    //конструктор с параметром затирает дефолтный параметр и надо думаь хотим такую возможность предоставить или нет
    //смотреть выше что можно так, и ниже что так, но лучше как ниже

    public Book(String title){ //позволяет создать обьекты new Book + название ("JAva 17")
        this.title = title; //для текущего значения title значение будет равно что передано в title
    }

    //конструкторов может быть много, главное чтобы они отличались типом аргументов

    //new Book ("Java17", author1)
    public Book(String title, Author author){
        this.title = title;
        setAuthor(author);
    }


    //методы которые позволяют установить значения приватных свойств
    //методы такие называются - сеттеры
    //установим свойство кол-ва страниц
    //int - свойство вводных данных
    public void setPageCount(int count){
        if (count < 10){
            throw new IllegalArgumentException("значение не м.б  меньше 10"); //останавливается метод и выводит ошибку throw new
        }
        pageCount = count; // кол-во страницу будет равно значению переменной
    }

    //методы которые возвращают значения
    //методы такие называются - геттеры
    public int getPageCount(){
        return pageCount;
    }

    //возвращает значение типа автор
    public Author getAuthor() {
        return author;
    }

    //установка значения и проверка на null и запись его в свойство
    public void setAuthor(Author author) {
        if (author == null) {
            throw new IllegalArgumentException("author  не м.б null");
        }
        this.author = author; //this ссылка на текущий объект если имена совпадают
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author=" + author +
                '}';
    }
}
