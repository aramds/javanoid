package data;

public class Post extends DataMain {

    private String title;
    private String description;
    private String content;
    private Boolean asPage;
    private Boolean published;
    private User author;

    public Post() {
    }

    public Post(Long id, String title, String description, String content, Boolean asPage, Boolean published, User author) {
        super(id);
        this.title = title;
        this.description = description;
        this.content = content;
        this.asPage = asPage;
        this.published = published;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getAsPage() {
        return asPage;
    }

    public void setAsPage(Boolean asPage) {
        this.asPage = asPage;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", asPage=" + asPage +
                ", published=" + published +
                ", author=" + author.getUsername() +
                '}';
    }
}
