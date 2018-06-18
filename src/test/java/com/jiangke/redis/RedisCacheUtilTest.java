package com.jiangke.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.testng.annotations.Test;

/**
 * author:bazz jiang
 * date:Create in 2018-06-19
 * email:bazzjiang@gmail.com
 */
public class RedisCacheUtilTest extends ApplicationBaseTest {
    @Autowired
    private CacheManager cacheManager;
    @Test
    public void putCacheTest(){
        Cache cache = cacheManager.getCache("test_redis");
        RedisCacheUtil.putCache(cache,"jiangke","1111");
    }
}
