package com.ingles.examen.services;

import com.ingles.examen.entity.Usuario;
import com.ingles.examen.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioServiceIMPL implements UsuarioService{
    @Autowired
    private UsuarioRepository ur;
    @Override
    public Usuario createUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> findAllUsuario() {
        return (List<Usuario>)ur.findAll();
    }

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return ur.save(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        ur.delete(usuario);
    }

    @Override
    public Usuario findUsuario(Usuario usuario) {
        return ur.findById(usuario.getId()).orElse(null);
    }

    @Override
    public Usuario findUsuarioById(Long id) {
        return ur.findById(id).orElse(null);
    }

}
