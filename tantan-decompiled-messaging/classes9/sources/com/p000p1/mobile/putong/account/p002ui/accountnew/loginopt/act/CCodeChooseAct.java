package com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP;
import com.p1.mobile.android.app.Act;
import p006l.kr3;
import p006l.njm;
import p006l.or3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CCodeChooseAct extends SignInBaseActMVP<kr3, or3> {

    /* JADX INFO: renamed from: c */
    public or3 f584c;

    /* JADX INFO: renamed from: d */
    public kr3 f585d;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m557Y1(Act act) {
        return new Intent((Context) act, (Class<?>) CCodeChooseAct.class);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public kr3 generateSignInPresenter() {
        kr3 kr3Var = new kr3(this);
        this.f585d = kr3Var;
        return kr3Var;
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public or3 generateSignInViewModel() {
        or3 or3Var = new or3(this);
        this.f584c = or3Var;
        return or3Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f584c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.p002ui.account.SignInBaseActMVP, com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f585d.mo12401a0();
    }

    public void onBackPressed() {
        hideInput();
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_country_code_selection_view";
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
