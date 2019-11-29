package indi.tudan.devtools;

import indi.tudan.devtools.processor.PropProcessor;
import indi.tudan.devtools.processor.YamlProcessor;
import indi.tudan.devtools.utils.SpringBeanUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 程序入口类
 *
 * @author wangtan
 * @date 2019-11-28 17:29:53
 * @since 1.0
 */
@SpringBootApplication
@EnableConfigurationProperties
public class LearnDevToolsApplication {

    public static void main(String[] args) {

        SpringApplication.run(LearnDevToolsApplication.class, args);

        SpringBeanUtils.getBean(YamlProcessor.class).start();

        SpringBeanUtils.getBean(PropProcessor.class).start();

    }

}
