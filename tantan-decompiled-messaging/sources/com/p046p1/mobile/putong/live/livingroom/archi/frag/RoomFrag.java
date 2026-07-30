package com.p046p1.mobile.putong.live.livingroom.archi.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.p046p1.mobile.putong.live.livingroom.view.RightSideViewGroup;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p149l.AbstractC15533a6;
import p149l.d30;
import p149l.e30;
import p149l.ffw;
import p149l.g4c;
import p149l.gkh0;
import p149l.h4g0;
import p149l.ho2;
import p149l.hu20;
import p149l.l8d0;
import p149l.lsi0;
import p149l.o8d0;
import p149l.o91;
import p149l.vwb;
import p149l.x7d0;
import p149l.z3g0;
import p149l.zcu;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class RoomFrag extends LiveBaseFrag {

    /* JADX INFO: renamed from: A */
    public o8d0 f47738A;

    /* JADX INFO: renamed from: B */
    public AudienceStartData f47739B;

    /* JADX INFO: renamed from: z */
    public l8d0 f47740z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.archi.frag.RoomFrag$a */
    public class C12612a implements C22306c.a<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f47741a;

        public C12612a(boolean z) {
            this.f47741a = z;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void call(final z3g0<? super Boolean> z3g0Var) {
            final RightSideViewGroup.InterfaceC12939c interfaceC12939c = new RightSideViewGroup.InterfaceC12939c() { // from class: l.n7d0
                @Override // com.p046p1.mobile.putong.live.livingroom.view.RightSideViewGroup.InterfaceC12939c
                /* JADX INFO: renamed from: d */
                public final void mo76629d(boolean z) {
                    this.f137499a.m71809d(z3g0Var, z);
                }
            };
            RoomFrag.this.f47738A.m163118e(interfaceC12939c);
            if (this.f47741a) {
                z3g0Var.onNext(Boolean.valueOf(RoomFrag.this.f47738A.m163126p()));
            }
            z3g0Var.m217046b(h4g0.m129240a(new d30() { // from class: l.o7d0
                @Override // p149l.d30
                public final void call() {
                    this.f142485a.m71810e(interfaceC12939c);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m71809d(z3g0 z3g0Var, boolean z) {
            RoomFrag.this.act().setFullSlide(!z);
            if (z3g0Var.isUnsubscribed()) {
                return;
            }
            z3g0Var.onNext(Boolean.valueOf(z));
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m71810e(RightSideViewGroup.InterfaceC12939c interfaceC12939c) {
            RoomFrag.this.f47738A.m163129u(interfaceC12939c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m71794E4(C4319c c4319c) {
        if (c4319c instanceof C4319c.a) {
            m71797O4(((C4319c.a) c4319c).f15559p);
        }
    }

    /* JADX INFO: renamed from: N4 */
    public static RoomFrag m71796N4(AudienceStartData audienceStartData) {
        RoomFrag roomFrag = new RoomFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable(AudienceStartData.LIVE_AUDIENCE_START_DATA, audienceStartData);
        roomFrag.setArguments(bundle);
        return roomFrag;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0041  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    private void m71797O4(Bundle bundle) {
        ho2 ho2Var;
        BLiveAbsData bLiveAbsData;
        hu20.m132969o("context_square");
        hu20.m132969o("context_common");
        hu20.m132969o("context_live_activities");
        Bundle arguments = getArguments();
        if (arguments != null) {
            AudienceStartData audienceStartData = (AudienceStartData) arguments.getSerializable(AudienceStartData.LIVE_AUDIENCE_START_DATA);
            this.f47739B = audienceStartData;
            if (audienceStartData == null || !audienceStartData.fromFW) {
                ho2Var = null;
            } else {
                ho2 ho2VarM124361b = g4c.m124360a().m124361b();
                if (ho2VarM124361b instanceof o91) {
                    ((o91) ho2VarM124361b).mo97486a(true);
                }
                this.f47739B.live = ho2VarM124361b.mo149813j();
                ho2Var = ho2VarM124361b;
            }
        } else {
            ho2Var = null;
        }
        if (this.f47739B == null && NullChecker.m81303a(bundle)) {
            this.f47739B = (AudienceStartData) bundle.getSerializable(AudienceStartData.LIVE_AUDIENCE_START_DATA);
        }
        AudienceStartData audienceStartData2 = this.f47739B;
        if (audienceStartData2 == null || (bLiveAbsData = audienceStartData2.live) == null) {
            lsi0.m151584n(R$string.f47161c3);
            act().m50458m2();
            return;
        }
        zvf0.m220371D("e_live_room_create", zcu.m218092g(bLiveAbsData, false), vwb.m200311Y("live_id", this.f47739B.live.f44323id), vwb.m200311Y("live_network_type", ConnectivityReceiver.m81281d()), vwb.m200311Y("anchorId", this.f47739B.live.anchor.f44419id), vwb.m200311Y("liveRecommendCategory", this.f47739B.category), vwb.m200311Y("live_outside_source", this.f47739B.source));
        this.f47740z = new l8d0(this, ho2Var, this.f47739B);
        o8d0 o8d0Var = new o8d0();
        this.f47738A = o8d0Var;
        this.f47740z.mo51532C(o8d0Var);
        this.f47740z.m148874H0(act());
    }

    /* JADX INFO: renamed from: P4 */
    public void m71798P4() {
        if (NullChecker.m81303a(this.f47740z)) {
            this.f47740z.m148898j1();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: Q4 */
    public BLiveAbsData m71799Q4() {
        if (m71800R4() == null) {
            return null;
        }
        BLiveAbsData bLiveAbsDataM148919z0 = m71800R4().m148919z0();
        AbstractC15533a6 abstractC15533a6M148918y0 = m71800R4().m148918y0();
        return (NullChecker.m81303a(abstractC15533a6M148918y0) && NullChecker.m81303a(abstractC15533a6M148918y0.m206027E2()) && NullChecker.m81303a(abstractC15533a6M148918y0.m206027E2().mo149813j())) ? abstractC15533a6M148918y0.m206027E2().mo149813j() : bLiveAbsDataM148919z0;
    }

    /* JADX INFO: renamed from: R4 */
    public l8d0 m71800R4() {
        return this.f47740z;
    }

    /* JADX INFO: renamed from: S4 */
    public boolean m71801S4() {
        return this.f47738A.m163126p();
    }

    /* JADX INFO: renamed from: T4 */
    public C22306c<Boolean> m71802T4(boolean z) {
        return C22306c.create(new C12612a(z));
    }

    /* JADX INFO: renamed from: U4 */
    public void m71803U4(x7d0 x7d0Var, String str) {
        this.f47738A.f142614d.m75577z(x7d0Var, str);
    }

    /* JADX INFO: renamed from: V4 */
    public void m71804V4(boolean z, boolean z2) {
        this.f47738A.m163131w(z, z2);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        lifecycle().subscribe(ffw.m121197h(new e30() { // from class: l.m7d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131820a.m71794E4((C4319c) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        o8d0 o8d0Var = this.f47738A;
        if (o8d0Var == null) {
            return;
        }
        o8d0Var.m163125n(act());
        gkh0.m126627j("[live]scroll_view", "room init view finished");
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        o8d0 o8d0Var = this.f47738A;
        if (o8d0Var == null) {
            return new FrameLayout(viewGroup.getContext());
        }
        View viewInflateView = o8d0Var.inflateView(layoutInflater, viewGroup);
        this.f47738A.f142614d.m75570n(this, this.f47740z);
        return viewInflateView;
    }

    /* JADX INFO: renamed from: o */
    public boolean m71805o() {
        if (NullChecker.m81303a(this.f47740z)) {
            return this.f47740z.m148894f1();
        }
        return false;
    }
}
