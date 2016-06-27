package main;

import data.Post;
import data.Tag;
import data.TagJunction;
import data.User;
import service.DataService;

class TestDataAndMethods {

    static void demo() {
        /**
         * init
         */
        DataService<User> users = new DataService<>();
        DataService<Post> posts = new DataService<>();
        DataService<Tag> tags = new DataService<>();
        DataService<TagJunction> joinedTags = new DataService<>();
        User user = new User((long) 1, "test@test.test", "testName", "openPassword", System.currentTimeMillis(), System.currentTimeMillis());
        Post post = new Post((long) 1, "new post", "new post description", "new post content", false, true, user);
        Tag tag = new Tag((long) 1, "New tag title", "New tag description", false);
        TagJunction joinedTag = new TagJunction((long) 1, tags.getById((long) 1), posts.getById((long) 2));

        /**
         * //////////////////////////////////////
         */
        user.setId((long) 2);
        user.setEmail("test2@test.test");
        user.setUsername("testName2");
        user.setPassword("openPassword2");
        user.setSignUpDate(System.currentTimeMillis());
        user.setLastLoginDate(System.currentTimeMillis());
        /** add to map */
        users.addNew(user);

        post.setId((long) 2);
        post.setTitle("new post");
        post.setDescription("new post description");
        post.setContent("new post content");
        post.setAsPage(false);
        post.setPublished(true);
        post.setAuthor(user);
        /** add to map */
        posts.addNew(post);

        post = new Post();
        post.setId((long) 3);
        post.setTitle("new post 2");
        post.setDescription("new post description 2");
        post.setContent("new post content 2");
        post.setAsPage(false);
        post.setPublished(true);
        post.setAuthor(user);
        /** add to map */
        posts.addNew(post);


        tag.setId((long) 2);
        tag.setTitle("New tag title 2");
        tag.setDescription("New tag description 2");
        tag.setIsCategory(false);
        /** add to map */
        tags.addNew(tag);

        tag = new Tag();
        tag.setId((long) 3);
        tag.setTitle("New tag title 3");
        tag.setDescription("New tag description 3");
        tag.setIsCategory(true);
        /** add to map */
        tags.addNew(tag);

        tag = new Tag();
        tag.setId((long) 4);
        tag.setTitle("New tag title 4");
        tag.setDescription("New tag description 4");
        tag.setIsCategory(true);
        /** add to map */
        tags.addNew(tag);


        joinedTag.setId((long) 1);
        joinedTag.setPost(posts.getById((long) 2));
        joinedTag.setTag(tags.getById((long) 2));
        /** add to map */
        joinedTags.addNew(joinedTag);

        joinedTag = new TagJunction();
        joinedTag.setId((long) 2);
        joinedTag.setPost(posts.getById((long) 2));
        joinedTag.setTag(tags.getById((long) 3));
        /** add to map */
        joinedTags.addNew(joinedTag);

        /** list map contents */
        users.printData();
        posts.printData();
        tags.printData();
        joinedTags.printData();

        joinedTags.deleteById((long) 1);
        TagJunction edit = joinedTags.getById((long) 2);
        edit.getTag().setTitle("fucking");

        tags.printData();
    }
}
