public class Book {
    private String name;
    private String author;
    private int number;
    private String category;
    //constructor with Arguments:
    public Book(String name, String author, int number, String category) {
        this.name = name;
        this.author = author;
        this.number = number;
        this.category = category;

    }
    public Book(){

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;

    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;

    }

}
