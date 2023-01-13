package com.smhome.userboard.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName="set")
public class ResponseDto<D> {
	private boolean status;
	private String message;
	private D data;
	
	public static <D> ResponseDto<D> setSuccess(String message, D data) {
//		성공 시 멤버변수를 매개변수로 할당, 초기화
		return ResponseDto.set(true, message, data);
	}
	
	public static <D> ResponseDto<D> setFailed(String message) {
		return ResponseDto.set(false, message, null);
	}
}
