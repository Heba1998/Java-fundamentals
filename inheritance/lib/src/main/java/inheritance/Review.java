package inheritance;

public class Review {

    private String body;
    private String author;
    private int numberOfStars;

    public Review(String body, String author, int numberOfStars) {
        this.body = body;
        this.author = author;
        if (numberOfStars >= 0 && numberOfStars <=5){
            this.numberOfStars = numberOfStars;
        } else {
            System.out.println("Please enter a valid number");
        }
    }
    public String getBody() {
        return body;
    }
    public String getAuthor() {
        return author;
    }
    public int getNumberOfStars() {
        return numberOfStars;
    }

    @Override
    public String toString() {
        return "{Author: " + author + ", body: " + body  + ", Rate: " + numberOfStars+ "}";
    }
}