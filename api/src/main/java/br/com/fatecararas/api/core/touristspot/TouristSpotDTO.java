package br.com.fatecararas.api.core.touristspot;

import br.com.fatecararas.api.core.touristspot.category.CategoryDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TouristSpotDTO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long id;

    @Size(max = 13, message = "{campo.telefone-ponto.tamanho-maximo}")
    private String telefone;

    @Size(max = 60, message = "{campo.geolocal-ponto.tamanho-maximo}")
    private String geolocal;

    @Size(max = 80, message = "{campo.bairro-ponto.tamanho-maximo}")
    private String bairro;

    @Size(max = 80, message = "{campo.rua-ponto.tamanho-maximo}")
    private String rua;

    @Size(max = 8, message = "{campo.cep-ponto.tamanho-maximo}")
    private String cep;

    private Integer numero;

    @Size(max = 400, message = "{campo.descricao-ponto.tamanho-maximo}")
    private String descricao;

    @Size(max = 60, message = "{campo.nome-ponto.tamanho-maximo}")
    private String nome;

    @Size(max = 1, message = "{campo.setor-ponto.tamanho-maximo}")
    private String setor;

    private List<CategoryDTO> categorias;
}
