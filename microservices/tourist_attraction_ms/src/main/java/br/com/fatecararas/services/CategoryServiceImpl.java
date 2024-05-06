package br.com.fatecararas.services;

import br.com.fatecararas.api.core.touristspot.category.CategoryDTO;
import br.com.fatecararas.api.core.touristspot.category.CategoryService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController("/category")
public class CategoryServiceImpl implements CategoryService {

    final CategoryDTO category = CategoryDTO.builder()
            .id(1L)
                .nome("Lago Municipal")
                .icone("/asset/images/lago.png")
                .build();

    //TODO: Inclusao de dependencia de repositorios

    @Override
    public List<CategoryDTO> findAll() {
        //TODO: Validacoes de serviços

        //TODO: Chamadas de repositorios
        return List.of(category);
    }

    @Override
    public CategoryDTO save(CategoryDTO dto) {
        return category;
    }
}
