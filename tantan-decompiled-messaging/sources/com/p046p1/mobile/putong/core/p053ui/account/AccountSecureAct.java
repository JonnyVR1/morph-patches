package com.p046p1.mobile.putong.core.p053ui.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.C16954fx;
import p149l.C21800zx;

/* JADX INFO: loaded from: classes8.dex */
public class AccountSecureAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public C21800zx f28209c;

    /* JADX INFO: renamed from: d */
    public C16954fx f28210d;

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f28209c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f28209c = new C21800zx(this);
        C16954fx c16954fx = new C16954fx(this);
        this.f28210d = c16954fx;
        c16954fx.mo51532C(this.f28209c);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f28210d.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_account_and_security_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
