package demo;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhangzhongguo
 * @date 2022/06/18
 */
public class LockDemo {

    private  static  ReentrantLock lock=new ReentrantLock();

    public static void main(String[] args) {

        lock.lock();


        lock.unlock();

    }


}
