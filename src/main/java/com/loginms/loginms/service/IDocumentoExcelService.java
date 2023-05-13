package com.loginms.loginms.service;

import com.loginms.loginms.dto.ContabilidadConsultDTO;
import com.loginms.loginms.dto.ContabilidadConsultInDTO;
import com.loginms.loginms.dto.DocumentoBse64DTO;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

public interface IDocumentoExcelService {

    /**
     * Reporte
     *
     * @param contabilidadConsultInDTO Parametro de entrada
     * @return
     */
    DocumentoBse64DTO repote(ContabilidadConsultInDTO contabilidadConsultInDTO) throws ParseException;

    List<ContabilidadConsultDTO>
    repoteDatos(ContabilidadConsultInDTO contabilidadConsultInDTO) throws ParseException;
}
