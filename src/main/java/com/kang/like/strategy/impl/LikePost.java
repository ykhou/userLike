package com.kang.like.strategy.impl;

import com.kang.like.domain.UserLike;
import com.kang.like.strategy.LikeStrategy;
import org.springframework.stereotype.Component;

import static com.kang.like.enums.LikeSetNameEnum.POST_LIKE_SET;

/**
 * 点赞帖子行为处理类
 */
@Component
public class LikePost extends LikeStrategy {


    @Override
    public void like(UserLike userLike) {
        likeByType(userLike, POST_LIKE_SET);
    }

    /**
     * 根据子类获取类型名
     */
    @Override
    public String getTypeName() {
        return POST_LIKE_SET.getTypeName();
    }
}
