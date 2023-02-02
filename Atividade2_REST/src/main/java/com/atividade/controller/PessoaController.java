package com.atividade.controller;

import com.atividade.models.PessoaModel;
import com.atividade.request.PessoaRequest;
import com.atividade.response.MessageResponse;
import com.atividade.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;


    @GetMapping("/findAll")
    public ResponseEntity<List<PessoaModel>> getAllPessoas(){
        List<PessoaModel> pessoaModels = pessoaService.getAllPessoa();
        return ResponseEntity.ok(pessoaModels);
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<PessoaModel> getPessoasById(@PathVariable("id")Integer pessoa_id){
        PessoaModel pessoaModel = pessoaService.getAsSinglePessoa(pessoa_id);
        return new ResponseEntity<>(pessoaModel, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<MessageResponse> addPessoa(@RequestBody PessoaRequest pessoa){
        MessageResponse newPessoa = pessoaService.createPessoa(pessoa);
        return new ResponseEntity<>(newPessoa, HttpStatus.OK);
    }

    @PutMapping("/update")
    public Optional<PessoaModel> updatePessoa(@RequestBody PessoaRequest pessoa){

        return pessoaService.updatePessoa(pessoa);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePessoa(@PathVariable Integer id){
        pessoaService.deletePessoa(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
