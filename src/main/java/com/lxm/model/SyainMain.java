package com.lxm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SyainMain {
    private Integer syainId;

    private String firstNameKanji;

    private String lastNameKanji;

    private String firstNameKana;

    private String lastNameKana;

    private String firstNameEigo;

    private String lastNameEigo;

    private Integer seibetu;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date tanjyobi;

    private Integer kokuseki;

    private String syussinn;

    private Integer haigusya;

    private String passportNum;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date passportEndDate;

    private Integer visaKikan;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date visaEndDate;

    private Integer zairyuSikaku;

    private String kojinNum;

    private String zairyuNum;

    private Integer syozokuKaisya;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date nyuusyaDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date taisyaDate;

    private Integer syokugyoKind;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date rainitiDate;

    private String bikou;

    private String yuubin;

    private String jyusyo1;

    private String jyusyo2;

    private String moyoriEki;

    private String tel;

    private String email;

    private String wechat;

    private String line;

    private String bokokuJyusyo;

    private String bokokuKinnkyuuRennraku;

    private Integer saisyuuGakureki;

    private String gakkouName;

    private String sennmomName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date sotugyoDate;

    private Float gyumuNensu;

    private String itOs;

    private String itGengo;

    private String itDb;

    private String itWebServer;

    private String itFw;

    private String itOther;

    private String itBikou;

    private Integer deleteFlag;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date tourokubi;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date kousinnbi;

    public Integer getSyainId() {
        return syainId;
    }

    public void setSyainId(Integer syainId) {
        this.syainId = syainId;
    }

    public String getFirstNameKanji() {
        return firstNameKanji;
    }

    public void setFirstNameKanji(String firstNameKanji) {
        this.firstNameKanji = firstNameKanji == null ? null : firstNameKanji.trim();
    }

    public String getLastNameKanji() {
        return lastNameKanji;
    }

    public void setLastNameKanji(String lastNameKanji) {
        this.lastNameKanji = lastNameKanji == null ? null : lastNameKanji.trim();
    }

    public String getFirstNameKana() {
        return firstNameKana;
    }

    public void setFirstNameKana(String firstNameKana) {
        this.firstNameKana = firstNameKana == null ? null : firstNameKana.trim();
    }

    public String getLastNameKana() {
        return lastNameKana;
    }

    public void setLastNameKana(String lastNameKana) {
        this.lastNameKana = lastNameKana == null ? null : lastNameKana.trim();
    }

    public String getFirstNameEigo() {
        return firstNameEigo;
    }

    public void setFirstNameEigo(String firstNameEigo) {
        this.firstNameEigo = firstNameEigo == null ? null : firstNameEigo.trim();
    }

    public String getLastNameEigo() {
        return lastNameEigo;
    }

    public void setLastNameEigo(String lastNameEigo) {
        this.lastNameEigo = lastNameEigo == null ? null : lastNameEigo.trim();
    }

    public Integer getSeibetu() {
        return seibetu;
    }

    public void setSeibetu(Integer seibetu) {
        this.seibetu = seibetu;
    }

    public Date getTanjyobi() {
        return tanjyobi;
    }

    public void setTanjyobi(Date tanjyobi) {
        this.tanjyobi = tanjyobi;
    }

    public Integer getKokuseki() {
        return kokuseki;
    }

    public void setKokuseki(Integer kokuseki) {
        this.kokuseki = kokuseki;
    }

    public String getSyussinn() {
        return syussinn;
    }

    public void setSyussinn(String syussinn) {
        this.syussinn = syussinn == null ? null : syussinn.trim();
    }

    public Integer getHaigusya() {
        return haigusya;
    }

    public void setHaigusya(Integer haigusya) {
        this.haigusya = haigusya;
    }

    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum == null ? null : passportNum.trim();
    }

    public Date getPassportEndDate() {
        return passportEndDate;
    }

    public void setPassportEndDate(Date passportEndDate) {
        this.passportEndDate = passportEndDate;
    }

    public Integer getVisaKikan() {
        return visaKikan;
    }

    public void setVisaKikan(Integer visaKikan) {
        this.visaKikan = visaKikan;
    }

    public Date getVisaEndDate() {
        return visaEndDate;
    }

    public void setVisaEndDate(Date visaEndDate) {
        this.visaEndDate = visaEndDate;
    }

    public Integer getZairyuSikaku() {
        return zairyuSikaku;
    }

    public void setZairyuSikaku(Integer zairyuSikaku) {
        this.zairyuSikaku = zairyuSikaku;
    }

    public String getKojinNum() {
        return kojinNum;
    }

    public void setKojinNum(String kojinNum) {
        this.kojinNum = kojinNum == null ? null : kojinNum.trim();
    }

    public String getZairyuNum() {
        return zairyuNum;
    }

    public void setZairyuNum(String zairyuNum) {
        this.zairyuNum = zairyuNum == null ? null : zairyuNum.trim();
    }

    public Integer getSyozokuKaisya() {
        return syozokuKaisya;
    }

    public void setSyozokuKaisya(Integer syozokuKaisya) {
        this.syozokuKaisya = syozokuKaisya;
    }

    public Date getNyuusyaDate() {
        return nyuusyaDate;
    }

    public void setNyuusyaDate(Date nyuusyaDate) {
        this.nyuusyaDate = nyuusyaDate;
    }

    public Date getTaisyaDate() {
        return taisyaDate;
    }

    public void setTaisyaDate(Date taisyaDate) {
        this.taisyaDate = taisyaDate;
    }

    public Integer getSyokugyoKind() {
        return syokugyoKind;
    }

    public void setSyokugyoKind(Integer syokugyoKind) {
        this.syokugyoKind = syokugyoKind;
    }

    public Date getRainitiDate() {
        return rainitiDate;
    }

    public void setRainitiDate(Date rainitiDate) {
        this.rainitiDate = rainitiDate;
    }

    public String getBikou() {
        return bikou;
    }

    public void setBikou(String bikou) {
        this.bikou = bikou == null ? null : bikou.trim();
    }

    public String getYuubin() {
        return yuubin;
    }

    public void setYuubin(String yuubin) {
        this.yuubin = yuubin == null ? null : yuubin.trim();
    }

    public String getJyusyo1() {
        return jyusyo1;
    }

    public void setJyusyo1(String jyusyo1) {
        this.jyusyo1 = jyusyo1 == null ? null : jyusyo1.trim();
    }

    public String getJyusyo2() {
        return jyusyo2;
    }

    public void setJyusyo2(String jyusyo2) {
        this.jyusyo2 = jyusyo2 == null ? null : jyusyo2.trim();
    }

    public String getMoyoriEki() {
        return moyoriEki;
    }

    public void setMoyoriEki(String moyoriEki) {
        this.moyoriEki = moyoriEki == null ? null : moyoriEki.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line == null ? null : line.trim();
    }

    public String getBokokuJyusyo() {
        return bokokuJyusyo;
    }

    public void setBokokuJyusyo(String bokokuJyusyo) {
        this.bokokuJyusyo = bokokuJyusyo == null ? null : bokokuJyusyo.trim();
    }

    public String getBokokuKinnkyuuRennraku() {
        return bokokuKinnkyuuRennraku;
    }

    public void setBokokuKinnkyuuRennraku(String bokokuKinnkyuuRennraku) {
        this.bokokuKinnkyuuRennraku = bokokuKinnkyuuRennraku == null ? null : bokokuKinnkyuuRennraku.trim();
    }

    public Integer getSaisyuuGakureki() {
        return saisyuuGakureki;
    }

    public void setSaisyuuGakureki(Integer saisyuuGakureki) {
        this.saisyuuGakureki = saisyuuGakureki;
    }

    public String getGakkouName() {
        return gakkouName;
    }

    public void setGakkouName(String gakkouName) {
        this.gakkouName = gakkouName == null ? null : gakkouName.trim();
    }

    public String getSennmomName() {
        return sennmomName;
    }

    public void setSennmomName(String sennmomName) {
        this.sennmomName = sennmomName == null ? null : sennmomName.trim();
    }

    public Date getSotugyoDate() {
        return sotugyoDate;
    }

    public void setSotugyoDate(Date sotugyoDate) {
        this.sotugyoDate = sotugyoDate;
    }

    public Float getGyumuNensu() {
        return gyumuNensu;
    }

    public void setGyumuNensu(Float gyumuNensu) {
        this.gyumuNensu = gyumuNensu;
    }

    public String getItOs() {
        return itOs;
    }

    public void setItOs(String itOs) {
        this.itOs = itOs == null ? null : itOs.trim();
    }

    public String getItGengo() {
        return itGengo;
    }

    public void setItGengo(String itGengo) {
        this.itGengo = itGengo == null ? null : itGengo.trim();
    }

    public String getItDb() {
        return itDb;
    }

    public void setItDb(String itDb) {
        this.itDb = itDb == null ? null : itDb.trim();
    }

    public String getItWebServer() {
        return itWebServer;
    }

    public void setItWebServer(String itWebServer) {
        this.itWebServer = itWebServer == null ? null : itWebServer.trim();
    }

    public String getItFw() {
        return itFw;
    }

    public void setItFw(String itFw) {
        this.itFw = itFw == null ? null : itFw.trim();
    }

    public String getItOther() {
        return itOther;
    }

    public void setItOther(String itOther) {
        this.itOther = itOther == null ? null : itOther.trim();
    }

    public String getItBikou() {
        return itBikou;
    }

    public void setItBikou(String itBikou) {
        this.itBikou = itBikou == null ? null : itBikou.trim();
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
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

    @Override
    public String toString() {
        return "SyainMain{" +
                "syainId=" + syainId +
                ", firstNameKanji='" + firstNameKanji + '\'' +
                ", lastNameKanji='" + lastNameKanji + '\'' +
                ", firstNameKana='" + firstNameKana + '\'' +
                ", lastNameKana='" + lastNameKana + '\'' +
                ", firstNameEigo='" + firstNameEigo + '\'' +
                ", lastNameEigo='" + lastNameEigo + '\'' +
                ", seibetu=" + seibetu +
                ", tanjyobi=" + tanjyobi +
                ", kokuseki=" + kokuseki +
                ", syussinn='" + syussinn + '\'' +
                ", haigusya=" + haigusya +
                ", passportNum='" + passportNum + '\'' +
                ", passportEndDate=" + passportEndDate +
                ", visaKikan=" + visaKikan +
                ", visaEndDate=" + visaEndDate +
                ", zairyuSikaku=" + zairyuSikaku +
                ", kojinNum='" + kojinNum + '\'' +
                ", zairyuNum='" + zairyuNum + '\'' +
                ", syozokuKaisya=" + syozokuKaisya +
                ", nyuusyaDate=" + nyuusyaDate +
                ", taisyaDate=" + taisyaDate +
                ", syokugyoKind=" + syokugyoKind +
                ", rainitiDate=" + rainitiDate +
                ", bikou='" + bikou + '\'' +
                ", yuubin='" + yuubin + '\'' +
                ", jyusyo1='" + jyusyo1 + '\'' +
                ", jyusyo2='" + jyusyo2 + '\'' +
                ", moyoriEki='" + moyoriEki + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", wechat='" + wechat + '\'' +
                ", line='" + line + '\'' +
                ", bokokuJyusyo='" + bokokuJyusyo + '\'' +
                ", bokokuKinnkyuuRennraku='" + bokokuKinnkyuuRennraku + '\'' +
                ", saisyuuGakureki=" + saisyuuGakureki +
                ", gakkouName='" + gakkouName + '\'' +
                ", sennmomName='" + sennmomName + '\'' +
                ", sotugyoDate=" + sotugyoDate +
                ", gyumuNensu=" + gyumuNensu +
                ", itOs='" + itOs + '\'' +
                ", itGengo='" + itGengo + '\'' +
                ", itDb='" + itDb + '\'' +
                ", itWebServer='" + itWebServer + '\'' +
                ", itFw='" + itFw + '\'' +
                ", itOther='" + itOther + '\'' +
                ", itBikou='" + itBikou + '\'' +
                ", deleteFlag=" + deleteFlag +
                ", tourokubi=" + tourokubi +
                ", kousinnbi=" + kousinnbi +
                '}';
    }
}