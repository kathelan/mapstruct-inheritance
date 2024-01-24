package pl.kathelan.mapstructinheritance.mappers;

import jakarta.persistence.MapsId;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import pl.kathelan.mapstructinheritance.dto.ContactDto;
import pl.kathelan.mapstructinheritance.dto.UserDto;
import pl.kathelan.mapstructinheritance.entities.User;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = AddressMapper.class
)
public abstract class ContactMapper {
    public static final ContactMapper MAPPER = Mappers.getMapper(ContactMapper.class);

    @Mapping(source = "user", target = "address")
    public abstract ContactDto toDto(User user);

}
