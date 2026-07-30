package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP;
import p149l.njm;
import p149l.ws60;
import p149l.yr60;

/* JADX INFO: loaded from: classes9.dex */
public class PhoneNumberLoginOptAct extends SignInBaseActMVP<yr60, ws60> {

    /* JADX INFO: renamed from: c */
    public ws60 f16603c;

    /* JADX INFO: renamed from: d */
    public yr60 f16604d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m28679Y1(Act act) {
        return new Intent(act, (Class<?>) PhoneNumberLoginOptAct.class);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public yr60 generateSignInPresenter() {
        yr60 yr60Var = new yr60(this);
        this.f16604d = yr60Var;
        return yr60Var;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public ws60 generateSignInViewModel() {
        ws60 ws60Var = new ws60(this);
        this.f16603c = ws60Var;
        return ws60Var;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f16603c.m205455Z()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16603c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16604d.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f16603c.m205455Z()) {
            return;
        }
        hideInput();
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_phone_number_signin_or_signup";
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        njm.m159745a(this);
        super.preCreateView(bundle);
        this.pageHelper.m109041q(pageId());
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
