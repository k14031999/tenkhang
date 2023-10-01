package jpa.example.demoJPA1234.Entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity(name = " project")
public class ProjectEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 @OneToMany(mappedBy = "project")
 private List<projectuser>listproject;

    public List<projectuser> getListproject() {
        return listproject;
    }

    public void setListproject(List<projectuser> listproject) {
        this.listproject = listproject;
    }

    @Column(name = "startDate")
    private Date startDate;
    @Column(name = "endDate")
    private Date endDate;
    @Column(name = "name")
    private String name;
}
