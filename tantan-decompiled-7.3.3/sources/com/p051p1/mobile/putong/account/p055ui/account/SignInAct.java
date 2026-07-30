package com.p051p1.mobile.putong.account.p055ui.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import p153l.jdf0;
import p153l.jyb;
import p153l.og3;
import p153l.vcf0;

/* JADX INFO: loaded from: classes9.dex */
public class SignInAct extends SignInBaseActMVP<vcf0, jdf0> {
    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public vcf0 generateSignInPresenter() {
        return new vcf0(this);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public jdf0 generateSignInViewModel() {
        return new jdf0(this);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((jdf0) this.signInViewModel).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        ((vcf0) this.signInPresenter).mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        ((vcf0) this.signInPresenter).f114209a = getIntent().getIntExtra(SignInBaseActMVP.AFTER_SIGNIN, 0);
        super.preCreateView(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        return jyb.m147507f0("after sign in", Integer.valueOf(((vcf0) this.signInPresenter).f114209a), og3.f147187b);
    }
}
