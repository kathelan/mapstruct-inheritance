package pl.kathelan.mapstructinheritance.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContactDto {
    private String email;
    private String mobile;
    private AddressDto address;

}
