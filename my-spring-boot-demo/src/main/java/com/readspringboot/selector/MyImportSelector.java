package com.readspringboot.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * 全部解析完时执行
 */
@Component
public class MyImportSelector implements ImportSelector {
    /**
     * 返回配置类，在全部解析完时执行后调用此方法解析
	 */
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[0];
	}
}
