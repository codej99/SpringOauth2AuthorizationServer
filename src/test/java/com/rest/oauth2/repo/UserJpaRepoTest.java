package com.rest.oauth2.repo;

import com.rest.oauth2.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserJpaRepoTest {
    @Autowired
    private UserJpaRepo userJpaRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void insert() {
        // given
        userJpaRepo.save(User.builder()
                .uid("happydaddy@gmail.com")
                .password(passwordEncoder.encode("1234"))
                .name("happydaddy")
                .roles(Collections.singletonList("ROLE_USER"))
                .build());
    }
}