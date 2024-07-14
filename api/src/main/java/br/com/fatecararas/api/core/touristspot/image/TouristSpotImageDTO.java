package br.com.fatecararas.api.core.touristspot.image;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TouristSpotImageDTO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long id;

    @Size(max = 60, message = "{Max lenght exceded}")
    private String nome;

    @NotNull
    private String imagem;

    @NotNull
    private Long pontoId;
}
