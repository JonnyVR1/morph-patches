package com.p046p1.mobile.putong.live.external.internal.live.square;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.internal.live.square.LiveSquareHomeFragDomestic;
import com.p046p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import p149l.d30;
import p149l.e30;
import p149l.hu20;
import p149l.mss;
import p149l.s0u;
import p149l.s2u;
import p149l.t0u;
import p149l.w0u;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareHomeFragDomestic extends LiveSquareHomeFrag {

    /* JADX INFO: renamed from: A */
    public t0u f44958A;

    /* JADX INFO: renamed from: B */
    public final LiveHomeEventBus f44959B = new LiveHomeEventBus();

    /* JADX INFO: renamed from: z */
    public w0u f44960z;

    /* JADX INFO: renamed from: Q4 */
    public static /* synthetic */ void m68942Q4(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
        this.f44958A.m196514Q2();
        hu20.m132970p("context_square");
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag
    /* JADX INFO: renamed from: M4 */
    public String mo68943M4() {
        return this.f44958A.m186874T2();
    }

    @Override // com.p046p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag
    /* JADX INFO: renamed from: N4 */
    public LiveHomeEventBus mo68944N4() {
        return this.f44959B;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: Z3 */
    public void mo20579Z3(Bundle bundle) {
        super.mo20579Z3(bundle);
        if (bundle != null) {
            bundle.remove(Act.FRAGMENTS_TAG);
            bundle.remove(Act.SUPPORT_FRAGMENTS_TAG);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f44958A = new t0u(this, s2u.m182077i().map(new w9j() { // from class: l.p0u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }), new mss(this.f44959B, this));
        w0u w0uVar = new w0u();
        this.f44960z = w0uVar;
        this.f44958A.mo51532C(w0uVar);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        creates(new e30() { // from class: l.q0u
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSquareHomeFragDomestic.m68942Q4((Bundle) obj);
            }
        }, new d30() { // from class: l.r0u
            @Override // p149l.d30
            public final void call() {
                this.f157203a.destroy();
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f44960z.m200900r();
        s0u.m181891a(this.f44958A, this.f44960z, act());
        this.f44958A.m196516S2();
        this.f44958A.m196515R2();
        if (isHidden()) {
            return;
        }
        onHiddenChanged(false);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f44960z.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        super.mo20594n4(bundle);
        if (bundle != null) {
            s2u.m182081m(true);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.f44958A.m186875U2(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_live_recommend";
    }

    @Override // com.p046p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag, p149l.a7j0
    /* JADX INFO: renamed from: v */
    public String mo68945v() {
        return mo68943M4();
    }
}
