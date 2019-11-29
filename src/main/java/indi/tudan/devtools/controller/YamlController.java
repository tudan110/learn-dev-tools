package indi.tudan.devtools.controller;

import indi.tudan.devtools.common.TestYaml;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置类控制器
 *
 * @author wangtan
 * @date 2019-11-29 11:13:10
 * @since 1.0
 */
@Slf4j
@RestController
@RequestMapping("yaml")
public class YamlController {

    @Autowired
    private TestYaml testYaml;

    @GetMapping("test")
    public String test() {
        log.info("load test.yml.");
        return testYaml.toString();
    }

}
