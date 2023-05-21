package com.readspringboot.selector;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author yanggy
 */
@Configuration
@Import({MyDeferredImportSelector.class, MyDeferredImportSelectorWithGroup.class})
public class SelectorConfig {
}

