/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinelitas.cinelitas.services;

import com.cinelitas.cinelitas.entity.Sala;
import com.cinelitas.cinelitas.repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jorklin
 */
@Service
public class SalaService implements ISalaService{
    
    @Autowired
    private SalaRepository salaRepository;

    @Override
    public List<Sala> listSala() {
       
        return (List<Sala>)salaRepository.findAll();
    }
    
    
}
