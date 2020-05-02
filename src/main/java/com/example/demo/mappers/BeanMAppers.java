package com.example.demo.mappers;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.model.CustomerModel;

@Mapper(componentModel = "spring")
public interface BeanMAppers {
	
	
	
	@Mapping(source = "address.addressLine1",target = "addressLine1")
	@Mapping(source = "address.addressLine2",target = "addressLine2")
	@Mapping(source = "address.city",target = "city")
	@Mapping(source = "address.state",target = "state")
	@Mapping(source = "address.country",target = "country")
	@Mapping(source = "address.zipCode",target = "zipCode")
	public CustomerEntity modelToEntity(CustomerModel customerModel);
	
	@InheritInverseConfiguration
	public CustomerModel entityToModel(CustomerEntity customerEntity);
	
	List <CustomerModel> entityToModelList(List<CustomerEntity> entityList);
	List <CustomerEntity> modelToEntityList(List<CustomerModel> entityList);
	

}
