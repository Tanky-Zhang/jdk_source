package demo;

import java.util.*;

/**
 * @author zhangzhongguo
 * @date 2022/06/13
 */
public class HashMapDemo {

    public static void main(String[] args) {

        Map map = new HashMap();
//        map.put()

        String[] strings = {"2", "3", "4"};

        strings = Arrays.copyOf(strings, 6);

        System.out.println(strings.length);

        List<Integer> list = new ArrayList<>(15);
        System.out.println(list.size());

        list.set(2, 4);

        Integer a=8;
        a.equals(5);
    }

}
