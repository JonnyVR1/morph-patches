package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.AccountBaseAct;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.data.SignUpData;
import p149l.bwb;
import p149l.rvb;
import p149l.v0c0;
import p149l.vwb;
import p149l.zvf0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class CropperAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public rvb f16597c;

    /* JADX INFO: renamed from: d */
    public bwb f16598d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m28661V1(Act act, String str, SignUpData signUpData, boolean z) {
        Intent intent = new Intent(act, (Class<?>) CropperAct.class);
        intent.putExtra("image_uri", str);
        intent.putExtra("signup_data", signUpData);
        intent.putExtra("cropNewProfilePicture", z);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16598d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.AccountBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f16597c = new rvb(this);
        bwb bwbVar = new bwb(this);
        this.f16598d = bwbVar;
        this.f16597c.mo51532C(bwbVar);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16597c.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        zvf0.m220399u("e_imagepage_signup_edit_back_button", "p_picture_editing_page", vwb.m200311Y("signup_source", AccountModule.m28131F().getSignUpType()));
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        this.f16597c.m181270O0(this, this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_picture_editing_page";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        getSupportActionBar().mo134134u(new ColorDrawable(RoundedDrawable.DEFAULT_BORDER_COLOR));
        setStatusBarColorResId(v0c0.f179094a);
        alwaysHideInput();
        this.f16597c.m181272Q0(getIntent().getStringExtra("image_uri"));
        this.f16597c.m181271P0(getIntent().getBooleanExtra("cropNewProfilePicture", false));
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
