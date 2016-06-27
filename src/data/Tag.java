package data;

public class Tag extends DataMain {
    private String title;
    private String description;
    private Boolean isCategory;

    public Tag() {
    }

    public Tag(Long id, String title, String description, Boolean isCategory) {
        super(id);
        this.title = title;
        this.description = description;
        this.isCategory = isCategory;
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

    public Boolean getIsCategory() {
        return isCategory;
    }

    public void setIsCategory(Boolean isCategory) {
        this.isCategory = isCategory;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isCategory=" + isCategory +
                '}';
    }
}
