package app.tk.mongo;

public class Imdb {
    private String id;
    private float rating;
    private float votes;


    // Getter Methods

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getRating() {
        return rating;
    }

    // Setter Methods

    public void setRating(float rating) {
        this.rating = rating;
    }

    public float getVotes() {
        return votes;
    }

    public void setVotes(float votes) {
        this.votes = votes;
    }
}
