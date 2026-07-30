package com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.AccountBaseAct;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.SignUpData;
import java.io.Serializable;
import l.j760;
import l.vwb;
import l.zvf0;
import p006l.bwb;
import p006l.rvb;
import p006l.v0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CropperAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public rvb f586c;

    /* JADX INFO: renamed from: d */
    public bwb f587d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m560V1(Act act, String str, SignUpData signUpData, boolean z) {
        Intent intent = new Intent((Context) act, (Class<?>) CropperAct.class);
        intent.putExtra("image_uri", str);
        intent.putExtra("signup_data", (Serializable) signUpData);
        intent.putExtra("cropNewProfilePicture", z);
        return intent;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f587d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.AccountBaseAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f586c = new rvb(this);
        bwb bwbVar = new bwb(this);
        this.f587d = bwbVar;
        this.f586c.C(bwbVar);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f586c.m23321a0();
    }

    public void onBackPressed() {
        zvf0.u("e_imagepage_signup_edit_back_button", "p_picture_editing_page", new j760[]{vwb.Y("signup_source", AccountModule.m26F().getSignUpType())});
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    public void onStartLifecycle() {
        this.f586c.m23317O0(this, this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_picture_editing_page";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        getSupportActionBar().u(new ColorDrawable(-16777216));
        setStatusBarColorResId(v0c0.f23853a);
        alwaysHideInput();
        this.f586c.m23319Q0(getIntent().getStringExtra("image_uri"));
        this.f586c.m23318P0(getIntent().getBooleanExtra("cropNewProfilePicture", false));
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
