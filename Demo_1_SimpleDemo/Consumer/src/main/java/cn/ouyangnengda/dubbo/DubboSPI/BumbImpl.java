package cn.ouyangnengda.dubbo.DubboSPI;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月08日 11:57:00
 **/
public class BumbImpl implements Robort {
    @Override
    public void sayHello() {
        System.out.println("Hello, I'm Bumb.");
    }
}
