package br.com.fatecararas.api.core.route;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoutePointDTO {
    private List<Long> pointIds;
}
