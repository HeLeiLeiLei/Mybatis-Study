package com.hl.dao;

import com.hl.pojo.User;
import com.hl.util.MyBatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {
    static Logger logger = Logger.getLogger(UserDaoTest.class);
    @Test
    public void getUserListById(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        logger.info("info:进入到getUserListById");
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.getUserListById(1));

        sqlSession.close();
    }

    @Test
    public void log4jTest(){
        logger.info("info:进入到log4jTest");
        logger.debug("debug:进入到log4jTest");
        logger.error("error:进入到log4jTest");
    }


    @Test
    public void  getUserListByLimit(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User> userList = mapper.getUserListByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void  getUserListByRowBands(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        RowBounds rowBounds = new RowBounds(1,2);
        List<User> list = sqlSession.selectList("com.hl.dao.UserMapper.getUserListByRowBands", null, rowBounds);
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
