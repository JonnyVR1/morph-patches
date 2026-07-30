package com.p000p1.mobile.putong.live.livingroom.archi.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.livingroom.view.RightSideViewGroup;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.ffw;
import l.gkh0;
import l.h4g0;
import l.hu20;
import l.j760;
import l.lsi0;
import l.vwb;
import l.z3g0;
import l.zcu;
import l.zvf0;
import p002l.AbstractC0485a6;
import p002l.g4c;
import p002l.ho2;
import p002l.l8d0;
import p002l.o8d0;
import p002l.o91;
import p002l.x7d0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class RoomFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public o8d0 f3780A;

    /* JADX INFO: renamed from: B */
    public AudienceStartData f3781B;

    /* JADX INFO: renamed from: z */
    public l8d0 f3782z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.frag.RoomFrag$a */
    public class C0201a implements c.a<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f3783a;

        public C0201a(boolean z) {
            this.f3783a = z;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void call(final z3g0<? super Boolean> z3g0Var) {
            final RightSideViewGroup.c cVar = new RightSideViewGroup.c() { // from class: l.n7d0
                /* JADX INFO: renamed from: d */
                public final void m18525d(boolean z) {
                    this.f15853a.m5180d(z3g0Var, z);
                }
            };
            RoomFrag.this.f3780A.m19295e(cVar);
            if (this.f3783a) {
                z3g0Var.onNext(Boolean.valueOf(RoomFrag.this.f3780A.m19304p()));
            }
            z3g0Var.b(h4g0.a(new d30() { // from class: l.o7d0
                public final void call() {
                    this.f16416a.m5181e(cVar);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m5180d(z3g0 z3g0Var, boolean z) {
            RoomFrag.this.act().setFullSlide(!z);
            if (z3g0Var.isUnsubscribed()) {
                return;
            }
            z3g0Var.onNext(Boolean.valueOf(z));
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m5181e(RightSideViewGroup.c cVar) {
            RoomFrag.this.f3780A.m19307u(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m5163E4(com.p1.mobile.android.app.c cVar) {
        if (cVar instanceof com.p1.mobile.android.app.c.a) {
            m5166O4(((com.p1.mobile.android.app.c.c) ((com.p1.mobile.android.app.c.a) cVar)).p);
        }
    }

    /* JADX INFO: renamed from: N4 */
    public static RoomFrag m5165N4(AudienceStartData audienceStartData) {
        RoomFrag roomFrag = new RoomFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LIVE_AUDIENCE_START_DATA", audienceStartData);
        roomFrag.setArguments(bundle);
        return roomFrag;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    private void m5166O4(Bundle bundle) {
        ho2 ho2Var;
        BLiveAbsData bLiveAbsData;
        hu20.o("context_square");
        hu20.o("context_common");
        hu20.o("context_live_activities");
        Bundle arguments = getArguments();
        if (arguments != null) {
            AudienceStartData serializable = arguments.getSerializable("LIVE_AUDIENCE_START_DATA");
            this.f3781B = serializable;
            if (serializable == null || !serializable.fromFW) {
                ho2Var = null;
            } else {
                ho2 ho2VarM13626b = g4c.m13625a().m13626b();
                if (ho2VarM13626b instanceof o91) {
                    ((o91) ho2VarM13626b).mo9889a(true);
                }
                this.f3781B.live = ho2VarM13626b.m17234j();
                ho2Var = ho2VarM13626b;
            }
        } else {
            ho2Var = null;
        }
        if (this.f3781B == null && NullChecker.a(bundle)) {
            this.f3781B = bundle.getSerializable("LIVE_AUDIENCE_START_DATA");
        }
        AudienceStartData audienceStartData = this.f3781B;
        if (audienceStartData == null || (bLiveAbsData = audienceStartData.live) == null) {
            lsi0.n(R$string.f3203c3);
            act().finish();
            return;
        }
        zvf0.D("e_live_room_create", zcu.g(bLiveAbsData, false), new j760[]{vwb.Y("live_id", this.f3781B.live.id), vwb.Y("live_network_type", ConnectivityReceiver.d()), vwb.Y("anchorId", this.f3781B.live.anchor.id), vwb.Y("liveRecommendCategory", this.f3781B.category), vwb.Y("live_outside_source", this.f3781B.source)});
        this.f3782z = new l8d0(this, ho2Var, this.f3781B);
        o8d0 o8d0Var = new o8d0();
        this.f3780A = o8d0Var;
        this.f3782z.C(o8d0Var);
        this.f3782z.m17065H0(act());
    }

    /* JADX INFO: renamed from: P4 */
    public void m5167P4() {
        if (NullChecker.a(this.f3782z)) {
            this.f3782z.m17089j1();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Q4 */
    public BLiveAbsData m5168Q4() {
        if (m5169R4() == null) {
            return null;
        }
        BLiveAbsData bLiveAbsDataM17110z0 = m5169R4().m17110z0();
        AbstractC0485a6 abstractC0485a6M17109y0 = m5169R4().m17109y0();
        return (NullChecker.a(abstractC0485a6M17109y0) && NullChecker.a(abstractC0485a6M17109y0.m25547E2()) && NullChecker.a(abstractC0485a6M17109y0.m25547E2().m17234j())) ? abstractC0485a6M17109y0.m25547E2().m17234j() : bLiveAbsDataM17110z0;
    }

    /* JADX INFO: renamed from: R4 */
    public l8d0 m5169R4() {
        return this.f3782z;
    }

    /* JADX INFO: renamed from: S4 */
    public boolean m5170S4() {
        return this.f3780A.m19304p();
    }

    /* JADX INFO: renamed from: T4 */
    public c<Boolean> m5171T4(boolean z) {
        return c.create(new C0201a(z));
    }

    /* JADX INFO: renamed from: U4 */
    public void m5172U4(x7d0 x7d0Var, String str) {
        this.f3780A.f16430d.m9216z(x7d0Var, str);
    }

    /* JADX INFO: renamed from: V4 */
    public void m5173V4(boolean z, boolean z2) {
        this.f3780A.m19309w(z, z2);
    }

    /* JADX INFO: renamed from: f4 */
    public void m5174f4() {
        super.f4();
        lifecycle().subscribe(ffw.h(new e30() { // from class: l.m7d0
            public final void call(Object obj) {
                this.f15261a.m5163E4((com.p1.mobile.android.app.c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m5175g4(Bundle bundle) {
        o8d0 o8d0Var = this.f3780A;
        if (o8d0Var == null) {
            return;
        }
        o8d0Var.m19303n(act());
        gkh0.j("[live]scroll_view", "room init view finished");
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        o8d0 o8d0Var = this.f3780A;
        if (o8d0Var == null) {
            return new FrameLayout(viewGroup.getContext());
        }
        View viewInflateView = o8d0Var.inflateView(layoutInflater, viewGroup);
        this.f3780A.f16430d.m9209n(this, this.f3782z);
        return viewInflateView;
    }

    /* JADX INFO: renamed from: o */
    public boolean m5176o() {
        if (NullChecker.a(this.f3782z)) {
            return this.f3782z.m17085f1();
        }
        return false;
    }
}
