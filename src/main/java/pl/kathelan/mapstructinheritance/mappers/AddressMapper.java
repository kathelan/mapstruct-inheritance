package pl.kathelan.mapstructinheritance.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import pl.kathelan.mapstructinheritance.dto.AddressDto;
import pl.kathelan.mapstructinheritance.dto.ContactDto;
import pl.kathelan.mapstructinheritance.entities.User;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE

)
public abstract class AddressMapper {
    public static final AddressMapper MAPPER = Mappers.getMapper(AddressMapper.class);

    public abstract AddressDto toDto(User user);

    public abstract User toEntity(AddressDto addressDto);
}
