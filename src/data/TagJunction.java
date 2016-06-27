package data;

public class TagJunction extends DataMain {
    private Tag tag;
    private Post post;

    public TagJunction() {
    }

    public TagJunction(Long id, Tag tag, Post post) {
        super(id);
        this.tag = tag;
        this.post = post;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "TagJunction{" +
                "tag=" + tag +
                ", post=" + post +
                '}';
    }
}
