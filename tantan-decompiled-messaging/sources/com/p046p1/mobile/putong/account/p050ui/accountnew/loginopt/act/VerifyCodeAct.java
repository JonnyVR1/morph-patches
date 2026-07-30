package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP;
import org.slf4j.Marker;
import p149l.azk0;
import p149l.njm;
import p149l.qzk0;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
public class VerifyCodeAct extends SignInBaseActMVP<azk0, qzk0> {

    /* JADX INFO: renamed from: c */
    public qzk0 f16610c;

    /* JADX INFO: renamed from: d */
    public azk0 f16611d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m28685Y1(Act act, int i, String str, @IntRange(from = 1, to = 2) int i2) {
        Intent intent = new Intent(act, (Class<?>) VerifyCodeAct.class);
        intent.putExtra("ccode", i);
        intent.putExtra("phone", str);
        intent.putExtra("verify_type", i2);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public azk0 generateSignInPresenter() {
        azk0 azk0Var = new azk0(this);
        this.f16611d = azk0Var;
        return azk0Var;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public qzk0 generateSignInViewModel() {
        qzk0 qzk0Var = new qzk0(this);
        this.f16610c = qzk0Var;
        return qzk0Var;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f16610c.m177262H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16610c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16611d.mo39470a0();
        this.pageHelper.m109041q(pageId());
        this.pageHelper.m109040p(vwb.m200311Y("phone_number", Marker.ANY_NON_NULL_MARKER + this.f16611d.f72361f + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f16611d.f72362g), vwb.m200311Y("login_scene", "android_phone"));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f16610c.m177262H()) {
            return;
        }
        hideInput();
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_login_verification_code";
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        njm.m159745a(this);
        super.preCreateView(bundle);
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
