package com.p051p1.mobile.putong.account.p055ui.accountai;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import p153l.mgf0;
import p153l.ref0;
import p153l.x5m;

/* JADX INFO: loaded from: classes9.dex */
public class SignUpAiV2Act extends SignInBaseActMVP<ref0, mgf0> implements x5m {
    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public ref0 generateSignInPresenter() {
        return new ref0(this);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public mgf0 generateSignInViewModel() {
        return new mgf0(this);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((mgf0) this.signInViewModel).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        ((ref0) this.signInPresenter).mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_ai_signup";
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.act.setSwipeBackEnable(false);
        if (NullChecker.m82486a(this.act.getSupportActionBar())) {
            this.act.getSupportActionBar().mo102186m();
        }
        setTransparentStatusBar();
        ((ref0) this.signInPresenter).m181017h1(AccountModule.f16756c.m29324c1());
        super.preCreateView(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().setStatusBarColor(0);
        setStatusBarColor(0);
        if (NullChecker.m82486a(getSupportActionBar())) {
            getSupportActionBar().mo102168A(0.0f);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
