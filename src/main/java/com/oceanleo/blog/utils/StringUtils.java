package com.oceanleo.blog.utils;

/**
 * @author haiyang.li
 */
public abstract class StringUtils {

    public static boolean hasText(String text) {
        return text != null && text.trim().length() > 0;
    }

}
