package com.kang.like.service.impl;

import com.kang.like.domain.UserLike;
import com.kang.like.mq.UserLikeSender;
import com.kang.like.service.LikeRedisService;
import com.kang.like.strategy.LikeFactory;
import com.kang.like.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Service
public class LikeRedisServiceImpl implements LikeRedisService {
    @Autowired
    LikeFactory likeFactory;
    @Autowired
    UserLikeSender userLikeSender;

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public void saveOrUpdate(UserLike userLike) {
        userLikeSender.sendMessage(userLike);
    }

    @Override
    public List<Object> getMultiValueInHash(String key, Collection<String> hashKeys) {
        return redisUtil.hMget(key, hashKeys);
    }

    @Override
    public Set<String> getAllUserIdInHash(String key) {
        return redisUtil.hKeys(key);
    }

    @Override
    public Set<Object> getAllTypeIdByTypeInSet(Integer type) {
        //根据type获取策略处理类在获取类型名
        String typeName = likeFactory.getLikeStrategy(type).getTypeName();
        return redisUtil.sMember(typeName);
    }
}
