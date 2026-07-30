package com.p051p1.mobile.putong.core.newui.messages.teamgroup;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import p153l.dpi0;
import p153l.ipi0;

/* JADX INFO: loaded from: classes11.dex */
public class TeamGroupAct extends PutongCoreMvpAct<dpi0, ipi0> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m43570a2(Context context) {
        return new Intent(context, (Class<?>) TeamGroupAct.class);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public dpi0 mo30949Y1() {
        return new dpi0(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public ipi0 mo30950Z1() {
        return new ipi0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_subscription_content";
    }
}
