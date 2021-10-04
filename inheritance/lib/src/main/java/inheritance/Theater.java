package inheritance;

import java.util.ArrayList;

public class Theater extends Price {

    private ArrayList<String> moviesList = new ArrayList<String>();

    public Theater(String name) {
        super(name);
    }

    public ArrayList getMoviesList() {
        return moviesList;
    }

    public void addMovie(String movieName) {
        boolean NotExist = true;
        for (int i = 0; i < moviesList.size(); i++) {
            if (moviesList.get(i).contains(movieName)){
                System.out.println("Movie already in the list");
                NotExist = false;
                break;
            }
        }
        if (NotExist) {
            moviesList.add(movieName);
        }
    }

    public void removeMovie(String movieName) {
        moviesList.remove(movieName);
    }

    public void addMovieWithReview(String body , String author, int numberOfStars , String movieName) {
        String newReview = "{Author: " + author + ", body: " + body  + ", Rate: " + numberOfStars+  ", Watched movie: " + movieName + "}";
        if (getReview().isEmpty()) {
            setStars(numberOfStars);
            getReview().add(newReview);
        } else {
            boolean NotExist = true;
            for (int i = 0; i < getReview().size(); i++) {
                String current = (String) getReview().get(i);
                if (current.contains(author)){
                    System.out.println("You have already added");
                    NotExist = false;
                    break;
                }
            }
            if (NotExist) {
                setStars(numberOfStars);
                getReview().add(newReview);
            }
        }
    }

    @Override
    public String toString() {
        if (getReview().isEmpty()) {
            return "\n" +"Theater name: " + getName() + "\n" +"Total Rate: " + getStars() + "\n" + "Today's Movies: " + moviesList + "\n" + "Review: No review added.";
        } else {
            return  "\n" +"Theater name: " + getName() + "\n" + "Total Rate: " + getStars() + "\n" + "Today's Movies: " + moviesList + "\n" +  "Review: " + getReview();
        }

    }
}