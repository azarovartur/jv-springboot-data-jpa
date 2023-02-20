package mate.academy.springboot.datajpa.model.dto.response;

import java.math.BigDecimal;
import lombok.Data;
import mate.academy.springboot.datajpa.model.Category;

@Data
public class ProductResponseDto {
    private Long id;
    private String title;
    private BigDecimal price;
    private Category categories;
}
