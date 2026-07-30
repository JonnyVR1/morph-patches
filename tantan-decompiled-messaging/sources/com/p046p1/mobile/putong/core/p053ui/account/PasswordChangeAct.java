package com.p046p1.mobile.putong.core.p053ui.account;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.i960;
import p149l.rol;
import p149l.z860;

/* JADX INFO: loaded from: classes8.dex */
public class PasswordChangeAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public z860 f28253c;

    /* JADX INFO: renamed from: d */
    public i960 f28254d;

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f28254d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f28253c = new z860(this);
        i960 i960Var = new i960(this);
        this.f28254d = i960Var;
        this.f28253c.mo51532C(i960Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f28253c.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_edit_password_view";
    }
}
