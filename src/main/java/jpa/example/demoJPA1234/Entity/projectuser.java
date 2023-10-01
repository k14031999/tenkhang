package jpa.example.demoJPA1234.Entity;

import jakarta.persistence.*;
import jpa.example.demoJPA1234.Entity.keys.ProjectUserkeys;

import java.util.Date;
@Entity(name = "projectusers")
public class projectuser {
 private Date createDate;
 @EmbeddedId
 private ProjectUserkeys keys;
 @ManyToOne
    @JoinColumn(name = "id_user")
    private UserEntity user;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public ProjectUserkeys getKeys() {
        return keys;
    }

    public void setKeys(ProjectUserkeys keys) {
        this.keys = keys;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public ProjectEntity getProject() {
        return project;
    }

    public void setProject(ProjectEntity project) {
        this.project = project;
    }

    @ManyToOne
    @JoinColumn(name = "id_project")
    private ProjectEntity project;

}
