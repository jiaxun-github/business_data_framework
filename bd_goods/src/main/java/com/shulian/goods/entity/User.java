package com.shulian.goods.entity;

import lombok.Data;

/**
 * @author jiaxun
 * @date 2020-06-22
 * @time 10:48
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
