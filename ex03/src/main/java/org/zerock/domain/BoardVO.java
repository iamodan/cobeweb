package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
//롬복 @Data 어노테이션 : 게터 세터 자동생성 투스트링 오버라이드.
public class BoardVO {
	private Long bno;
	private String title, content, writer;
	private Date regdate, updateDate;
}
