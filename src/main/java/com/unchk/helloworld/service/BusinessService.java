package com.unchk.helloworld.service;

import org.springframework.stereotype.Component;

import com.unchk.helloworld.model.Helloworld;

@Component
public class BusinessService {
	public Helloworld getHelloworld() {
		Helloworld hw = new Helloworld();
		return hw;
	}
}
