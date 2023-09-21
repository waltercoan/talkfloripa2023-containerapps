package br.com.waltercoan.contapps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.waltercoan.contapps.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
    
}
