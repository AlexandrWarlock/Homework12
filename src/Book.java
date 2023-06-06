public class Book {
       private String name;
       private int publisherYear;
       private String nameAuthor;
       private String surnameAuthor;
    public Book (String name, int publisherYear, String nameAuthor, String surnameAuthor) {
        this.name = name;
        this.publisherYear = publisherYear;
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }
    public String getName() {
        return this.name;
    }
    public int getPublisherYear() {
        return this.publisherYear;
    }
    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }
    public String getNameAuthor() {
        return this.nameAuthor;
    }
    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }
}
