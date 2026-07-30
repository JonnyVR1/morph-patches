package com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.AccountBaseAct;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.data.SignUpData;
import p153l.b9c0;
import p153l.fxb;
import p153l.i4g0;
import p153l.jyb;
import p153l.pxb;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class CropperAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public fxb f17316c;

    /* JADX INFO: renamed from: d */
    public pxb f17317d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m29660X1(Act act, String str, SignUpData signUpData, boolean z) {
        Intent intent = new Intent(act, (Class<?>) CropperAct.class);
        intent.putExtra("image_uri", str);
        intent.putExtra("signup_data", signUpData);
        intent.putExtra("cropNewProfilePicture", z);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17317d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.AccountBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17316c = new fxb(this);
        pxb pxbVar = new pxb(this);
        this.f17317d = pxbVar;
        this.f17316c.mo52715C(pxbVar);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17316c.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        i4g0.m138523u("e_imagepage_signup_edit_back_button", "p_picture_editing_page", jyb.m147494Y("signup_source", AccountModule.m29130F().getSignUpType()));
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        this.f17316c.m127962O0(this, this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_picture_editing_page";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        getSupportActionBar().mo102194u(new ColorDrawable(RoundedDrawable.DEFAULT_BORDER_COLOR));
        setStatusBarColorResId(b9c0.f75555a);
        alwaysHideInput();
        this.f17316c.m127964Q0(getIntent().getStringExtra("image_uri"));
        this.f17316c.m127963P0(getIntent().getBooleanExtra("cropNewProfilePicture", false));
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
