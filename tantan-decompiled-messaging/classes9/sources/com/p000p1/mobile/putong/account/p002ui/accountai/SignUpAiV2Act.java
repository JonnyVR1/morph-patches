package com.p000p1.mobile.putong.account.p002ui.accountai;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import p006l.f8f0;
import p006l.g3m;
import p006l.k6f0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SignUpAiV2Act extends SignInBaseActMVP<k6f0, f8f0> implements g3m {
    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public k6f0 generateSignInPresenter() {
        return new k6f0(this);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public f8f0 generateSignInViewModel() {
        return new f8f0(this);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((f8f0) this.signInViewModel).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        ((k6f0) this.signInPresenter).mo12401a0();
    }

    public void onBackPressed() {
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_ai_signup";
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        ((Act) this).act.setSwipeBackEnable(false);
        if (NullChecker.a(((Act) this).act.getSupportActionBar())) {
            ((Act) this).act.getSupportActionBar().m();
        }
        setTransparentStatusBar();
        ((k6f0) this.signInPresenter).m17972h1(AccountModule.f26c.m220c1());
        super.preCreateView(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(0);
        setStatusBarColor(0);
        if (NullChecker.a(getSupportActionBar())) {
            getSupportActionBar().A(0.0f);
        }
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
