package com.tencent.could.huiyansdk.entity;

/* JADX INFO: loaded from: classes12.dex */
public class TuringResultCacheEntity {
    public String turingResultDate = "";
    public String turingEnvErrorStr = "";
    public boolean isNeedFrameCheck = false;
    public String turingFrameResult = "";
    public String frameParam = "";
    public String extraInfo = "";

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public String getFrameParam() {
        return this.frameParam;
    }

    public String getTuringEnvErrorStr() {
        return this.turingEnvErrorStr;
    }

    public String getTuringFrameResult() {
        return this.turingFrameResult;
    }

    public String getTuringResultDate() {
        return this.turingResultDate;
    }

    public boolean isNeedFrameCheck() {
        return this.isNeedFrameCheck;
    }

    public void reset() {
        this.turingResultDate = "";
        this.isNeedFrameCheck = false;
        this.turingFrameResult = "";
        this.frameParam = "";
        this.extraInfo = "";
        this.turingEnvErrorStr = "";
    }

    public void setExtraInfo(String str) {
        this.extraInfo = str;
    }

    public void setFrameParam(String str) {
        this.frameParam = str;
    }

    public void setNeedFrameCheck(boolean z) {
        this.isNeedFrameCheck = z;
    }

    public void setTuringEnvErrorStr(String str) {
        this.turingEnvErrorStr = str;
    }

    public void setTuringFrameResult(String str) {
        this.turingFrameResult = str;
    }

    public void setTuringResultDate(String str) {
        this.turingResultDate = str;
    }
}
