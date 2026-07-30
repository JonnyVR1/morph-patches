package com.p000p1.mobile.putong.feed.newui.webview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import l.e30;
import l.juk;
import p007l.b5c0;
import p007l.o6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedWebViewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public FeedWebViewFrag f5004c;

    /* JADX INFO: renamed from: d */
    public String f5005d;

    /* JADX INFO: renamed from: e */
    public String f5006e;

    /* JADX INFO: renamed from: f */
    public String f5007f;

    /* JADX INFO: renamed from: g */
    public String f5008g;

    /* JADX INFO: renamed from: h */
    public boolean f5009h;

    /* JADX INFO: renamed from: i */
    public boolean f5010i;

    /* JADX INFO: renamed from: j */
    public boolean f5011j;

    /* JADX INFO: renamed from: k */
    public boolean f5012k;

    /* JADX INFO: renamed from: l */
    public boolean f5013l;

    /* JADX INFO: renamed from: X1 */
    private boolean m7647X1() {
        return juk.a(this.f5006e);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m7648Y1(Context context, String str, String str2, String str3, String str4) {
        return m7649Z1(context, str, str2, str3, str4, true, false, true, false);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m7649Z1(Context context, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
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
    public static void m7650a2(Context context, String str, String str2, String str3, String str4) {
        context.startActivity(m7648Y1(context, str, str2, str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        if (fragmentManager().h0(b5c0.f5989P) == null) {
            this.f5004c = FeedWebViewFrag.m7655R4(this.f5005d, this.f5006e, this.f5007f, this.f5008g, this.f5009h, this.f5010i, this.f5011j, this.f5012k, this.f5013l, true);
            fragmentManager().m().s(b5c0.f5989P, this.f5004c).i();
        }
        fragmentManager().e0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void applyOverrideConfiguration(Configuration configuration) {
        super/*android.view.ContextThemeWrapper*/.applyOverrideConfiguration(configuration);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(o6c0.f11325w, (ViewGroup) null);
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.bai
            public final void call(Object obj) {
                this.f6211a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    public void onBackPressed() {
        FeedWebViewFrag feedWebViewFrag = this.f5004c;
        if (feedWebViewFrag != null ? feedWebViewFrag.m7665o() : false) {
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public void onHomePressed() {
        FeedWebViewFrag feedWebViewFrag = this.f5004c;
        if (feedWebViewFrag == null || !feedWebViewFrag.m7661V4()) {
            super/*com.p1.mobile.android.app.Act*/.onHomePressed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f5005d = getIntent().getStringExtra("title");
        this.f5006e = getIntent().getStringExtra("url");
        this.f5009h = getIntent().getBooleanExtra("hideNavigationBar", false);
        this.f5010i = getIntent().getBooleanExtra("hardwareAccelerated", false);
        this.f5011j = getIntent().getBooleanExtra("advanceInitJsBridge", true);
        this.f5012k = getIntent().getBooleanExtra("transparent_status_bar", false);
        this.f5013l = getIntent().getBooleanExtra("playbackRequiresUserGesture", false);
        this.f5007f = getIntent().getStringExtra("webviewColor");
        this.f5008g = getIntent().getStringExtra("notchColor");
    }

    public boolean shouldBlockOnResume() {
        return m7647X1() && super.shouldBlockOnResume();
    }

    public boolean shouldBlockOnStart() {
        return m7647X1() && super.shouldBlockOnResume();
    }
}
