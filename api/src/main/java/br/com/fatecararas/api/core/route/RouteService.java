package br.com.fatecararas.api.core.route;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface RouteService {
    @GetMapping
    List<RouteDTO> findAll();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    RouteDTO save(@RequestBody @Valid RouteDTO dto);

    @PostMapping("/{id}/save-points")
    @ResponseStatus(HttpStatus.CREATED)
    RoutePointDTO saveRoutePoint(@PathVariable("id") @RequestBody @Valid RoutePointDTO dto);

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    RouteDTO update(@RequestBody @Valid RouteDTO dto) ;
}
