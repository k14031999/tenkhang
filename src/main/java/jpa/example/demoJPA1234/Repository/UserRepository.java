package jpa.example.demoJPA1234.Repository;

import jpa.example.demoJPA1234.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    @Query("FROM users WHERE email =?1 AND pwd =?2 ") // query  của JPA DUng tên Entity trong bảng
    List<UserEntity>getByEmailAndPwd(String email,String pwd);


// List<UserEntity> findByEmailAndPwd(String email,String pwd);
    @Query("FROM users WHERE phone =?1 AND fullName = ?2")
   List<UserEntity>getByPhoneAndFullname(String phone,String fullname);
}
