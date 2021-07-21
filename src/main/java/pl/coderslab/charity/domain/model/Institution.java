package pl.coderslab.charity.domain.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="institutions")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Institution {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(name="name", unique = true)
@NotNull
private String name;
@Column(name="description")
private String description;
}
