package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p1.mobile.putong.live.livingroom.view.RightSideViewGroup;
import l.e30;
import l.ffw;
import l.l3m;
import l.lsi0;
import l.r8d0;
import l.soj0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class n2j extends pat<ho2> implements l3m {

    /* JADX INFO: renamed from: i */
    public final l8d0 f15798i;

    public n2j(bsm bsmVar, l8d0 l8d0Var) {
        super(bsmVar);
        this.f15798i = l8d0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: X3 */
    public void m18458X3(JumpRoomData jumpRoomData) {
        if (m25552L2()) {
            lsi0.w(R$string.f3207c7);
        } else {
            if (TextUtils.equals(m25547E2().m17239o(), jumpRoomData.getToRoomId())) {
                lsi0.w(R$string.f3181b3);
                return;
            }
            if (TextUtils.isEmpty(jumpRoomData.getLiveType())) {
                jumpRoomData.setLiveType(m14196o3().m27366b());
            }
            this.f15798i.m17076V0(jumpRoomData);
        }
    }

    /* JADX INFO: renamed from: T */
    public void m18459T() {
        super.T();
        duringCreated((c) m25548F2().FragProxyEvent.jumpRoom().g()).filter(new w9j() { // from class: l.a2j
            public final Object call(Object obj) {
                return Boolean.valueOf(((JumpRoomData) obj) != null);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.h2j
            public final void call(Object obj) {
                this.f11857a.m18458X3((JumpRoomData) obj);
            }
        }));
        duringCreated((c) m25548F2().FragProxyEvent.initRoomInfo().g()).subscribe(ffw.d(new e30() { // from class: l.i2j
            public final void call(Object obj) {
                this.f12408a.m18461Y3((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().FragProxyEvent.changeRoomData().g()).subscribe(ffw.d(new e30() { // from class: l.j2j
            public final void call(Object obj) {
                this.f13538a.m18460W3((r8d0) obj);
            }
        }));
        m14188d3(u4d0.class, new w9j() { // from class: l.k2j
            public final Object call(Object obj) {
                return this.f14178a.m18463a4((u4d0) obj);
            }
        });
        m14188d3(y7d0.class, new w9j() { // from class: l.l2j
            public final Object call(Object obj) {
                return this.f14658a.m18464b4((y7d0) obj);
            }
        });
        duringCreated((c) m25548F2().FragProxyEvent.finish().g()).subscribe(ffw.d(new e30() { // from class: l.m2j
            public final void call(Object obj) {
                this.f15220a.m18465c4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().FragProxyEvent.switchNextLive().g()).subscribe(ffw.h(new e30() { // from class: l.b2j
            public final void call(Object obj) {
                this.f7970a.m18466d4((soj0) obj);
            }
        }));
        duringCreated((c) m25548F2().FragProxyEvent.clickClose().g()).subscribe(ffw.h(new e30() { // from class: l.c2j
            public final void call(Object obj) {
                this.f8468a.m18467e4((soj0) obj);
            }
        }));
        m14188d3(t25.class, new w9j() { // from class: l.d2j
            public final Object call(Object obj) {
                return this.f9048a.m18468f4((t25) obj);
            }
        });
        m14188d3(ghc0.class, new w9j() { // from class: l.e2j
            public final Object call(Object obj) {
                return this.f9556a.m18469g4((ghc0) obj);
            }
        });
        duringCreated((c) m25548F2().ClearScreenEvent.addClearScreenCallBack().g()).subscribe(ffw.h(new e30() { // from class: l.f2j
            public final void call(Object obj) {
                this.f10109a.m18470h4((RightSideViewGroup.c) obj);
            }
        }));
        duringCreated((c) m25548F2().ClearScreenEvent.removeClearScreenCallBack().g()).subscribe(ffw.h(new e30() { // from class: l.g2j
            public final void call(Object obj) {
                this.f10735a.m18462Z3((RightSideViewGroup.c) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: W3 */
    public void m18460W3(r8d0 r8d0Var) {
        m25547E2().m14526S(r8d0Var);
        this.f15798i.m17098r0(r8d0Var);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m18461Y3(soj0 soj0Var) {
        this.f15798i.m17066I0();
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m18462Z3(RightSideViewGroup.c cVar) {
        this.f15798i.m17103t1(cVar);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Boolean m18463a4(u4d0 u4d0Var) {
        return Boolean.valueOf(this.f15798i.m17073R0());
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ x7d0 m18464b4(y7d0 y7d0Var) {
        return this.f15798i.m17060E0();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m18465c4(soj0 soj0Var) {
        this.f15798i.m17104u0();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m18466d4(soj0 soj0Var) {
        this.f15798i.m17100s0();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m18467e4(soj0 soj0Var) {
        this.f15798i.m17087h1();
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ Boolean m18468f4(t25 t25Var) {
        return (Boolean) this.f15798i.m17092m1(true).a;
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ String m18469g4(ghc0 ghc0Var) {
        return this.f15798i.m17056C0();
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m18470h4(RightSideViewGroup.c cVar) {
        this.f15798i.m17096q0(cVar);
    }
}
