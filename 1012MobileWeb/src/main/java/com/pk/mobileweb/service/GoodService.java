package com.pk.mobileweb.service;

import java.util.List;

import com.pk.mobileweb.domain.Good;

public interface GoodService {
	//전체 데이터를 가져오는 메소드
	public List<Good> list();
}
