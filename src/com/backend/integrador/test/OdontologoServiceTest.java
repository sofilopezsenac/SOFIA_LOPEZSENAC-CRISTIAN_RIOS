package com.backend.integrador.test;

import com.backend.integrador.dao.impl.OdontologoDaoH2;
import com.backend.integrador.entity.Odontologo;
import com.backend.integrador.service.OdontologoService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


     public class OdontologoServiceTest {
        OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());


        @Test
        void deberiaAgregarUnMedicamento(){
            Odontologo odont1 = new Odontologo(2345677, "mateo", "lopez");
            Odontologo odontologoInsertado = odontologoService.registrarOdontologo(odont1);

            assertNotNull(odontologoInsertado.getId());
        }

        @Test
        public void deberiaHaberUnaListaNoVacia(){
            List<Odontologo> odontologosTest = odontologoService.listarTodosLosOdontologos();
            assertFalse(odontologosTest.isEmpty());
            assertTrue(odontologosTest.size() >= 1);

        }


    }
