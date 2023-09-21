package br.com.waltercoan.contapps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.waltercoan.contapps.entity.Client;
import br.com.waltercoan.contapps.repository.ClientRepository;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping("/v1/users")
public class ClientAPIController {

    @Autowired
    private ClientRepository repository;

    @GetMapping
    public ResponseEntity<List<Client>> getAll(){
        var listClient = repository.findAll();
        return new ResponseEntity<List<Client>>(listClient, HttpStatus.OK);
    }
    
}
