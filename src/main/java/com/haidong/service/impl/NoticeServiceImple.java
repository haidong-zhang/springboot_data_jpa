package com.haidong.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haidong.dao.NoticeDao;
import com.haidong.entities.Notice;
import com.haidong.service.NoticeService;
@Service
@Transactional
public class NoticeServiceImple implements NoticeService {
	
	@Autowired
	private NoticeDao noticeDao;
	//查询所有的通告
	@Override
	public List<Notice> findAll() {
		return noticeDao.findAll();
	}

}
