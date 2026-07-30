package com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP;
import com.p1.mobile.android.app.Act;
import l.j760;
import l.vwb;
import p006l.azk0;
import p006l.njm;
import p006l.qzk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VerifyCodeAct extends SignInBaseActMVP<azk0, qzk0> {

    /* JADX INFO: renamed from: c */
    public qzk0 f599c;

    /* JADX INFO: renamed from: d */
    public azk0 f600d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m584Y1(Act act, int i, String str, @IntRange(from = 1, to = 2) int i2) {
        Intent intent = new Intent((Context) act, (Class<?>) VerifyCodeAct.class);
        intent.putExtra("ccode", i);
        intent.putExtra("phone", str);
        intent.putExtra("verify_type", i2);
        return intent;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public azk0 generateSignInPresenter() {
        azk0 azk0Var = new azk0(this);
        this.f600d = azk0Var;
        return azk0Var;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public qzk0 generateSignInViewModel() {
        qzk0 qzk0Var = new qzk0(this);
        this.f599c = qzk0Var;
        return qzk0Var;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f599c.m22551H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f599c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f600d.mo12401a0();
        this.pageHelper.q(pageId());
        this.pageHelper.p(new j760[]{vwb.Y("phone_number", "+" + this.f600d.f8629f + " " + this.f600d.f8630g), vwb.Y("login_scene", "android_phone")});
    }

    public void onBackPressed() {
        if (this.f599c.m22551H()) {
            return;
        }
        hideInput();
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_login_verification_code";
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        njm.m20153a(this);
        super.preCreateView(bundle);
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
