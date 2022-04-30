package com.BookStoreApplication.dto;

import lombok.Data;

@Data
public class ResponseDTO {
    private String message;
    private Object data;
    
    public ResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
