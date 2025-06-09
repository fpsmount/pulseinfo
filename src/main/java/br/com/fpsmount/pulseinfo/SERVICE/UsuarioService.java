package br.com.fpsmount.pulseinfo.SERVICE;

import br.com.fpsmount.pulseinfo.DOMAIN.Usuario;
import br.com.fpsmount.pulseinfo.DTO.UsuarioDTO;

public class UsuarioService {

    public Usuario criarUsuario(UsuarioDTO data){
        Usuario usuario = new Usuario(data);
    }

}
