package br.com.fatecararas.services;

import br.com.fatecararas.api.core.attraction.category.CategoryDTO;
import br.com.fatecararas.api.core.attraction.category.CategoryService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryServiceImpl implements CategoryService {

    @Override
    public List<CategoryDTO> findAllCategoryOnly() {
        return null;
    }

    @Override
    public CategoryDTO save(CategoryDTO dto) {
        return null;
    }
}
