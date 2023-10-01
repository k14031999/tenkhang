package jpa.example.demoJPA1234.CONTROLLER;

import jpa.example.demoJPA1234.DTO.RoleDto;
import jpa.example.demoJPA1234.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired()
    private RoleService roleService;
    @GetMapping("")
    public ResponseEntity<?>getRole(){
        List<RoleDto>listRole = roleService.listRole();
        ResponseEntity res = new ResponseEntity<>(listRole, HttpStatus.OK);

        return res;
    }
}
