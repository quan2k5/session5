package com.data.session4_api.model.entity;
import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
}
