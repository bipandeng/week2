package com.bipandeng.bean;

public class Goods {

	private int id;
	private String name;
	private String ename;
	private double size;
	private double price;
	private int  number;
	private String log;
	private String img;
	private int bid;
	private String bname;
	private int kid;
	private String kname;
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(int id, String name, String ename, double size, double price, int number, String log, String img,
			int bid, String bname, int kid, String kname) {
		super();
		this.id = id;
		this.name = name;
		this.ename = ename;
		this.size = size;
		this.price = price;
		this.number = number;
		this.log = log;
		this.img = img;
		this.bid = bid;
		this.bname = bname;
		this.kid = kid;
		this.kname = kname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	
	
}
