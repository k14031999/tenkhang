package jpa.example.demoJPA1234.CONTROLLER;

import jpa.example.demoJPA1234.DTO.UserDto;
import jpa.example.demoJPA1234.Entity.UserEntity;
import jpa.example.demoJPA1234.Repository.UserRepository;
import jpa.example.demoJPA1234.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
     private UserService userService;
 private Logger  logger = LoggerFactory.getLogger(UserController.class);
    @GetMapping("")
 public ResponseEntity<?> getUser(){

         List<UserDto>listUser = userService.list();
     return  new ResponseEntity<>(listUser, HttpStatus.OK);

 }
 @PostMapping("/sigin")
    public  ResponseEntity<?>getSigin(@RequestParam String email,@RequestParam String pwd){
        logger.info("Hello " + email + "-"+ pwd);
 boolean iss = userService.check(email, pwd);
     logger.info("test" + iss);
        return  new ResponseEntity<>(iss,HttpStatus.OK);

 }
 @PostMapping("/search")
    public ResponseEntity<?>search(@RequestParam String phone ,@RequestParam String fullname){
        List<UserDto>list = userService.getByPhoneAndFullname(phone, fullname);
        return   new ResponseEntity<>(list, HttpStatus.OK);


 }

}
