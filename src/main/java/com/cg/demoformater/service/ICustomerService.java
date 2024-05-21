package com.cg.demoformater.service;

import com.cg.demoformater.model.Customer;
import com.cg.demoformater.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ICustomerService extends IGenerateService<Customer>{
    Iterable<Customer> findAllByProvince(Province province);
}
