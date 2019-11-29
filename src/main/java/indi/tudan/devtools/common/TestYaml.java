package indi.tudan.devtools.common;

/**
 * 配置类
 *
 * @author wangtan
 * @date 2019-11-28 17:23:00
 * @since 1.0
 */

import indi.tudan.devtools.spring.core.io.support.YamlPropertySourceFactory;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 配置映射类
 *
 * @author wangtan
 * @date 2019-11-28 17:26:39
 * @since 1.0
 */
@Data
@Component
@PropertySource(
        name = "test.yml",
        value = {"classpath:config/test.yml"},
        ignoreResourceNotFound = false,
        encoding = "UTF-8",
        factory = YamlPropertySourceFactory.class
)
@ConfigurationProperties(prefix = "test")
public class TestYaml {

    private String name;

    private int age;

}
