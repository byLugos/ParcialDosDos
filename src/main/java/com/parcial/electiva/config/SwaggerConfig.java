package com.parcial.electiva.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "API de Usuarios", version = "v1", description = "API para gestionar usuarios y pedidos en el sistema"))
public class SwaggerConfig {
    // No es necesario agregar configuraciones adicionales en Springdoc OpenAPI 2.x
}
