package com.data.session4_api.model.entity;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Product> products;
}
