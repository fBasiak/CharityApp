package pl.coderslab.charity.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.charity.domain.model.Donation;


public interface DonationRepository extends JpaRepository<Donation, Long> {
    @Query("Select sum(d.quantity) from Donation d")
    int countBags();
}
