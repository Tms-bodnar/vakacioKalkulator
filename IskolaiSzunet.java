/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vakacio;

/**
 *
 * @author Bodnár Tamás <tms.bodnar@gmail.com> | www.kalandlabor.hu
 */
public class IskolaiSzunet {
private String nev;
private int kezdetEv;
private int kezdetHo;
private int kezdezNap;
private int vegEv;
private int vegHo;
private int vegNap;

    public IskolaiSzunet() {
    }

    public IskolaiSzunet(String nev, int kezdetEv, int kezdetHo, int kezdezNap, int vegEv, int vegHo, int vegNap) {
        this.nev = nev;
        this.kezdetEv = kezdetEv;
        this.kezdetHo = kezdetHo;
        this.kezdezNap = kezdezNap;
        this.vegEv = vegEv;
        this.vegHo = vegHo;
        this.vegNap = vegNap;
    }

    public int getVegNap() {
        return vegNap;
    }

    public void setVegNap(int vegNap) {
        this.vegNap = vegNap;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKezdetEv() {
        return kezdetEv;
    }

    public void setKezdetEv(int kezdetEv) {
        this.kezdetEv = kezdetEv;
    }

    public int getKezdetHo() {
        return kezdetHo;
    }

    public void setKezdetHo(int kezdetHo) {
        this.kezdetHo = kezdetHo;
    }

    public int getKezdezNap() {
        return kezdezNap;
    }

    public void setKezdezNap(int kezdezNap) {
        this.kezdezNap = kezdezNap;
    }

    public int getVegEv() {
        return vegEv;
    }

    public void setVegEv(int vegEv) {
        this.vegEv = vegEv;
    }

    public int getVegHo() {
        return vegHo;
    }

    public void setVegHo(int vegHo) {
        this.vegHo = vegHo;
    }





}
