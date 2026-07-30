package com.p046p1.mobile.putong.account.p050ui.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import p149l.ag3;
import p149l.c5f0;
import p149l.o4f0;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
public class SignInAct extends SignInBaseActMVP<o4f0, c5f0> {
    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public o4f0 generateSignInPresenter() {
        return new o4f0(this);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public c5f0 generateSignInViewModel() {
        return new c5f0(this);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((c5f0) this.signInViewModel).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        ((o4f0) this.signInPresenter).mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        ((o4f0) this.signInPresenter).f73209a = getIntent().getIntExtra(SignInBaseActMVP.AFTER_SIGNIN, 0);
        super.preCreateView(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return vwb.m200324f0("after sign in", Integer.valueOf(((o4f0) this.signInPresenter).f73209a), ag3.f69253b);
    }
}
