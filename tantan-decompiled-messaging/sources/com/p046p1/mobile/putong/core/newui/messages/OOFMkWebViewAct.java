package com.p046p1.mobile.putong.core.newui.messages;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import p149l.juk;
import p149l.mqi0;
import p149l.sub0;

/* JADX INFO: loaded from: classes11.dex */
public class OOFMkWebViewAct extends MkWebViewAct implements sub0 {

    /* JADX INFO: renamed from: g */
    public static final String f25278g;

    static {
        f25278g = (juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com").concat("/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/core/one-out-of-four/index.html?speed=true&_bid=1003918&hideNavigationBar=1&hideNotch=1#/");
    }

    /* JADX INFO: renamed from: m2 */
    public static Intent m41782m2(Context context) {
        return m41783n2(context, null);
    }

    /* JADX INFO: renamed from: n2 */
    public static Intent m41783n2(Context context, String str) {
        String str2 = f25278g;
        if (!TextUtils.isEmpty(str)) {
            str2 = str2 + "?firstIDs=" + str;
        }
        Intent intentM80239d2 = MkWebViewAct.m80239d2(context, "", str2, true, true, true, null);
        intentM80239d2.setClass(context, OOFMkWebViewAct.class);
        intentM80239d2.putExtra("hideNotch", true);
        return intentM80239d2;
    }

    @Override // p149l.sub0
    @NonNull
    /* JADX INFO: renamed from: B */
    public Animator mo41784B() {
        return null;
    }

    @Override // p149l.sub0
    @NonNull
    /* JADX INFO: renamed from: C */
    public View mo41785C() {
        return this.f54801e.f67595a;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        CoreModule.f17545c.f19642f0.m32650Fo();
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        CoreModule.f17545c.f19642f0.f19971r1.put(Long.valueOf(mqi0.m155944o()));
        CoreModule.f17545c.f19639e0.f149242P4.put(Long.valueOf(mqi0.m155944o()));
    }

    @Override // p149l.sub0
    @NonNull
    /* JADX INFO: renamed from: p */
    public View mo41786p() {
        return this.f54801e.f67595a;
    }

    @Override // p149l.sub0
    public void stop() {
    }

    @Override // p149l.sub0
    /* JADX INFO: renamed from: w */
    public void mo41787w() {
    }
}
