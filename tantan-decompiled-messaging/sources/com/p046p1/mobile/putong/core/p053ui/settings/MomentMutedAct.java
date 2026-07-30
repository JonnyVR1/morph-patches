package com.p046p1.mobile.putong.core.p053ui.settings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.rh00;
import p149l.th00;

/* JADX INFO: loaded from: classes9.dex */
public class MomentMutedAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public rh00 f35822c;

    /* JADX INFO: renamed from: d */
    public th00 f35823d;

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f35823d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f35822c = new rh00(this);
        th00 th00Var = new th00(this);
        this.f35823d = th00Var;
        this.f35822c.mo51532C(th00Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f35822c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_blocked_users_view";
    }
}
