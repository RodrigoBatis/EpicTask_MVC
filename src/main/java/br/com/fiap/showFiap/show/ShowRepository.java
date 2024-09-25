package br.com.fiap.showFiap.show;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ShowRepository extends JpaRepository<Show, Integer> {
}
