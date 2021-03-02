package com.fang.controller;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Set;

public class redisT {
    public static void main(String[] args) {
    }

    @Test  //该方法是一种测试方法,可以不用main方法调用就可以测试出运行结果
    public void test(){
        //连接redis数据库,host为你的ip,port端口号
        Jedis jedis = new Jedis("192.168.147.128",6379);
        //使用set方法设置值
        jedis.set("username","lss-love");
        System.out.println(jedis.get("username"));
        Set<String> set = jedis.keys("*");
        System.out.println(set);
    }

    @Test
    public void test1(){
//        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        //设置最大连接数
//        jedisPoolConfig.setMaxTotal(50);
//        //设置最大的闲置数
//        jedisPoolConfig.setMaxIdle(30);
//        //设置最小的闲置数
//        jedisPoolConfig.setMinIdle(10);

//        //1.创建redis连接池;参数：1.上面的配置，2.ip地址
//        JedisPool jedisPool = new JedisPool(jedisPoolConfig,"ip");
//        //2.从pool里面获取连接对象
//        Jedis jedis = jedisPool.getResource();
//        //创建对象
////        User user = new User(1001, "战三");
////        //使用set把对象放入redis中
////        jedis.set("user", JSON.toJSONString(user));
//        System.out.println(jedis.get("user"));
//        //关闭资源
//        jedis.close();
//        jedisPool.close();
        JedisPool jedisPool1 = JedisPoolUtil.getinstance();
        JedisPool jedisPool2 = JedisPoolUtil.getinstance();
        System.out.println(jedisPool1==jedisPool2);

        Jedis jedis = jedisPool1.getResource();
        jedis.set("aa","ddd");
        jedis.close();
    }
}
