package com.tarea.libro.util;

public class ErrorDetalle {
    
    private String title;
	private int status;
	private String detail;
	private long timeStamp;
	
	public ErrorDetalle() {
	}
	
	public ErrorDetalle(String title, int status, String detail, long timeStamp) {
		this.title = title;
		this.status = status;
		this.detail = detail;
		this.timeStamp = timeStamp;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
