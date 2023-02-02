package com.atividade.request;

import com.atividade.models.EstadoCivil;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaRequest {

    private Integer id;
    @NotBlank
    @NotNull
    private String nome;

    @NotBlank
    @NotNull
    private String cpf;

    @NotBlank
    @NotNull
    private String rg;

    @NotBlank
    @NotNull
    private String dataNascimento;

    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;

    @NotBlank
    @NotNull
    private String telefone;
    @NotBlank
    @NotNull
    private String email;
}
