import com.hl.dao.StudentMapper;
import com.hl.pojo.Student;
import com.hl.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MyTest {

    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentById = mapper.getstudents();
        for (Student student : studentById) {
            System.out.println(student);
        }

        sqlSession.close();
    }
}
