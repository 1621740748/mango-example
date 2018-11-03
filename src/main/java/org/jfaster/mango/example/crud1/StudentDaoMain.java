package org.jfaster.mango.example.crud1;

import java.util.List;

import javax.sql.DataSource;

import org.jfaster.mango.datasource.DriverManagerDataSource;
import org.jfaster.mango.operator.Mango;

import com.alibaba.fastjson.JSON;

/**
 * @author ash
 */
public class StudentDaoMain {

  public static void main(String[] args) {
    String driverClassName = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/jpa";
    String username = "root"; // 这里请使用您自己的用户名
    String password = "yy123456"; // 这里请使用您自己的密码
    DataSource ds = new DriverManagerDataSource(driverClassName, url, username, password);
    Mango mango = Mango.newInstance(ds); // 使用数据源初始化mango

    StudentDao dao = mango.create(StudentDao.class);
    Student student = new Student();
    student.setStudentId(4L);;
    student.setName("hy1");;
    student.setAge(122);
   // dao.add(student);
    dao.delete(3L);
    System.out.println(JSON.toJSONString(dao.getOne(3L)));
    List<Student> ss=dao.findByName("hy1");
    System.out.println(JSON.toJSONString(ss));
  }

}
