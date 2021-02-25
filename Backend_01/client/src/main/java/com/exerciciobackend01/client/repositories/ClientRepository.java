package com.exerciciobackend01.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exerciciobackend01.client.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
