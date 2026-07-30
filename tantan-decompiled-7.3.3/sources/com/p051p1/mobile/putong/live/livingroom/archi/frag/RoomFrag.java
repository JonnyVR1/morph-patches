package com.p051p1.mobile.putong.live.livingroom.archi.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.p051p1.mobile.putong.live.livingroom.view.RightSideViewGroup;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p153l.AbstractC21253x5;
import p153l.afu;
import p153l.agd0;
import p153l.dhw;
import p153l.gcg0;
import p153l.i4g0;
import p153l.jyb;
import p153l.nsh0;
import p153l.o1j0;
import p153l.o5c;
import p153l.ogd0;
import p153l.oo2;
import p153l.pcg0;
import p153l.r230;
import p153l.rgd0;
import p153l.v91;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class RoomFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public rgd0 f48586A;

    /* JADX INFO: renamed from: B */
    public AudienceStartData f48587B;

    /* JADX INFO: renamed from: z */
    public ogd0 f48588z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.frag.RoomFrag$a */
    public class C12775a implements C22421c.a<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f48589a;

        public C12775a(boolean z) {
            this.f48589a = z;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void call(final gcg0<? super Boolean> gcg0Var) {
            final RightSideViewGroup.InterfaceC13102c interfaceC13102c = new RightSideViewGroup.InterfaceC13102c() { // from class: l.qfd0
                @Override // com.p051p1.mobile.putong.live.livingroom.view.RightSideViewGroup.InterfaceC13102c
                /* JADX INFO: renamed from: d */
                public final void mo77812d(boolean z) {
                    this.f157296a.m72992d(gcg0Var, z);
                }
            };
            RoomFrag.this.f48586A.m181410e(interfaceC13102c);
            if (this.f48589a) {
                gcg0Var.onNext(Boolean.valueOf(RoomFrag.this.f48586A.m181418p()));
            }
            gcg0Var.m129866b(pcg0.m171648a(new x20() { // from class: l.rfd0
                @Override // p153l.x20
                public final void call() {
                    this.f162777a.m72993e(interfaceC13102c);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m72992d(gcg0 gcg0Var, boolean z) {
            RoomFrag.this.act().setFullSlide(!z);
            if (gcg0Var.isUnsubscribed()) {
                return;
            }
            gcg0Var.onNext(Boolean.valueOf(z));
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m72993e(RightSideViewGroup.InterfaceC13102c interfaceC13102c) {
            RoomFrag.this.f48586A.m181421u(interfaceC13102c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m72977E4(C4470c c4470c) {
        if (c4470c instanceof C4470c.a) {
            m72980O4(((C4470c.a) c4470c).f16278p);
        }
    }

    /* JADX INFO: renamed from: N4 */
    public static RoomFrag m72979N4(AudienceStartData audienceStartData) {
        RoomFrag roomFrag = new RoomFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable(AudienceStartData.LIVE_AUDIENCE_START_DATA, audienceStartData);
        roomFrag.setArguments(bundle);
        return roomFrag;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    private void m72980O4(Bundle bundle) {
        oo2 oo2Var;
        BLiveAbsData bLiveAbsData;
        r230.m179474o("context_square");
        r230.m179474o("context_common");
        r230.m179474o("context_live_activities");
        Bundle arguments = getArguments();
        if (arguments != null) {
            AudienceStartData audienceStartData = (AudienceStartData) arguments.getSerializable(AudienceStartData.LIVE_AUDIENCE_START_DATA);
            this.f48587B = audienceStartData;
            if (audienceStartData == null || !audienceStartData.fromFW) {
                oo2Var = null;
            } else {
                oo2 oo2VarM166096b = o5c.m166095a().m166096b();
                if (oo2VarM166096b instanceof v91) {
                    ((v91) oo2VarM166096b).mo146606a(true);
                }
                this.f48587B.live = oo2VarM166096b.mo183435j();
                oo2Var = oo2VarM166096b;
            }
        } else {
            oo2Var = null;
        }
        if (this.f48587B == null && NullChecker.m82486a(bundle)) {
            this.f48587B = (AudienceStartData) bundle.getSerializable(AudienceStartData.LIVE_AUDIENCE_START_DATA);
        }
        AudienceStartData audienceStartData2 = this.f48587B;
        if (audienceStartData2 == null || (bLiveAbsData = audienceStartData2.live) == null) {
            o1j0.m165640n(R$string.f48009c3);
            act().m51642n2();
            return;
        }
        i4g0.m138495D("e_live_room_create", afu.m97558g(bLiveAbsData, false), jyb.m147494Y("live_id", this.f48587B.live.f45171id), jyb.m147494Y("live_network_type", ConnectivityReceiver.m82464d()), jyb.m147494Y("anchorId", this.f48587B.live.anchor.f45267id), jyb.m147494Y("liveRecommendCategory", this.f48587B.category), jyb.m147494Y("live_outside_source", this.f48587B.source));
        this.f48588z = new ogd0(this, oo2Var, this.f48587B);
        rgd0 rgd0Var = new rgd0();
        this.f48586A = rgd0Var;
        this.f48588z.mo52715C(rgd0Var);
        this.f48588z.m167549H0(act());
    }

    /* JADX INFO: renamed from: P4 */
    public void m72981P4() {
        if (NullChecker.m82486a(this.f48588z)) {
            this.f48588z.m167573j1();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: Q4 */
    public BLiveAbsData m72982Q4() {
        if (m72983R4() == null) {
            return null;
        }
        BLiveAbsData bLiveAbsDataM167594z0 = m72983R4().m167594z0();
        AbstractC21253x5 abstractC21253x5M167593y0 = m72983R4().m167593y0();
        return (NullChecker.m82486a(abstractC21253x5M167593y0) && NullChecker.m82486a(abstractC21253x5M167593y0.m213810E2()) && NullChecker.m82486a(abstractC21253x5M167593y0.m213810E2().mo183435j())) ? abstractC21253x5M167593y0.m213810E2().mo183435j() : bLiveAbsDataM167594z0;
    }

    /* JADX INFO: renamed from: R4 */
    public ogd0 m72983R4() {
        return this.f48588z;
    }

    /* JADX INFO: renamed from: S4 */
    public boolean m72984S4() {
        return this.f48586A.m181418p();
    }

    /* JADX INFO: renamed from: T4 */
    public C22421c<Boolean> m72985T4(boolean z) {
        return C22421c.create(new C12775a(z));
    }

    /* JADX INFO: renamed from: U4 */
    public void m72986U4(agd0 agd0Var, String str) {
        this.f48586A.f162996d.m76760z(agd0Var, str);
    }

    /* JADX INFO: renamed from: V4 */
    public void m72987V4(boolean z, boolean z2) {
        this.f48586A.m181423w(z, z2);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        lifecycle().subscribe(dhw.m115829h(new y20() { // from class: l.pfd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152170a.m72977E4((C4470c) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        rgd0 rgd0Var = this.f48586A;
        if (rgd0Var == null) {
            return;
        }
        rgd0Var.m181417n(act());
        nsh0.m164608j("[live]scroll_view", "room init view finished");
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        rgd0 rgd0Var = this.f48586A;
        if (rgd0Var == null) {
            return new FrameLayout(viewGroup.getContext());
        }
        View viewInflateView = rgd0Var.inflateView(layoutInflater, viewGroup);
        this.f48586A.f162996d.m76753n(this, this.f48588z);
        return viewInflateView;
    }

    /* JADX INFO: renamed from: o */
    public boolean m72988o() {
        if (NullChecker.m82486a(this.f48588z)) {
            return this.f48588z.m167569f1();
        }
        return false;
    }
}
