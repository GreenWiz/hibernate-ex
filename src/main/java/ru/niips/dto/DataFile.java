package ru.niips.dto;

import javax.persistence.*;

@Entity
public class DataFile {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
