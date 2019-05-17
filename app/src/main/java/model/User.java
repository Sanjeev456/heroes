package model;

public class User {

    private  int id;
    private  String name;
    private  String image;
    private  String desc;


    public User(int id, String name, String image, String desc) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
