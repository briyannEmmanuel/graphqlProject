package com.groupeisi.repository;

import com.groupeisi.entity.Etudiant;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findAll();
}
