package br.com.fatecararas.api.core.touristspot.category;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

public interface CategoryService {
    @GetMapping("/category/all")
    @ResponseStatus(HttpStatus.OK)
    List<CategoryDTO> findAll();

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    CategoryDTO save(@RequestBody @Valid CategoryDTO dto);
}
