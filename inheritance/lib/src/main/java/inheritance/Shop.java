package inheritance;

public class Shop extends Price {

    private String descriptions;
    public Shop (String name  , String descriptions) {
        super(name);
        this.descriptions = descriptions;
    }

    public String getDescriptions() {
        return descriptions;
    }
    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public String toString() {
        if (getReview().isEmpty()) {
            return  "\n" + "Shop name: " + getName() + "\n" + "Total Rate: " + getStars() + "\n" + "price category: " + getPrice() + "\n" +  "Descriptions: " + getDescriptions() + "\n" + "Review: No review added.";
        } else {
            return  "\n" +"Shop name: " + getName() + "\n" + "Total Rate: " + getStars() + "\n" + "price category: " + getPrice() + "\n" +  "Descriptions: " + getDescriptions() + "\n" + "Review: " + getReview();
        }
    }

}