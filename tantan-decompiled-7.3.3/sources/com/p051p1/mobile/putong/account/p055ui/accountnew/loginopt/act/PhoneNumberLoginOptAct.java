package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP;
import p153l.c170;
import p153l.e070;
import p153l.plm;

/* JADX INFO: loaded from: classes9.dex */
public class PhoneNumberLoginOptAct extends SignInBaseActMVP<e070, c170> {

    /* JADX INFO: renamed from: c */
    public c170 f17322c;

    /* JADX INFO: renamed from: d */
    public e070 f17323d;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m29678Z1(Act act) {
        return new Intent(act, (Class<?>) PhoneNumberLoginOptAct.class);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public e070 generateSignInPresenter() {
        e070 e070Var = new e070(this);
        this.f17323d = e070Var;
        return e070Var;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public c170 generateSignInViewModel() {
        c170 c170Var = new c170(this);
        this.f17322c = c170Var;
        return c170Var;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f17322c.m107590Z()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17322c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17323d.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f17322c.m107590Z()) {
            return;
        }
        hideInput();
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_phone_number_signin_or_signup";
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        plm.m172838a(this);
        super.preCreateView(bundle);
        this.pageHelper.m152782q(pageId());
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
