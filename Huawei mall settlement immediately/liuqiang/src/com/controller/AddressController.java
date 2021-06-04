package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.T_addr;
import com.service.AddressService;

@Controller
public class AddressController {
	@Autowired
	private AddressService addrService;
	
	//查询到信息跳转到confirmcartAddress.jsp界面
	@RequestMapping("/selectAllT_addr")
	public String selectAllT_addr(Model model){
		List<T_addr> addrList = addrService.selectAllT_addr();
		model.addAttribute("addrList", addrList);
		return "confirmcartAddress";
	}
	
	//根据id删除信息重定向查询全部信息刷新页面
	@RequestMapping("/deleteAddress")
	public String deleteAddress(String a_id,Model model){
		int result = addrService.deleteT_addr(a_id);
		return "redirect:/selectAllT_addr";
	}
	
	//跳转到修改页面updateAddress.jsp
	@GetMapping("/toUpdateAddress")
	public String toUpdateAddress(String a_id,Model model){
		T_addr t_addr = addrService.selectT_addrId(a_id);
		model.addAttribute("t_addr", t_addr);
		return "updateAddress";
	}
	
	//修改
	@RequestMapping("/updateAddress")
	public String updateT_addr(T_addr t_addr,Model model){
		addrService.updateT_addr(t_addr);
		return "redirect:/selectAllT_addr";
	}
}
