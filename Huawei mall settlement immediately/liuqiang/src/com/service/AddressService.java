package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dao.AddressDao;
import com.entity.T_addr;

@Service
public class AddressService{

	@Autowired
	private AddressDao addr;
	
	/**
	 * 查询全部数据
	 * @return
	 */
	public List<T_addr> selectAllT_addr() {
		List<T_addr> addrList = addr.selectAllT_addr();
		return addrList;
	}
	
	/**
	 * 根据id删除数据
	 * @param a_id
	 * @return
	 */
	public int deleteT_addr(String a_id){
		int result = addr.deleteT_addr(a_id);
		return result;
	}
	
	/**
	 * 根据id查询信息
	 * @param a_id
	 * @return
	 */
	public T_addr selectT_addrId(String a_id){
		T_addr t_addr = addr.selectT_addrId(a_id);
		return t_addr;
	}
	
	/**
	 * 根据id修改数据
	 * @param t_addr
	 * @return
	 */
	public int updateT_addr(T_addr t_addr){
		int result = addr.updateT_addr(t_addr);
		return result;
	}

}
