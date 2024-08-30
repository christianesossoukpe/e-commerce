package bj.highfive.e_commerce.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
// import lombok.NoArgsConstructor;

@Builder
@Data
@Entity
@Table(name = "users")

public  class User {
@Id
@GeneratedValue //genere l'id automatiquement
private Long id ;
private String username;
private String email;
private long password;
private LocalDateTime created_At ;
private LocalDateTime updated_At;



}

