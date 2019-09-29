package club.dafty.gshop.eureka;

/**
 * @author leechengchao@foxmail.com
 * @date 2019/9/29 23:31
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @EnableEurekaServer - 标注启动该组件技术相关注解标签
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp.class,args);
    }
}