package com.p000p1.mobile.putong.core.p001ui.moment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import l.rol;
import l.v7c0;
import l.w0c0;
import p002l.gh00;
import p002l.sg00;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MomentMessageAct extends PutongAct implements rol {

    /* JADX INFO: renamed from: c */
    public sg00 f379c;

    /* JADX INFO: renamed from: d */
    public gh00 f380d;

    /* JADX INFO: renamed from: e */
    public String f381e;

    /* JADX INFO: renamed from: f */
    public String f382f;

    /* JADX INFO: renamed from: g */
    public String f383g;

    /* JADX INFO: renamed from: V1 */
    public static Intent m517V1(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) MomentMessageAct.class);
        intent.putExtra("momentId", str);
        intent.putExtra("userId", str2);
        intent.putExtra("from", str3);
        return intent;
    }

    public void checkGradientColors() {
        super.checkGradientColors();
        setStatusBarColorResId(w0c0.l1);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        act().overridePendingTransition(0, 0);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f380d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f379c = new sg00(this);
        gh00 gh00Var = new gh00(this);
        this.f380d = gh00Var;
        this.f379c.C(gh00Var);
        this.f381e = act().getIntent().getStringExtra("momentId");
        this.f382f = act().getIntent().getStringExtra("userId");
        String stringExtra = act().getIntent().getStringExtra("from");
        this.f383g = stringExtra;
        this.f379c.m22441l0(this.f381e, this.f382f, stringExtra);
    }

    public void initSubscription() {
        super.initSubscription();
        this.f379c.m22438a0();
    }

    public void onStartLifecycle() {
        setSwipeBackEnable(false);
        super/*com.p1.mobile.android.app.Act*/.onStartLifecycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onWindowFocusChanged(boolean z) {
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        this.f380d.m13803O(z);
    }

    public String pageId() {
        return "p_moment_chat";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setStatusBarColor(getResources().getColor(w0c0.m1));
    }

    public void setTheme() {
        super.setTheme();
        setTheme(v7c0.t);
    }
}
