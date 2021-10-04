# Inheritance and Interfaces

## About the project

### File

* Library.java
* Restaurant.java
* Review.java

### Classes contained in the file

**Restaurant class:**

```
Includes name , stars, price and review.
```

* methods:
  * Restaurant: constructor to assign the name.
  * setStars : calculate rating.
  * setPrice : calculate the price (number of dollar sing).
  * addReview : add the new review to the restaurant and calculate the new rating.
  * getter methods : to get the values of the restaurant.

 **Review class:**

```
Includes body , author and numberOfStars.
```

* methods:
    * Review: constructor to assign the values.
    * getter methods : to get the values of the restaurant.

 **Shop Class :**

```
Includes name, description, and number of dollar signs.
```

* methods:
    * toString methods : to return class String.
    * getter and setter method : get and set a values to the descriptions.

 **Theater class :**

```
Includes name and all of the movies currently showing.
```

* methods:
    * addMovie : check if movie is not already exist if not add it to movies list.
    * removeMovie : remove movie from moviesList.
    * getter : get the values of moviesList.
    * addMovieWithReview : add a new review that contains movie people saw and calculate the new rating.
    * toString methods : to return class String.