package com.stichteam.cafe.cafe.dto;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@Component
public class MemberDTO {
     
	 private String Id;
	 private String pwd;
	 private String phone;
	 private String address;
	 private String birth;
	 private String name;
	 
	 
	 
}
