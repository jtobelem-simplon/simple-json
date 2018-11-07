package jackson.model.wiki;

public class WikiArticle {
    public String title;
    public String desc;
    public String url;

    public WikiArticle(String title, String desc, String url) {
        this.title = title;
        this.desc = desc;
        this.url = url;
    }
}