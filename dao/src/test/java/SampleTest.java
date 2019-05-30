import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.entity.User;
import com.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/*.xml"})
public class SampleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.lambda().eq(User::getId ,"2" );
        List<User> userList = userMapper.selectList(queryWrapper);
        userList.forEach(item-> {System.out.println(item.getAge());});
    }

    /**
     * <p>
     * 插入一条记录
     * </p>
     *
     * @param u 实体对象
     * @return 插入成功记录数
     */
    @Test
    public void insert() {
        User u = new User();
        u.setName("Tomcat");
        u.setAge(18);
        u.setEmail("kellylake@qq.com");
        u.setCreateTime(new Date());
        System.out.println( "成功记录数"+userMapper.insert(u));
    }

    /**
     * <p>
     * 根据 ID 删除
     * </p>
     *
     * @param id 主键ID
     * @return 删除成功记录数
     */
    @Test
    public void deleteById() {
        int id = 1;
        System.out.println("删除成功记录数"+userMapper.deleteById(id));
    }



}