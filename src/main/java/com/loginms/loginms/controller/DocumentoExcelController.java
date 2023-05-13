package com.loginms.loginms.controller;

import com.loginms.loginms.dto.ContabilidadConsultInDTO;
import com.loginms.loginms.dto.DocumentoBse64DTO;
import com.loginms.loginms.service.IDocumentoExcelService;
import com.loginms.loginms.utilities.Constantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
@CrossOrigin("*")
@RequestMapping(value = Constantes.Urls.PATH_EXCEL)
public class DocumentoExcelController {

    @Autowired
    IDocumentoExcelService iDocumentoExcelService;

    @PostMapping
    public DocumentoBse64DTO repote(@RequestBody ContabilidadConsultInDTO contabilidadConsultInDTO) throws ParseException {
        return iDocumentoExcelService.repote(contabilidadConsultInDTO);
    }

}
