package demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhangzhongguo
 * @date 2023/04/20
 */
public class MyProxy {
    public interface IHello{
        void sayHello();
    }

    static class Hello implements IHello{
        @Override
        public void sayHello() {
            System.out.println("Hello World");
        }
    }

    static class MyInvocationHandler implements InvocationHandler {
        private Object target;//目标对象
        public MyInvocationHandler(Object target){
            this.target=target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
            System.out.println("before");
            Object rs=method.invoke(target,args);
            System.out.println("after");
            return  rs;
        }
    }

    public static void main(String [] args){
//        System.out.println("test");
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        IHello iHello=(IHello) Proxy.newProxyInstance(IHello.class.getClassLoader(),//加载接口的类加载器
                new Class[]{IHello.class},
                new MyInvocationHandler(new Hello()));
        iHello.sayHello();
    }
}