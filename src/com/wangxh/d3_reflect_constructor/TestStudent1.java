package com.wangxh.d3_reflect_constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestStudent1 {
    //1.getConstructors:
    //获取全部的构造器：只能获取public修饰的构造器
    //Constructor[] getConstructors()
    @Test
    public void getConstructors() {
        //a,第一步：获取对象
        Class c= Student.class;
        //b.提取类中的全部的构造器对象
        Constructor[] constructors = c.getConstructors();
        //c.遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "=====>"+ constructor.getParameterCount());
        }
            //2.getDeclaredConstructors()
        //获取全部的构造器无所谓权限
        public void getConstructors() {
            //a,第一步：获取对象
            Class c  = Student.class;
            //b.提取类中的全部的构造器对象
            Constructor[] constructors = c.getConstructors();
            //c.遍历构造器
            for (Constructor constructor : constructors) {
                System.out.println(constructor.getName() + "=====>"+ constructor.getDeclaringClass());
            }
    }


}
