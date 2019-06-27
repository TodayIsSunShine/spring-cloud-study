package com.xiangzi.springcloudproducer1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudProducer1ApplicationTests {

    @Test
    public void contextLoads() {
        List<Integer> integers = Arrays.asList(1, 2, 3, null, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = integers.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(collect.toString());
    }

}
