package com.p046p1.mobile.putong.core.newui.messages.teamgroup;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import p149l.dgi0;
import p149l.igi0;

/* JADX INFO: loaded from: classes11.dex */
public class TeamGroupAct extends PutongCoreMvpAct<dgi0, igi0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m42559Z1(Context context) {
        return new Intent(context, (Class<?>) TeamGroupAct.class);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public dgi0 mo29951X1() {
        return new dgi0(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public igi0 mo29952Y1() {
        return new igi0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_subscription_content";
    }
}
