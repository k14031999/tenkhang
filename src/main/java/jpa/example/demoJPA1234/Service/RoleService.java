package jpa.example.demoJPA1234.Service;

import jpa.example.demoJPA1234.DTO.RoleDto;
import jpa.example.demoJPA1234.Entity.RoleEntity;
import jpa.example.demoJPA1234.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleService {
   @Autowired
   private RoleRepository roleRepository;
   public List<RoleDto>listRole(){
       List<RoleEntity> listRole = roleRepository.findAll();
       List<RoleDto>listRoleDto = new ArrayList<>();
       for (RoleEntity data : listRole){
           RoleDto roleDto = new RoleDto();
           roleDto.setName(data.getName());
           roleDto.setId(data.getId());
           listRoleDto.add(roleDto);

       }
       return listRoleDto;

   }
}
