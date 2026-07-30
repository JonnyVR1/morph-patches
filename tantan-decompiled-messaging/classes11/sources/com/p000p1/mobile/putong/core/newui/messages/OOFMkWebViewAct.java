package com.p000p1.mobile.putong.core.newui.messages;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct;
import com.p1.mobile.putong.core.CoreModule;
import p009l.juk;
import p009l.mqi0;
import p009l.sub0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class OOFMkWebViewAct extends MkWebViewAct implements sub0 {

    /* JADX INFO: renamed from: g */
    public static final String f4056g;

    static {
        f4056g = (juk.m17221e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/one-out-of-four/index.html?speed=true&_bid=1003918&hideNavigationBar=1&hideNotch=1#/");
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m5906m2(Context context) {
        return m5907n2(context, null);
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m5907n2(Context context, String str) {
        String str2 = f4056g;
        if (!TextUtils.isEmpty(str)) {
            str2 = str2 + "?firstIDs=" + str;
        }
        Intent intentM10586d2 = MkWebViewAct.m10586d2(context, "", str2, true, true, true, null);
        intentM10586d2.setClass(context, OOFMkWebViewAct.class);
        intentM10586d2.putExtra("hideNotch", true);
        return intentM10586d2;
    }

    @Override // p009l.sub0
    @NonNull
    /* JADX INFO: renamed from: B */
    public Animator mo5908B() {
        return null;
    }

    @Override // p009l.sub0
    @NonNull
    /* JADX INFO: renamed from: C */
    public View mo5909C() {
        return this.f8407e.f9223a;
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        CoreModule.c.f0.Fo();
    }

    @Override // com.p000p1.mobile.putong.p004ui.webview.p007mk.MkWebViewAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        CoreModule.c.f0.r1.put(Long.valueOf(mqi0.m18550o()));
        CoreModule.c.e0.P4.put(Long.valueOf(mqi0.m18550o()));
    }

    @Override // p009l.sub0
    @NonNull
    /* JADX INFO: renamed from: p */
    public View mo5910p() {
        return this.f8407e.f9223a;
    }

    @Override // p009l.sub0
    public void stop() {
    }

    @Override // p009l.sub0
    /* JADX INFO: renamed from: w */
    public void mo5911w() {
    }
}
