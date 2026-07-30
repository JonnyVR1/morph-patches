package com.p046p1.mobile.putong.account.p050ui.accountai;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import p149l.C19496qh;
import p149l.g3m;
import p149l.saf0;
import p149l.z5f0;

/* JADX INFO: loaded from: classes9.dex */
public class SignUpAiAct extends SignInBaseActMVP<z5f0, saf0> implements g3m {

    /* JADX INFO: renamed from: c */
    public static C19496qh f16355c = new C19496qh();

    /* JADX INFO: renamed from: Y1 */
    public static Intent m28395Y1(Context context) {
        return new Intent(context, (Class<?>) SignUpAiAct.class);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public z5f0 generateSignInPresenter() {
        return new z5f0(this);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public saf0 generateSignInViewModel() {
        return new saf0(this);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((saf0) this.signInViewModel).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        ((z5f0) this.signInPresenter).mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_ai_signup";
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        this.act.setSwipeBackEnable(false);
        if (NullChecker.m81303a(this.act.getSupportActionBar())) {
            this.act.getSupportActionBar().mo134126m();
        }
        setTransparentStatusBar();
        ((z5f0) this.signInPresenter).m217322i1(AccountModule.f16037c.m28325c1());
        super.preCreateView(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        setLightStatusBar(1024);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().setStatusBarColor(0);
        setStatusBarColor(0);
        if (NullChecker.m81303a(getSupportActionBar())) {
            getSupportActionBar().mo134111A(0.0f);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
