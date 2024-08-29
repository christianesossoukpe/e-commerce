package bj.highfive.e_commerce.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.Data;

// import lombok.EqualsAndHashCode;
// import lombok.Getter;
// import lombok.Setter;
// import lombok.ToString;


// @Getter
// @Setter
// @ToString
// @EqualsAndHashCode
// @RequiredArgsConstructor
@Data
@Entity

public  class User {


private Long id ;
private String username;
private String email;
private long password;
private LocalDateTime createdAt ;
private LocalDateTime updatedAt;





}