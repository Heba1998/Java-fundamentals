package inheritance;

import java.util.ArrayList;

import static org.apache.commons.math3.util.Precision.round;

public class Restaurant {

    private String name;
    private double stars;
    private String price;
    private ArrayList<String> review = new ArrayList<>();

    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }
    public double getStars() {
        return stars;
    }
    public ArrayList getReview() {
        return review;
    }


    public void setPrice(int price) {
        if (price >= 0 && price <=5){
            String setPrice = "";
            for (int i = 0; i < price; i++) {
                setPrice = setPrice + "$";
            }
            this.price = setPrice;
        } else {
            this.price = "Price Not Available";
        }
    }


    private int starsCounter = 0;
    private int starsTotal = 0;
    public void setStars(int stars) {
        if (stars >= 0 && stars <=5){
            starsCounter++;
            starsTotal = starsTotal + stars;
            this.stars = (double) this.starsTotal/this.starsCounter;
        } else {
            System.out.println("Please enter a valid number");
        }
    }


    public void addReview(String body, String author ,int numberOfStars) {
        if (review.isEmpty()) {
            Review newReview = new Review( body ,  author,  numberOfStars);
            setStars(numberOfStars);
            review.add(newReview.toString());
        } else {
            boolean exist = true;
            for (int i = 0; i < review.size(); i++) {
                if (review.get(i).contains(author)){
                    System.out.println("You have already added");
                    exist = false;
                    break;
                }
            }
            if (exist) {
                Review newReview = new Review( body ,  author,  numberOfStars);
                setStars(numberOfStars);
                review.add(newReview.toString());
            }
        }
    }

    @Override
    public String toString() {
        if (review.isEmpty()) {
            return "Name: " + name + ", Total Rate: " + stars + ", price category: " + price + ", Review: No review added.";
        } else {
            return "Name: " + name + ", Total Rate: " + stars + ", price category: " + price + ", Review: " + review;
        }
    }
}