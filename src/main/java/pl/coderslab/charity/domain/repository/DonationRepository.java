package pl.coderslab.charity.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.charity.domain.model.Donation;

import java.util.Optional;


public interface DonationRepository extends JpaRepository<Donation, Long> {
    @Query("Select sum(d.quantity) from Donation d")
    Optional<Long> countBags();
}
