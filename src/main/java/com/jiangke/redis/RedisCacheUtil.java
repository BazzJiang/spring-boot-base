package com.jiangke.redis;

import org.springframework.cache.Cache;

/**
 * author:bazz jiang
 * date:Create in 2018-06-19
 * email:bazzjiang@gmail.com
 */
public class RedisCacheUtil {
    public static boolean putCache(Cache cache, String key, Object value) {
        if (null == value) {
            return false;
        }
        cache.put(key, value);
        return true;
    }

}
