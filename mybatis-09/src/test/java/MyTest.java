import com.hl.dao.UserMapper;
import com.hl.pojo.User;
import com.hl.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {

    @Test
    public void findUserById(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user1 = mapper.findUserById(1);
        //mapper.updateUser(new User(4,"小i","000000"));
        sqlSession.clearCache();
        System.out.println(user1);
        User user2 = mapper.findUserById(1);
        System.out.println(user2);

        sqlSession.close();
    }

    @Test
    public void findUserById2(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        SqlSession sqlSession2 = MyBatisUtils.getSqlSession();


        UserMapper mapper1 = sqlSession.getMapper(UserMapper.class);
        User user1 = mapper1.findUserById(1);
        System.out.println(user1);
        sqlSession.close();
        /*
        当一级缓存结束时 就会将数据提交到二级缓存 如果是相同查询在同一个namespace下面的话
        这个查询就会直接去二级缓存里面去取值

        * */
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.findUserById(1);
        System.out.println(user2);
        sqlSession2.close();


        /**
         * 缓存顺序是  当用户第一次进入到服务器 需要查询数据时 先会到二级缓存中去找有没有相应的数据
         * 如果二级缓存没有 就回到一级缓存中寻找数据 如果一级缓存中没有数据时就会取执行相应的sql
         * 并把数据放在一级缓存中 当一级缓存结束时也就是sqlSession.colse后 它会把查询到的数据放到
         * 二级缓存中去 如果用户重复调用改方法查询数据 那么查询的数据 就会在二级缓存中 直接使用
         */


    }









}
