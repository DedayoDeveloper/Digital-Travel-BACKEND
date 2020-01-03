/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.insurance.travel.repository;

import com.insurance.travel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 *
 * @author oreoluwa
 */
@Repository
public interface UserRepository extends JpaRepository<User , Long>{
    
    User findByPhonenumber(String phonenumber);
    User findByEmail(String email);

    @Modifying
    @Transactional
    @Query("update User u set u.password = :password where u.phonenumber = :phonenumber")
    int updatePassword(@Param("password") String password, @Param("phonenumber") String phonenumber);


}
