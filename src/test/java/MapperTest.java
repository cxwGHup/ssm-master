import com.it.ssm.dao.DepartmentMapper;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})//可加载多个xx.xml，，逗号分隔
public class MapperTest {
    @Autowired
     DepartmentMapper departmentMapper;

    @Test
    public void testCRUD(){
        System.out.println(departmentMapper);



    }
}
