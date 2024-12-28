package com.groupeisi.ms2.web.rest.controllers;

import com.groupeisi.ms2.domain.Etudiant;
import com.groupeisi.ms2.service.IEtudiantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EtudiantController {

    private final IEtudiantService etudiantService;

    // Constructeur avec injection de dépendances
    public EtudiantController(IEtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @GetMapping("/etudiants")
    public ResponseEntity<List<Etudiant>> getAllEtudiants() {
        return ResponseEntity.ok(etudiantService.getAllEtudiants());
    }
    @PostMapping("/etudiant")
    public ResponseEntity<Etudiant> createEtudiant(@RequestBody Etudiant etudiant) {
        return ResponseEntity.status(HttpStatus.CREATED).body(etudiantService.createEtudiant(etudiant));
    }
}
