package org.iweb.test1;



import org.iweb.dao.StudentDAO;
import org.iweb.dao.impl.StudentDAOImpl;
import org.iweb.pojo.Student;

import java.util.Date;


/**
 * JDBC java database connection
 *
 * @author G
 * @date 2024/7/22 14:47
 */
public class Test {
    public static void main(String[] args) {
//        驱动加载
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println("驱动加载成功!");
//        //获取jdbc连接
//        String url ="jdbc:mysql://localhost:3306/nuist?characterEncoding=utf8";
//        String username = "root";
//        String password = "123456";
//        Connection connection = null;
//        try {
//             connection =
//                    DriverManager.getConnection(url,username,password);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        System.out.println("获取连接成功!");
//        try {
//            Statement s = connection.createStatement();
//            //准备一个sql语句
//            String sql = "insert into stu" +
//                    "(name,gender,birthday,addr,qqnumber) VALUES" +
//                    "('留情','男','2003-02-15','江苏南京',3124076825)";
//            //运行sql语句
//            s.execute(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            // 驱动加载 连接获取 创建编译语句对象 执行语句
//            // 驱动加载 连接后去 创建编译语句对象 执行语句 获取查询结果集
//        }
//        Student s1 = new Student(0, "吴畏", "男",
//                new Date(), "南京", 110);
        StudentDAO studentDAO = new StudentDAOImpl();
//        studentDAO.insert(s1);
        Student s2 = new Student(6, "不留情", "女",
                new Date(), "宿迁", 119545872L);
        studentDAO.update(s2);

    }
}
