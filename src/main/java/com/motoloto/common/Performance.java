package com.motoloto.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class Performance implements Serializable {

	private static final long serialVersionUID = 1L;

	private String season1;
	private String season2;
	private String season3;
	private String season4;
	public String getSeason1() {
		return season1;
	}
	public void setSeason1(String season1) {
		this.season1 = season1;
	}
	public String getSeason2() {
		return season2;
	}
	public void setSeason2(String season2) {
		this.season2 = season2;
	}
	public String getSeason3() {
		return season3;
	}
	public void setSeason3(String season3) {
		this.season3 = season3;
	}
	public String getSeason4() {
		return season4;
	}
	public void setSeason4(String season4) {
		this.season4 = season4;
	}
	
	
	
}