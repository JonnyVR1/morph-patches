package com.momo.xeengine.p049cv.bean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Deprecated
public class XEMutableInfo {
    private String business;
    private CVSegmentInfo maskInfo1;
    private CVSegmentInfo maskInfo2;
    private List<XEMutableData> mutableDatas;

    public XEMutableInfo(String str) {
        this.business = str;
    }

    public String getBusiness() {
        return this.business;
    }

    public CVSegmentInfo getMaskInfo1() {
        return this.maskInfo1;
    }

    public CVSegmentInfo getMaskInfo2() {
        return this.maskInfo2;
    }

    public List<XEMutableData> getMutableDatas() {
        return this.mutableDatas;
    }

    public void setBusiness(String str) {
        this.business = str;
    }

    public void setMaskInfo1(CVSegmentInfo cVSegmentInfo) {
        this.maskInfo1 = cVSegmentInfo;
    }

    public void setMaskInfo2(CVSegmentInfo cVSegmentInfo) {
        this.maskInfo2 = cVSegmentInfo;
    }

    public void setMutableDatas(List<XEMutableData> list) {
        this.mutableDatas = list;
    }
}
