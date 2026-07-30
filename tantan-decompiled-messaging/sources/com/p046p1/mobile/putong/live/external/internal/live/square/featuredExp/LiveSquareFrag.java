package com.p046p1.mobile.putong.live.external.internal.live.square.featuredExp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.internal.live.square.featuredExp.LiveSquareFrag;
import com.p046p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import p149l.d30;
import p149l.e30;
import p149l.f2u;
import p149l.hu20;
import p149l.mss;
import p149l.p2u;
import p149l.s2u;
import p149l.w9j;
import p149l.y4u;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareFrag extends LiveSquareHomeFrag {

    /* JADX INFO: renamed from: A */
    public p2u f44984A;

    /* JADX INFO: renamed from: B */
    public final LiveHomeEventBus f44985B = new LiveHomeEventBus();

    /* JADX INFO: renamed from: z */
    public y4u f44986z;

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ void m69027O4(Bundle bundle) {
    }

    /* JADX INFO: renamed from: S4 */
    public static LiveSquareFrag m69030S4(Bundle bundle) {
        LiveSquareFrag liveSquareFrag = new LiveSquareFrag();
        liveSquareFrag.setArguments(bundle);
        return liveSquareFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
        this.f44984A.m196514Q2();
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
        return this.f44984A.m167223T2();
    }

    @Override // com.p046p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag
    /* JADX INFO: renamed from: N4 */
    public LiveHomeEventBus mo68944N4() {
        return this.f44985B;
    }

    /* JADX INFO: renamed from: R4 */
    public void m69031R4(Bundle bundle) {
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
        this.f44984A = new p2u(this, s2u.m182077i().map(new w9j() { // from class: l.j0u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }), new mss(this.f44985B, this));
        y4u y4uVar = new y4u();
        this.f44986z = y4uVar;
        this.f44984A.mo51532C(y4uVar);
        act().setSwipeBackEnable(false);
        act().setFullSlide(false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        creates(new e30() { // from class: l.h0u
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSquareFrag.m69027O4((Bundle) obj);
            }
        }, new d30() { // from class: l.i0u
            @Override // p149l.d30
            public final void call() {
                this.f110383a.destroy();
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f44986z.m212946r();
        f2u.m119238a(this.f44984A, this.f44986z);
        this.f44984A.m196516S2();
        this.f44984A.m196515R2();
        if (isHidden()) {
            return;
        }
        onHiddenChanged(false);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f44986z.inflateView(layoutInflater, viewGroup);
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
        this.f44984A.m167224U2(z);
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
