/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author ACER
 */
public class Student {
    private String MASP,TenSP,Dongia;

    public Student() {
    }

    public Student(String MASP) {
        this.MASP = MASP;
    }

    public Student(String MASP, String TenSP, String Dongia) {
        this.MASP = MASP;
        this.TenSP = TenSP;
        this.Dongia = Dongia;
    }

    public String getMASP() {
        return MASP;
    }

    public void setMASP(String MASP) {
        this.MASP = MASP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getDongia() {
        return Dongia;
    }

    public void setDongia(String Dongia) {
        this.Dongia = Dongia;
    }

    @Override
    public String toString() {
        return "Student{" + "MASP=" + MASP + ", TenSP=" + TenSP + ", Dongia=" + Dongia + '}';
    }
    
}
