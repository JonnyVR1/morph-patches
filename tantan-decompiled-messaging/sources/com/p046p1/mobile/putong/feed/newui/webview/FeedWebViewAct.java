package com.p046p1.mobile.putong.feed.newui.webview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.b5c0;
import p149l.e30;
import p149l.juk;
import p149l.o6c0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedWebViewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public FeedWebViewFrag f43543c;

    /* JADX INFO: renamed from: d */
    public String f43544d;

    /* JADX INFO: renamed from: e */
    public String f43545e;

    /* JADX INFO: renamed from: f */
    public String f43546f;

    /* JADX INFO: renamed from: g */
    public String f43547g;

    /* JADX INFO: renamed from: h */
    public boolean f43548h;

    /* JADX INFO: renamed from: i */
    public boolean f43549i;

    /* JADX INFO: renamed from: j */
    public boolean f43550j;

    /* JADX INFO: renamed from: k */
    public boolean f43551k;

    /* JADX INFO: renamed from: l */
    public boolean f43552l;

    /* JADX INFO: renamed from: X1 */
    private boolean m66480X1() {
        return juk.m143319a(this.f43545e);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m66481Y1(Context context, String str, String str2, String str3, String str4) {
        return m66482Z1(context, str, str2, str3, str4, true, false, true, false);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m66482Z1(Context context, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
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

    /* JADX INFO: renamed from: a2 */
    public static void m66483a2(Context context, String str, String str2, String str3, String str4) {
        context.startActivity(m66481Y1(context, str, str2, str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (fragmentManager().m2554h0(b5c0.f73508P) == null) {
            this.f43543c = FeedWebViewFrag.m66488R4(this.f43544d, this.f43545e, this.f43546f, this.f43547g, this.f43548h, this.f43549i, this.f43550j, this.f43551k, this.f43552l, true);
            fragmentManager().m2567m().m2811s(b5c0.f73508P, this.f43543c).mo2707i();
        }
        fragmentManager().m2545e0();
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration configuration) {
        super.applyOverrideConfiguration(configuration);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(o6c0.f142306w, (ViewGroup) null);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.bai
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74692a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FeedWebViewFrag feedWebViewFrag = this.f43543c;
        if (feedWebViewFrag != null ? feedWebViewFrag.m66494o() : false) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onHomePressed() {
        FeedWebViewFrag feedWebViewFrag = this.f43543c;
        if (feedWebViewFrag == null || !feedWebViewFrag.m66492V4()) {
            super.onHomePressed();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f43544d = getIntent().getStringExtra("title");
        this.f43545e = getIntent().getStringExtra("url");
        this.f43548h = getIntent().getBooleanExtra("hideNavigationBar", false);
        this.f43549i = getIntent().getBooleanExtra("hardwareAccelerated", false);
        this.f43550j = getIntent().getBooleanExtra("advanceInitJsBridge", true);
        this.f43551k = getIntent().getBooleanExtra("transparent_status_bar", false);
        this.f43552l = getIntent().getBooleanExtra("playbackRequiresUserGesture", false);
        this.f43546f = getIntent().getStringExtra("webviewColor");
        this.f43547g = getIntent().getStringExtra("notchColor");
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnResume() {
        return m66480X1() && super.shouldBlockOnResume();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public boolean shouldBlockOnStart() {
        return m66480X1() && super.shouldBlockOnResume();
    }
}
