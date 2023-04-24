package demo;


/**
 * @author zhangzhongguo
 * @date 2022/06/09
 */
public class Test {


    public static void main(String[] args) {
        System.out.println("hello!!!!");
        String extPath = System.getProperty("java.ext.dirs");
        System.out.println(System.getProperty("java.ext.dirs"));

        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.get();
        threadLocal.set(1);
        threadLocal.remove();
    }
}
