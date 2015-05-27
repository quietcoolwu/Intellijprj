package com.immoc.collection;//package com.imooc.collection;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

//import com.sun.media.jfxmedia.control.VideoDataBuffer;

public class TestGeneric {// 定义泛型
    public List<Course> courses;

    public TestGeneric() {
        this.courses = new ArrayList<Course>();

    }

    /*
     * 测试增加
     */
    public void testAdd() {
        Course cr1 = new Course("1", "大学语文");
        courses.add(cr1);
        // 泛型集合中,不能添加泛型规定的类型及其子类型以外的对象
        // courses.add("奇怪的东西");

        Course cr2 = new Course("2", "Java基础");
        courses.add(cr2);

    }

    public void testForEach() {
        // 已经规定泛型,肯定是课程类型,不必做OBJ取出再做强转
        for (Course cr : courses) {
            System.out.println(cr.id + ":" + cr.name);

        }
    }

	/*
	 * 测试泛型可以添加子类型
	 */

    public void testChild() {
        ChildCourse ccr = new ChildCourse();
        ccr.id = "3";
        ccr.name = "我是子类型对象的实例";
        courses.add(ccr);

    }

	/*
	 * 泛型不能使用基本类型
	 */

    public void testBasicType(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        System.out.println("基本类型必须以包装类作为泛型:"+list.get(0));
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TestGeneric Generic = new TestGeneric();
        Generic.testAdd();
        Generic.testForEach();
        Generic.testChild();
        Generic.testForEach();
        Generic.testBasicType();
    }

}
