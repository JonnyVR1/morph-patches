package com.p046p1.mobile.putong.account.p050ui.accountnew;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.account.AccountBaseAct;
import com.p046p1.mobile.putong.data.SignUpData;
import p149l.def0;
import p149l.ief0;

/* JADX INFO: loaded from: classes9.dex */
public class SignUpProfileImageAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public ief0 f16443c;

    /* JADX INFO: renamed from: d */
    public def0 f16444d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m28502V1(Context context) {
        return new Intent(context, (Class<?>) SignUpProfileImageAct.class);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m28503X1(Context context, SignUpData signUpData) {
        Intent intent = new Intent(context, (Class<?>) SignUpProfileImageAct.class);
        intent.putExtra("signup_data", signUpData);
        return intent;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f16443c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.account.AccountBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f16443c = new ief0(this);
        def0 def0Var = new def0(this);
        this.f16444d = def0Var;
        def0Var.mo51532C(this.f16443c);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f16444d.mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f16444d.m111223I0(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        this.f16444d.m111221G0(this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_imagepage_signup_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        this.f16444d.m111225r0(bundle);
        super.preCreateView(bundle);
    }
}
