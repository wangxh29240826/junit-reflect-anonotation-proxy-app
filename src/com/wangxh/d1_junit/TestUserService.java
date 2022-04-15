package com.wangxh.d1_junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * 测试类
 */
public class TestUserService {
    /**
     测试方法
     注意点：
            1.必须是公开的，无参数 无返回值的方法
            2.测试方法必须使用@Test注解标记
     */
    @Test
    public void testLoginName(){
        UserService userService = new UserService();
        String rs = userService.loginName("admin","123456");

        //进行预期结果的正确性测试，断言
        Assert.assertEquals("您的登录业务有问题","登录成功", rs );

    }
    @Test
    public  void testSelectNames(){
        UserService userService = new UserService();
        userService.selectNames();

    }


}
