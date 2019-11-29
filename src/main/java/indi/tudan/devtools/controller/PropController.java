package indi.tudan.devtools.controller;

import indi.tudan.devtools.common.TestProp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * prop 配置类控制器
 *
 * @author wangtan
 * @date 2019-11-29 16:08:09
 * @since 1.0
 */
@Slf4j
@RestController
@RequestMapping("prop")
public class PropController {

    @Autowired
    private TestProp testProp;

    @GetMapping("test")
    public String test() {
        log.info("load test.properties.");
        return testProp.toString();
    }

}
