package com.tantanapp.media.ttmediaeffect.bean;

import com.momo.mcamera.mask.AdditionalInfo;

/* JADX INFO: loaded from: classes13.dex */
public class TTAdditionalInfo {
    private AdditionalInfo realAdditionalInfo;

    public TTAdditionalInfo(AdditionalInfo additionalInfo) {
        if (additionalInfo != null) {
            this.realAdditionalInfo = additionalInfo;
        } else {
            this.realAdditionalInfo = new AdditionalInfo();
        }
    }

    public TipInfo getBackTip() {
        return new TipInfo(this.realAdditionalInfo.getBackTip());
    }

    public int getFaceAlignmentVersion() {
        return this.realAdditionalInfo.getFaceAlignmentVersion();
    }

    public TipInfo getFrontTip() {
        return new TipInfo(this.realAdditionalInfo.getFrontTip());
    }

    public AdditionalInfo getRealAdditionalInfo() {
        return this.realAdditionalInfo;
    }

    public boolean isAnimojiDetectEnable() {
        return this.realAdditionalInfo.isAnimojiDetectEnable();
    }

    public boolean isBodyDetectEnable() {
        return this.realAdditionalInfo.isBodyDetectEnable();
    }

    public boolean isBodySegmentDetectEnable() {
        return this.realAdditionalInfo.isBodySegmentDetectEnable();
    }

    public boolean isComic() {
        return this.realAdditionalInfo.isComic();
    }

    public boolean isExpressionDetectEnable() {
        return this.realAdditionalInfo.isExpressionDetectEnable();
    }

    public boolean isMultiFaceSwitchEnable() {
        return this.realAdditionalInfo.isMultiFaceSwitchEnable();
    }

    public boolean isObjectDetectEnable() {
        return this.realAdditionalInfo.isObjectDetectEnable();
    }

    public void setAnimojiDetectEnable(boolean z) {
        this.realAdditionalInfo.setAnimojiDetectEnable(z);
    }

    public void setBackTip(TipInfo tipInfo) {
        if (tipInfo != null) {
            this.realAdditionalInfo.setBackTip(tipInfo.getRealTipInfo());
        }
    }

    public void setBodyDetectEnable(boolean z) {
        this.realAdditionalInfo.setBodyDetectEnable(z);
    }

    public void setBodySegmentDetectEnable(boolean z) {
        this.realAdditionalInfo.setBodySegmentDetectEnable(z);
    }

    public void setComic(boolean z) {
        this.realAdditionalInfo.setComic(z);
    }

    public void setExpressionDetectEnable(boolean z) {
        this.realAdditionalInfo.setExpressionDetectEnable(z);
    }

    public void setFaceAlignmentVersion(int i) {
        this.realAdditionalInfo.setFaceAlignmentVersion(i);
    }

    public void setFrontTip(TipInfo tipInfo) {
        if (tipInfo != null) {
            this.realAdditionalInfo.setFrontTip(tipInfo.getRealTipInfo());
        }
    }

    public void setMultiFaceSwitchEnable(boolean z) {
        this.realAdditionalInfo.setMultiFaceSwitchEnable(z);
    }

    public void setObjectDetectEnable(boolean z) {
        this.realAdditionalInfo.setObjectDetectEnable(z);
    }

    public TTAdditionalInfo() {
        this.realAdditionalInfo = new AdditionalInfo();
    }
}
