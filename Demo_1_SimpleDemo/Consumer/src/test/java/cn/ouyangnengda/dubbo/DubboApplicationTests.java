package cn.ouyangnengda.dubbo;

import cn.ouyangnengda.dubbo.DubboSPI.Robort;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ServiceLoader;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboApplicationTests {

    @Test
    public void sayHello() {
        ServiceLoader<Robort> serviceLoader = ServiceLoader.load(Robort.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robort::sayHello);
    }

}
