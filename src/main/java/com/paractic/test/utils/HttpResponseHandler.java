package com.paractic.test.utils;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class HttpResponseHandler {

    /**
     * Devuelve una respuesta 200 OK
     */
    public static ResponseEntity<Map<String, String>> successResponse(String message) {
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("message", message));
    }

    /**
     * Devuelve una respuesta 400 Bad Request
     */
    public static ResponseEntity<Map<String, String>> badRequest(String error) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", error));
    }

    /**
     * Devuelve una respuesta 404 Not Found
     */
    public static ResponseEntity<Map<String, String>> notFound(String error) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("error", error));
    }

    /**
     * Devuelve una respuesta 500 Internal Server Error
     */
    public static ResponseEntity<Map<String, String>> serverError(String error) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("error", error));
    }
}

