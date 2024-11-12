package Model;

import java.util.Date;

public class LogData {

    private int id;
    private Date date;
    private Date time;
    private int userId;
    private String writer;
    private String ipAddress;
    private String vrsta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    @Override
    public String toString() {
        return "LogData{" +
                "id=" + id +
                ", date=" + date +
                ", time=" + time +
                ", userId=" + userId +
                ", writer='" + writer + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", vrsta='" + vrsta + '\'' +
                '}';
    }
}