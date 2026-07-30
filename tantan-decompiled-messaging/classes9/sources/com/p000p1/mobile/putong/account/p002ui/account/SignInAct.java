package com.p000p1.mobile.putong.account.p002ui.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import l.ag3;
import l.vwb;
import p006l.c5f0;
import p006l.o4f0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SignInAct extends SignInBaseActMVP<o4f0, c5f0> {
    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public o4f0 generateSignInPresenter() {
        return new o4f0(this);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public c5f0 generateSignInViewModel() {
        return new c5f0(this);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((c5f0) this.signInViewModel).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        ((o4f0) this.signInPresenter).mo12401a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        ((o4f0) this.signInPresenter).f8701a = getIntent().getIntExtra(SignInBaseActMVP.AFTER_SIGNIN, 0);
        super.preCreateView(bundle);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return vwb.f0(new Object[]{"after sign in", Integer.valueOf(((o4f0) this.signInPresenter).f8701a), ag3.b});
    }
}
