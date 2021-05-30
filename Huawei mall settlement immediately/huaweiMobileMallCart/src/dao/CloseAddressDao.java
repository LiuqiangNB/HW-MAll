package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import entity.T_addr;

public interface CloseAddressDao {
	/**
	 * 查询收货地址的数据，全部
	 * 修改	姓名、手机号码、收货地址
	 * 删除
	 * 新增收货地址 姓名、手机号码、收货地址
	 * 
	 */
	//查询全部收货地址
	@Select("select * from T_addr")
	public List<T_addr> selectAddressAll();
	
	//修改收货地址
	@Update("update T_addr set a_id=#{a_id},u_id=#{u_id},receive_name=#{receive_name},phone_num=#{phone_num},phone_other=#{phone_other},address=#{address} where a_id=#{a_id}")
	public int updateAddress(String a_id);
	
	
	//根据id删除收货地址
	@Delete("delete from T_addr where a_id=#{a_id}")
	public String deleteAddressId(String a_id);
	
	//增加收货地址
	@Insert("insert into T_addr values(#{a_id},#{u_id},#{receive_name},#{phone_num},#{phone_other},#{address})")
	public int insertAddress(T_addr t_addr);
}
