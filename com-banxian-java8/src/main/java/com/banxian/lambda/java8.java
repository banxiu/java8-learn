package com.banxian.lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;


/**
 * @program: java8-learn
 * @description:
 * @author: Wangly
 * @create: 2021-04-30 10:04
 */
public class java8
{
    public static void main(String[] args) {
        /*JFrame jf = new JFrame("测试窗口");
        jf.setSize(200, 200);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        // 创建一个按钮
        final JButton btn = new JButton("测试按钮");
        // 添加按钮的点击事件监听器
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取到的事件源就是按钮本身
                // transient
                System.out.println("按钮被点击");
            }
        });

        // 匿名内部类中使用 final 局部变量
        final String name = getUserName();
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("hi " + name);
            }
        });
        panel.add(btn);
        jf.setContentPane(panel);
        jf.setVisible(true);
        // Lambda 表达式中引用既成事实上的 final 变量
        String name1 = getUserName();
        btn.addActionListener(event -> System.out.println("hi " + name));
        // 未使用既成事实上的 final 变量，导致无法通过编译
        String name2 = getUserName();
        name2 = formatUserName(name2);
        btn.addActionListener(event -> System.out.println("hi " + name));
*/
       // Callable
       /* final List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Callable<Integer> callableObj = () -> {
            int result = integers.stream().mapToInt(i -> i.intValue()).sum();
            return result;
        };
        // 手动创建线程池，效果会更好哦。
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> future = service.submit(callableObj);
        Integer result = 0;

        try
        {
            result = future.get();

        }catch(InterruptedException e){

            e.printStackTrace();

        }catch (ExecutionException e) {

            e.printStackTrace();
        }
        System.out.println("Sum = "+result);
        service.shutdown();*/
    }
    static String getUserName()
    {
        return "hello world";
    }
    static String formatUserName(String name)
    {
       return name.toLowerCase();
    }
}