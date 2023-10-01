package jpa.example.demoJPA1234.Entity.keys;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class ProjectUserkeys implements Serializable {
   @Column(name = "id_user",insertable = false,updatable = false)
    private int idUser;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

@Column(name = "id_project",insertable = false,updatable = false )
    private int idProject;
     ProjectUserkeys(){}
    ProjectUserkeys(int idUser, int idProject){
        this.idProject=idProject;
        this.idUser=idUser;
    }


}
