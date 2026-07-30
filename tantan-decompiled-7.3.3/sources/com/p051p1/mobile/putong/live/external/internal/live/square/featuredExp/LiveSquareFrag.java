package com.p051p1.mobile.putong.live.external.internal.live.square.featuredExp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.external.internal.live.square.featuredExp.LiveSquareFrag;
import com.p051p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import p153l.g4u;
import p153l.nus;
import p153l.q4u;
import p153l.qcj;
import p153l.r230;
import p153l.t4u;
import p153l.x20;
import p153l.y20;
import p153l.z6u;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSquareFrag extends LiveSquareHomeFrag {

    /* JADX INFO: renamed from: A */
    public q4u f45832A;

    /* JADX INFO: renamed from: B */
    public final LiveHomeEventBus f45833B = new LiveHomeEventBus();

    /* JADX INFO: renamed from: z */
    public z6u f45834z;

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ void m70210O4(Bundle bundle) {
    }

    /* JADX INFO: renamed from: S4 */
    public static LiveSquareFrag m70213S4(Bundle bundle) {
        LiveSquareFrag liveSquareFrag = new LiveSquareFrag();
        liveSquareFrag.setArguments(bundle);
        return liveSquareFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
        this.f45832A.m204601Q2();
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
        return this.f45832A.m175258T2();
    }

    @Override // com.p051p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag
    /* JADX INFO: renamed from: N4 */
    public LiveHomeEventBus mo70127N4() {
        return this.f45833B;
    }

    /* JADX INFO: renamed from: R4 */
    public void m70214R4(Bundle bundle) {
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
        this.f45832A = new q4u(this, t4u.m189320i().map(new qcj() { // from class: l.k2u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }), new nus(this.f45833B, this));
        z6u z6uVar = new z6u();
        this.f45834z = z6uVar;
        this.f45832A.mo52715C(z6uVar);
        act().setSwipeBackEnable(false);
        act().setFullSlide(false);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        creates(new y20() { // from class: l.i2u
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSquareFrag.m70210O4((Bundle) obj);
            }
        }, new x20() { // from class: l.j2u
            @Override // p153l.x20
            public final void call() {
                this.f118091a.destroy();
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f45834z.m218813r();
        g4u.m128910a(this.f45832A, this.f45834z);
        this.f45832A.m204603S2();
        this.f45832A.m204602R2();
        if (isHidden()) {
            return;
        }
        onHiddenChanged(false);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f45834z.inflateView(layoutInflater, viewGroup);
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
        this.f45832A.m175259U2(z);
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
