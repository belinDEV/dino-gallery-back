package gallery_dinosaur.model;

import gallery_dinosaur.DTO.EspecieRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "especie")
@Entity(name = "Especies")


public class Especie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotNull(message = "Selecione uma Especie")
    @Pattern(regexp = " |CHORDATA", message = "Escolha o tipo de especie 'CHORDATA', ")
    String tipo;

    public Especie(EspecieRequestDTO data) {
        this.tipo = data.tipo();
    }


}