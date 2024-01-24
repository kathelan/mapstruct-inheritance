package pl.kathelan.mapstructinheritance.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import pl.kathelan.mapstructinheritance.dto.UserDto;
import pl.kathelan.mapstructinheritance.entities.User;

@Mapper(componentModel = "spring",
        uses = ContactMapper.class,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public abstract class UserMapper {
    public static final UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "user", target = "contact")
    public abstract UserDto toDto(User user);

}
