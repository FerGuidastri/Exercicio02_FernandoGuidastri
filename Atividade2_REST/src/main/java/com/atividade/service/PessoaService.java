package com.atividade.service;

import com.atividade.models.PessoaModel;
import com.atividade.request.PessoaRequest;
import com.atividade.response.MessageResponse;

import java.util.List;
import java.util.Optional;

public interface PessoaService {

    MessageResponse createPessoa(PessoaRequest pessoaRequest);

    Optional<PessoaModel> updatePessoa(PessoaRequest pessoaRequest);

    void deletePessoa(Integer pessoa_id);

    PessoaModel getAsSinglePessoa(Integer pessoa_id);

    List<PessoaModel> getAllPessoa();

}
