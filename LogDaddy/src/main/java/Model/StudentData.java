package Model;

import java.util.Date;

public class StudentData {

    private int id;
    private String name;
    private Date plannedStartDate;
    private Date actualStartDate;
    private Date endDate;
    private String napomena;
    private String radnoMjesto;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPlannedStartDate() {
        return plannedStartDate;
    }

    public void setPlannedStartDate(Date plannedStartDate) {
        this.plannedStartDate = plannedStartDate;
    }

    public Date getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(Date actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public String getRadnoMjesto() {
        return radnoMjesto;
    }

    public void setRadnoMjesto(String radnoMjesto) {
        this.radnoMjesto = radnoMjesto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void nullAll(){
        this.name = null;
        this.plannedStartDate = null;
        this.actualStartDate = null;
        this.endDate = null;
        this.napomena = null;
        this.radnoMjesto = null;
        this.status = null;
    }

    @Override
    public String toString() {
        return "StudentData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plannedStartDate=" + plannedStartDate +
                ", actualStartDate=" + actualStartDate +
                ", endDate=" + endDate +
                ", napomena='" + napomena + '\'' +
                ", radnoMjesto='" + radnoMjesto + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}