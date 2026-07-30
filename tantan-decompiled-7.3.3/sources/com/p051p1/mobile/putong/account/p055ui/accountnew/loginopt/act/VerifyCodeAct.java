package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP;
import org.slf4j.Marker;
import p153l.g8l0;
import p153l.jyb;
import p153l.plm;
import p153l.w8l0;

/* JADX INFO: loaded from: classes9.dex */
public class VerifyCodeAct extends SignInBaseActMVP<g8l0, w8l0> {

    /* JADX INFO: renamed from: c */
    public w8l0 f17329c;

    /* JADX INFO: renamed from: d */
    public g8l0 f17330d;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m29684Z1(Act act, int i, String str, @IntRange(from = 1, to = 2) int i2) {
        Intent intent = new Intent(act, (Class<?>) VerifyCodeAct.class);
        intent.putExtra("ccode", i);
        intent.putExtra("phone", str);
        intent.putExtra("verify_type", i2);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public g8l0 generateSignInPresenter() {
        g8l0 g8l0Var = new g8l0(this);
        this.f17330d = g8l0Var;
        return g8l0Var;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public w8l0 generateSignInViewModel() {
        w8l0 w8l0Var = new w8l0(this);
        this.f17329c = w8l0Var;
        return w8l0Var;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f17329c.m205449H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17329c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17330d.mo40473a0();
        this.pageHelper.m152782q(pageId());
        this.pageHelper.m152781p(jyb.m147494Y("phone_number", Marker.ANY_NON_NULL_MARKER + this.f17330d.f102695f + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f17330d.f102696g), jyb.m147494Y("login_scene", "android_phone"));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f17329c.m205449H()) {
            return;
        }
        hideInput();
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_login_verification_code";
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        plm.m172838a(this);
        super.preCreateView(bundle);
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
