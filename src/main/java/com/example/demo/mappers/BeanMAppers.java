package com.example.demo.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.model.CustomerModel;

@Mapper(componentModel = "spring")
public interface BeanMAppers {
	public CustomerModel entityToModel(CustomerEntity customerEntity);
	public CustomerEntity modelToEntity(CustomerModel customerModel);
	
	List <CustomerModel> entityToModelList(List<CustomerEntity> entityList);
	List <CustomerEntity> modelToEntityList(List<CustomerModel> entityList);
	

}
