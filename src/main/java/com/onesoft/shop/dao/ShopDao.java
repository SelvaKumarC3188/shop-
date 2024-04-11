package com.onesoft.shop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.onesoft.shop.entity.Shop;
import com.onesoft.shop.repository.Shoprepository;

@Repository
public class ShopDao {
	@Autowired
	Shoprepository sr;
	public String setData(Shop e) {
		sr.save(e);
		return "Data Saved";
	}
	public String setList(List<Shop> r) {
		sr.saveAll(r);
		return "List Saved";
	}
	public Shop findbyid(int a) {
		return sr.findById(a).get();
		
	}
	public List<Shop> getalldetails() {
		return sr.findAll();
}
	public String delete(int a) {
		sr.deleteById(a);
		return "Succesfully deleted";
	}
	public List<Shop> updateprice(List<Shop> a){
		return sr.saveAll(a);
		
	}
	public String patch(int a,Shop b) {
		List<Shop> c=sr.findAll();
		c.forEach(x->{
			if(x.getId()==a) {
				x.setPrice(b.getPrice());
			}
		});
		sr.saveAll(c);
		return "success";
	}
	
}
