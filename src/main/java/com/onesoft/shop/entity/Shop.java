package com.onesoft.shop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="products")
public class Shop {
	@Id                                               
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String productname;
private int price;
private int hsn;
private int quantity;

}
