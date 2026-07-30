package com.p051p1.mobile.putong.account.p055ui.accountnew;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.account.AccountBaseAct;
import com.p051p1.mobile.putong.data.SignUpData;
import p153l.kmf0;
import p153l.pmf0;

/* JADX INFO: loaded from: classes9.dex */
public class SignUpProfileImageAct extends AccountBaseAct {

    /* JADX INFO: renamed from: c */
    public pmf0 f17162c;

    /* JADX INFO: renamed from: d */
    public kmf0 f17163d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m29501X1(Context context) {
        return new Intent(context, (Class<?>) SignUpProfileImageAct.class);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m29502Y1(Context context, SignUpData signUpData) {
        Intent intent = new Intent(context, (Class<?>) SignUpProfileImageAct.class);
        intent.putExtra("signup_data", signUpData);
        return intent;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17162c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.account.AccountBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f17162c = new pmf0(this);
        kmf0 kmf0Var = new kmf0(this);
        this.f17163d = kmf0Var;
        kmf0Var.mo52715C(this.f17162c);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f17163d.mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f17163d.m150456I0(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        this.f17163d.m150454G0(this.pageHelper);
        super.onStartLifecycle();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_imagepage_signup_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        this.f17163d.m150458r0(bundle);
        super.preCreateView(bundle);
    }
}
