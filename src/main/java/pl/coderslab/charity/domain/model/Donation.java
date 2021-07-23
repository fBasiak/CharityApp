package pl.coderslab.charity.domain.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="donations")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Donation {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(name = "quantity")
@NotNull
private Integer quantity;
@ManyToMany
@JoinColumn(name = "categories_id")
private List<Category> categories = new ArrayList<>();
@ManyToOne
@JoinColumn(name="institutions_id")
private Institution institution;
@Column(name = "street")
private String street;
@Column(name = "city")
private String city;
@Column(name = "zip_code")
private String zipcode;
@Column(name = "date")
private LocalDate pickUpDate;
@Column(name = "time")
private LocalTime pickUpTime;
@Column(name = "comment")
private String pickUpComment;

}
