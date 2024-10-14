package org.example.app.db.entity;

import java.util.Date;

public class Pagesa {
private Long id;
private Long studentId;
private Date dataEFillimit;
private Date dataEMbarimit;
private boolean eshtePaguar;
private String paguarMe;

public Pagesa(Long id,Long studentId,Date dataEFillimit,Date dataEMbarimit,Boolean eshtePaguar,String eshtePaguarMe){
    this.id = id;
    this.studentId = studentId;
    this.dataEFillimit = dataEFillimit;
    this.dataEMbarimit = dataEFillimit;
    this.eshtePaguar = eshtePaguar;
    this.paguarMe = paguarMe;
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Date getDataEFillimit() {
        return dataEFillimit;
    }

    public Date setDataEFillimit(Date dataEFillimit) {
        this.dataEFillimit = dataEFillimit;
    }

    public Date getDataEMbarimit() {
        return dataEMbarimit;
    }

    public Date setDataEMbarimit(Date dataEMbarimit) {
        this.dataEMbarimit = dataEMbarimit;
    }

    public boolean isEshtePaguar() {
        return eshtePaguar;
    }

    public void setEshtePaguar(boolean eshtePaguar) {
        this.eshtePaguar = eshtePaguar;
    }

    public String getPaguarMe() {
        return paguarMe;
    }

    public void setPaguarMe(String paguarMe) {
        this.paguarMe = paguarMe;
    }

    @Override
    public String toString() {
        return "Pagesa{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", dataEFillimit='" + dataEFillimit + '\'' +
                ", dataEMbarimit='" + dataEMbarimit + '\'' +
                ", eshtePaguar=" + eshtePaguar +
                ", paguarMe='" + paguarMe + '\'' +
                '}';
    }
}

