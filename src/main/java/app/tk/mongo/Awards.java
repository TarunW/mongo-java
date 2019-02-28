package app.tk.mongo;

public class Awards {
    private float wins;
    private float nominations;
    private String text;


    // Getter Methods

    public float getWins() {
        return wins;
    }

    public void setWins(float wins) {
        this.wins = wins;
    }

    public float getNominations() {
        return nominations;
    }

    // Setter Methods

    public void setNominations(float nominations) {
        this.nominations = nominations;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
