package com.reto.service.apirestusers.domain.dto.user;

import com.reto.service.apirestusers.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring"
)
public interface UserMapper {
    @Mapping(target = "password", ignore = true)
    UserDto toDto(User model);

    User toModel(UserDto dto);
}
