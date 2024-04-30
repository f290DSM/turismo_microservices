package br.com.fatecararas.api.core.attraction.category;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

public interface CategoryService {
    @GetMapping("/categorias/info-categorias")
    @ResponseStatus(HttpStatus.OK)
    List<CategoryDTO> findAllCategoryOnly();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    CategoryDTO save(@RequestBody @Valid CategoryDTO dto);
}
