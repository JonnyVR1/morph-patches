package com.p000p1.mobile.putong.feed.newui.webview;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.webview.FeedWebViewFrag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongMvpFrag;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.fkp0;
import l.mkd0;
import l.w9j;
import p007l.iai;
import p007l.mai;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedWebViewFrag extends PutongMvpFrag<iai, mai> {

    /* JADX INFO: renamed from: B */
    public boolean f5014B;

    /* JADX INFO: renamed from: Q4 */
    public static /* synthetic */ void m7654Q4(String str, String[] strArr, c cVar) {
        if (cVar == c.i) {
            fkp0.f("PV", (String) null, str, strArr);
        } else if (cVar == c.j) {
            fkp0.f("PD", (String) null, str, strArr);
        }
    }

    /* JADX INFO: renamed from: R4 */
    public static FeedWebViewFrag m7655R4(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
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

    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public iai m7656M4() {
        return new iai(this);
    }

    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public mai m7657N4() {
        return new mai(act(), this);
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m7660U4(Boolean bool) {
        ((mai) ((PutongMvpFrag) this).A).m11888K(bool.toString());
    }

    /* JADX INFO: renamed from: V4 */
    public boolean m7661V4() {
        if (!((mai) ((PutongMvpFrag) this).A).m11894l()) {
            return false;
        }
        ((mai) ((PutongMvpFrag) this).A).m11901v();
        return true;
    }

    /* JADX INFO: renamed from: W4 */
    public void m7662W4(final String str, final String[] strArr) {
        if (TextUtils.isEmpty(str) || this.f5014B) {
            return;
        }
        lifecycle().filter(new w9j() { // from class: l.dai
            public final Object call(Object obj) {
                c cVar = (c) obj;
                return Boolean.valueOf(cVar == c.i || cVar == c.j);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.eai
            public final void call(Object obj) {
                FeedWebViewFrag.m7654Q4(str, strArr, (c) obj);
            }
        }));
        this.f5014B = true;
    }

    /* JADX INFO: renamed from: d4 */
    public void m7663d4() {
        super.d4();
        ((mai) ((PutongMvpFrag) this).A).m11902w();
        L4().subscribe(mkd0.G(new e30() { // from class: l.cai
            public final void call(Object obj) {
                this.f6589a.m7660U4((Boolean) obj);
            }
        }));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((mai) ((PutongMvpFrag) this).A).inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n4 */
    public void m7664n4(Bundle bundle) {
        ((mai) ((PutongMvpFrag) this).A).m11884G(getArguments());
        if (!(act() instanceof FeedWebViewAct) || act().getSupportActionBar() == null) {
            return;
        }
        act().getSupportActionBar().m();
    }

    /* JADX INFO: renamed from: o */
    public boolean m7665o() {
        if (((mai) ((PutongMvpFrag) this).A).m11894l()) {
            ((mai) ((PutongMvpFrag) this).A).m11901v();
            return true;
        }
        act().finish();
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        if (NullChecker.a(((mai) ((PutongMvpFrag) this).A).f10396v)) {
            ((mai) ((PutongMvpFrag) this).A).f10396v.onActivityResult(i, i2, intent);
        }
    }
}
