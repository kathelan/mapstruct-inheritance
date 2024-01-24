package pl.kathelan.mapstructinheritance.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AddressDto {
    private String street;
    private String city;
    private String apartment;
}
