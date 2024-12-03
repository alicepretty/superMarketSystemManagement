package com.pretty.stockamanagement.User;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table

public class Users {
    @Id
    @SequenceGenerator(
            name = "Users_sequence",
            sequenceName = "Users_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE ,
            generator = "Users_sequence"
    )
    private long id;
    private String Names;
    private LocalDate dob;
    private String email;

    public Users() {
    }

    public Users(long id) {
        this.id = id;
    }

    public Users(long id, String names, LocalDate dob, String email) {
        this.id = id;
        Names = names;
        this.dob = dob;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String names) {
        Names = names;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", Names='" + Names + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                '}';
    }
}
