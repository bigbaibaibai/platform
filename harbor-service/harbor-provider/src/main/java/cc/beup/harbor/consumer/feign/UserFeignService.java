package cc.beup.harbor.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: Byron Bai
 * @Date: 2021/3/25 16:21
 * @Description:
 */
//@FeignClient(value = "服务名" + "${feignRouSuffix:}", contextId = "user")
public interface UserFeignService {
}
