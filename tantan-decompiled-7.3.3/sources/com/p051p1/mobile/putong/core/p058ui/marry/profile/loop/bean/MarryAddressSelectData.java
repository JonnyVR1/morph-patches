package com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean;

import java.io.Serializable;
import java.util.List;
import p153l.jyb;

/* JADX INFO: loaded from: classes3.dex */
public class MarryAddressSelectData implements Serializable {
    public String city;
    public String country;
    private boolean isSelected = false;
    private int level;
    List<MarryAddressSelectData> nextList;
    public String province;
    private boolean showArrow;
    private String showText;
    private MarryAddressDataSelectType type;

    public enum MarryAddressDataSelectType {
        SELECT_INFO("选择的数据"),
        SELECT_OVERSEAS("海外地区"),
        OLD_DATA("存在的数据");

        String des;

        MarryAddressDataSelectType(String str) {
            this.des = str;
        }
    }

    public MarryAddressSelectData(String str, MarryAddressDataSelectType marryAddressDataSelectType) {
        MarryAddressDataSelectType marryAddressDataSelectType2 = MarryAddressDataSelectType.SELECT_INFO;
        this.country = "";
        this.province = "";
        this.city = "";
        this.level = 0;
        this.showArrow = false;
        this.type = marryAddressDataSelectType;
        this.showText = str;
    }

    public List<MarryAddressSelectData> getNextList() {
        return this.nextList;
    }

    public String getShowText() {
        return this.showText;
    }

    public MarryAddressDataSelectType getType() {
        return this.type;
    }

    public boolean hasNextData() {
        return !jyb.m147479J(this.nextList);
    }

    public boolean isOldData() {
        return this.type == MarryAddressDataSelectType.OLD_DATA;
    }

    public boolean isOverseasData() {
        return this.type == MarryAddressDataSelectType.SELECT_OVERSEAS;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setData(String str, String str2, String str3) {
        this.country = str;
        this.city = str3;
        this.province = str2;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setNextList(List<MarryAddressSelectData> list) {
        this.nextList = list;
    }

    public MarryAddressSelectData setSelected(boolean z) {
        this.isSelected = z;
        return this;
    }

    public MarryAddressSelectData setShowArrow() {
        this.showArrow = true;
        return this;
    }

    public void setShowText(String str) {
        this.showText = str;
    }

    public boolean showArrow() {
        return this.showArrow;
    }

    public MarryAddressSelectData(String str, MarryAddressDataSelectType marryAddressDataSelectType, String str2, String str3, String str4) {
        MarryAddressDataSelectType marryAddressDataSelectType2 = MarryAddressDataSelectType.SELECT_INFO;
        this.level = 0;
        this.showArrow = false;
        this.type = marryAddressDataSelectType;
        this.showText = str;
        this.country = str2;
        this.city = str4;
        this.province = str3;
    }
}
