package com.lugoban.catalogo.service.serviceimpl;

import java.util.List;

import com.lugoban.catalogo.model.Musica;
import com.lugoban.catalogo.repository.CatalogoRepository;
import com.lugoban.catalogo.service.CatalogoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogoServiceImpl implements CatalogoService {

    @Autowired
    CatalogoRepository  catalogoRepository;

    @Override
    public List<Musica> findAll() {                
        return catalogoRepository.findAll();
    }

    @Override
    public Musica findById(long id) {        
        return catalogoRepository.findById(id).get();
    }

    @Override
    public Musica save(Musica musica) {
        return catalogoRepository.save(musica);
    }

    @Override
    public void excluir(long id) {
        catalogoRepository.deleteById(id);
    }
    
    @Override
    public Musica update(Musica musica){
        return catalogoRepository.save(musica);
    }
}