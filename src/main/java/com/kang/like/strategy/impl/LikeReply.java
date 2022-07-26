package com.kang.like.strategy.impl;

import com.kang.like.domain.UserLike;
import com.kang.like.strategy.LikeStrategy;
import org.springframework.stereotype.Component;

import static com.kang.like.enums.LikeSetNameEnum.REPLY_LIKE_SET;

/**
 * 点赞回复行为处理类
 */
@Component
public class LikeReply extends LikeStrategy {

    @Override
    public void like(UserLike userLike) {
        likeByType(userLike, REPLY_LIKE_SET);
    }

    @Override
    public String getTypeName() {
        return REPLY_LIKE_SET.getTypeName();
    }
}
