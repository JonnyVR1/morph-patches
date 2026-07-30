package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.view.RightSideViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public class n2j extends pat<ho2> implements l3m {

    /* JADX INFO: renamed from: i */
    public final l8d0 f136838i;

    public n2j(bsm bsmVar, l8d0 l8d0Var) {
        super(bsmVar);
        this.f136838i = l8d0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: X3 */
    public void m157653X3(JumpRoomData jumpRoomData) {
        if (m206032L2()) {
            lsi0.m151593w(R$string.f47165c7);
        } else {
            if (TextUtils.equals(m206027E2().m149818o(), jumpRoomData.getToRoomId())) {
                lsi0.m151593w(R$string.f47139b3);
                return;
            }
            if (TextUtils.isEmpty(jumpRoomData.getLiveType())) {
                jumpRoomData.setLiveType(m129309o3().m218715b());
            }
            this.f136838i.m148885V0(jumpRoomData);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().FragProxyEvent.jumpRoom().m172460g()).filter(new w9j() { // from class: l.a2j
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((JumpRoomData) obj) != null);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.h2j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105536a.m157653X3((JumpRoomData) obj);
            }
        }));
        duringCreated(m206028F2().FragProxyEvent.initRoomInfo().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.i2j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110556a.m157655Y3((soj0) obj);
            }
        }));
        duringCreated(m206028F2().FragProxyEvent.changeRoomData().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.j2j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115930a.m157654W3((r8d0) obj);
            }
        }));
        m129301d3(u4d0.class, new w9j() { // from class: l.k2j
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f120738a.m157657a4((u4d0) obj);
            }
        });
        m129301d3(y7d0.class, new w9j() { // from class: l.l2j
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f125791a.m157658b4((y7d0) obj);
            }
        });
        duringCreated(m206028F2().FragProxyEvent.finish().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.m2j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130928a.m157659c4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().FragProxyEvent.switchNextLive().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.b2j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72704a.m157660d4((soj0) obj);
            }
        }));
        duringCreated(m206028F2().FragProxyEvent.clickClose().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.c2j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78364a.m157661e4((soj0) obj);
            }
        }));
        m129301d3(t25.class, new w9j() { // from class: l.d2j
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f83412a.m157662f4((t25) obj);
            }
        });
        m129301d3(ghc0.class, new w9j() { // from class: l.e2j
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88925a.m157663g4((ghc0) obj);
            }
        });
        duringCreated(m206028F2().ClearScreenEvent.addClearScreenCallBack().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.f2j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94186a.m157664h4((RightSideViewGroup.InterfaceC12939c) obj);
            }
        }));
        duringCreated(m206028F2().ClearScreenEvent.removeClearScreenCallBack().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.g2j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100271a.m157656Z3((RightSideViewGroup.InterfaceC12939c) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: W3 */
    public void m157654W3(r8d0 r8d0Var) {
        m206027E2().mo132090S(r8d0Var);
        this.f136838i.m148907r0(r8d0Var);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m157655Y3(soj0 soj0Var) {
        this.f136838i.m148875I0();
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m157656Z3(RightSideViewGroup.InterfaceC12939c interfaceC12939c) {
        this.f136838i.m148912t1(interfaceC12939c);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Boolean m157657a4(u4d0 u4d0Var) {
        return Boolean.valueOf(this.f136838i.m148882R0());
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ x7d0 m157658b4(y7d0 y7d0Var) {
        return this.f136838i.m148869E0();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m157659c4(soj0 soj0Var) {
        this.f136838i.m148913u0();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m157660d4(soj0 soj0Var) {
        this.f136838i.m148909s0();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m157661e4(soj0 soj0Var) {
        this.f136838i.m148896h1();
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ Boolean m157662f4(t25 t25Var) {
        return this.f136838i.m148901m1(true).f116564a;
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ String m157663g4(ghc0 ghc0Var) {
        return this.f136838i.m148865C0();
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m157664h4(RightSideViewGroup.InterfaceC12939c interfaceC12939c) {
        this.f136838i.m148905q0(interfaceC12939c);
    }
}
