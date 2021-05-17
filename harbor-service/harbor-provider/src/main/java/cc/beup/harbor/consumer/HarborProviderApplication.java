package cc.beup.harbor.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

@EnableFeignClients//启用feign客户端
@EnableDiscoveryClient
//@EnableEurekaClient//启用eureka客户端
@SpringBootApplication
//@MapperScan(value = "cc.beup.harbor.mapper")//替代@Mapper
@Slf4j
public class HarborProviderApplication {

    @Value("${spring.profiles.active}")
    private String env;

    @Value("${spring.application.name}")
    private String applicationName;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HarborProviderApplication.class, args);
        HarborProviderApplication obj = context.getBean(HarborProviderApplication.class);
        log.info("SpringBoot Start Success: " + obj.applicationName + ",Env: " + obj.env);
    }

}
