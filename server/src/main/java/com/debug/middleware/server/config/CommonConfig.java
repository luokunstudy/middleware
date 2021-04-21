package com.debug.middleware.server.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * 通用化配置
 * @author luokun
 * @date 2021/04/19 20:34
 */
public class CommonConfig {

    //redis链接工厂
    @Autowired
    private RedisConnectionFactory redisConnectionFactory;


    /**
     * 缓存redis-redisTemplate
     * @return
     */
    @Bean
    public RedisTemplate<String,Object> redisTemplate(){

        RedisTemplate<String,Object> redisTemplate = new RedisTemplate<String, Object>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        //指定大key序列化策为String序列化
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
        //指定hashKey序列化策略为String序列化
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        //redisTemplate.setHashValueSerializer(new StringRedisSerializer());
        return redisTemplate;
    }

    /**
     * 缓存redis-stringRedisTemplate
     * @return
     */
    @Bean
    public StringRedisTemplate stringRedisTemplate(){
        //采用默认配置即可-后续有自定义配置时则在此处添加即可
        StringRedisTemplate stringRedisTemplate=new StringRedisTemplate();
        stringRedisTemplate.setConnectionFactory(redisConnectionFactory);
        return stringRedisTemplate;
    }
}
