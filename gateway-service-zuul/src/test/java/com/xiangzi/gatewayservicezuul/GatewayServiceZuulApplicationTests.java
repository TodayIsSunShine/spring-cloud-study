package com.xiangzi.gatewayservicezuul;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GatewayServiceZuulApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void test() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
