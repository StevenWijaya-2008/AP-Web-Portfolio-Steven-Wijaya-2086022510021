package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer id;
    private String nama;
    private Integer persentase;
    private String deskripsi;
    private String iconClass;
    private String colorClass;

    public Integer getId() { return id; } 
    public void setId(Integer id) { this.id = id; }   

    public String getNama() { return nama; }   
    public void setNama(String nama) { this.nama = nama; }
    
    public String getDeskripsi() { return deskripsi; }
    public void setDeskripsi(String deskripsi) { this.deskripsi = deskripsi; }

    public Integer getPersentase() { return persentase; }   
    public void setPersentase(Integer persentase) { this.persentase = persentase; }   

    public String getIconClass() { return iconClass; }   
    public void setIconClass(String iconClass) { this.iconClass = iconClass; }   

    public String getColorClass() { return colorClass; }   
    public void setColorClass(String colorClass) { this.colorClass = colorClass; }   
}