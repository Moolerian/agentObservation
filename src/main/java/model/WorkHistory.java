package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "workHistory")
public class WorkHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "agentInfoId")
    private Integer agentInfoId;

    @Column(name = "registerDate")
    private Date registerDate;

    @Column(name = "fileName")
    private String fileName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAgentInfoId() {
        return agentInfoId;
    }

    public void setAgentInfoId(Integer agentInfoId) {
        this.agentInfoId = agentInfoId;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
