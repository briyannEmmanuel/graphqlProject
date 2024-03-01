package com.groupeisi.service.impl;

import com.groupeisi.entity.Etudiant;
import com.groupeisi.repository.EtudiantRepository;
import com.groupeisi.service.EtudiantService;
import java.util.List;

public class EtudiantImpl implements EtudiantService {

    private EtudiantRepository etudiantRepository;

    public EtudiantImpl(EtudiantRepository etudiantRepository) {
        super();
        this.etudiantRepository = etudiantRepository;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant saveEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant findAllEtudiant(Long id) {
        return etudiantRepository.findById(id).get();
    }

    @Override
    public Etudiant countEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiantById(Long id) {
        etudiantRepository.deleteById(id);
    }
}
