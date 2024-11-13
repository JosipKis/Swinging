package Model;

import java.util.Date;

public class UserData {

    private int id;
    private String name;
    private String address;
    private Date dateEnd;
    private String napomena;
    private String oib;
    private Date dateBegin;
    private String workPlace;
    private String workPlaceCode;
    private String service;
    private String status;
    private String isplataGo;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getWorkPlaceCode() {
        return workPlaceCode;
    }

    public void setWorkPlaceCode(String workPlaceCode) {
        this.workPlaceCode = workPlaceCode;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsplataGo() {
        return isplataGo;
    }

    public void setIsplataGo(String isplataGo) {
        this.isplataGo = isplataGo;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dateEnd=" + dateEnd +
                ", napomena='" + napomena + '\'' +
                ", oib='" + oib + '\'' +
                ", dateBegin=" + dateBegin +
                ", workPlace='" + workPlace + '\'' +
                ", workPlaceCode='" + workPlaceCode + '\'' +
                ", service='" + service + '\'' +
                ", status='" + status + '\'' +
                ", isplataGo='" + isplataGo + '\'' +
                '}';
    }
}