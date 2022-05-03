package com.example.demo.endpoints;

import com.example.demo.model.ResponseBody;
import com.example.demo.model.Responses;
import com.example.demo.model.UsersVO;
import com.example.demo.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Action;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/users")
public class UsersEndpoint {
    @Autowired
    private UsersService usersService;

    @GetMapping("/getall")
    public ResponseEntity<com.example.demo.model.ResponseBody<List<UsersVO>>>getAll() throws ApplicationException {
        ResponseEntity<ResponseBody<List<UsersVO>>> res = null;
        List<UsersVO> aux = new ArrayList<>();
        try {
            aux= usersService.getAll();
            res = Responses.response200OK("Lista de tiempos (milisegundos)",aux, aux.size());
        }catch (Exception e){
            res = Responses.response200OK("No se encontraron resultados",aux, 0);
        }

        return res;
    }
}
