package com.fleetMall.service.other.otherImpl;

import com.fleetMall.domain.Employee;
import com.fleetMall.service.other.EmployeeService;
import com.fleetMall.service.base.baseImpl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * Created by beila on 2017/4/9.
 */
@Service("employee_service")
public class EmployeeServiceImpl extends ServiceImpl<Employee> implements EmployeeService{
}
