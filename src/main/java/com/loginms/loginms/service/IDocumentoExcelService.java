package com.loginms.loginms.service;

import com.loginms.loginms.dto.ContabilidadConsultInDTO;
import com.loginms.loginms.dto.DocumentoBse64DTO;

import java.text.ParseException;

public interface IDocumentoExcelService {

    /**
     * Reporte
     *
     * @param contabilidadConsultInDTO Parametro de entrada
     * @return
     */
    DocumentoBse64DTO repote(ContabilidadConsultInDTO contabilidadConsultInDTO) throws ParseException;
}
