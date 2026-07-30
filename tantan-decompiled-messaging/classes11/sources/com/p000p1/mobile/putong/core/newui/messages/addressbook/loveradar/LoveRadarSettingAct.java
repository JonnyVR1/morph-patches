package com.p000p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import p009l.aew;
import p009l.zdw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LoveRadarSettingAct extends PutongCoreMvpAct<zdw, aew> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m6050Z1(Context context) {
        return new Intent(context, (Class<?>) LoveRadarSettingAct.class);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public zdw m6051X1() {
        return new zdw(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public aew m6052Y1() {
        return new aew(this);
    }

    public String pageId() {
        return "p_love_radar";
    }
}
