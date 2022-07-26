package com.kang.like.strategy.impl;

import com.kang.like.domain.UserLike;
import com.kang.like.strategy.LikeStrategy;
import org.springframework.stereotype.Component;

import static com.kang.like.enums.LikeSetNameEnum.COMMENT_LIKE_SET;

/**
 * 点赞评论行为处理类
 */
@Component
public class LikeComment extends LikeStrategy {

    @Override
    public void like(UserLike userLike) {
        likeByType(userLike, COMMENT_LIKE_SET);
    }

    @Override
    public String getTypeName() {
        return COMMENT_LIKE_SET.getTypeName();
    }
}
