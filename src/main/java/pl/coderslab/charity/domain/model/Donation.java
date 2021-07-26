package pl.coderslab.charity.domain.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

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
@JoinColumn(name = "categories")
private List<Category> categories = new ArrayList<>();
@ManyToOne
@JoinColumn(name="institutions")
private Institution institution;
@Column(name = "street")
private String street;
@Column(name = "city")
private String city;
@Column(name = "zipCode")
private String zipCode;
@Column(name = "pickUpDate")
@DateTimeFormat(pattern = "yyyy-MM-dd")
private LocalDate pickUpDate;
@Column(name = "pickUpTime")
private LocalTime pickUpTime;
@Column(name = "pickUpComment")
private String pickUpComment;

}
