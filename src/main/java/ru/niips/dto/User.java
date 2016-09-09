package ru.niips.dto;

import javax.persistence.*;

@Entity
@Table(name = "users")
@SecondaryTable(name = "country")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Basic(fetch = FetchType.LAZY)
    private String email;
    @Column(table = "country")
    private String country;
    @OneToOne(fetch = FetchType.LAZY)
    Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
