package com.masai.bean;

public class Tender {

	private int tid;
	private String ttitle;
	private String tdesc;
	private String type;
	private String sDate;
	private String eDate;
	private int tprice;
	
	
	@Override
	public String toString() {
		return "Tender [tid=" + tid + ", ttitle=" + ttitle + ", tdesc=" + tdesc + ", type=" + type + ", sDate=" + sDate
				+ ", eDate=" + eDate + ", tprice=" + tprice + "]";
	}
	
	
	public Tender() {
		super();
	}


	public Tender(int tid, String ttitle, String tdesc, String type, String sDate, String eDate, int tprice) {
		super();
		this.tid = tid;
		this.ttitle = ttitle;
		this.tdesc = tdesc;
		this.type = type;
		this.sDate = sDate;
		this.eDate = eDate;
		this.tprice = tprice;
	}


	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTtitle() {
		return ttitle;
	}
	public void setTtitle(String ttitle) {
		this.ttitle = ttitle;
	}
	public String getTdesc() {
		return tdesc;
	}
	public void setTdesc(String tdesc) {
		this.tdesc = tdesc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getsDate() {
		return sDate;
	}
	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	public String geteDate() {
		return eDate;
	}
	public void seteDate(String eDate) {
		this.eDate = eDate;
	}
	public int getTprice() {
		return tprice;
	}
	public void setTprice(int tprice) {
		this.tprice = tprice;
	}
	
	
	
}
