package br.com.fatecararas.api.core.touristspot;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface TouristSpotService {

    @GetMapping("/category/{id}")
    List<TouristSpotDTO> findByCategoryId(@PathVariable("id") Integer id);

    @GetMapping("/route/{id}")
    List<TouristSpotDTO> findByRouteId(@PathVariable("id") Integer id);

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    TouristSpotDTO save(@RequestBody @Valid TouristSpotDTO dto);

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    TouristSpotDTO update(@RequestBody @Valid TouristSpotDTO dto);
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id);

    @GetMapping("/{id}")
    TouristSpotDTO findById(@PathVariable Long id);
}
