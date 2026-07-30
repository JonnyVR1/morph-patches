package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.GPMemo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class iny extends uly<kny> {

    /* JADX INFO: renamed from: d */
    public int f114071d;

    /* JADX INFO: renamed from: e */
    public int f114072e;

    /* JADX INFO: renamed from: f */
    public c4g0 f114073f;

    /* JADX INFO: renamed from: g */
    public boolean f114074g;

    public iny(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ Integer m137208a1(xaj0 xaj0Var) {
        return (Integer) ((j760) xaj0Var.f191752b).f116564a;
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m137213B1(String str, GPMemo gPMemo) {
        if (TextUtils.isEmpty(gPMemo.memo)) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
            if (userM169430Pa == null || userM169430Pa.inactivated) {
                ((kny) this.viewModel).m146631M("");
            } else {
                ((kny) this.viewModel).m146631M(userM169430Pa.name);
            }
        } else {
            ((kny) this.viewModel).m146631M(gPMemo.memo);
        }
        User userM169430Pa2 = CoreModule.f17545c.f19639e0.m169430Pa(str);
        if (userM169430Pa2 == null || !((kny) this.viewModel).m146624F(userM169430Pa2)) {
            return;
        }
        ((kny) this.viewModel).m146631M(userM169430Pa2.publicId);
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m137214C1(String str) {
        Conversation conversation = m156455e0().mo48974l().f96919k;
        if (conversation == null || !str.equals(conversation.otherUser)) {
            return;
        }
        this.f114073f = m137228f1();
        if (this.f114074g) {
            return;
        }
        ((kny) this.viewModel).m146629K();
        this.f114074g = true;
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m137215D1(C4319c c4319c) {
        if (c4319c == C4319c.f15549j) {
            mkd0.m154992z(this.f114073f);
            ((kny) this.viewModel).m146630L();
            this.f114074g = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m137216E1(j760 j760Var) {
        this.f114072e = ((Integer) ((j760) j760Var.f116565b).f116564a).intValue();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m137217F1(j760 j760Var) {
        ((kny) this.viewModel).m146621B(j760Var);
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m137218H1(User user) {
        ((kny) this.viewModel).m146622C(user);
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m137219I1(fcz fczVar, View view) {
        if (!CoreModule.m29935P().m94658i().mo158400k1() && CoreModule.m29935P().m94658i().mo158479z0() && NullChecker.m81303a(fczVar.f96919k) && !fczVar.f96919k.localEverHasMessage && NullChecker.m81303a(fczVar.mo120858x6()) && fczVar.mo120858x6().onlineMatchLocked() && !m137243r1()) {
            CoreModule.m29935P().m94658i().mo158298S();
            CoreModule.m29935P().m94658i().mo158362d1(act());
            return;
        }
        if (NullChecker.m81303a(fczVar.f96919k) && CoreModule.m29935P().m94652b().mo35118lo(fczVar.f96919k)) {
            CoreModule.m29935P().m94652b().mo35104Wl(act());
            return;
        }
        if (y19.m212153M() && r9m.m178395r().m178402q(mqi0.m155944o())) {
            r9m.m178395r().m178401F(act());
            return;
        }
        if (CoreModule.m29935P().m94651a().mo33531kb() && lz4.m152319h().m152331n() && fczVar.m120749b4() && !((kny) this.viewModel).m146624F(fczVar.m120851w3(m156455e0().mo48974l().mo120828r3()))) {
            lz4.m152321v(act(), lz4.m152319h().m152324f());
        } else {
            act().m66873d2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m137220J1(xaj0 xaj0Var) {
        this.f114071d = ((Integer) ((j760) xaj0Var.f191752b).f116564a).intValue();
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m137221L1(xaj0 xaj0Var) {
        ((kny) this.viewModel).m146623E(xaj0Var);
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m137222N1(BubbleInfo bubbleInfo) {
        V v2 = this.viewModel;
        if (bubbleInfo == null) {
            ((kny) v2).m146639z();
        } else {
            ((kny) v2).m146627I(bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m137223O1(Throwable th) {
        ((kny) this.viewModel).m146639z();
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m137224P1(final String str, ConversationStatus conversationStatus) {
        if (!m137230h1(conversationStatus)) {
            ((kny) this.viewModel).m146639z();
            return;
        }
        if (CoreModule.m29935P().m94656g().mo35085xn() && NullChecker.m81303a(m156455e0().mo48974l()) && NullChecker.m81303a(m156455e0().mo48974l().f96919k) && m156455e0().mo48974l().f96919k.isConfessionFirstConv()) {
            ((kny) this.viewModel).m146626H("https://auto.tancdn.com/v1/images/eyJpZCI6IklTNDI2NFI2R1ZaVEpWWjRWVFJDUTJEVEVQVllZRzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzEyMjQyMzAzNzQ3NTY0Nzc4N30.png");
            return;
        }
        if (CoreModule.f17557o.m195057d().mo33700I5() && NullChecker.m81303a(m156455e0().mo48974l()) && NullChecker.m81303a(m156455e0().mo48974l().f96919k) && NullChecker.m81303a(m156455e0().mo48974l().f96919k.additional) && NullChecker.m81303a(m156455e0().mo48974l().f96919k.additional.greetingInfo) && m156455e0().mo48974l().f96919k.additional.greetingInfo.fromGreeting) {
            ((kny) this.viewModel).m146626H("https://auto.tancdn.com/v1/images/eyJpZCI6IklTNDI2NFI2R1ZaVEpWWjRWVFJDUTJEVEVQVllZRzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzEyMjQyMzAzNzQ3NTY0Nzc4N30.png");
            return;
        }
        if (CoreModule.m29935P().m94651a().mo33526jj() && NullChecker.m81303a(m156455e0().mo48974l()) && NullChecker.m81303a(m156455e0().mo48974l().f96919k) && m156455e0().mo48974l().f96919k.isConfessionFirstConv()) {
            ((kny) this.viewModel).m146626H("https://auto.tancdn.com/v1/images/eyJpZCI6IklTNDI2NFI2R1ZaVEpWWjRWVFJDUTJEVEVQVllZRzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzEyMjQyMzAzNzQ3NTY0Nzc4N30.png");
        } else {
            duringCreated(new v9j() { // from class: l.vmy
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.m29934N().mo60400vm(str);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.wmy
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f187189a.m137222N1((BubbleInfo) obj);
                }
            }, new e30() { // from class: l.xmy
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f193625a.m137223O1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Q1 */
    public void m137225Q1() {
        this.f114074g = false;
    }

    /* JADX INFO: renamed from: R1 */
    public final void m137226R1(String str) {
        if (CoreModule.m29935P().m94658i().mo158465x()) {
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(str);
            if (NullChecker.m81303a(conversationM32856Xe)) {
                conversationM32856Xe.status = ConversationStatus.get("default");
            }
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m137231i1();
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m137227e1() {
        return m156455e0().mo48974l().m120690P2();
    }

    /* JADX INFO: renamed from: f1 */
    public final c4g0 m137228f1() {
        CoreAssetsSettings coreAssetsSettingsM95177g = CoreModule.f17546d.m95177g();
        int i = NullChecker.m81303a(coreAssetsSettingsM95177g) ? coreAssetsSettingsM95177g.keepConnection.chatTypingInterval : 0;
        mkd0.m154992z(this.f114073f);
        return C22306c.interval(i == 0 ? 12L : i + 2, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.zmy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203906a.m137245s1((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g1 */
    public final C22306c<j760<Integer, Boolean>> m137229g1(String str) {
        if (m156455e0().mo48974l() instanceof mcz) {
            return C22306c.just(null);
        }
        return CoreModule.m29935P().m94658i().mo158354c() ? CoreModule.f17545c.f19642f0.m33048mo(str) : C22306c.just(null);
    }

    /* JADX INFO: renamed from: h1 */
    public final boolean m137230h1(ConversationStatus conversationStatus) {
        return (conversationStatus == null || TEnum.equals(conversationStatus, "dismissed") || TEnum.equals(conversationStatus, "deleted") || TEnum.equals(conversationStatus, "blocked")) ? false : true;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m137231i1() {
        creates(new e30() { // from class: l.fmy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98389a.m137246t1((Bundle) obj);
            }
        });
        m137239o1();
        m137236l1();
        m137232j1();
        m137237m1();
        m137234k1();
        if (CoreModule.m29934N().mo60294M8()) {
            m137240p1();
            duringCreated(CoreModule.m29934N().mo60362jb()).subscribe(mkd0.m154955G(new e30() { // from class: l.qmy
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f155365a.m137247u1((Boolean) obj);
                }
            }));
            duringCreated(CoreModule.m29934N().mo60351f9()).subscribe(mkd0.m154955G(new e30() { // from class: l.any
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f70774a.m137248v1((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final void m137232j1() {
        final String strMo120828r3 = m156455e0().mo48974l().mo120828r3();
        duringCreated(new v9j() { // from class: l.cny
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f81697a.m137250x1(strMo120828r3);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.dny
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87112a.m137251z1((knb0) obj);
            }
        }));
        if (CoreModule.m29935P().m94658i().mo158265L5()) {
            duringCreated(new v9j() { // from class: l.eny
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.f17545c.f19639e0.m169414La(strMo120828r3);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.fny
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f98483a.m137213B1(strMo120828r3, (GPMemo) obj);
                }
            }));
        }
    }

    @Override // p149l.uly
    /* JADX INFO: renamed from: k0 */
    public int mo137233k0() {
        return this.f114072e;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m137234k1() {
        if (!m137243r1() && CoreModule.m29935P().m94658i().mo158296R4()) {
            duringCreated(CoreModule.f17545c.f19639e0.m169442T6()).subscribe(mkd0.m154955G(new e30() { // from class: l.gny
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f103636a.m137214C1((String) obj);
                }
            }));
            lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.hny
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f108732a.m137215D1((C4319c) obj);
                }
            }));
        }
    }

    @Override // p149l.uly
    /* JADX INFO: renamed from: l0 */
    public int mo137235l0() {
        return this.f114071d;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m137236l1() {
        if (CoreModule.m29935P().m94652b().mo35107Yg()) {
            fcz<? extends DbObject, ?> fczVarMo48974l = m156455e0().mo48974l();
            if (NullChecker.m81303a(fczVarMo48974l)) {
                if (CoreModule.m29935P().m94652b().mo35105Wr(fczVarMo48974l.f96919k)) {
                    this.f114072e = 100;
                    return;
                }
                if (CoreModule.m29935P().m94652b().mo35126v6(fczVarMo48974l.f96919k)) {
                    final String strMo120828r3 = fczVarMo48974l.mo120828r3();
                    duringCreated(new v9j() { // from class: l.nmy
                        @Override // p149l.v9j, java.util.concurrent.Callable
                        public final Object call() {
                            String str = strMo120828r3;
                            return mkd0.m154984r(CoreModule.f17545c.f19639e0.m169410Ka(str), CoreModule.m29935P().m94652b().mo35093Da(str), new x9j() { // from class: l.ymy
                                @Override // p149l.x9j
                                public final Object call(Object obj, Object obj2) {
                                    return vwb.m200311Y((User) obj, (j760) obj2);
                                }
                            });
                        }
                    }).filter(new w9j() { // from class: l.omy
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(((User) ((j760) obj).f116564a).isLoveBuzz());
                        }
                    }).doOnNext(new e30() { // from class: l.pmy
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f150314a.m137216E1((j760) obj);
                        }
                    }).subscribe(mkd0.m154955G(new e30() { // from class: l.rmy
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f160221a.m137217F1((j760) obj);
                        }
                    }));
                } else if (CoreModule.m29935P().m94652b().mo35133zo(fczVarMo48974l.f96919k)) {
                    this.f114072e = 100;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final void m137237m1() {
        final String strMo120828r3 = m156455e0().mo48974l().mo120828r3();
        duringCreated(new v9j() { // from class: l.lmy
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f17545c.f19639e0.m169410Ka(strMo120828r3);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.mmy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134722a.m137218H1((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n1 */
    public void m137238n1() {
        if (CoreModule.m29935P().m94658i().mo158354c() || CoreModule.m29935P().m94652b().mo35107Yg()) {
            final fcz<? extends DbObject, ?> fczVarMo48974l = m156455e0().mo48974l();
            if (CoreModule.m29935P().m94651a().mo33531kb() && fczVarMo48974l.m120784i4()) {
                fczVarMo48974l.m120842t7().m190316m0().setLeftIconResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78570L3 : c3c0.f78514F1);
            }
            fczVarMo48974l.m120842t7().m190316m0().setLeftIconOnClick(new View.OnClickListener() { // from class: l.bny
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f76458a.m137219I1(fczVarMo48974l, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m137239o1() {
        final String strMo120828r3 = m156455e0().mo48974l().mo120828r3();
        if (!CoreModule.m29935P().m94658i().mo158354c() || m137241q1(strMo120828r3)) {
            return;
        }
        duringCreated(new v9j() { // from class: l.gmy
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                String str = strMo120828r3;
                return mkd0.m154985s(CoreModule.f17545c.f19639e0.m169410Ka(str), CoreModule.f17545c.f19642f0.m33048mo(str), CoreModule.f17545c.f19642f0.m32820Ue(str), new tmy());
            }
        }).filter(new w9j() { // from class: l.hmy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) ((xaj0) obj).f191751a).onlineMatch());
            }
        }).doOnNext(new e30() { // from class: l.imy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113978a.m137220J1((xaj0) obj);
            }
        }).distinctUntilChanged(new w9j() { // from class: l.jmy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return iny.m137208a1((xaj0) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.kmy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123847a.m137221L1((xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p1 */
    public final void m137240p1() {
        final String strMo120828r3 = m156455e0().mo48974l().mo120828r3();
        if (((kny) this.viewModel).m146624F(m156455e0().mo48974l().m120851w3(strMo120828r3))) {
            return;
        }
        User userM120851w3 = m156455e0().mo48974l().m120851w3(strMo120828r3);
        if (NullChecker.m81303a(userM120851w3) && userM120851w3.isTeamAccount()) {
            return;
        }
        duringCreated(CoreModule.m29932K().mo30744ab(strMo120828r3)).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.smy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165399a.m137224P1(strMo120828r3, (ConversationStatus) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q1 */
    public final boolean m137241q1(String str) {
        Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(str);
        return NullChecker.m81303a(conversationM33216zp) && NullChecker.m81303a(conversationM33216zp.property) && NullChecker.m81303a(conversationM33216zp.property.quickchat) && TextUtils.equals(conversationM33216zp.convType, "default") && TextUtils.equals(conversationM33216zp.property.quickchat.bellType, "male");
    }

    @Override // p149l.uly
    /* JADX INFO: renamed from: r0 */
    public void mo137242r0() {
        fcz<? extends DbObject, ?> fczVarMo48974l = m156455e0().mo48974l();
        zvf0.m220396r("e_getback_match", fczVarMo48974l.pageId());
        if (CoreModule.f17545c.f19555C0.m210102K3()) {
            CoreModule.f17545c.f19642f0.m32760Op(fczVarMo48974l.m120788j3().f56011id);
        } else {
            CoreModule.m29935P().m94658i().mo158476y4(act(), "p_unmatch,getback_match", Privilege.recover_unmatches);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public boolean m137243r1() {
        return m156455e0().mo48974l().m120794k4(m156455e0().mo48974l().mo120828r3());
    }

    @Override // p149l.uly
    /* JADX INFO: renamed from: s0 */
    public void mo137244s0() {
        m137226R1(m156455e0().mo48974l().mo120828r3());
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m137245s1(Long l2) {
        ((kny) this.viewModel).m146630L();
        this.f114074g = false;
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m137246t1(Bundle bundle) {
        ((kny) this.viewModel).m146638y(this);
        m137238n1();
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m137247u1(Boolean bool) {
        m137240p1();
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m137248v1(Boolean bool) {
        m137240p1();
    }

    @Override // p149l.uly
    /* JADX INFO: renamed from: x0 */
    public void mo137249x0(User user) {
        ((kny) this.viewModel).m146628J(user);
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ C22306c m137250x1(String str) {
        return mkd0.m154986t(CoreModule.f17545c.f19639e0.m169410Ka(str), C22306c.just(Boolean.FALSE), m137229g1(str), m156455e0().mo48974l().mo120709T2(), new z9j() { // from class: l.umy
            @Override // p149l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                return new knb0((User) obj, (Boolean) obj2, (j760) obj3, (Conversation) obj4);
            }
        });
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m137251z1(knb0 knb0Var) {
        ((kny) this.viewModel).m146620A(knb0Var);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
