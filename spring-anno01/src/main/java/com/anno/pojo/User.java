package com.anno.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class User {
    @Value("dsaf")
    public String name;

}
