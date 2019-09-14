package cn.ouyangnengda.dubbo.JavaSPI;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月08日 12:57:00
 **/
public class BlameImpl implements Robot {
    @Override
    public void sayHello() {
        System.out.println("This is blame.");
    }
}
