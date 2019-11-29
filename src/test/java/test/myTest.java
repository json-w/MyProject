package test;

import com.jk.domain.Student;
import com.jk.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Array;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class myTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void run(){
        // 查询全部用户
        List<Student> studentList = studentService.findAll();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void run1(){
        // 查询某一个用户
        Student studentOne = studentService.findById(1);
        System.out.println(studentOne);
    }

    @Test
    public void run2(){
        //删除用户信息
        studentService.deleteStu(8);
    }

    @Test
    public void run3(){
        // 修改用户信息
        int number=0;
        try {
            Student student = studentService.findById(8);
            student.setName("吴薇");
            student.setAge(35);
            student.setSex("女");
            student.setNumber("110120119");
            student.setAddress("湖南省永州市");
            studentService.updateStu(student);

        } catch (Exception e) {
        } finally {

        }
    }

    @Test
    public void run4(){
        // 储存用户信息
        Student student=new Student();
        student.setName("少年");
        student.setSex("男");
        student.setAge(22);
        student.setNumber("15789654256");
        student.setAddress("广东深圳");
        studentService.save(student);
    }

    // 冒泡排序
    @Test
    public void test(){
        int[]  array={40,10,30,50,20,15,30};
        for (int i = 0; i < array.length; i++) {
            System.out.println("比较的轮数："+i);
            for (int j = 0; j < array.length-1-i; j++) {
                System.out.println("比较的次数，随着比较轮数的改变而改变："+j);
                if (array[j]>array[j+1]){
                    int c=array[j];
                    array[j]=array[j+1];
                    array[j+1]=c;
                }
            }
        }
        System.out.println("冒泡排序的结果：");
        for (int i : array) {
            System.out.print(i+"\t");
        }
    }

    // 选择排序
    @Test
    public void test2(){
        // 角标记录
        int[]  array={40,10,30,50,20,15,30};
        for (int i = 0; i < array.length; i++) {
            int mixIndex=i;
            for (int j = i+1; j < array.length; j++) {
                if (array[mixIndex]>array[j]){
                    mixIndex=j;
                }
            }
            // 角标比较，不等于当前角标，进行换值操作
            if (mixIndex!=i){
                int change=array[mixIndex];
                array[mixIndex]=array[i];
                array[i]=change;
            }
        }
        System.out.println("选择排序后的结果：");
        for (int i : array) {
            System.out.print(i+"\t");
        }
    }
}
