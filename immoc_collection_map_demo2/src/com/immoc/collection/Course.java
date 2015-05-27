package com.immoc.collection;


public class Course {
    public String id;

    public String name;
    //含参构造器
    public Course(String id, String name){
        this.id=id;

        this.name=name;

    }

    //为了让childcourse继承必须添加无参构造器
    public Course(){

    }
}
