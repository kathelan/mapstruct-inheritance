package pl.kathelan.mapstructinheritance.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private ContactDto contact;
}
