package Homework12;

import Homework12.Book;
public class Main {
    public static void main(String[] args) {
        Author turgenev = new Author("Иван", "Тургенев");

        Book fathersAndSon = new Book("Отцы и дети", 5555, turgenev);

        Author feynman = new Author("Иван", "Фейман");

        Book kED = new Book("Квантовая электролинамика", 1000, feynman);

        fathersAndSon.setPublisherYear(6666);
        kED.setPublisherYear(2000);
        System.out.println(fathersAndSon);
        System.out.println(kED);
        System.out.println(kED.equals(fathersAndSon));
        System.out.println(kED.hashCode());
    }

}