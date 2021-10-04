package com.example.JavaWeb_Mall.test;

import com.example.JavaWeb_Mall.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * JdbcUtilsTest
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/3 21:11
 **/
public class JdbcUtilsTest {

    @Test
    public void testJdbcUtils(){
        for (int i = 0; i < 100; i++){
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection);
            JdbcUtils.close(connection);
        }
    }

}
