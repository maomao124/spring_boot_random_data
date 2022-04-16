package mao.spring_boot_random_data.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：spring_boot_random_data
 * Package(包名): mao.spring_boot_random_data.data
 * Class(测试类名): RandomDataTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/16
 * Time(创建时间)： 18:53
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class RandomDataTest
{
    @Autowired
    RandomData randomData;

    @Test
    public void test()
    {
        System.out.println(randomData);
    }
}