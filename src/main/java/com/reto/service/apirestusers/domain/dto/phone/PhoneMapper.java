package com.reto.service.apirestusers.domain.dto.phone;

import com.reto.service.apirestusers.domain.model.Phone;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface PhoneMapper {
    PhoneDto toDto(Phone model);

    Phone toModel(PhoneDto dto);
}
