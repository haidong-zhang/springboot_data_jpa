package com.haidong.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haidong.entities.Notice;

@Repository
public interface NoticeDao extends JpaRepository<Notice, Long>{

}
