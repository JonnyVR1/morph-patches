package com.tantanapp.media.ttmediaeffect.bean;

import com.momo.mcamera.mask.AdditionalInfo;
import com.momo.mcamera.mask.TriggerTip;

/* JADX INFO: loaded from: classes12.dex */
public class TipInfo {
    private AdditionalInfo.TipInfo realTipInfo;

    public TipInfo(AdditionalInfo.TipInfo tipInfo) {
        if (tipInfo != null) {
            this.realTipInfo = tipInfo;
        } else {
            this.realTipInfo = new AdditionalInfo.TipInfo();
        }
    }

    public String getContent() {
        return this.realTipInfo.getContent();
    }

    public AdditionalInfo.TipInfo getRealTipInfo() {
        return this.realTipInfo;
    }

    public TriggerTip getTriggerTip() {
        return this.realTipInfo.getTriggerTip();
    }

    public boolean isFaceTrack() {
        return this.realTipInfo.isFaceTrack();
    }

    public void setContent(String str) {
        this.realTipInfo.setContent(str);
    }

    public void setFaceTrack(boolean z) {
        this.realTipInfo.setFaceTrack(z);
    }

    public void setTriggerTip(TriggerTip triggerTip) {
        this.realTipInfo.setTriggerTip(triggerTip);
    }

    public TipInfo() {
        this.realTipInfo = new AdditionalInfo.TipInfo();
    }
}
