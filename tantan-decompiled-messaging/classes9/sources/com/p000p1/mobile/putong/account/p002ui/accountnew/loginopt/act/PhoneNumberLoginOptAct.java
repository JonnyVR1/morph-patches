package com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP;
import com.p1.mobile.android.app.Act;
import p006l.njm;
import p006l.ws60;
import p006l.yr60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PhoneNumberLoginOptAct extends SignInBaseActMVP<yr60, ws60> {

    /* JADX INFO: renamed from: c */
    public ws60 f592c;

    /* JADX INFO: renamed from: d */
    public yr60 f593d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m578Y1(Act act) {
        return new Intent((Context) act, (Class<?>) PhoneNumberLoginOptAct.class);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public yr60 generateSignInPresenter() {
        yr60 yr60Var = new yr60(this);
        this.f593d = yr60Var;
        return yr60Var;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public ws60 generateSignInViewModel() {
        ws60 ws60Var = new ws60(this);
        this.f592c = ws60Var;
        return ws60Var;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f592c.m26747Z()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f592c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f593d.mo12401a0();
    }

    public void onBackPressed() {
        if (this.f592c.m26747Z()) {
            return;
        }
        hideInput();
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_phone_number_signin_or_signup";
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        njm.m20153a(this);
        super.preCreateView(bundle);
        this.pageHelper.q(pageId());
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
