package com.readspringboot.selector;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanggy
 */
public class SelectorGroup1 implements DeferredImportSelector.Group {
	private final List<Entry> list = new ArrayList<>();

	/**
	 *
	 * @param metadata
	 * @param selector DeferredImportSelector 如：MyDeferredImportSelectorWithGroup
	 */
	@Override
	public void process(AnnotationMetadata metadata, DeferredImportSelector selector) {

	}

	/**
	 * 待解析的配置类（封装成Entry）
	 */
	@Override
	public Iterable<Entry> selectImports() {
		return list;
	}
}
