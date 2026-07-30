package com.p046p1.mobile.putong.core.p053ui.moment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.gh00;
import p149l.rol;
import p149l.sg00;
import p149l.v7c0;
import p149l.w0c0;

/* JADX INFO: loaded from: classes4.dex */
public class MomentMessageAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public sg00 f32557c;

    /* JADX INFO: renamed from: d */
    public gh00 f32558d;

    /* JADX INFO: renamed from: e */
    public String f32559e;

    /* JADX INFO: renamed from: f */
    public String f32560f;

    /* JADX INFO: renamed from: g */
    public String f32561g;

    /* JADX INFO: renamed from: V1 */
    public static Intent m50092V1(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) MomentMessageAct.class);
        intent.putExtra("momentId", str);
        intent.putExtra("userId", str2);
        intent.putExtra("from", str3);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
        setStatusBarColorResId(w0c0.f183865l1);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        act().overridePendingTransition(0, 0);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f32558d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f32557c = new sg00(this);
        gh00 gh00Var = new gh00(this);
        this.f32558d = gh00Var;
        this.f32557c.mo51532C(gh00Var);
        this.f32559e = act().getIntent().getStringExtra("momentId");
        this.f32560f = act().getIntent().getStringExtra("userId");
        String stringExtra = act().getIntent().getStringExtra("from");
        this.f32561g = stringExtra;
        this.f32557c.m184022l0(this.f32559e, this.f32560f, stringExtra);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f32557c.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        setSwipeBackEnable(false);
        super.onStartLifecycle();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f32558d.m126125O(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_moment_chat";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setStatusBarColor(getResources().getColor(w0c0.f183868m1));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
        setTheme(v7c0.f180373t);
    }
}
