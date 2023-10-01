package jpa.example.demoJPA1234.Service;

import jpa.example.demoJPA1234.DTO.RoleDto;
import jpa.example.demoJPA1234.DTO.UserDto;
import jpa.example.demoJPA1234.Entity.UserEntity;
import jpa.example.demoJPA1234.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserService {
 @Autowired
     private UserRepository userRepository;
 public List<UserDto>list(){
     List<UserEntity>list = userRepository.findAll(); // nghĩa là như viết câu query của bảng USER
     List<UserDto>listDtto = new ArrayList<>();
     for (UserEntity data : list){
         UserDto userDto = new UserDto();
         userDto.setFirstName(data.getFirstName());
         userDto.setId(data.getId());
         userDto.setPwd(data.getPwd());
         userDto.setEmail(data.getEmail());
         userDto.setFirstName(data.getFirstName());

         RoleDto roleDto = new RoleDto();

         roleDto.setId(data.getRoleEntity().getId());
         roleDto.setName(data.getRoleEntity().getName());
         userDto.setRole(roleDto);
         listDtto.add(userDto);

     }
     return listDtto;
 }
 public boolean check(String email,String pwd){
     List<UserEntity>listUser = userRepository.getByEmailAndPwd(email, pwd);

     return listUser.size() > 0;
 }
 public List<UserDto>getByPhoneAndFullname(String phone,String fullname){
     List<UserEntity>listUser = userRepository.getByPhoneAndFullname(phone, fullname);
     List<UserDto>listUserDto = new ArrayList<>();
     for(UserEntity data : listUser){
         UserDto userDto = new UserDto();
         userDto.setEmail(data.getEmail());
         userDto.setFirstName(data.getFirstName());
         listUserDto.add(userDto);
     }
     return listUserDto;

 }

}
