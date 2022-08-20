package com.example.list;

import com.example.list.pojo.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamList {
    // 参考这篇文章 https://blog.csdn.net/yuxiangdeming/article/details/121288780
    public static void main(String[] args) {
        List<User> userList1 = new ArrayList<>();
        userList1.add(new User("张三", 12, "南京"));
        userList1.add(new User("李四", 13, "北京"));
        userList1.add(new User("王五", 14, "苏州"));
        userList1.add(new User("王五", 17, "郑州"));

        List<User> userList2 = new ArrayList<>();
        userList2.add(new User("李四", 13, "北京"));
        userList2.add(new User("王五", 20, "广州"));

        List<User> matchNameOrAge = userList1.stream()
                .filter(
                        a -> userList2.stream().anyMatch(b -> a.getName().equals(b.getName())
                                || a.getAge() == b.getAge()
                        )
                ).collect(Collectors.toList());

        System.out.println("matchNameOrAge = " + matchNameOrAge);
    }
}
