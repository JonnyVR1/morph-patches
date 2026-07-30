package com.p051p1.mobile.putong.live.external.internal.live.square;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.internal.live.square.LiveSquareHomeFragDomestic;
import com.p051p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import p153l.nus;
import p153l.qcj;
import p153l.r230;
import p153l.t2u;
import p153l.t4u;
import p153l.u2u;
import p153l.x20;
import p153l.x2u;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSquareHomeFragDomestic extends LiveSquareHomeFrag {

    /* JADX INFO: renamed from: A */
    public u2u f45806A;

    /* JADX INFO: renamed from: B */
    public final LiveHomeEventBus f45807B = new LiveHomeEventBus();

    /* JADX INFO: renamed from: z */
    public x2u f45808z;

    /* JADX INFO: renamed from: Q4 */
    public static /* synthetic */ void m70125Q4(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
        this.f45806A.m204601Q2();
        r230.m179475p("context_square");
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag
    /* JADX INFO: renamed from: M4 */
    public String mo70126M4() {
        return this.f45806A.m194302T2();
    }

    @Override // com.p051p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag
    /* JADX INFO: renamed from: N4 */
    public LiveHomeEventBus mo70127N4() {
        return this.f45807B;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: Z3 */
    public void mo21578Z3(Bundle bundle) {
        super.mo21578Z3(bundle);
        if (bundle != null) {
            bundle.remove(Act.FRAGMENTS_TAG);
            bundle.remove(Act.SUPPORT_FRAGMENTS_TAG);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f45806A = new u2u(this, t4u.m189320i().map(new qcj() { // from class: l.q2u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }), new nus(this.f45807B, this));
        x2u x2uVar = new x2u();
        this.f45808z = x2uVar;
        this.f45806A.mo52715C(x2uVar);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        creates(new y20() { // from class: l.r2u
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSquareHomeFragDomestic.m70125Q4((Bundle) obj);
            }
        }, new x20() { // from class: l.s2u
            @Override // p153l.x20
            public final void call() {
                this.f165933a.destroy();
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f45808z.m209179r();
        t2u.m189000a(this.f45806A, this.f45808z, act());
        this.f45806A.m204603S2();
        this.f45806A.m204602R2();
        if (isHidden()) {
            return;
        }
        onHiddenChanged(false);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f45808z.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
        if (bundle != null) {
            t4u.m189324m(true);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.f45806A.m194303U2(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_live_recommend";
    }

    @Override // com.p051p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag, p153l.egj0
    /* JADX INFO: renamed from: v */
    public String mo70128v() {
        return mo70126M4();
    }
}
