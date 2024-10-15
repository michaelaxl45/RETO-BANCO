package com.reto.service.apirestusers.domain.dto.configuration;

import com.reto.service.apirestusers.domain.model.GlobalConfiguration;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-15T16:11:13-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class GlobalConfigurationMapperImpl implements GlobalConfigurationMapper {

    @Override
    public GlobalConfigurationDto toDto(GlobalConfiguration model) {
        if ( model == null ) {
            return null;
        }

        GlobalConfigurationDto.GlobalConfigurationDtoBuilder globalConfigurationDto = GlobalConfigurationDto.builder();

        globalConfigurationDto.id( model.getId() );
        globalConfigurationDto.name( model.getName() );
        globalConfigurationDto.description( model.getDescription() );
        globalConfigurationDto.pattern( model.getPattern() );

        return globalConfigurationDto.build();
    }

    @Override
    public GlobalConfiguration toModel(GlobalConfigurationDto dto) {
        if ( dto == null ) {
            return null;
        }

        GlobalConfiguration.GlobalConfigurationBuilder globalConfiguration = GlobalConfiguration.builder();

        globalConfiguration.id( dto.getId() );
        globalConfiguration.name( dto.getName() );
        globalConfiguration.description( dto.getDescription() );
        globalConfiguration.pattern( dto.getPattern() );

        return globalConfiguration.build();
    }
}
