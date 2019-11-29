package indi.tudan.devtools.spring.core.io.support;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;
import org.springframework.lang.Nullable;

import java.io.IOException;

/**
 * Yaml 配置文件读取工厂类
 *
 * @author wangtan
 * @date 2019-11-29 14:37:44
 * @since 1.0
 */
public class YamlPropertySourceFactory implements PropertySourceFactory {

    public YamlPropertySourceFactory() {
    }

    /**
     * yaml 文档解析方法
     *
     * @param name     配置项名称
     * @param resource 配置项资源
     * @return PropertySource<?>
     * @throws IOException IOException
     * @date 2019-11-29 14:45:00
     * @since 1.0
     */
    @Override
    public PropertySource<?> createPropertySource(@Nullable String name, EncodedResource resource) throws IOException {

        // 返回 yaml 属性资源
        return new YamlPropertySourceLoader()
                .load(resource.getResource().getFilename(), resource.getResource())
                .get(0);
    }

}
