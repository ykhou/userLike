package com.kang.like.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserLike implements Serializable {
    public Long likeId;
    public Integer type;
    public Long typeId;
    public Integer status;
    public String userId;
    public Date likeTime;
}
