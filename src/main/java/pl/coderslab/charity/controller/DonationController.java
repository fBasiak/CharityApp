package pl.coderslab.charity.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.domain.model.Donation;
import pl.coderslab.charity.domain.repository.CategoryRepository;
import pl.coderslab.charity.domain.repository.DonationRepository;
import pl.coderslab.charity.domain.repository.InstitutionRepository;

import javax.validation.Valid;

@Slf4j
@RequestMapping("/form")
@Controller
public class DonationController {
    private final DonationRepository donationRepository;
    private final InstitutionRepository institutionRepository;
    private final CategoryRepository categoryRepository;

    public DonationController(DonationRepository donationRepository, InstitutionRepository institutionRepository, CategoryRepository categoryRepository) {
        this.donationRepository = donationRepository;
        this.institutionRepository = institutionRepository;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    public String form(Model model){
        model.addAttribute("donation", new Donation());
        model.addAttribute("categories", categoryRepository.findAll());
        model.addAttribute("institutions", institutionRepository.findAll());
        return "form";
    }

    @PostMapping
    public String formConfirm(@Valid Donation donation){
        donationRepository.save(donation);
        return "form-confirmation";
    }
}
