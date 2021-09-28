package com.hl.util;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtils {
    private static SqlSessionFactory sessionFactory;
    //使用mybatis第一步 : 获取sqlSessionFactory
    static {
        try {
            InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
            sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //既然有了SqlsessionFactory,我们就可以从中获得SqlSession的实例了。
    //sqlSession 完全包含了面向数据库执行sql命令所需要的所有方法
    public static SqlSession getSqlSession(){
        return sessionFactory.openSession(true);
    }
}
