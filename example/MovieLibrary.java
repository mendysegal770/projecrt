package org.example;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;

public class MovieLibrary {
    private List<Movie> movies1;

    public MovieLibrary () {
        List<List<String>> directorsData = Utils.readFile("directors");

//        List<List<String>> actorsData = Utils.readFile("actors");
//
//        //System.out.println(directorsData1.get(0).get(1));
//
//        List<List<String>> movies2 = Utils.readFile("movies");
//        //System.out.println(movies2.get(0).get(6));
//        this.movies1=new ArrayList<>();
//        for (int i=0; i<movies2.size(); i++){
//            Director director=null;
//            List<Actor>actors=new ArrayList<>();
//            int id= Integer.parseInt((movies2.get(i).get(0)));
//            String title=movies2.get(i).get(1);
//            int iDirector= Integer.parseInt(movies2.get(i).get(2));
//
//            int onePlayer= Integer.parseInt(movies2.get(i).get(3));
//            int secondPlayer= Integer.parseInt(movies2.get(i).get(4));
//
//            int releaseYear= Integer.parseInt(movies2.get(i).get(5));
//            String genre=movies2.get(i).get(6);
//            for (int j=0; j<directorsData.size(); j++){
//                int newDirector1=Integer.parseInt(directorsData.get(j).get(0));
//                String newDirector2=(directorsData.get(j).get(1));
//                int newDirector3=Integer.parseInt(directorsData.get(j).get(2));
//                if (newDirector1==iDirector){
//                    director=new Director(newDirector1,newDirector2,newDirector3);
//                }
//            }
//            for (int j=0; j<actorsData.size(); j++){
//                int newActor=Integer.parseInt(actorsData.get(j).get(0));
//                String nameActor=(actorsData.get(j).get(1));
//
//                if (newActor==onePlayer){
//                    actors.add(new Actor(0,nameActor,0));
//                }
//                if (newActor==secondPlayer){
//                    actors.add(new Actor(0,nameActor,0));
//                }
//            }
//
//           Movie movie=new Movie(id,title,director,actors,releaseYear,genre);
//           this.movies1.add(movie);
//        }
//        System.out.println(this.movies1);
//        System.out.println("-----------------------------");
//        System.out.println(movies2);



        //move on
    }


//    // 1. Find all movies released in a specific year.
//    // Return a list of movie titles.
//    public List<String> findMoviesByYear(int year) {
    //   // Implement using declarative programming
//    }
//
//    // 2. Find all movies of a specific genre.
//    // Return a list of movie titles.
//    public List<String> findMoviesByGenre(String genre) {
//        // Implement using declarative programming
//    }
//
//    // 3. Find all directors who have directed at least N movies.
//    // Return a list of director names.
//    public List<String> findDirectorsWithAtLeastNMovies(int n) {
//        // Implement using declarative programming
//    }
//
//    // 4. Find all actors who have appeared in movies of a specific genre.
//    // Return a list of actor names.
//    public List<String> findActorsInGenre(String genre) {
//        // Implement using declarative programming
//    }
//
//    // 5. Find the average release year of movies for a specific director.
//    // Return a double value.
//    public double findAverageReleaseYearForDirector(String directorName) {
//        // Implement using declarative programming
//    }
//
//    // 6. Find the top N actors who have appeared in the most movies.
//    // Return a list of actor names.
//    public List<String> findTopNActors(int n) {
//        // Implement using declarative programming
//    }
//
//    // 7. Find all movies where a specific actor and director have worked together.
//    // Return a list of movie titles.
//    public List<String> findMoviesByActorAndDirector(String actorName, String directorName) {
//        // Implement using declarative programming
//    }
//
//    // 8. Find the most common genre for each actor.
//    // Return a map with actor names as keys and the most common genre as values.
//    public Map<String, String> findMostCommonGenrePerActor() {
//        // Implement using declarative programming
//    }
//
//    // 9. Find the director with the highest average movie rating (1-5).
//    // Assume there is a method: double getMovieRating(Movie movie), which returns the rating of a movie.
//    // Return the director name.
//    public String findDirectorWithHighestAverageRating() {
//        // Implement using declarative programming
//    }


}
