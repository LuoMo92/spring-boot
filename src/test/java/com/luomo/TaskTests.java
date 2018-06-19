package com.luomo;

import com.luomo.task.Task;
import com.luomo.task.Task2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

/**
 * @author LiuMei
 * @date 2018-06-19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskTests {

    @Autowired
    private Task task;

    @Autowired
    private Task2 task2;

    @Test
    public void testAsync() throws Exception {

        long start = System.currentTimeMillis();

        Future<String> task1 = task.doTaskOne();
        Future<String> task2 = task.doTaskTwo();
        Future<String> task3 = task.doTaskThree();
        while (true) {
            if (task1.isDone() && task2.isDone() && task3.isDone()) {
                // 三个任务都调用完成，退出循环等待
                break;
            }
            Thread.sleep(1000);
        }
        long end = System.currentTimeMillis();
        System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");

    }

    @Test
    public void testThreadPool() throws Exception {

        task2.doTaskOne();
        task2.doTaskTwo();
        task2.doTaskThree();

        Thread.currentThread().join();
    }

}
