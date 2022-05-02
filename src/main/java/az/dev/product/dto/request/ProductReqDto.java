package az.dev.product.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductReqDto {

    private String name;
    private Double price;
}
