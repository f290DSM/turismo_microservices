package br.com.fatecararas.api.core.touristspot.category;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDTO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long id;

    @Size(max = 60, message = "Excede 60 caracteres.")
    private String nome;

    private String icone;

}
