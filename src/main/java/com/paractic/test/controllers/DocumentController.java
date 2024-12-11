package com.paractic.test.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.paractic.test.models.Person;
import com.paractic.test.models.ResponsePerson;
import com.paractic.test.utils.HttpResponseHandler;

import jakarta.validation.constraints.NotBlank;

@RestController
@RequestMapping("/api")
@Validated
public class DocumentController {

    Person person = new Person(
        "C",
        "23445322",
        "Juan",
        "Carlos",
        "Pérez",
        "Gómez",
        "123456789",
        "Calle Falsa 123",
        "Bogotá"
);

    @GetMapping("/user-info")
    public ResponseEntity<?> getUserInfo(
            @RequestParam @NotBlank String tipoDocumento,
            @RequestParam @NotBlank String numeroDocumento
    ) {
        try {
            // Validación de lógica
            if (!tipoDocumento.equals("C") && !tipoDocumento.equals("P")) {
                return HttpResponseHandler.badRequest("Tipo de documento inválido.");
            }

            // Simulación: No hay datos para el número de documento
            if (!numeroDocumento.equals(person.getNumeroDocumento())) {
                return HttpResponseHandler.notFound("No se encontraron datos para el número de documento.");
            }
            if(tipoDocumento.equals(person.getTipoDocumento())&&numeroDocumento.equals(person.getNumeroDocumento())){
                ResponsePerson response = new ResponsePerson("Datos obtenidos con éxito.",person);
                return ResponseEntity.ok(response);
            }        
            return HttpResponseHandler.badRequest("Verifica la informacion suministrados");
        } catch (Exception e) {
            return HttpResponseHandler.serverError("Error interno en el servidor.");
        }
    }
    
}
