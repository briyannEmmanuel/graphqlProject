package com.groupeisi.controller;

import com.groupeisi.entity.Etudiant;
import com.groupeisi.service.EtudiantService;
import java.util.List;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class controllerEtudiant {

    private final EtudiantService etudiantService;

    public controllerEtudiant(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @QueryMapping
    List<Etudiant> getAllEtudiantsHandler() {
        return etudiantService.getAllEtudiants();
    }
}
