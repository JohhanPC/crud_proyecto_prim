package com.proyectoPri.userRegister.controllers.contracts;


import com.proyectoPri.userRegister.dtos.requests.CreateRequest;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.proyectoPri.userRegister.constants.ConstantesDeProceso.MICROSERVICE_PATH_USER;

@Validated
@RequestMapping(path = MICROSERVICE_PATH_USER, produces = MediaType.APPLICATION_JSON_VALUE)
public interface ICrudController {

    @ApiOperation(nickname = "Este servicio sirve para crear el usuario", value = "user create")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Process ok"),
            @ApiResponse(responseCode = "400", description = "Custom bussiness error"),
            @ApiResponse(responseCode = "500", description = "General bussineess error")
    })
    @PostMapping(path = "/create")
    ResponseEntity<Object> create(
            @Valid @RequestBody CreateRequest createRequest
    );
}