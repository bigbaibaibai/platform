package cc.beup.harbor.consumer.frontend;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Byron Bai
 * @Date: 2021/3/25 16:21
 * @Description:
 */
@Api(tags = "港口测试接口", value = "HarborController")
@RestController("/harbor")
public class HarborController {

    /**
     * 测试接口
     *
     * @Author: Byron Bai
     * @Date: 2021/5/27 18:29
     */
    @ApiOperation(value = "测试接口", notes = "白鑫翔")
    @GetMapping("/test")
    public String test() {
        return "success";
    }

}
