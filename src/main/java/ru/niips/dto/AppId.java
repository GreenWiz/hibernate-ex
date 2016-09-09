package ru.niips.dto;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AppId implements Serializable{
    private Long id;
    private String name;

    public AppId() {
    }

    public AppId(Long id, String name) {
        this.id = id;
        this.name = name;
    }

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
}
