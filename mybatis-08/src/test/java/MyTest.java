import com.hl.dao.BlogMapper;
import com.hl.pojo.Blog;
import com.hl.util.IdUtils;
import com.hl.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class MyTest {

    @Test
    public void Test(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog=new Blog();
        blog.setId(IdUtils.getId());
        blog.setTitle("1111111");
        blog.setAuthor("小p");
        blog.setCreateDate(new Date());
        blog.setViews(999);
        mapper.addBlog(blog);

        Blog blog2=new Blog();
        blog2.setId(IdUtils.getId());
        blog2.setTitle("222222");
        blog2.setAuthor("小o");
        blog2.setCreateDate(new Date());
        blog2.setViews(999);
        mapper.addBlog(blog2);

        Blog blog3=new Blog();
        blog3.setId(IdUtils.getId());
        blog3.setTitle("333332");
        blog3.setAuthor("小i");
        blog3.setCreateDate(new Date());
        blog3.setViews(999);
        mapper.addBlog(blog3);


        sqlSession.close();
    }

    @Test
    public void Test2(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map<Object,Object> map = new HashMap<Object,Object>();
        //map.put("title","%"+"s"+"%");
        map.put("author","小L");
        //map.put("views",-1);
        List<Blog> blogs = mapper.getBlogByIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void Test3(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        map.put("title","JavaWeb");
        //map.put("author","小何");
        map.put("id","7b52ffd2b97a4694ace8c4b3d4da3411");

        int i = mapper.updateBlog(map);
        sqlSession.close();
    }


    @Test
    public void Test4(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map map = new HashMap();
        //map.put("title","spring");
        //map.put("author","小L");
        //map.put("views",9991);
        List<Blog> blogs = mapper.getBlogByIf2(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void Test5(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map map = new HashMap();
        ArrayList<String> list = new ArrayList<String>();
        list.add("65170e6cc73c4f1b967f7a9e14c6f939");
        list.add("74254fb85fd5437d9dd21380225f17c6");
        list.add("804dbc1fc475405e8799ce364053aeda");
        map.put("ids",list);
        int i = mapper.deleteBlogsById(map);

        sqlSession.close();
    }
}

