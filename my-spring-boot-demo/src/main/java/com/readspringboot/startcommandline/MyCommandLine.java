package com.readspringboot.startcommandline;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 启动过程的最后执行
 *
 * @author yanggy
 */
@Component
public class MyCommandLine implements CommandLineRunner {
	/**
	 *
	 * @param args incoming main method arguments
	 * @throws Exception
	 */
	@Override
	public void run(String... args) throws Exception {
//		System.out.println(Arrays.toString(args));
	}
}
