package reniec.go.pe.reniecv1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reniec.go.pe.reniecv1.dto.ReniecDto;

@RestController
@RequestMapping("/api/reniec")
public class ReniecController {

    @GetMapping
    public ReniecDto getAll() {
        ReniecDto dto = new ReniecDto();
        dto.setId("24561895041");
        dto.setName("Reniec");
        dto.setEmail("consultas@reniec.go.pe");
        return dto;
    }
}