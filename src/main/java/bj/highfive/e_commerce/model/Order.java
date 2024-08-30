package bj.highfive.e_commerce.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    // todo:ajouter la clé secondaire de user-id
    private Long id;
    @Column(nullable=false,unique=true)
    private Double totalAmount;

    @Column(nullable=false)
    private String status;

    @Column(updatable=false)
    private LocalDateTime created_At;

    private LocalDateTime update_At;
}
