import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }

        User userById = mapper.getUserById(1);
        System.out.println(userById);

        mapper.addUser(new User(6,"hello","sdfsf"));
        mapper.updateUser(new User(6,"123","sdfsf"));
        mapper.deleteUser(6);
        
        sqlSession.commit();
        sqlSession.close();
    }
}
