package br.com.fatecararas.api.core.touristspot.category;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CategoryService {
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    List<CategoryDTO> findAll();

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    CategoryDTO findById(@PathVariable("id") @Valid Integer id);

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    CategoryDTO save(@RequestBody @Valid CategoryDTO dto);

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    CategoryDTO update(@PathVariable("id") @Valid Integer id, @RequestBody @Valid CategoryDTO dto);

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    void delete(@PathVariable("id") @Valid Integer id);
}
