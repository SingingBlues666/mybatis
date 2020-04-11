package com.zlx.mybatis.dao;

import com.zlx.mybatis.bean.Employee;

public interface EmployeeMapper {
    public Employee getEmpById(Integer id);
}
