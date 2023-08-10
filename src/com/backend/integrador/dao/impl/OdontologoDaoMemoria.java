package com.backend.integrador.dao.impl;

import com.backend.integrador.dao.IDao;
import com.backend.integrador.entity.Odontologo;
import org.apache.log4j.Logger;

import java.util.List;

public class OdontologoDaoMemoria implements IDao<Odontologo> {
    private final Logger LOGGER = Logger.getLogger(OdontologoDaoMemoria.class);
    private List<Odontologo> odontologoRepository;

    public OdontologoDaoMemoria(List<Odontologo> medicamentoRepository) {
        this.odontologoRepository = medicamentoRepository;
    }

    @Override
    public Odontologo registrar(Odontologo odontologo) {
        odontologoRepository.add(odontologo);
        LOGGER.info("Odontologo guardado: " + odontologo);
        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {
        LOGGER.info("Listado de todos los medicamentos: \n" + odontologoRepository);
        return odontologoRepository;
    }
}
