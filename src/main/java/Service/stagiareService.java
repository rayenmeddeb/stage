package Service;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.stagiaire;

import Repository.stagiairerepo;

@Service
public class stagiareService {
	 @Autowired
	    private stagiairerepo stagiaireRepository;

	
	    public stagiaire saveStagiaire(stagiaire stg) {
	        return stagiaireRepository.save(stg);
	    }
	    
	    
	    
	    
	    public void deleteStagiaire(Long id) {
	        stagiaireRepository.deleteById(id);
	    }

	   
	    public stagiaire getStagiaireById(Long id) {
	        return stagiaireRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Stagiaire not found with id " + id));
	    }
	    
	    
	    public List<stagiaire> getAllStagiaires() {
	        return  (List<stagiaire>) stagiaireRepository.findAll();
	    }

	    public List<stagiaire> getStagiairesByTuteur(Long tuteurId) {
	        return stagiaireRepository.findByTuteurId(tuteurId);
	    }


	    public stagiaire findByEmail(String email) {
	        return stagiaireRepository.findByEmail(email);
	    }
	    
	    
	    
	    
}

