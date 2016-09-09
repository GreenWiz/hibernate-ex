package ru.niips.dto;

import javax.persistence.*;

@Entity
@Table(name = "app")
public class AppWithEmbedded {
    @EmbeddedId
    private AppId id;
    @Column
    private String title;

    public AppId getId() {
        return id;
    }

    public void setId(AppId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
