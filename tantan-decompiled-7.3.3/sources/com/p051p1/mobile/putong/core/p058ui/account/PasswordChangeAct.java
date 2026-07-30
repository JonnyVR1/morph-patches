package com.p051p1.mobile.putong.core.p058ui.account;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.crl;
import p153l.eh60;
import p153l.nh60;

/* JADX INFO: loaded from: classes9.dex */
public class PasswordChangeAct extends PutongAct implements crl {

    /* JADX INFO: renamed from: c */
    public eh60 f29101c;

    /* JADX INFO: renamed from: d */
    public nh60 f29102d;

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f29102d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f29101c = new eh60(this);
        nh60 nh60Var = new nh60(this);
        this.f29102d = nh60Var;
        this.f29101c.mo52715C(nh60Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f29101c.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_edit_password_view";
    }
}
