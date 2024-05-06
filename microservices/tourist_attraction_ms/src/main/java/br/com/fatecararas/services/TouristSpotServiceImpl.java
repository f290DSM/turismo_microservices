package br.com.fatecararas.services;

import br.com.fatecararas.api.core.touristspot.TouristSpotDTO;
import br.com.fatecararas.api.core.touristspot.TouristSpotService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController("/touristspot")
public class TouristSpotServiceImpl implements TouristSpotService {
    @Override
    public List<TouristSpotDTO> findByCategoryId(Integer id) {
        return Collections.emptyList();
    }

    @Override
    public List<TouristSpotDTO> findByRouteId(Integer id) {
        return Collections.emptyList();

    }

    @Override
    public TouristSpotDTO save(TouristSpotDTO dto) {
        return new TouristSpotDTO();
    }

    @Override
    public TouristSpotDTO update(TouristSpotDTO dto) {
        return new TouristSpotDTO();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public TouristSpotDTO findById(Long id) {
        return new TouristSpotDTO();
    }
}
