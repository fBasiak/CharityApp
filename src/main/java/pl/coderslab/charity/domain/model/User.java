package pl.coderslab.charity.domain.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(nullable = false, unique = true)
@Email
private String email;
@Column(nullable = false)
private String password;
@Column(nullable = false)
private String role;
}
