package br.com.fiap.showFiap.show;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "T_SHOW_FIAP")
public class Show {

    @Id
    Integer id;

    @NotBlank
    String nomeEvento;

    @NotBlank
    String descricao;

    @NotBlank
    String artistas;

    @NotBlank
    String localizacao;

}
