package br.com.fpsmount.pulseinfo.REPOSITORY;

import br.com.fpsmount.pulseinfo.DOMAIN.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findUserById(Long id);
}
