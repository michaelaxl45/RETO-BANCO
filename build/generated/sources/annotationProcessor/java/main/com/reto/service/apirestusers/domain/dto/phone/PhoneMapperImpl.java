package com.reto.service.apirestusers.domain.dto.phone;

import com.reto.service.apirestusers.domain.model.Phone;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-15T16:11:13-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class PhoneMapperImpl implements PhoneMapper {

    @Override
    public PhoneDto toDto(Phone model) {
        if ( model == null ) {
            return null;
        }

        PhoneDto.PhoneDtoBuilder phoneDto = PhoneDto.builder();

        phoneDto.id( model.getId() );
        phoneDto.number( model.getNumber() );
        phoneDto.cityCode( model.getCityCode() );
        phoneDto.countryCode( model.getCountryCode() );
        phoneDto.user( model.getUser() );

        return phoneDto.build();
    }

    @Override
    public Phone toModel(PhoneDto dto) {
        if ( dto == null ) {
            return null;
        }

        Phone.PhoneBuilder phone = Phone.builder();

        phone.id( dto.getId() );
        phone.number( dto.getNumber() );
        phone.cityCode( dto.getCityCode() );
        phone.countryCode( dto.getCountryCode() );
        phone.user( dto.getUser() );

        return phone.build();
    }
}
