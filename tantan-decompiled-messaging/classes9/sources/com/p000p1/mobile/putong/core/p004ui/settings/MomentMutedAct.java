package com.p000p1.mobile.putong.core.p004ui.settings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import p006l.rh00;
import p006l.th00;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class MomentMutedAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public rh00 f5603c;

    /* JADX INFO: renamed from: d */
    public th00 f5604d;

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f5604d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f5603c = new rh00(this);
        th00 th00Var = new th00(this);
        this.f5604d = th00Var;
        this.f5603c.C(th00Var);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f5603c.m22846a0();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_blocked_users_view";
    }
}
