package cn.ouyangnengda.dubbo.DubboSPI;

import cn.ouyangnengda.dubbo.JavaSPI.BlameImpl;
import cn.ouyangnengda.dubbo.JavaSPI.PrimeImpl;
import cn.ouyangnengda.dubbo.JavaSPI.Robot;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月10日 16:57:00
 **/

public class TestExtensionLoader {
    public static void main(String[] args) {
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        BlameImpl blame = (BlameImpl) extensionLoader.getExtension("blameImpl");
        blame.sayHello();
        PrimeImpl prime = (PrimeImpl) extensionLoader.getExtension("");
        prime.sayHello();
    }
}
