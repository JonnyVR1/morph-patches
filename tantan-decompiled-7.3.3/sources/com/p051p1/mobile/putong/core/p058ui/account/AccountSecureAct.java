package com.p051p1.mobile.putong.core.p058ui.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.C20416tx;
import p153l.C21908zw;

/* JADX INFO: loaded from: classes9.dex */
public class AccountSecureAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public C20416tx f29057c;

    /* JADX INFO: renamed from: d */
    public C21908zw f29058d;

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f29057c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f29057c = new C20416tx(this);
        C21908zw c21908zw = new C21908zw(this);
        this.f29058d = c21908zw;
        c21908zw.mo52715C(this.f29057c);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f29058d.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_account_and_security_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
