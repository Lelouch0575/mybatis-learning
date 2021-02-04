import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        //mapper.updateUser(new User(2,"aaaa", "bbbbb"));
        sqlSession.clearCache();

        System.out.println("==============");

        User user2 = mapper.queryUserById(1);
        System.out.println(user2);
        System.out.println(user == user2);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlSession.close();

        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);
        System.out.println(user == user2);
        sqlSession2.close();
    }
}
