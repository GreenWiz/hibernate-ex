package ru.niips.dto;

import javax.persistence.*;

@Entity
@IdClass(AppId.class)
public class App {
    @Id
    private Long id;
    @Id
    private String name;
    @Column
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
