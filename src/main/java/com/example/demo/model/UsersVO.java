package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "tusers")
@NamedQueries({
    @NamedQuery(name = "UsersVO.getAll",query = "select u from UsersVO u")
})
public class UsersVO implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
