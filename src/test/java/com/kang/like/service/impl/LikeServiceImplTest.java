package com.kang.like.service.impl;

import com.kang.like.service.LikeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LikeServiceImplTest {

    @Autowired
    LikeService likeService;

    @Test
    void saveOrDeleteAll() {
        likeService.saveOrDeleteAll();
    }

}