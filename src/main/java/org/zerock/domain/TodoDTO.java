package org.zerock.domain;

import java.util.Date;

import lombok.Data;

//2020-01-01
@Data
public class TodoDTO {
	private String title;
	private Date dueDate;
}
