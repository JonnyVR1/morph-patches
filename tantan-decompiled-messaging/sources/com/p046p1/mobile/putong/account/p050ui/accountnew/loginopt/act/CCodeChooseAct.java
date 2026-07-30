package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP;
import p149l.kr3;
import p149l.njm;
import p149l.or3;

/* JADX INFO: loaded from: classes9.dex */
public class CCodeChooseAct extends SignInBaseActMVP<kr3, or3> {

    /* JADX INFO: renamed from: c */
    public or3 f16595c;

    /* JADX INFO: renamed from: d */
    public kr3 f16596d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m28658Y1(Act act) {
        return new Intent(act, (Class<?>) CCodeChooseAct.class);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public kr3 generateSignInPresenter() {
        kr3 kr3Var = new kr3(this);
        this.f16596d = kr3Var;
        return kr3Var;
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public or3 generateSignInViewModel() {
        or3 or3Var = new or3(this);
        this.f16595c = or3Var;
        return or3Var;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16595c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.p050ui.account.SignInBaseActMVP, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16596d.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        hideInput();
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_country_code_selection_view";
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
