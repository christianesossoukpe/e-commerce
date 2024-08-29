package bj.highfive.e_commerce.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity

public  class User {
@Id
@GeneratedValue //genere l'id automatiquement
private Long id ;
private String username;
private String email;
private long password;
private LocalDateTime createdAt ;
private LocalDateTime updatedAt;



}

