package cc.beup.harbor.consumer.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: BaiXinxiang
 * @Date: 2019/12/20 11:52
 * @Description:
 */
@EnableSwagger2
@Configuration
@EnableKnife4j
public class SwaggerConfig {

    @Autowired
    private Environment environment;

    @Bean
    public Docket api() {

//        if (PlatformConstant.PROD_ENV.equals(environment.getProperty("spring.profiles.active"))) {
//            return new Docket(DocumentationType.SWAGGER_2)
//                    .enable(false);
//        } else {
        return new Docket(DocumentationType.SWAGGER_2).
                useDefaultResponseMessages(false)
                .apiInfo(this.apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .build();
//        }

    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(environment.getProperty("platform.swagger.config.title"))
                .description(environment.getProperty("platform.swagger.config.description"))
                .termsOfServiceUrl(environment.getProperty("platform.swagger.config.termsOfServiceUrl"))
                .version(environment.getProperty("platform.swagger.config.version"))
                .build();
    }

}
