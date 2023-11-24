package com.company.sys.controller;
import com.company.sys.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
class EmployeeController {
    @GetMapping("employee")
    public Result list(){
        log.info("查询雇员信息");
        return  Result.success();
    }
}
