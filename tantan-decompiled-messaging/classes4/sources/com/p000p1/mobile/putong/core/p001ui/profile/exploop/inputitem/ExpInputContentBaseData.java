package com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem;

import java.io.Serializable;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpInputContentBaseData implements Serializable {
    public ExpProfileLoopCustomHomeTownTypeData getCustomHomeTownType() {
        return this instanceof ExpProfileLoopCustomHomeTownTypeData ? (ExpProfileLoopCustomHomeTownTypeData) this : new ExpProfileLoopCustomHomeTownTypeData();
    }

    public ExpProfileLoopUploadImageTypeData getImageType() {
        return this instanceof ExpProfileLoopUploadImageTypeData ? (ExpProfileLoopUploadImageTypeData) this : new ExpProfileLoopUploadImageTypeData();
    }

    public ExpProfileLoopSelectTypeData getSelectType() {
        return this instanceof ExpProfileLoopSelectTypeData ? (ExpProfileLoopSelectTypeData) this : new ExpProfileLoopSelectTypeData(vwb.f0(new ExpProfileLoopSelectTypeData.ItemData[0]));
    }

    public ExpProfileLoopTextTypeData getTextType() {
        return this instanceof ExpProfileLoopTextTypeData ? (ExpProfileLoopTextTypeData) this : new ExpProfileLoopTextTypeData("", "");
    }

    public ExpProfileLoopWheelTypeData getWheelType() {
        return this instanceof ExpProfileLoopWheelTypeData ? (ExpProfileLoopWheelTypeData) this : new ExpProfileLoopWheelTypeData();
    }
}
