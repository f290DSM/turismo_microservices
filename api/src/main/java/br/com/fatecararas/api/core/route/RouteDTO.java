package br.com.fatecararas.api.core.route;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RouteDTO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long id;

    @Size(max = 45, message = "{campo.nome-rota.tamanho-maximo}")
    private String nome;

    @Size(max = 45, message = "{campo.descricao-rota.tamanho-maximo}")
    private String descricao;

    @Size(max = 1, message = "{campo.tipo-rota.tamanho-maximo}")
    private String tipo;

    private boolean isGratuito;

    private LocalTime tempo;

    private Long distancia;

}
