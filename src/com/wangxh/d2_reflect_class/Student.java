package com.wangxh.d2_reflect_class;

public class Student {
    public static void main(String[] args) throws Exception{
        //1.Class类中的一个静态方法：forName（全限名：包名+类名）
        Class c = Class.forName("com.wangxh.d2_reflect_class");
        System.out.println(c);

        //2.类名.class
        Class c1 = Student.class;
        System.out.println(c1);

        //3.对象.getClass()获取对象对应类的Class对象
        Student s = new Student();
        Class c2 = s.getClass();
        System.out.println(c2);
    }

}
