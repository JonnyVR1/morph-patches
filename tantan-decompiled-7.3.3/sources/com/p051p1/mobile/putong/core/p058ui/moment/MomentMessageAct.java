package com.p051p1.mobile.putong.core.p058ui.moment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.agc0;
import p153l.bp00;
import p153l.c9c0;
import p153l.crl;
import p153l.pp00;

/* JADX INFO: loaded from: classes4.dex */
public class MomentMessageAct extends PutongAct implements crl {

    /* JADX INFO: renamed from: c */
    public bp00 f33405c;

    /* JADX INFO: renamed from: d */
    public pp00 f33406d;

    /* JADX INFO: renamed from: e */
    public String f33407e;

    /* JADX INFO: renamed from: f */
    public String f33408f;

    /* JADX INFO: renamed from: g */
    public String f33409g;

    /* JADX INFO: renamed from: X1 */
    public static Intent m51275X1(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) MomentMessageAct.class);
        intent.putExtra("momentId", str);
        intent.putExtra("userId", str2);
        intent.putExtra("from", str3);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
        setStatusBarColorResId(c9c0.f80438m1);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        act().overridePendingTransition(0, 0);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f33406d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f33405c = new bp00(this);
        pp00 pp00Var = new pp00(this);
        this.f33406d = pp00Var;
        this.f33405c.mo52715C(pp00Var);
        this.f33407e = act().getIntent().getStringExtra("momentId");
        this.f33408f = act().getIntent().getStringExtra("userId");
        String stringExtra = act().getIntent().getStringExtra("from");
        this.f33409g = stringExtra;
        this.f33405c.m105777l0(this.f33407e, this.f33408f, stringExtra);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f33405c.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        setSwipeBackEnable(false);
        super.onStartLifecycle();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f33406d.m173164O(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_moment_chat";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setStatusBarColor(getResources().getColor(c9c0.f80441n1));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
        setTheme(agc0.f71134t);
    }
}
