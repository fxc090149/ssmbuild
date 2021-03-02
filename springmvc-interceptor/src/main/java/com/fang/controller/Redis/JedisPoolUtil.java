package com.fang.controller.Redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisPoolUtil {
    private static volatile JedisPool jedisPool = null;
    private JedisPoolUtil(){}

    public static JedisPool getinstance(){
        if(null==jedisPool){
            synchronized (JedisPoolUtil.class){
                if (null==jedisPool){
                    JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
                    jedisPoolConfig.setMaxTotal(100);
                    jedisPoolConfig.setMaxIdle(50);
                    jedisPoolConfig.setMaxWaitMillis(100*1000);
                    jedisPoolConfig.setTestOnBorrow(true);
                    jedisPool= new JedisPool(jedisPoolConfig,"192.168.147.128",6379);
                }
            }
        }
        return jedisPool;
    }

    public static void release(JedisPool jedisPool, Jedis jedis){
        if(null != jedis){
            jedisPool.close();
        }
    }
}
