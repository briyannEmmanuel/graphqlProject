package com.groupeisi.service;

import com.groupeisi.entity.Etudiant;
import java.util.List;

public interface EtudiantService {
    List<Etudiant> getAllEtudiants();

    Etudiant saveEtudiant(Etudiant etudiant);

    Etudiant findAllEtudiant(Long id);

    Etudiant countEtudiant(Etudiant etudiant);

    void deleteEtudiantById(Long id);
}
