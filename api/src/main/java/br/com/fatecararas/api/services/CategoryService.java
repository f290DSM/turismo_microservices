package br.com.fatecararas.api.services;

import br.com.fatecararas.api.core.dto.CategoryDTO;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface CategoryService {
    @GetMapping("/info-categorias")
    List<CategoryDTO> findAll();
}
