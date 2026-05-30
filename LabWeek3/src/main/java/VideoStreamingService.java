public abstract class Video{
    private String title;
    private int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getInfo(){
        return  "title: "+ title + " duration: " + duration;
    }

}

public class TvSeries extends Video{
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }
}
public class Movie extends Video{
    private double rating;

    public Movie(String title, int duration,double rating) {
        super(title, duration);
        this.rating = rating;
    }
}





void main() {
    
}