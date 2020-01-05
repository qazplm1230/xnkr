package com.lxm.model;

import java.util.Date;

public class SyainRireki extends SyainRirekiKey {
    private Date syuryobi;

    private String kaisyaName;

    private String busyo;

    private Date tourokubi;

    private Date kousinnbi;

    public Date getSyuryobi() {
        return syuryobi;
    }

    public void setSyuryobi(Date syuryobi) {
        this.syuryobi = syuryobi;
    }

    public String getKaisyaName() {
        return kaisyaName;
    }

    public void setKaisyaName(String kaisyaName) {
        this.kaisyaName = kaisyaName == null ? null : kaisyaName.trim();
    }

    public String getBusyo() {
        return busyo;
    }

    public void setBusyo(String busyo) {
        this.busyo = busyo == null ? null : busyo.trim();
    }

    public Date getTourokubi() {
        return tourokubi;
    }

    public void setTourokubi(Date tourokubi) {
        this.tourokubi = tourokubi;
    }

    public Date getKousinnbi() {
        return kousinnbi;
    }

    public void setKousinnbi(Date kousinnbi) {
        this.kousinnbi = kousinnbi;
    }
}