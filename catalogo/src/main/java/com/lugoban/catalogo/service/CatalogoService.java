package com.lugoban.catalogo.service;

import java.util.List;

import javax.validation.Valid;

import com.lugoban.catalogo.model.Musica;

public interface CatalogoService {
    List<Musica> findAll();
    Musica findById(long id);
    Musica save(Musica musica);
	void excluir(long id);
	Musica update(@Valid Musica musica);
}