package com.masai.bean;

public class Vender {
	
	private int vid;
	private String vname;
	private String vtype;
	private int price;
	private String vdate;
	private String uname;
	private String password;
	
	
	
	public Vender() {
		super();
	}



	public int getVid() {
		return vid;
	}



	public void setVid(int vid) {
		this.vid = vid;
	}



	public String getVname() {
		return vname;
	}



	public void setVname(String vname) {
		this.vname = vname;
	}



	public String getVtype() {
		return vtype;
	}



	public void setVtype(String vtype) {
		this.vtype = vtype;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getVdate() {
		return vdate;
	}



	public void setVdate(String vdate) {
		this.vdate = vdate;
	}



	public String getUname() {
		return uname;
	}



	public void setUname(String uname) {
		this.uname = uname;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Vender [vid=" + vid + ", vname=" + vname + ", vtype=" + vtype + ", price=" + price + ", vdate=" + vdate
				+ ", uname=" + uname + ", password=" + password + "]";
	}



	public Vender(int vid, String vname, String vtype, int price, String vdate, String uname, String password) {
		super();
		this.vid = vid;
		this.vname = vname;
		this.vtype = vtype;
		this.price = price;
		this.vdate = vdate;
		this.uname = uname;
		this.password = password;
	}
	
	

}
