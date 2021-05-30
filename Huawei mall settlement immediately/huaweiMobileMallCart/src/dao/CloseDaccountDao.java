package dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import entity.T_car;

public interface CloseDaccountDao {
	 /**
	  * 查询购物车表的数据
	  * 金额相加汇总
	  */
	@Select("select * from T_car")
	public List<T_car> selectT_carAll();
}
