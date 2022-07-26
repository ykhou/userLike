package com.kang.like.service;

import com.kang.like.domain.UserLike;

public interface LikeService {

    /**
     * 从redis中取出数据，跟数据库数据比较，新增添加，没有删除
     */
    public void saveOrDeleteAll();

    /**
     * 直接插入数据库中
     * */
    public void insert(UserLike userLike);
}
