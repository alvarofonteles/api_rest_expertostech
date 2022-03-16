package com.expertostech.tutorial.rest.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.expertostech.tutorial.rest.api.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
