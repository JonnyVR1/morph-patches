package com.p051p1.mobile.putong.core.newui.messages;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import p153l.pzi0;
import p153l.w2c0;
import p153l.zwk;

/* JADX INFO: loaded from: classes11.dex */
public class OOFMkWebViewAct extends MkWebViewAct implements w2c0 {

    /* JADX INFO: renamed from: g */
    public static final String f26020g;

    static {
        f26020g = (zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/one-out-of-four/index.html?speed=true&_bid=1003918&hideNavigationBar=1&hideNotch=1#/");
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m42793n2(Context context) {
        return m42794o2(context, null);
    }

    /* JADX INFO: renamed from: o2 */
    public static Intent m42794o2(Context context, String str) {
        String str2 = f26020g;
        if (!TextUtils.isEmpty(str)) {
            str2 = str2 + "?firstIDs=" + str;
        }
        Intent intentM81422e2 = MkWebViewAct.m81422e2(context, "", str2, true, true, true, null);
        intentM81422e2.setClass(context, OOFMkWebViewAct.class);
        intentM81422e2.putExtra("hideNotch", true);
        return intentM81422e2;
    }

    @Override // p153l.w2c0
    @NonNull
    /* JADX INFO: renamed from: C */
    public Animator mo42795C() {
        return null;
    }

    @Override // p153l.w2c0
    @NonNull
    /* JADX INFO: renamed from: E */
    public View mo42796E() {
        return this.f55649e.f151649a;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        CoreModule.f18264c.f20384f0.m33653Fo();
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        CoreModule.f18264c.f20384f0.f20713r1.put(Long.valueOf(pzi0.m174454o()));
        CoreModule.f18264c.f20381e0.f89099P4.put(Long.valueOf(pzi0.m174454o()));
    }

    @Override // p153l.w2c0
    @NonNull
    /* JADX INFO: renamed from: q */
    public View mo42797q() {
        return this.f55649e.f151649a;
    }

    @Override // p153l.w2c0
    public void stop() {
    }

    @Override // p153l.w2c0
    /* JADX INFO: renamed from: w */
    public void mo42798w() {
    }
}
