package com.metacoding.securityapp.domain.user;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private EntityManager em;

    public UserRepository(EntityManager em) {
        this.em = em;
    }

    public void save(String username, String password, String email) {
        em.createNativeQuery("insert into user_tb (username, password, email) values (?, ?, ?)")
                .setParameter(1, username)
                .setParameter(2, password)
                .setParameter(3, email)
                .executeUpdate();
    }
}
