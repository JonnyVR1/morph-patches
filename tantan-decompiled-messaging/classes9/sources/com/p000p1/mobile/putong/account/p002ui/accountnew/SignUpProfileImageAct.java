package com.p000p1.mobile.putong.account.p002ui.accountnew;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.AccountBaseAct;
import com.p1.mobile.putong.data.SignUpData;
import java.io.Serializable;
import p006l.def0;
import p006l.ief0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SignUpProfileImageAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public ief0 f432c;

    /* JADX INFO: renamed from: d */
    public def0 f433d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m398V1(Context context) {
        return new Intent(context, (Class<?>) SignUpProfileImageAct.class);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m399X1(Context context, SignUpData signUpData) {
        Intent intent = new Intent(context, (Class<?>) SignUpProfileImageAct.class);
        intent.putExtra("signup_data", (Serializable) signUpData);
        return intent;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f432c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.account.AccountBaseAct, com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f432c = new ief0(this);
        def0 def0Var = new def0(this);
        this.f433d = def0Var;
        def0Var.C(this.f432c);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        this.f433d.m14001a0();
    }

    public void onBackPressed() {
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f433d.m13999I0(bundle);
    }

    public void onStartLifecycle() {
        this.f433d.m13997G0(this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_imagepage_signup_view";
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        this.f433d.m14002r0(bundle);
        super.preCreateView(bundle);
    }
}
