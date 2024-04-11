package com.onesoft.shop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.onesoft.shop.dao.ShopDao;
import com.onesoft.shop.entity.Shop;

@Service
public class ShopServices {
	@Autowired
	ShopDao sd;
	public String setData(Shop e) {
		return sd.setData(e);
	}
	public String setList(List<Shop> r) {
		List<Shop> s1=new ArrayList<>();
		for(Shop x:s1) {
			if(x.getProductname().startsWith("b")) {
				s1.add(x);
			}
		}
		return sd.setList(s1); 
	}
	public Shop findbyid(int a) {
		return sd.findbyid(a);
	}
	public List<Shop> getalldetails() {
		return sd.getalldetails();
}
	public String delete(int a) {
		return sd.delete(a);
}
	public List<Shop> updateprice(int price){
		List<Shop> newcar=sd.getalldetails();
		List<Shop> s=newcar.stream().filter(x->x.getPrice()>price).peek(x->x.setPrice(x.getPrice()+x.getPrice()*5/100)).collect(Collectors.toList());
		return sd.updateprice(s);
	}
		public String patch(int a,Shop b) {
		return sd.patch(a,b);
	}
	
	
}