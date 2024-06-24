package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.stagiaire;
import Service.stagiareService;

@RestController
@RequestMapping("/api/stagiaires")
public class StagiaireController {

    @Autowired
    private stagiareService stagiaireService;

    @GetMapping
    public List<stagiaire> getAllStagiaires() {
        return  (List<stagiaire>)  stagiaireService.getAllStagiaires();
    }

    @GetMapping("/{id}")
    public stagiaire getStagiaireById(@PathVariable Long id) {
        return stagiaireService.getStagiaireById(id);
    }

    @GetMapping("/me")
    public stagiaire getStagiaireDetails(@AuthenticationPrincipal UserDetails userDetails) {
        return stagiaireService.findByEmail(userDetails.getUsername());
    }

    @PostMapping("/addstagiaire")
    public stagiaire createStagiaire(@RequestBody stagiaire stagiaire) {
        return (stagiaire) stagiaireService.saveStagiaire(stagiaire);
    }

   

    @DeleteMapping("/{id}")
    public void deleteStagiaire(@PathVariable Long id) {
        stagiaireService.deleteStagiaire(id);
    }
}
	
