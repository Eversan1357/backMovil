package com.loginms.loginms.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class ContabilidadConsultInDTO {

    String usuario;
    String fechaI;
    String fechaF;
    List<Long> tipo;
}
