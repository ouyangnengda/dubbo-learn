package cn.ouyangnengda.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
@ImportResource("classpath:consumer.xml")
public class DubboApplication {

    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = SpringApplication.run(DubboApplication.class, args);
        System.out.println("Start consumer!");
        Object demoService = applicationContext.getBean("demoService");
        System.out.println(demoService.toString());
        System.in.read();
    }

}
