package org.iweb.test;


import org.iweb.dao.StudentDAO;
import org.iweb.dao.impl.StudentDAOImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**测试类 用于DAO接口测试
 * @Test 将指定方法标记为测试方法 可以不依赖与main方法直接运行
 * @Before 在所有测试方法运行之前执行的代码 一般用于环境的初始化
 * After 在所有测试
 * @author 18369
 * @date 2024/7/23 上午11:02
 */
public class TestStudentDAO {
    private StudentDAO studentDAO;
    @Before
    public void init(){
        studentDAO=new StudentDAOImpl();
    }
    @Test
    public void testFindById(){
        System.out.println(studentDAO.findById(7));
        Assert.assertNotNull(studentDAO.findById(9));//断言某个值 不为空 如果为空就抛出异常
    }
    @Test
    public void testCount(){
        Assert.assertEquals(8,(long)studentDAO.count());
    }
    @Test
    public void testFindALL(){
        Assert.assertNotNull(studentDAO.findAll());
    }
    @Test
    public void testfindByNameLike(){
        Assert.assertNotNull(studentDAO.findByNameLike("张"));
    }
    @Test
    public void testfindByNameLikeWithLimit(){
        Assert.assertNotNull(studentDAO.findByNameLikeWithLimit("张",0,1));
    }
    @Test
    public void testfindWithLimit(){
        Assert.assertNotNull(studentDAO.findWithLimit(0,10));
    }
}
