package com.pigasso.Mapper;

import com.pigasso.pojo.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {
    @Select("SELECT * FROM mybatis.emp")
    public List<Emp> list();

    // 根据id删除数据
    @Delete("DELETE FROM mybatis.emp WHERE id = #{id}")
    public int delete(Integer id);


}
