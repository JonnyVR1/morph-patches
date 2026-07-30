package com.p051p1.mobile.putong.feed.newui.webview;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import com.p051p1.mobile.putong.feed.newui.webview.FeedWebViewFrag;
import com.tantanapp.common.utils.NullChecker;
import p153l.bci;
import p153l.jtp0;
import p153l.psd0;
import p153l.qcj;
import p153l.xbi;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedWebViewFrag extends PutongMvpFrag<xbi, bci> {

    /* JADX INFO: renamed from: B */
    public boolean f44401B;

    /* JADX INFO: renamed from: Q4 */
    public static /* synthetic */ void m67670Q4(String str, String[] strArr, C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            jtp0.m146916f("PV", null, str, strArr);
        } else if (c4470c == C4470c.f16268j) {
            jtp0.m146916f("PD", null, str, strArr);
        }
    }

    /* JADX INFO: renamed from: R4 */
    public static FeedWebViewFrag m67671R4(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
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

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: S4, reason: merged with bridge method [inline-methods] */
    public xbi mo30639M4() {
        return new xbi(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: T4, reason: merged with bridge method [inline-methods] */
    public bci mo30640N4() {
        return new bci((PutongAct) act(), this);
    }

    /* JADX INFO: renamed from: U4 */
    public final /* synthetic */ void m67674U4(Boolean bool) {
        ((bci) this.f17893A).m103526K(bool.toString());
    }

    /* JADX INFO: renamed from: V4 */
    public boolean m67675V4() {
        if (!((bci) this.f17893A).m103531l()) {
            return false;
        }
        ((bci) this.f17893A).m103538v();
        return true;
    }

    /* JADX INFO: renamed from: W4 */
    public void m67676W4(final String str, final String[] strArr) {
        if (TextUtils.isEmpty(str) || this.f44401B) {
            return;
        }
        lifecycle().filter(new qcj() { // from class: l.sbi
            @Override // p153l.qcj
            public final Object call(Object obj) {
                C4470c c4470c = (C4470c) obj;
                return Boolean.valueOf(c4470c == C4470c.f16267i || c4470c == C4470c.f16268j);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.tbi
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedWebViewFrag.m67670Q4(str, strArr, (C4470c) obj);
            }
        }));
        this.f44401B = true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        ((bci) this.f17893A).m103539w();
        m30638L4().subscribe(psd0.m173596G(new y20() { // from class: l.rbi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162024a.m67674U4((Boolean) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((bci) this.f17893A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        ((bci) this.f17893A).m103522G(getArguments());
        if (!(act() instanceof FeedWebViewAct) || act().getSupportActionBar() == null) {
            return;
        }
        act().getSupportActionBar().mo102186m();
    }

    /* JADX INFO: renamed from: o */
    public boolean m67677o() {
        if (((bci) this.f17893A).m103531l()) {
            ((bci) this.f17893A).m103538v();
            return true;
        }
        act().m68056e2();
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (NullChecker.m82486a(((bci) this.f17893A).f76171v)) {
            ((bci) this.f17893A).f76171v.onActivityResult(i, i2, intent);
        }
    }
}
