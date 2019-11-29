package indi.tudan.devtools.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * prop 配置映射类
 *
 * @author wangtan
 * @date 2019-11-28 17:26:39
 * @since 1.0
 */
@Data
@Component
@PropertySource(
        name = "test.properties",
        value = {"classpath:config/test.properties"},
        ignoreResourceNotFound = false,
        encoding = "UTF-8",
        factory = DefaultPropertySourceFactory.class
)
@ConfigurationProperties(prefix = "prop")
public class TestProp {

    private String name;

    private int age;

    private String[] pc;
    //private List<String> pc;

    private List<String> hobby;
    //private String[] hobby;

}
