package com.nageoffer.shortlink.admin.common.constant;

/**
 * 短链接后管 Redis缓存常量类
 */
public class RedisCacheConstant {

    /**
     * 用户注册分布式锁
     */
    public static final String LOCK_USER_REGISTER_KEY = "short-link:lock_user_register:";

    /**
     * 分组创建分布式锁
     */
    public static final String LOCK_GROUP_CREATE_KEY = "short-link:lock_group_create:%s";

    /**
     * 用户登录缓存标识
     */
    public static final String USER_LOGIN_KEY="short-link:login:";
}
