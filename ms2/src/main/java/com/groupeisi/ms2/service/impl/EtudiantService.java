package com.groupeisi.ms2.service.impl;

import com.groupeisi.ms2.domain.Etudiant;
import com.groupeisi.ms2.service.IEtudiantService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EtudiantService implements IEtudiantService {
    private final List<Etudiant> lesEtudiants = new ArrayList<>();

    @Override
    public List<Etudiant> getAllEtudiants() {

        Etudiant et1 = new Etudiant();
        et1.setIdEtudiant(1L);
        et1.setNomEtudiant("Soumare");
        et1.setPrenomEtudiant("Seynabou");
        lesEtudiants.add(et1);

        Etudiant et2 = new Etudiant();
        et2.setIdEtudiant(2L);
        et2.setNomEtudiant("Mbaye");
        et2.setPrenomEtudiant("Tahir");
        lesEtudiants.add(et2);

        return lesEtudiants;
    }

    @Override
    public Etudiant createEtudiant(Etudiant etudiant) {
        Etudiant etudiant1 = new Etudiant();
        etudiant1.setIdEtudiant(1L);
        lesEtudiants.add(etudiant1);
        return etudiant1;
    }
}
