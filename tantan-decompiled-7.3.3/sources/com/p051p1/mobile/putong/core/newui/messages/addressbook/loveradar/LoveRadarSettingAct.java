package com.p051p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.xfw;
import p153l.yfw;

/* JADX INFO: loaded from: classes11.dex */
public class LoveRadarSettingAct extends PutongCoreMvpAct<xfw, yfw> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m42921a2(Context context) {
        return new Intent(context, (Class<?>) LoveRadarSettingAct.class);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public xfw mo30949Y1() {
        return new xfw(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public yfw mo30950Z1() {
        return new yfw(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_love_radar";
    }
}
