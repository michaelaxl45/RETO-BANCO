package com.reto.service.apirestusers.application;

import com.reto.service.apirestusers.domain.dto.configuration.GlobalConfigurationDto;
import com.reto.service.apirestusers.infrastucture.enums.GlobalConfigurationEnum;

import java.util.List;
import java.util.UUID;

public interface GlobalConfigurationService {
    GlobalConfigurationDto createGlobalConfiguration(GlobalConfigurationDto globalConfigurationDto);

    List<GlobalConfigurationDto> getAllGlobalConfigurations();

    GlobalConfigurationDto updateGlobalConfiguration(UUID globalConfigurationId, GlobalConfigurationDto globalConfigurationDto);

    String getPatternByName(GlobalConfigurationEnum name);
}
