package indi.tudan.devtools.processor;

import indi.tudan.devtools.common.TestProp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * prop 配置处理器
 *
 * @author wangtan
 * @date 2019-11-29 16:08:42
 * @since 1.0
 */
@Component
@EnableConfigurationProperties
public class PropProcessor {

    @Autowired
    private TestProp testProp;

    /**
     * 执行
     *
     * @date 2019-11-29 16:08:46
     */
    public void start() {

        System.out.println(testProp.toString());
    }
}
