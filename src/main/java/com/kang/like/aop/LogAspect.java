package com.kang.like.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect // 切面 定义了通知和切点的关系
@Slf4j
public class LogAspect {


    public Object saveLog(ProceedingJoinPoint joinPoint) {
        Object target = joinPoint.getTarget();
        Signature signature = joinPoint.getSignature();
        Object result = null;
        long start = System.currentTimeMillis();
        try {
            result = joinPoint.proceed();
        } catch (Throwable ignored) {}
        long end = System.currentTimeMillis();
        log.info("耗时:{}", (end - start));
        return result;
    }

//    @Around("@within(org.springframework.stereotype.Service)")
//    Object aroundController(ProceedingJoinPoint joinPoint) {
//        return saveLog(joinPoint);
//    }

    @Around("@within(org.springframework.web.bind.annotation.RestController)")
    Object aroundRestController(ProceedingJoinPoint joinPoint) {
        return saveLog(joinPoint);
    }
}
