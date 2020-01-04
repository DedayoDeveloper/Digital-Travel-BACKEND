/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.insurance.travel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author oreoluwa
 */
@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "fullname", nullable = false)
    private String fullname;

    @Column(name = "phonenumber", nullable = false)
    private String phonenumber;

    @Column(name = "email", nullable = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "kinname", nullable = false)
    private String kinname;

    @Column(name = "kinphonenumber", nullable = false)
    private String kinphonenumber;

    @Column(name = "kinemail", nullable = true)
    private String kinemail;

    @Column(name = "kinaddress", nullable = false)
    private String kinaddress;

    public String getKinname() {
        return kinname;
    }

    public void setKinname(String kinname) {
        this.kinname = kinname;
    }

    public String getKinphonenumber() {
        return kinphonenumber;
    }

    public void setKinphonenumber(String kinphonenumber) {
        this.kinphonenumber = kinphonenumber;
    }

    public String getKinemail() {
        return kinemail;
    }

    public void setKinemail(String kinemail) {
        this.kinemail = kinemail;
    }

    public String getKinaddress() {
        return kinaddress;
    }

    public void setKinaddress(String kinaddress) {
        this.kinaddress = kinaddress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
