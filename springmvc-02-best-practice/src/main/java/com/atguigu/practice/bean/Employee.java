package com.atguigu.practice.bean;


import com.atguigu.practice.annotation.Gender;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Employee {

    @NotNull(message = "id不能为空")
    private Long id;

    @NotEmpty(message = "姓名不能为空")
    private String name;
    private Integer age;
    private String email;
    private String gender;
    private String address;
    private BigDecimal salary;


    private Date birth;

}
