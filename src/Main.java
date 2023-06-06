public class Main {
    public static void main(String[] args) {
        Book fathersAndSon = new Book("Отцы и дети", 1990, "Иван", "Тургенев");
        System.out.println("Книга: " + fathersAndSon.getName() + ". Год издания: " + fathersAndSon.getPublisherYear() + " Автор: " + fathersAndSon.getNameAuthor() + " " +fathersAndSon.getSurnameAuthor());
        Book kED = new Book("Квантовая электролинамика", 1899, "Ричард", "Фейман");
        System.out.println("Книга: " + kED.getName() + ". Год издания: " + kED.getPublisherYear() + " Автор: " + kED.getNameAuthor() + " " + kED.getSurnameAuthor());
        kED.setPublisherYear(1901);
        System.out.println("Книга: " + fathersAndSon.getName() + ". Год издания: " + fathersAndSon.getPublisherYear() + " Автор: " + fathersAndSon.getNameAuthor() + " " +fathersAndSon.getSurnameAuthor());
    }
}