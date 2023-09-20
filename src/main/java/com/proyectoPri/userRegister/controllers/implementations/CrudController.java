package com.proyectoPri.userRegister.controllers.implementations;

import com.proyectoPri.userRegister.controllers.contracts.ICrudController;
import com.proyectoPri.userRegister.dtos.requests.CreateRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
public class CrudController implements ICrudController {

    @Override
    public ResponseEntity<Object> create (CreateRequest createRequest){
        return null;
    }
}
