package com.p051p1.mobile.putong.feed.newui.webview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.hdc0;
import p153l.tec0;
import p153l.y20;
import p153l.zwk;

/* JADX INFO: loaded from: classes13.dex */
public class FeedWebViewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public FeedWebViewFrag f44391c;

    /* JADX INFO: renamed from: d */
    public String f44392d;

    /* JADX INFO: renamed from: e */
    public String f44393e;

    /* JADX INFO: renamed from: f */
    public String f44394f;

    /* JADX INFO: renamed from: g */
    public String f44395g;

    /* JADX INFO: renamed from: h */
    public boolean f44396h;

    /* JADX INFO: renamed from: i */
    public boolean f44397i;

    /* JADX INFO: renamed from: j */
    public boolean f44398j;

    /* JADX INFO: renamed from: k */
    public boolean f44399k;

    /* JADX INFO: renamed from: l */
    public boolean f44400l;

    /* JADX INFO: renamed from: Y1 */
    private boolean m67663Y1() {
        return zwk.m221901a(this.f44393e);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m67664Z1(Context context, String str, String str2, String str3, String str4) {
        return m67665a2(context, str, str2, str3, str4, true, false, true, false);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m67665a2(Context context, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent(context, (Class<?>) FeedWebViewAct.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        intent.putExtra("webviewColor", str3);
        intent.putExtra("notchColor", str4);
        intent.putExtra("hideNavigationBar", z);
        intent.putExtra("hardwareAccelerated", z2);
        intent.putExtra("transparent_status_bar", z3);
        intent.putExtra("playbackRequiresUserGesture", z4);
        return intent;
    }

    /* JADX INFO: renamed from: b2 */
    public static void m67666b2(Context context, String str, String str2, String str3, String str4) {
        context.startActivity(m67664Z1(context, str, str2, str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (fragmentManager().m2555h0(hdc0.f108861P) == null) {
            this.f44391c = FeedWebViewFrag.m67671R4(this.f44392d, this.f44393e, this.f44394f, this.f44395g, this.f44396h, this.f44397i, this.f44398j, this.f44399k, this.f44400l, true);
            fragmentManager().m2568m().m2812s(hdc0.f108861P, this.f44391c).mo2708i();
        }
        fragmentManager().m2546e0();
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration configuration) {
        super.applyOverrideConfiguration(configuration);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(tec0.f173775w, (ViewGroup) null);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.qbi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156483a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FeedWebViewFrag feedWebViewFrag = this.f44391c;
        if (feedWebViewFrag != null ? feedWebViewFrag.m67677o() : false) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onHomePressed() {
        FeedWebViewFrag feedWebViewFrag = this.f44391c;
        if (feedWebViewFrag == null || !feedWebViewFrag.m67675V4()) {
            super.onHomePressed();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f44392d = getIntent().getStringExtra("title");
        this.f44393e = getIntent().getStringExtra("url");
        this.f44396h = getIntent().getBooleanExtra("hideNavigationBar", false);
        this.f44397i = getIntent().getBooleanExtra("hardwareAccelerated", false);
        this.f44398j = getIntent().getBooleanExtra("advanceInitJsBridge", true);
        this.f44399k = getIntent().getBooleanExtra("transparent_status_bar", false);
        this.f44400l = getIntent().getBooleanExtra("playbackRequiresUserGesture", false);
        this.f44394f = getIntent().getStringExtra("webviewColor");
        this.f44395g = getIntent().getStringExtra("notchColor");
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnResume() {
        return m67663Y1() && super.shouldBlockOnResume();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public boolean shouldBlockOnStart() {
        return m67663Y1() && super.shouldBlockOnResume();
    }
}
