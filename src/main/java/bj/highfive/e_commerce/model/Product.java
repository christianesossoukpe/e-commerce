package bj.highfive.e_commerce.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")

public class Product {
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany(mappedBy="product")
List<OrderItem> orderItems;

    @Column(nullable=false)
    private String name;
    @Column(columnDefinition= "TEXT")
    private String description;

    @Column(nullable=false)
    private Double price;

    @Column(name="stock_quantity", nullable = false)
    private Integer stockQty;
    
    private LocalDateTime created_At;
    private LocalDateTime updated_At;
}
