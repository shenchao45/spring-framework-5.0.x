package com.lijl.service;

import org.springframework.stereotype.Service;

/**
 * @author lijunlong
 * @date 2018/12/10
 */
@Service
public class IndexServiceImpl2 implements IndexService {
	@Override
	public void service() {
		System.out.println("service2");
	}
}
