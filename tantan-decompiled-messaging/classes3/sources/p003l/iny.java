package p003l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.GPMemo;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.c3c0;
import l.j760;
import l.jq2;
import l.knb0;
import l.lz4;
import l.mcr;
import l.mcz;
import l.mkd0;
import l.mqi0;
import l.s7m;
import l.uly;
import l.ura;
import l.vwb;
import l.xaj0;
import l.y19;
import l.zvf0;
import org.eclipse.jetty.servlet.ServletHandler;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class iny extends uly<kny> {

    /* JADX INFO: renamed from: d */
    public int f4442d;

    /* JADX INFO: renamed from: e */
    public int f4443e;

    /* JADX INFO: renamed from: f */
    public c4g0 f4444f;

    /* JADX INFO: renamed from: g */
    public boolean f4445g;

    public iny(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ Integer m5179a1(xaj0 xaj0Var) {
        return (Integer) ((j760) xaj0Var.b).a;
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m5184B1(String str, GPMemo gPMemo) {
        if (TextUtils.isEmpty(gPMemo.memo)) {
            User userPa = CoreModule.c.e0.Pa(str);
            if (userPa == null || userPa.inactivated) {
                ((kny) ((jq2) this).viewModel).m5713M("");
            } else {
                ((kny) ((jq2) this).viewModel).m5713M(userPa.name);
            }
        } else {
            ((kny) ((jq2) this).viewModel).m5713M(gPMemo.memo);
        }
        User userPa2 = CoreModule.c.e0.Pa(str);
        if (userPa2 == null || !((kny) ((jq2) this).viewModel).m5706F(userPa2)) {
            return;
        }
        ((kny) ((jq2) this).viewModel).m5713M(userPa2.publicId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m5185C1(String str) {
        Conversation conversation = m6497e0().mo2066l().f3551k;
        if (conversation == null || !str.equals(conversation.otherUser)) {
            return;
        }
        this.f4444f = m5200f1();
        if (this.f4445g) {
            return;
        }
        ((kny) ((jq2) this).viewModel).m5711K();
        this.f4445g = true;
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m5186D1(c cVar) {
        if (cVar == c.j) {
            mkd0.z(this.f4444f);
            ((kny) ((jq2) this).viewModel).m5712L();
            this.f4445g = false;
        }
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m5187E1(j760 j760Var) {
        this.f4443e = ((Integer) ((j760) j760Var.b).a).intValue();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m5188F1(j760 j760Var) {
        ((kny) ((jq2) this).viewModel).m5702B(j760Var);
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m5189H1(User user) {
        ((kny) ((jq2) this).viewModel).m5703C(user);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m5190I1(fcz fczVar, View view) {
        if (!CoreModule.P().i().k1() && CoreModule.P().i().z0() && NullChecker.a(fczVar.f3551k) && !fczVar.f3551k.localEverHasMessage && NullChecker.a(fczVar.m4325x6()) && fczVar.m4325x6().onlineMatchLocked() && !m5215r1()) {
            CoreModule.P().i().S();
            CoreModule.P().i().d1(act());
            return;
        }
        if (NullChecker.a(fczVar.f3551k) && CoreModule.P().b().lo(fczVar.f3551k)) {
            CoreModule.P().b().Wl(act());
            return;
        }
        if (y19.M() && r9m.m7149r().m7156q(mqi0.o())) {
            r9m.m7149r().m7155F(act());
            return;
        }
        if (CoreModule.P().a().kb() && lz4.h().n() && fczVar.m4216b4() && !((kny) ((jq2) this).viewModel).m5706F(fczVar.m4318w3(m6497e0().mo2066l().m4295r3()))) {
            lz4.v(act(), lz4.h().f());
        } else {
            act().finish();
        }
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m5191J1(xaj0 xaj0Var) {
        this.f4442d = ((Integer) ((j760) xaj0Var.b).a).intValue();
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m5192L1(xaj0 xaj0Var) {
        ((kny) ((jq2) this).viewModel).m5705E(xaj0Var);
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m5193N1(BubbleInfo bubbleInfo) {
        s7m s7mVar = ((jq2) this).viewModel;
        if (bubbleInfo == null) {
            ((kny) s7mVar).m5722z();
        } else {
            ((kny) s7mVar).m5709I(bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m5194O1(Throwable th) {
        ((kny) ((jq2) this).viewModel).m5722z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m5195P1(final String str, ConversationStatus conversationStatus) {
        if (!m5202h1(conversationStatus)) {
            ((kny) ((jq2) this).viewModel).m5722z();
            return;
        }
        if (CoreModule.P().g().xn() && NullChecker.a(m6497e0().mo2066l()) && NullChecker.a(m6497e0().mo2066l().f3551k) && m6497e0().mo2066l().f3551k.isConfessionFirstConv()) {
            ((kny) ((jq2) this).viewModel).m5708H("https://auto.tancdn.com/v1/images/eyJpZCI6IklTNDI2NFI2R1ZaVEpWWjRWVFJDUTJEVEVQVllZRzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzEyMjQyMzAzNzQ3NTY0Nzc4N30.png");
            return;
        }
        if (CoreModule.o.d().I5() && NullChecker.a(m6497e0().mo2066l()) && NullChecker.a(m6497e0().mo2066l().f3551k) && NullChecker.a(m6497e0().mo2066l().f3551k.additional) && NullChecker.a(m6497e0().mo2066l().f3551k.additional.greetingInfo) && m6497e0().mo2066l().f3551k.additional.greetingInfo.fromGreeting) {
            ((kny) ((jq2) this).viewModel).m5708H("https://auto.tancdn.com/v1/images/eyJpZCI6IklTNDI2NFI2R1ZaVEpWWjRWVFJDUTJEVEVQVllZRzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzEyMjQyMzAzNzQ3NTY0Nzc4N30.png");
            return;
        }
        if (CoreModule.P().a().jj() && NullChecker.a(m6497e0().mo2066l()) && NullChecker.a(m6497e0().mo2066l().f3551k) && m6497e0().mo2066l().f3551k.isConfessionFirstConv()) {
            ((kny) ((jq2) this).viewModel).m5708H("https://auto.tancdn.com/v1/images/eyJpZCI6IklTNDI2NFI2R1ZaVEpWWjRWVFJDUTJEVEVQVllZRzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzEyMjQyMzAzNzQ3NTY0Nzc4N30.png");
        } else {
            duringCreated(new v9j() { // from class: l.vmy
                @Override // p003l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.N().vm(str);
                }
            }).subscribe((m250) mkd0.H(new e30() { // from class: l.wmy
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f8576a.m5193N1((BubbleInfo) obj);
                }
            }, new e30() { // from class: l.xmy
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f8804a.m5194O1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Q1 */
    public void m5196Q1() {
        this.f4445g = false;
    }

    /* JADX INFO: renamed from: R1 */
    public final void m5197R1(String str) {
        if (CoreModule.P().i().x()) {
            Conversation conversationXe = CoreModule.c.f0.Xe(str);
            if (NullChecker.a(conversationXe)) {
                conversationXe.status = ConversationStatus.get(ServletHandler.__DEFAULT_SERVLET);
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m5198a0() {
        super/*l.jq2*/.a0();
        m5203i1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e1 */
    public boolean m5199e1() {
        return m6497e0().mo2066l().m4155P2();
    }

    /* JADX INFO: renamed from: f1 */
    public final c4g0 m5200f1() {
        CoreAssetsSettings coreAssetsSettings = (CoreAssetsSettings) CoreModule.d.g();
        int i = NullChecker.a(coreAssetsSettings) ? coreAssetsSettings.keepConnection.chatTypingInterval : 0;
        mkd0.z(this.f4444f);
        return C1099c.interval(i == 0 ? 12L : i + 2, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m5414a()).subscribe((m250<? super Long>) mkd0.G(new e30() { // from class: l.zmy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9381a.m5217s1((Long) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g1 */
    public final C1099c<j760<Integer, Boolean>> m5201g1(String str) {
        if (m6497e0().mo2066l() instanceof mcz) {
            return C1099c.just(null);
        }
        return CoreModule.P().i().c() ? CoreModule.c.f0.mo(str) : C1099c.just(null);
    }

    /* JADX INFO: renamed from: h1 */
    public final boolean m5202h1(ConversationStatus conversationStatus) {
        return (conversationStatus == null || TEnum.equals(conversationStatus, "dismissed") || TEnum.equals(conversationStatus, "deleted") || TEnum.equals(conversationStatus, "blocked")) ? false : true;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m5203i1() {
        creates(new e30() { // from class: l.fmy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3662a.m5218t1((Bundle) obj);
            }
        });
        m5211o1();
        m5208l1();
        m5204j1();
        m5209m1();
        m5206k1();
        if (CoreModule.N().M8()) {
            m5212p1();
            duringCreated(CoreModule.N().jb()).subscribe((m250) mkd0.G(new e30() { // from class: l.qmy
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6652a.m5219u1((Boolean) obj);
                }
            }));
            duringCreated(CoreModule.N().f9()).subscribe((m250) mkd0.G(new e30() { // from class: l.any
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f2239a.m5220v1((Boolean) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j1 */
    public final void m5204j1() {
        final String strM4295r3 = m6497e0().mo2066l().m4295r3();
        duringCreated(new v9j() { // from class: l.cny
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f2736a.m5222x1(strM4295r3);
            }
        }).subscribe((m250) mkd0.G(new e30() { // from class: l.dny
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3046a.m5223z1((knb0) obj);
            }
        }));
        if (CoreModule.P().i().L5()) {
            duringCreated(new v9j() { // from class: l.eny
                @Override // p003l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.c.e0.La(strM4295r3);
                }
            }).subscribe((m250) mkd0.G(new e30() { // from class: l.fny
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f3663a.m5184B1(strM4295r3, (GPMemo) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public int m5205k0() {
        return this.f4443e;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m5206k1() {
        if (!m5215r1() && CoreModule.P().i().R4()) {
            duringCreated(CoreModule.c.e0.T6()).subscribe((m250) mkd0.G(new e30() { // from class: l.gny
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f3956a.m5185C1((String) obj);
                }
            }));
            lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.hny
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f4236a.m5186D1((c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l0 */
    public int m5207l0() {
        return this.f4442d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l1 */
    public final void m5208l1() {
        if (CoreModule.P().b().Yg()) {
            fcz<? extends DbObject, ?> fczVarMo2066l = m6497e0().mo2066l();
            if (NullChecker.a(fczVarMo2066l)) {
                if (CoreModule.P().b().Wr(fczVarMo2066l.f3551k)) {
                    this.f4443e = 100;
                    return;
                }
                if (CoreModule.P().b().v6(fczVarMo2066l.f3551k)) {
                    final String strM4295r3 = fczVarMo2066l.m4295r3();
                    duringCreated(new v9j() { // from class: l.nmy
                        @Override // p003l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            String str = strM4295r3;
                            return mkd0.r(CoreModule.c.e0.Ka(str), CoreModule.P().b().Da(str), new x9j() { // from class: l.ymy
                                @Override // p003l.x9j
                                public final Object call(Object obj, Object obj2) {
                                    return vwb.Y((User) obj, (j760) obj2);
                                }
                            });
                        }
                    }).filter(new w9j() { // from class: l.omy
                        @Override // p003l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(((User) ((j760) obj).a).isLoveBuzz());
                        }
                    }).doOnNext(new e30() { // from class: l.pmy
                        @Override // p003l.e30
                        public final void call(Object obj) {
                            this.f6465a.m5187E1((j760) obj);
                        }
                    }).subscribe((m250) mkd0.G(new e30() { // from class: l.rmy
                        @Override // p003l.e30
                        public final void call(Object obj) {
                            this.f7001a.m5188F1((j760) obj);
                        }
                    }));
                } else if (CoreModule.P().b().zo(fczVarMo2066l.f3551k)) {
                    this.f4443e = 100;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m1 */
    public final void m5209m1() {
        final String strM4295r3 = m6497e0().mo2066l().m4295r3();
        duringCreated(new v9j() { // from class: l.lmy
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.c.e0.Ka(strM4295r3);
            }
        }).subscribe((m250) mkd0.G(new e30() { // from class: l.mmy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5687a.m5189H1((User) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n1 */
    public void m5210n1() {
        if (CoreModule.P().i().c() || CoreModule.P().b().Yg()) {
            final fcz<? extends DbObject, ?> fczVarMo2066l = m6497e0().mo2066l();
            if (CoreModule.P().a().kb() && fczVarMo2066l.m4251i4()) {
                fczVarMo2066l.m4309t7().m7942m0().setLeftIconResource(ura.e().d().I4() ? c3c0.L3 : c3c0.F1);
            }
            fczVarMo2066l.m4309t7().m7942m0().setLeftIconOnClick(new View.OnClickListener() { // from class: l.bny
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2410a.m5190I1(fczVarMo2066l, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o1 */
    public final void m5211o1() {
        final String strM4295r3 = m6497e0().mo2066l().m4295r3();
        if (!CoreModule.P().i().c() || m5213q1(strM4295r3)) {
            return;
        }
        duringCreated(new v9j() { // from class: l.gmy
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                String str = strM4295r3;
                return mkd0.s(CoreModule.c.e0.Ka(str), CoreModule.c.f0.mo(str), CoreModule.c.f0.Ue(str), new tmy());
            }
        }).filter(new w9j() { // from class: l.hmy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) ((xaj0) obj).a).onlineMatch());
            }
        }).doOnNext(new e30() { // from class: l.imy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4441a.m5191J1((xaj0) obj);
            }
        }).distinctUntilChanged(new w9j() { // from class: l.jmy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return iny.m5179a1((xaj0) obj);
            }
        }).subscribe((m250) mkd0.G(new e30() { // from class: l.kmy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4970a.m5192L1((xaj0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p1 */
    public final void m5212p1() {
        final String strM4295r3 = m6497e0().mo2066l().m4295r3();
        if (((kny) ((jq2) this).viewModel).m5706F(m6497e0().mo2066l().m4318w3(strM4295r3))) {
            return;
        }
        User userM4318w3 = m6497e0().mo2066l().m4318w3(strM4295r3);
        if (NullChecker.a(userM4318w3) && userM4318w3.isTeamAccount()) {
            return;
        }
        duringCreated(CoreModule.K().ab(strM4295r3)).take(1).subscribe((m250) mkd0.G(new e30() { // from class: l.smy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7266a.m5195P1(strM4295r3, (ConversationStatus) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q1 */
    public final boolean m5213q1(String str) {
        Conversation conversationZp = CoreModule.c.f0.zp(str);
        return NullChecker.a(conversationZp) && NullChecker.a(conversationZp.property) && NullChecker.a(conversationZp.property.quickchat) && TextUtils.equals(conversationZp.convType, ServletHandler.__DEFAULT_SERVLET) && TextUtils.equals(conversationZp.property.quickchat.bellType, "male");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r0 */
    public void m5214r0() {
        fcz<? extends DbObject, ?> fczVarMo2066l = m6497e0().mo2066l();
        zvf0.r("e_getback_match", fczVarMo2066l.pageId());
        if (CoreModule.c.C0.K3()) {
            CoreModule.c.f0.Op(((DbObject) fczVarMo2066l.m4255j3()).id);
        } else {
            CoreModule.P().i().y4(act(), "p_unmatch,getback_match", Privilege.recover_unmatches);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r1 */
    public boolean m5215r1() {
        return m6497e0().mo2066l().m4261k4(m6497e0().mo2066l().m4295r3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public void m5216s0() {
        m5197R1(m6497e0().mo2066l().m4295r3());
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m5217s1(Long l2) {
        ((kny) ((jq2) this).viewModel).m5712L();
        this.f4445g = false;
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m5218t1(Bundle bundle) {
        ((kny) ((jq2) this).viewModel).m5721y(this);
        m5210n1();
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m5219u1(Boolean bool) {
        m5212p1();
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m5220v1(Boolean bool) {
        m5212p1();
    }

    /* JADX INFO: renamed from: x0 */
    public void m5221x0(User user) {
        ((kny) ((jq2) this).viewModel).m5710J(user);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ C1099c m5222x1(String str) {
        return mkd0.t(CoreModule.c.e0.Ka(str), C1099c.just(Boolean.FALSE), m5201g1(str), m6497e0().mo2066l().m4174T2(), new z9j() { // from class: l.umy
            @Override // p003l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo6904b(Object obj, Object obj2, Object obj3, Object obj4) {
                return new knb0((User) obj, (Boolean) obj2, (j760) obj3, (Conversation) obj4);
            }
        });
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m5223z1(knb0 knb0Var) {
        ((kny) ((jq2) this).viewModel).m5701A(knb0Var);
    }

    public void destroy() {
    }
}
