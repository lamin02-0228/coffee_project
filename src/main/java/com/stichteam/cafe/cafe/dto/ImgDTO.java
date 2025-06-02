package com.stichteam.cafe.cafe.dto;

import java.util.Date;


public class ImgDTO {
   private String writer;
   private String filePath;
   private Date Date;
   private String userId;
   private int bno;
   private String title;
public String getWriter() {
	return writer;
}
public void setWriter(String writer) {
	this.writer = writer;
}
public String getFilePath() {
	return filePath;
}
public void setFilePath(String filePath) {
	this.filePath = filePath;
}
public Date getDate() {
	return Date;
}
public void setDate(Date date) {
	Date = date;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public int getBno() {
	return bno;
}
public void setBno(int bno) {
	this.bno = bno;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}

@Override
public String toString() {
	return "ImgDTO " +
    "제목" + title + '\'' +
    ", 작성자 ='" + writer + '\'' +
    ", 회원 ID ='" + userId + '\'' +
    ", 글번호=" + bno + 
    ", 작성날짜'" + Date + '\'' +
    ", 이미지 경로='" + filePath +'\'' +
    '}';
    
}

	
}
   
   
   