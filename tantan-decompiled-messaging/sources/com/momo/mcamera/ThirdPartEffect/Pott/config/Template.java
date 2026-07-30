package com.momo.mcamera.ThirdPartEffect.Pott.config;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class Template {
    public String baseFolder;

    @SerializedName("fadeoutStartFrmNo")
    int fadeoutStartFrmNo;

    @SerializedName("folder")
    String subFolder;

    @SerializedName("totalNum")
    int totalNum;

    @SerializedName("type")
    String type;

    public int getFadeoutStartFrmNo() {
        return this.fadeoutStartFrmNo;
    }

    public String getSubFolder() {
        return this.subFolder;
    }

    public int getTotalNum() {
        return this.totalNum;
    }

    public String getType() {
        return this.type;
    }

    public void setFadeoutStartFrmNo(int i) {
        this.fadeoutStartFrmNo = i;
    }

    public void setSubFolder(String str) {
        this.subFolder = str;
    }

    public void setTotalNum(int i) {
        this.totalNum = i;
    }

    public void setType(String str) {
        this.type = str;
    }
}
