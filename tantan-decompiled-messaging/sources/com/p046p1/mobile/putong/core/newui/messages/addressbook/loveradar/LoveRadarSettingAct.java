package com.p046p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.aew;
import p149l.zdw;

/* JADX INFO: loaded from: classes11.dex */
public class LoveRadarSettingAct extends PutongCoreMvpAct<zdw, aew> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m41910Z1(Context context) {
        return new Intent(context, (Class<?>) LoveRadarSettingAct.class);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public zdw mo29951X1() {
        return new zdw(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public aew mo29952Y1() {
        return new aew(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_love_radar";
    }
}
