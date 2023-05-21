package com.readspringboot.selector;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * 全部解析完时执行
 */
@Component
public class MyDeferredImportSelectorWithGroup implements DeferredImportSelector {
	/**
	 * 分组，实现了该方法，selectImports 方法就没用了(不会执行该方法了)
	 * 返回的配置类逻辑在Group的实现类里面
	 * 多个DeferredImportSelector可以属于一个group
	 */
	@Override
	public Class<? extends Group> getImportGroup() {
		System.out.println("MyDeferredImportSelectorWithGroup#group....");
		return SelectorGroup1.class;
	}

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		System.out.println("MyDeferredImportSelectorWithGroup#selectImports....");
		return new String[0];
	}
}
