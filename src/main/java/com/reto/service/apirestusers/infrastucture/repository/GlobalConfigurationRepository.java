package com.reto.service.apirestusers.infrastucture.repository;

import com.reto.service.apirestusers.infrastucture.enums.GlobalConfigurationEnum;
import com.reto.service.apirestusers.domain.model.GlobalConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface GlobalConfigurationRepository extends CrudRepository<GlobalConfiguration, UUID> {
    Optional<GlobalConfiguration> findByName(GlobalConfigurationEnum name);
}
