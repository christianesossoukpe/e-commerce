package bj.highfive.e_commerce.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_items")

public class OrderItem {
    @Id
    @GeneratedValue
    private Long id;
    
    @ManyToOne
    @JoinColumn(name="order_id", nullable=false)
    private Order order;
    @ManyToOne
    @JoinColumn(name="product_id", nullable=false)
    private Product product;

    @Column(nullable=false)
    private Integer name;

    @Column(nullable=false)
    private Integer quantity;

    @Column(nullable=false)
    private Double price;

    @Column(updatable=false)
       private LocalDateTime created_At;
       private LocalDateTime updated_At;
}
