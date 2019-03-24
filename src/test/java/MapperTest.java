import com.it.ssm.dao.DepartmentMapper;


import com.it.ssm.dao.EmployeeMapper;
import com.it.ssm.entity.Department;
import com.it.ssm.entity.Employee;
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
    @Autowired
     EmployeeMapper employeeMapper;

    @Test
    public void testCRUD(){
        System.out.println(departmentMapper);
//        添加部门
        departmentMapper.insertSelective(new Department(null,"拓展部"));
        departmentMapper.insertSelective(new Department(null,"不退部"));
        System.out.println("部门操作成功");
//        添加员工

        employeeMapper.insertSelective(new Employee(null,"宝宝","M","654@qq.com",1));
        employeeMapper.insertSelective(new Employee(null,"追梦人","F","8888@qq.com",8));
        System.out.println("员工操作成功");


    }
}
