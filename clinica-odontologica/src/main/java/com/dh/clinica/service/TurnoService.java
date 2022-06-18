package com.dh.clinica.service;

import com.dh.clinica.model.Turno;
import com.dh.clinica.repository.IDao;
import com.dh.clinica.repository.impl.TurnoListRepository;

import java.util.List;

public class TurnoService {

    private final IDao<Turno> turnoRepository;

    public TurnoService() {
        this.turnoRepository = new TurnoListRepository();
    }

    public Turno registrarTurno(Turno turno) {
        return turnoRepository.guardar(turno);
    }

    public List<Turno> listar() {
        return turnoRepository.buscarTodos();
    }

    public void eliminar(Integer id) {
        turnoRepository.eliminar(id);
    }

    public Turno actualizar(Turno turno) {
        return turnoRepository.actualizar(turno);
    }

    public Turno buscar(Integer id) {
        return turnoRepository.buscar(id);
    }

}
