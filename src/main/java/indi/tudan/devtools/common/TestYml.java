package indi.tudan.devtools.common;

/**
 * 配置类
 *
 * @author wangtan
 * @date 2019-11-28 17:23:00
 * @since 1.0
 */

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "test")
@PropertySource(value = {"classpath:config/test.yml"},
        ignoreResourceNotFound = false, encoding = "UTF-8", name = "test.yml")
public class TestYml {

    private String name;

    private int age;
}
