package cn.ouyangnengda.dubbo.DemoService;

import org.apache.dubbo.config.annotation.Reference;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月08日 15:22:00
 **/

public class DemoServiceImpl {

    @Reference
    private DemoService demoService;

    public String sayHello(String s) {
        return demoService.sayHello(s);
    }
}
