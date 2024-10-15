package com.reto.service.apirestusers.domain.dto.user;

import com.reto.service.apirestusers.domain.dto.phone.PhoneDto;
import com.reto.service.apirestusers.domain.model.Phone;
import com.reto.service.apirestusers.domain.model.User;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-15T16:11:13-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User model) {
        if ( model == null ) {
            return null;
        }

        UserDto.UserDtoBuilder userDto = UserDto.builder();

        userDto.id( model.getId() );
        userDto.name( model.getName() );
        userDto.email( model.getEmail() );
        userDto.created( model.getCreated() );
        userDto.modified( model.getModified() );
        userDto.lastLogin( model.getLastLogin() );
        userDto.token( model.getToken() );
        userDto.isActive( model.getIsActive() );
        userDto.phones( phoneSetToPhoneDtoSet( model.getPhones() ) );

        return userDto.build();
    }

    @Override
    public User toModel(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( dto.getId() );
        user.name( dto.getName() );
        user.email( dto.getEmail() );
        user.password( dto.getPassword() );
        user.created( dto.getCreated() );
        user.modified( dto.getModified() );
        user.lastLogin( dto.getLastLogin() );
        user.token( dto.getToken() );
        user.isActive( dto.getIsActive() );
        user.phones( phoneDtoSetToPhoneSet( dto.getPhones() ) );

        return user.build();
    }

    protected PhoneDto phoneToPhoneDto(Phone phone) {
        if ( phone == null ) {
            return null;
        }

        PhoneDto.PhoneDtoBuilder phoneDto = PhoneDto.builder();

        phoneDto.id( phone.getId() );
        phoneDto.number( phone.getNumber() );
        phoneDto.cityCode( phone.getCityCode() );
        phoneDto.countryCode( phone.getCountryCode() );
        phoneDto.user( phone.getUser() );

        return phoneDto.build();
    }

    protected Set<PhoneDto> phoneSetToPhoneDtoSet(Set<Phone> set) {
        if ( set == null ) {
            return null;
        }

        Set<PhoneDto> set1 = new LinkedHashSet<PhoneDto>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Phone phone : set ) {
            set1.add( phoneToPhoneDto( phone ) );
        }

        return set1;
    }

    protected Phone phoneDtoToPhone(PhoneDto phoneDto) {
        if ( phoneDto == null ) {
            return null;
        }

        Phone.PhoneBuilder phone = Phone.builder();

        phone.id( phoneDto.getId() );
        phone.number( phoneDto.getNumber() );
        phone.cityCode( phoneDto.getCityCode() );
        phone.countryCode( phoneDto.getCountryCode() );
        phone.user( phoneDto.getUser() );

        return phone.build();
    }

    protected Set<Phone> phoneDtoSetToPhoneSet(Set<PhoneDto> set) {
        if ( set == null ) {
            return null;
        }

        Set<Phone> set1 = new LinkedHashSet<Phone>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( PhoneDto phoneDto : set ) {
            set1.add( phoneDtoToPhone( phoneDto ) );
        }

        return set1;
    }
}
