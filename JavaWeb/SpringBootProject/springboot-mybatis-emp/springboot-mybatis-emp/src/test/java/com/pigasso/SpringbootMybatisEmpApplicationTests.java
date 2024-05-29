package com.pigasso;

import com.pigasso.Mapper.EmpMapper;
import com.pigasso.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisEmpApplicationTests {

    @Autowired
    private EmpMapper empMapper;
    @Test
    public void testListUser(){
//        int delete = empMapper.delete(17);
//        System.out.println(delete);
        empMapper.delete(17);
    }

}
