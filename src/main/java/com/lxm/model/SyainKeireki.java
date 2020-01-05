package com.lxm.model;

import java.util.Date;

public class SyainKeireki extends SyainKeirekiKey {
    private Date syuryobi;

    private String pjName;

    private Integer tainitiFlag;

    private Integer basyo;

    private Integer kibo;

    private Integer gyosyu;

    private Integer kaihatukankyo;

    private Integer unyoukankyo;

    private String gengo;

    private String db;

    private String tool;

    private Integer tantou;

    private String sagyohani;

    private String gaiyou;

    private Date tourokubi;

    private Date kousinnbi;

    public Date getSyuryobi() {
        return syuryobi;
    }

    public void setSyuryobi(Date syuryobi) {
        this.syuryobi = syuryobi;
    }

    public String getPjName() {
        return pjName;
    }

    public void setPjName(String pjName) {
        this.pjName = pjName == null ? null : pjName.trim();
    }

    public Integer getTainitiFlag() {
        return tainitiFlag;
    }

    public void setTainitiFlag(Integer tainitiFlag) {
        this.tainitiFlag = tainitiFlag;
    }

    public Integer getBasyo() {
        return basyo;
    }

    public void setBasyo(Integer basyo) {
        this.basyo = basyo;
    }

    public Integer getKibo() {
        return kibo;
    }

    public void setKibo(Integer kibo) {
        this.kibo = kibo;
    }

    public Integer getGyosyu() {
        return gyosyu;
    }

    public void setGyosyu(Integer gyosyu) {
        this.gyosyu = gyosyu;
    }

    public Integer getKaihatukankyo() {
        return kaihatukankyo;
    }

    public void setKaihatukankyo(Integer kaihatukankyo) {
        this.kaihatukankyo = kaihatukankyo;
    }

    public Integer getUnyoukankyo() {
        return unyoukankyo;
    }

    public void setUnyoukankyo(Integer unyoukankyo) {
        this.unyoukankyo = unyoukankyo;
    }

    public String getGengo() {
        return gengo;
    }

    public void setGengo(String gengo) {
        this.gengo = gengo == null ? null : gengo.trim();
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool == null ? null : tool.trim();
    }

    public Integer getTantou() {
        return tantou;
    }

    public void setTantou(Integer tantou) {
        this.tantou = tantou;
    }

    public String getSagyohani() {
        return sagyohani;
    }

    public void setSagyohani(String sagyohani) {
        this.sagyohani = sagyohani == null ? null : sagyohani.trim();
    }

    public String getGaiyou() {
        return gaiyou;
    }

    public void setGaiyou(String gaiyou) {
        this.gaiyou = gaiyou == null ? null : gaiyou.trim();
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