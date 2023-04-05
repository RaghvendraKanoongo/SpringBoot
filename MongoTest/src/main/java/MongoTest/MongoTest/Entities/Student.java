package MongoTest.MongoTest.Entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "students")
public class Student {
    private int id;
    private String name;

    public Student(int id, String name, String cty, String college) {
        this.id = id;
        this.name = name;
        this.cty = cty;
        this.college = college;
    }

    public Student() {
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

    public String getCty() {
        return cty;
    }

    public void setCty(String cty) {
        this.cty = cty;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    private String cty;
    private String college;
}
