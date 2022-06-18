package com.dh.clinica.service;


import com.dh.clinica.model.Domicilio;
import com.dh.clinica.repository.IDao;
import com.dh.clinica.repository.impl.DomicilioDaoH2;

import java.util.List;

public class DomicilioService {
    private IDao<Domicilio> domicilioDao;

    public DomicilioService(DomicilioDaoH2 domicilioDaoH2) {
        this.domicilioDao = domicilioDaoH2;
    }

    public Domicilio guardar(Domicilio domicilio) {
        domicilioDao.guardar(domicilio);
        return domicilio;
    }

    public Domicilio buscar(Integer id) {
        return domicilioDao.buscar(id);
    }

    public List<Domicilio> buscarTodos() {
        return domicilioDao.buscarTodos();
    }

    public void eliminar(Integer id) {
        domicilioDao.eliminar(id);
    }

}
