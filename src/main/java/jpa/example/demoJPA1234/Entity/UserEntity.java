package jpa.example.demoJPA1234.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
@Column(name = "email")
   private String email;


@Column(name = "pwd")
    private String pwd;
    @Column(name = "first_name")
   private String firstName;
    @Column(name = "last_name")
   private String lastName;
    @Column(name = "full_name")
   private String fullName;
    @Column(name = "user_name")
   private String userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Column(name = "phone")
    private String phone;
//@Column(name = "id_role")
// TRONG Mapping entity  AI GIỮ KHÓA NGOẠI bảng nào giữ khóa ngoại thì sẽ có @JoinColumn và @ManyToOne
//  nếu MỐI QUAN HỆ  kết chữ ONE THÌ SẼ LÀ 1 ĐỐI TƯỢNG
//   NẾU MỐI QUAN HỆ KẾT THÚC CHỮ MANY THÌ SẼ LÀ 1 LIST


    @ManyToOne
    @JoinColumn(name = "id_role") // tên khóa ngoại trong database
    private RoleEntity roleEntity;// tên Entity tham chiếu tới

    public List<projectuser> getListUser() {
        return listUser;
    }

    public void setListUser(List<projectuser> listUser) {
        this.listUser = listUser;
    }

    @OneToMany(mappedBy = "user")
     List<projectuser>listUser;

    public RoleEntity getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(RoleEntity roleEntity) {
        this.roleEntity = roleEntity;
    }

    @Column(name = "image")
   private String image;

}
