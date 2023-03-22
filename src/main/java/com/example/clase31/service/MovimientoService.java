package com.example.clase31.service;

import com.example.clase31.domain.Movimiento;
import com.example.clase31.repository.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoService {
    private MovimientoRepository movimientoRepository;
    @Autowired
    public MovimientoService(MovimientoRepository movimientoRepository) {
        this.movimientoRepository = movimientoRepository;
    }
    public Movimiento guardarMovimiento(Movimiento movimiento){
        return movimientoRepository.save(movimiento);
    }
    public List<Movimiento> listarMovimientos(){
        return movimientoRepository.findAll();
    }
}
