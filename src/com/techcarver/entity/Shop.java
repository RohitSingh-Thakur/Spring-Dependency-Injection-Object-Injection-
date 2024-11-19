package com.techcarver.entity;

public class Shop {

	private Manufacturer manufacturer;

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void tv() {
		manufacturer.buildTv();
	}

	public void mobile() {
		manufacturer.buildMobile();
	}

	public void ac() {
		manufacturer.buildAC();
	}
}


