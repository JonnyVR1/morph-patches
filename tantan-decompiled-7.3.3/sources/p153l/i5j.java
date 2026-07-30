package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.view.RightSideViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public class i5j extends qct<oo2> implements c6m {

    /* JADX INFO: renamed from: i */
    public final ogd0 f113075i;

    public i5j(dum dumVar, ogd0 ogd0Var) {
        super(dumVar);
        this.f113075i = ogd0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: X3 */
    public void m138715X3(JumpRoomData jumpRoomData) {
        if (m213815L2()) {
            o1j0.m165649w(R$string.f48013c7);
        } else {
            if (TextUtils.equals(m213810E2().m202194o(), jumpRoomData.getToRoomId())) {
                o1j0.m165649w(R$string.f47987b3);
                return;
            }
            if (TextUtils.isEmpty(jumpRoomData.getLiveType())) {
                jumpRoomData.setLiveType(m138868o3().m98479b());
            }
            this.f113075i.m167560V0(jumpRoomData);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().FragProxyEvent.jumpRoom().m199270g()).filter(new qcj() { // from class: l.v4j
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((JumpRoomData) obj) != null);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.c5j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79866a.m138715X3((JumpRoomData) obj);
            }
        }));
        duringCreated(m213811F2().FragProxyEvent.initRoomInfo().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.d5j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85158a.m138717Y3((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().FragProxyEvent.changeRoomData().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.e5j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92219a.m138716W3((ugd0) obj);
            }
        }));
        m138860d3(xcd0.class, new qcj() { // from class: l.f5j
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f97228a.m138719a4((xcd0) obj);
            }
        });
        m138860d3(bgd0.class, new qcj() { // from class: l.g5j
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f102333a.m138720b4((bgd0) obj);
            }
        });
        duringCreated(m213811F2().FragProxyEvent.finish().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.h5j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107947a.m138721c4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().FragProxyEvent.switchNextLive().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.w4j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187413a.m138722d4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().FragProxyEvent.clickClose().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.x4j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192415a.m138723e4((vxj0) obj);
            }
        }));
        m138860d3(t35.class, new qcj() { // from class: l.y4j
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f197472a.m138724f4((t35) obj);
            }
        });
        m138860d3(npc0.class, new qcj() { // from class: l.z4j
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f202962a.m138725g4((npc0) obj);
            }
        });
        duringCreated(m213811F2().ClearScreenEvent.addClearScreenCallBack().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.a5j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68613a.m138726h4((RightSideViewGroup.InterfaceC13102c) obj);
            }
        }));
        duringCreated(m213811F2().ClearScreenEvent.removeClearScreenCallBack().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.b5j
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75072a.m138718Z3((RightSideViewGroup.InterfaceC13102c) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: W3 */
    public void m138716W3(ugd0 ugd0Var) {
        m213810E2().mo168476S(ugd0Var);
        this.f113075i.m167582r0(ugd0Var);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m138717Y3(vxj0 vxj0Var) {
        this.f113075i.m167550I0();
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m138718Z3(RightSideViewGroup.InterfaceC13102c interfaceC13102c) {
        this.f113075i.m167587t1(interfaceC13102c);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Boolean m138719a4(xcd0 xcd0Var) {
        return Boolean.valueOf(this.f113075i.m167557R0());
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ agd0 m138720b4(bgd0 bgd0Var) {
        return this.f113075i.m167544E0();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m138721c4(vxj0 vxj0Var) {
        this.f113075i.m167588u0();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m138722d4(vxj0 vxj0Var) {
        this.f113075i.m167584s0();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m138723e4(vxj0 vxj0Var) {
        this.f113075i.m167571h1();
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ Boolean m138724f4(t35 t35Var) {
        return this.f113075i.m167576m1(true).f152156a;
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ String m138725g4(npc0 npc0Var) {
        return this.f113075i.m167540C0();
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m138726h4(RightSideViewGroup.InterfaceC13102c interfaceC13102c) {
        this.f113075i.m167580q0(interfaceC13102c);
    }
}
