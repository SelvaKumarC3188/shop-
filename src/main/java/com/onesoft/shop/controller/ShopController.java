package com.onesoft.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;

import com.onesoft.shop.entity.Shop;
import com.onesoft.shop.service.ShopServices;
@Controller
public class ShopController {
	@Autowired
	 ShopServices ss;
	@PostMapping(value="/savedata")
	public String setData(@RequestBody Shop s) {
		return ss.setData(s);
   }
	@PostMapping(value="/savelist")
	public String setList(@RequestBody List<Shop> r) {
		return ss.setList(r);
   }
	@GetMapping(value="/findbyid/{a}")
	public Shop findbyid(@PathVariable int a) {
		return ss.findbyid(a);
	}
	@GetMapping(value="/getalldetails")
	public List<Shop> getalldetails() {
		return ss.getalldetails();
	}
	@DeleteMapping(value="/delete/{a}")
	public String delete(@PathVariable int a) {
		return ss.delete(a);
	}
	@PutMapping(value="/updateprice/{price}")
	public List<Shop> updateprice(@PathVariable int price){
		return ss.updateprice(price);
	}
	@PatchMapping(value="/patch/{a}")
	public String patch(@PathVariable int a ,@RequestBody Shop b) {
		return ss.patch(a,b);
	}
}