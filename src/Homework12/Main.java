package Homework12;

import Homework12.Book;
public class Main {
    public static void main(String[] args) {
        Author Turgenev = new Author("Иван", "Тургенев");

        Book fathersAndSon = new Book("Отцы и дети", 5555, Turgenev);

        Author Feynman = new Author("Ричард", "Фейман");

        Book kED = new Book("Квантовая электролинамика", 1000, Feynman);

        fathersAndSon.setPublisherYear(6666);

        kED.setPublisherYear(2000);
    }
}