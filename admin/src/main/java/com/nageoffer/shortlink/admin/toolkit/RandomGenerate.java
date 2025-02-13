package com.nageoffer.shortlink.admin.toolkit;

import java.security.SecureRandom;

/**
 * 分组ID随机生成器
 */
public final class RandomGenerate{
    // 包含所有可能的字符（数字、大写字母、小写字母）
    private static final String CHAR_POOL = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final int CODE_LENGTH = 6;
    /**
     * 生成随机分组ID
     * @return 分组ID
     */
    public static String generateRandomCode() {
        StringBuilder code = new StringBuilder(CODE_LENGTH);
        for (int i = 0; i < CODE_LENGTH; i++) {
            int randomIndex = RANDOM.nextInt(CHAR_POOL.length());
            code.append(CHAR_POOL.charAt(randomIndex));
        }
        return code.toString();
    }
}
