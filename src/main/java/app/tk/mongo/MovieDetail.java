package app.tk.mongo;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class MovieDetail {

    @Override
    public String toString() {
        return new StringJoiner(", ", MovieDetail.class.getSimpleName() + "[", "]")
                .add("countries=" + countries)
                .add("genres=" + genres)
                .add("writers=" + writers)
                .add("actors=" + actors)
                .add("ImdbObject=" + ImdbObject)
                .add("TomatoObject=" + TomatoObject)
                .add("AwardsObject=" + AwardsObject)
                .add("_id='" + _id + "'")
                .add("title='" + title + "'")
                .add("year=" + year)
                .add("director='" + director + "'")
                .add("plot='" + plot + "'")
                .add("poster='" + poster + "'")
                .add("metacritic=" + metacritic)
                .add("type='" + type + "'")
                .toString();
    }

    List<String> countries = new ArrayList<>();
    List<String> genres = new ArrayList<>();
    List<String> writers = new ArrayList<>();
    List<String> actors = new ArrayList<>();

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<String> getWriters() {
        return writers;
    }

    public void setWriters(List<String> writers) {
        this.writers = writers;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public Imdb getImdbObject() {
        return ImdbObject;
    }

    public void setImdbObject(Imdb imdbObject) {
        ImdbObject = imdbObject;
    }

    public Tomato getTomatoObject() {
        return TomatoObject;
    }

    public void setTomatoObject(Tomato tomatoObject) {
        TomatoObject = tomatoObject;
    }

    public Awards getAwardsObject() {
        return AwardsObject;
    }

    public void setAwardsObject(Awards awardsObject) {
        AwardsObject = awardsObject;
    }

    Imdb ImdbObject;
    Tomato TomatoObject;
    Awards AwardsObject;
    private String _id;
    private String title;
    private float year;
    //private Double rated;
    //private float runtime;
    private String director;
    private String plot;
    private String poster;
    private float metacritic;
    private String type;


    // Getter Methods

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getYear() {
        return year;
    }

    public void setYear(float year) {
        this.year = year;
    }

    /*public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }*/

   /* public float getRuntime() {
        return runtime;
    }

    public void setRuntime(float runtime) {
        this.runtime = runtime;
    }*/

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlot() {
        return plot;
    }

    // Setter Methods

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Imdb getImdb() {
        return ImdbObject;
    }

    public void setImdb(Imdb imdbObject) {
        this.ImdbObject = imdbObject;
    }

    public Tomato getTomato() {
        return TomatoObject;
    }

    public void setTomato(Tomato tomatoObject) {
        this.TomatoObject = tomatoObject;
    }

    public float getMetacritic() {
        return metacritic;
    }

    public void setMetacritic(float metacritic) {
        this.metacritic = metacritic;
    }

    public Awards getAwards() {
        return AwardsObject;
    }

    public void setAwards(Awards awardsObject) {
        this.AwardsObject = awardsObject;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

