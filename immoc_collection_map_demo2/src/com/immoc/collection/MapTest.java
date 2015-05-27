package com.immoc.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by William on 2015/5/9.
 */
public class MapTest {
    /*
    用来承装学生类型对象
     */
    public Map<String, Student> students;//规定泛型  String, Student

    /**
     * 在构造器中初始化students属性
     *
     * @param args
     */

    public MapTest() {
        this.students = new HashMap<>();//String, Student

    }

    /*
    测试添加,输入学生ID,判断占用,未被占用则输入姓名创建新学生对象,添加到Studens中
     */
    public void testPut() {
        Scanner console = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("请输入学生ID:");
            String ID = console.next();
            //判断ID是否被占用
            Student st = students.get(ID);
            if (st == null) {
                //提示输入学生姓名
                System.out.println("请输入学生姓名");
                String name = console.next();
                //创建新的学生对象
                Student newStudent = new Student(ID, name);
                //通过调用students的put方法添加ID-学生映射
                students.put(ID,newStudent);
                System.out.println("成功添加学生:"+students.get(ID).name);
                i++;
            }else {
                System.out.println("该学生ID已被占用!");
                continue;
            }


        }
    }

    /**
     * 测试Map的keyset方法
     * @param args
     */
    public void testKeySet(){
        Set<String> keySet = students.keySet();
        //取得studens的容量
        System.out.println("总共有:"+students.size()+"个学生");
        //遍历keyset对象取得map中的每一个键,再调用get方法取得每个键对应的value
        for(String stuId:keySet){
            Student st =students.get(stuId);
            if(st!=null){
                System.out.println("学生:"+st.name);
            }
        }
    }

    /*
    删除MAP中已有的映射
     */
    public void testRemove(){

        //获取从键盘输入的待删除学生ID字符串
        Scanner console = new Scanner(System.in);
        while(true) {
            //提示用户删除学生ID
            System.out.println("输入要删除的ID:");
            String ID = console.next();
            //判断该ID是否有对应的学生对象
            Student st = students.get(ID);
            if (st == null) {
                //提示输入的ID不存在
                System.out.println("该ID不存在!");
                continue;
            }
            students.remove(ID);
            System.out.println("成功删除学生!");
            break;
        }
    }

    /*
    通过entrySet遍历Map
     */
    public void testEntrySet(){
        Set<Map.Entry<String, Student>> entrySet =students.entrySet();
        for(Map.Entry<String, Student> entry:entrySet){
            System.out.println("取得键:"+entry.getKey());
            System.out.println("对应的值为:"+entry.getValue().name);
        }
    }



    public static void main(String[] args) {
        MapTest mt = new MapTest();
        mt.testPut();
        mt.testKeySet();//Hashmap无序
    }
}
