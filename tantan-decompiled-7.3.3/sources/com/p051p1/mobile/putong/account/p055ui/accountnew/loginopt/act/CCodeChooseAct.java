package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP;
import p153l.js3;
import p153l.ns3;
import p153l.plm;

/* JADX INFO: loaded from: classes9.dex */
public class CCodeChooseAct extends SignInBaseActMVP<js3, ns3> {

    /* JADX INFO: renamed from: c */
    public ns3 f17314c;

    /* JADX INFO: renamed from: d */
    public js3 f17315d;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m29657Z1(Act act) {
        return new Intent(act, (Class<?>) CCodeChooseAct.class);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public js3 generateSignInPresenter() {
        js3 js3Var = new js3(this);
        this.f17315d = js3Var;
        return js3Var;
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ns3 generateSignInViewModel() {
        ns3 ns3Var = new ns3(this);
        this.f17314c = ns3Var;
        return ns3Var;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17314c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.p055ui.account.SignInBaseActMVP, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17315d.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        hideInput();
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_country_code_selection_view";
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
