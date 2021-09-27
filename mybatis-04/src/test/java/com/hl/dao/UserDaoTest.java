package com.hl.dao;

import com.hl.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

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


}
