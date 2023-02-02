package com.atividade.service;

import com.atividade.exceptions.ResourceNotFoundException;
import com.atividade.models.PessoaModel;
import com.atividade.repository.PessoaRepository;
import com.atividade.request.PessoaRequest;
import com.atividade.response.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaServiceImpl implements PessoaService{

    @Autowired
    PessoaRepository pessoaRepository;

    @Override
    public MessageResponse createPessoa(PessoaRequest pessoaRequest){
        PessoaModel newPessoaModel = new PessoaModel();

        newPessoaModel.setNome(pessoaRequest.getNome());
        newPessoaModel.setRg(pessoaRequest.getRg());
        newPessoaModel.setCpf(pessoaRequest.getCpf());
        newPessoaModel.setEstadoCivil(pessoaRequest.getEstadoCivil());
        newPessoaModel.setDataNascimento(pessoaRequest.getDataNascimento());
        newPessoaModel.setTelefone(pessoaRequest.getTelefone());
        newPessoaModel.setEmail(pessoaRequest.getEmail());

        pessoaRepository.save(newPessoaModel);

        return new MessageResponse("Nova pessoa cadastrada");

    }

    @Override
    public Optional<PessoaModel> updatePessoa (PessoaRequest pessoaRequest){
        Optional<PessoaModel> pessoa = pessoaRepository.findById(pessoaRequest.getId());

        if(pessoa.isEmpty()){
            throw new RuntimeException();
        }
        else {
            pessoa.get().setNome(pessoaRequest.getNome());
            pessoa.get().setRg(pessoaRequest.getRg());
            pessoa.get().setCpf(pessoaRequest.getCpf());
            pessoa.get().setEstadoCivil(pessoaRequest.getEstadoCivil());
            pessoa.get().setEmail(pessoaRequest.getEmail());
            pessoa.get().setTelefone(pessoaRequest.getTelefone());


            pessoaRepository.save(pessoa.get());

            return pessoa;
        }


    }
    @Override
    public PessoaModel getAsSinglePessoa(Integer pessoa_id){
        return pessoaRepository.findById(pessoa_id).orElseThrow(() -> new RuntimeException());

    }

    @Override
    public List<PessoaModel> getAllPessoa(){
        return pessoaRepository.findAll();
    }

    @Override
    public void deletePessoa(Integer pessoaId) {
        if(pessoaRepository.getById(pessoaId).getId().equals(pessoaId)){
            pessoaRepository.deleteById(pessoaId);
        }
        else throw new ResourceNotFoundException("pessoa", "id", pessoaId);
    }
}
