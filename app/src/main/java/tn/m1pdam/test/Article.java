package tn.m1pdam.test;

public class Article {
    private String title, desc, img, content;

    public Article(String title, String desc, String img, String content) {
        this.title = title;
        this.desc = desc;
        this.img = img;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getImg() {
        return img;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
