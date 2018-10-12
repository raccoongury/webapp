package com.pk.mobileweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.mobileweb.dao.GoodDao;
import com.pk.mobileweb.domain.Good;

@Service
public class GoodServiceImpl implements GoodService {

	@Autowired
	private GoodDao goodDao;
	
	@Override
	public List<Good> list() {
		// TODO Auto-generated method stub
		return goodDao.list();
	}

}

