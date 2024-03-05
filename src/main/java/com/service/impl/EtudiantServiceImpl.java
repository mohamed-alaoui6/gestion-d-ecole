package com.service.impl;

import com.dao.EtudiantDao;

import com.entities.Etudiant;

import com.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Component
public class EtudiantServiceImpl implements EtudiantService {

    @Autowired
    private EtudiantDao etudiantDao ;
    @Override
    public void saveOrUpdate(Etudiant f) {
        this.etudiantDao.saveOrUpdate(f);

    }

    @Override
    public void delete(Etudiant f) {
        this.etudiantDao.delete(f);
    }

    @Override
    public Etudiant getById(int id) {
        return this.etudiantDao.getById(id);
    }

    @Override
    @Transactional
    public List<Etudiant> getAll() {
        List<Etudiant> etudiants = this.etudiantDao.getAll();
        return etudiants;
    }
}
