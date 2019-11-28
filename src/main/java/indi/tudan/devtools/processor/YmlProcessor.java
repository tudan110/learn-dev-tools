package indi.tudan.devtools.processor;

import indi.tudan.devtools.common.TestYml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 配置处理器
 *
 * @author wangtan
 * @date 2019-11-28 17:26:58
 * @since 1.0
 */
@Component
@EnableConfigurationProperties
public class YmlProcessor {

    @Autowired
    private TestYml testYml;

    /**
     * 执行
     *
     * @date 2019-11-28 17:28:05
     */
    public void start() {

        System.out.println(testYml.toString());
    }
}
