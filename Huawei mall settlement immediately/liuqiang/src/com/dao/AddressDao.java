package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.entity.T_addr;

@Repository
public interface AddressDao {
	//查询全部用户信息表
	@Select("select * from T_addr")
	public List<T_addr> selectAllT_addr();
	
	//根据id查询
	@Select("select * from T_addr where a_id=#{a_id}")
	public T_addr selectT_addrId(String a_id);
	
	@Insert("insert into T_addr(receive_name,phone_num,phone_other,address) values (#{receive_name},#{phone_num},#{phone_other},#{address})")
	public int insertT_addr(T_addr t_addr);
	
	//根据id删除用户信息
	@Delete("delete from t_addr where a_id=#{a_id}")
	public int deleteT_addr(String a_id);
	
	//根据id修改用户信息
	@Update("update T_addr set receive_name=#{receive_name},phone_num=#{phone_num},phone_other=#{phone_other},address=#{address} where a_id=#{a_id}")
	public int updateT_addr(T_addr t_addr);
	
}
