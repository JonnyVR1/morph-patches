package com.p046p1.mobile.putong.feed.newui.webview;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import com.p046p1.mobile.putong.feed.newui.webview.FeedWebViewFrag;
import com.tantanapp.common.utils.NullChecker;
import p149l.e30;
import p149l.fkp0;
import p149l.iai;
import p149l.mai;
import p149l.mkd0;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class FeedWebViewFrag extends PutongMvpFrag<iai, mai> {

    /* JADX INFO: renamed from: B */
    public boolean f43553B;

    /* JADX INFO: renamed from: Q4 */
    public static /* synthetic */ void m66487Q4(String str, String[] strArr, C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            fkp0.m121886f("PV", null, str, strArr);
        } else if (c4319c == C4319c.f15549j) {
            fkp0.m121886f("PD", null, str, strArr);
        }
    }

    /* JADX INFO: renamed from: R4 */
    public static FeedWebViewFrag m66488R4(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        FeedWebViewFrag feedWebViewFrag = new FeedWebViewFrag();
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putString("url", str2);
        bundle.putString("webviewColor", str3);
        bundle.putString("notchColor", str4);
        bundle.putBoolean("hideNavigationBar", z);
        bundle.putBoolean("hardwareAccelerated", z2);
        bundle.putBoolean("advanceInitJsBridge", z3);
        bundle.putBoolean("transparent_status_bar", z4);
        bundle.putBoolean("playbackRequiresUserGesture", z5);
        bundle.putBoolean("useActConfig", z6);
        feedWebViewFrag.setArguments(bundle);
        return feedWebViewFrag;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public iai mo29641M4() {
        return new iai(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public mai mo29642N4() {
        return new mai((PutongAct) act(), this);
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m66491U4(Boolean bool) {
        ((mai) this.f17174A).m153804K(bool.toString());
    }

    /* JADX INFO: renamed from: V4 */
    public boolean m66492V4() {
        if (!((mai) this.f17174A).m153809l()) {
            return false;
        }
        ((mai) this.f17174A).m153816v();
        return true;
    }

    /* JADX INFO: renamed from: W4 */
    public void m66493W4(final String str, final String[] strArr) {
        if (TextUtils.isEmpty(str) || this.f43553B) {
            return;
        }
        lifecycle().filter(new w9j() { // from class: l.dai
            @Override // p149l.w9j
            public final Object call(Object obj) {
                C4319c c4319c = (C4319c) obj;
                return Boolean.valueOf(c4319c == C4319c.f15548i || c4319c == C4319c.f15549j);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.eai
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedWebViewFrag.m66487Q4(str, strArr, (C4319c) obj);
            }
        }));
        this.f43553B = true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        ((mai) this.f17174A).m153817w();
        m29640L4().subscribe(mkd0.m154955G(new e30() { // from class: l.cai
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80034a.m66491U4((Boolean) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((mai) this.f17174A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        ((mai) this.f17174A).m153800G(getArguments());
        if (!(act() instanceof FeedWebViewAct) || act().getSupportActionBar() == null) {
            return;
        }
        act().getSupportActionBar().mo134126m();
    }

    /* JADX INFO: renamed from: o */
    public boolean m66494o() {
        if (((mai) this.f17174A).m153809l()) {
            ((mai) this.f17174A).m153816v();
            return true;
        }
        act().m66873d2();
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m81303a(((mai) this.f17174A).f132906v)) {
            ((mai) this.f17174A).f132906v.onActivityResult(i, i2, intent);
        }
    }
}
