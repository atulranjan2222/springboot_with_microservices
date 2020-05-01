package com.example.demo.mappers;

import org.mapstruct.Mapper;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.model.CustomerModel;

@Mapper(componentModel = "spring")
public interface BeanMAppers {
	public CustomerModel entityToModel(CustomerEntity customerEntity);
	public CustomerEntity modelToEntity(CustomerModel customerModel);

}
