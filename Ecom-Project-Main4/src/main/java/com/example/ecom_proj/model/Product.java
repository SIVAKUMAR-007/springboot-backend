package com.example.ecom_proj.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRODUCT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "BRAND")
	private String brand;

	@Column(name = "PRICE")
	private BigDecimal price;

	@Column(name = "CATEGORY")
	private String category;

	@Column(name = "RELEASE_DATE")
	private Date releaseDate;

	@Column(name = "PRODUCTAVAILABLE")
	private Boolean productAvailable;

	@Column(name = "STOCKQUANTITY")
	private int stockQuantity;

	@Column(name = "IAMGENAME")
	private String imageName;

	@Column(name = "IAMGETYPE")
	private String imageType;

	@Column(name = "IMAGEDATE")
	@Lob
	private byte[] imageDate;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Boolean getProductAvailable() {
		return productAvailable;
	}

	public void setProductAvailable(Boolean productAvailable) {
		this.productAvailable = productAvailable;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public byte[] getImageDate() {
		return imageDate;
	}

	public void setImageDate(byte[] imageDate) {
		this.imageDate = imageDate;
	}

}
