package com.haidong.service;

import java.util.List;

import com.haidong.entities.Notice;

public interface NoticeService {
	//查看所有公告
	public List<Notice> findAll();
}
