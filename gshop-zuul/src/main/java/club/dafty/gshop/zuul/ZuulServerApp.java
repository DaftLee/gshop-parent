package club.dafty.gshop.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author leechengchao@foxmail.com
 * @date 2019/9/29 23:35
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulServerApp {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApp.class,args);
    }
}