package br.com.fatecararas.services;

import br.com.fatecararas.api.core.dto.CategoryDTO;
import br.com.fatecararas.api.services.CategoryService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class CategoryServiceImpl implements CategoryService {
    @Override
    public List<CategoryDTO> findAll() {
        return Collections.emptyList();
    }
}
