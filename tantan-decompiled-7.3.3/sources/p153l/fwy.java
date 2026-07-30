package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreAssetsSettings;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.GPMemo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class fwy extends ruy<hwy> {

    /* JADX INFO: renamed from: d */
    public int f101224d;

    /* JADX INFO: renamed from: e */
    public int f101225e;

    /* JADX INFO: renamed from: f */
    public kcg0 f101226f;

    /* JADX INFO: renamed from: g */
    public boolean f101227g;

    public fwy(ner nerVar) {
        super(nerVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ Integer m127883a1(bkj0 bkj0Var) {
        return (Integer) ((pf60) bkj0Var.f77082b).f152156a;
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m127888B1(String str, GPMemo gPMemo) {
        if (TextUtils.isEmpty(gPMemo.memo)) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
            if (userM116503Pa == null || userM116503Pa.inactivated) {
                ((hwy) this.viewModel).m137534M("");
            } else {
                ((hwy) this.viewModel).m137534M(userM116503Pa.name);
            }
        } else {
            ((hwy) this.viewModel).m137534M(gPMemo.memo);
        }
        User userM116503Pa2 = CoreModule.f18264c.f20381e0.m116503Pa(str);
        if (userM116503Pa2 == null || !((hwy) this.viewModel).m137527F(userM116503Pa2)) {
            return;
        }
        ((hwy) this.viewModel).m137534M(userM116503Pa2.publicId);
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m127889C1(String str) {
        Conversation conversation = m143372e0().mo50158l().f82482k;
        if (conversation == null || !str.equals(conversation.otherUser)) {
            return;
        }
        this.f101226f = m127903f1();
        if (this.f101227g) {
            return;
        }
        ((hwy) this.viewModel).m137532K();
        this.f101227g = true;
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m127890D1(C4470c c4470c) {
        if (c4470c == C4470c.f16268j) {
            psd0.m173633z(this.f101226f);
            ((hwy) this.viewModel).m137533L();
            this.f101227g = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m127891E1(pf60 pf60Var) {
        this.f101225e = ((Integer) ((pf60) pf60Var.f152157b).f152156a).intValue();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m127892F1(pf60 pf60Var) {
        ((hwy) this.viewModel).m137524B(pf60Var);
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m127893H1(User user) {
        ((hwy) this.viewModel).m137525C(user);
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m127894I1(clz clzVar, View view) {
        if (!CoreModule.m30933P().m143412i().mo180492k1() && CoreModule.m30933P().m143412i().mo180571z0() && NullChecker.m82486a(clzVar.f82482k) && !clzVar.f82482k.localEverHasMessage && NullChecker.m82486a(clzVar.mo111064x6()) && clzVar.mo111064x6().onlineMatchLocked() && !m127918r1()) {
            CoreModule.m30933P().m143412i().mo180390S();
            CoreModule.m30933P().m143412i().mo180454d1(act());
            return;
        }
        if (NullChecker.m82486a(clzVar.f82482k) && CoreModule.m30933P().m143406b().mo36121lo(clzVar.f82482k)) {
            CoreModule.m30933P().m143406b().mo36107Wl(act());
            return;
        }
        if (h39.m133424M() && hcm.m134472r().m134479q(pzi0.m174454o())) {
            hcm.m134472r().m134478F(act());
            return;
        }
        if (CoreModule.m30933P().m143405a().mo34534kb() && k05.m147755h().m147767n() && clzVar.m110955b4() && !((hwy) this.viewModel).m137527F(clzVar.m111057w3(m143372e0().mo50158l().mo111034r3()))) {
            k05.m147757v(act(), k05.m147755h().m147760f());
        } else {
            act().m68056e2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m127895J1(bkj0 bkj0Var) {
        this.f101224d = ((Integer) ((pf60) bkj0Var.f77082b).f152156a).intValue();
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m127896L1(bkj0 bkj0Var) {
        ((hwy) this.viewModel).m137526E(bkj0Var);
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m127897N1(BubbleInfo bubbleInfo) {
        V v2 = this.viewModel;
        if (bubbleInfo == null) {
            ((hwy) v2).m137542z();
        } else {
            ((hwy) v2).m137530I(bubbleInfo);
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m127898O1(Throwable th) {
        ((hwy) this.viewModel).m137542z();
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m127899P1(final String str, ConversationStatus conversationStatus) {
        if (!m127905h1(conversationStatus)) {
            ((hwy) this.viewModel).m137542z();
            return;
        }
        if (CoreModule.m30933P().m143410g().mo36088xn() && NullChecker.m82486a(m143372e0().mo50158l()) && NullChecker.m82486a(m143372e0().mo50158l().f82482k) && m143372e0().mo50158l().f82482k.isConfessionFirstConv()) {
            ((hwy) this.viewModel).m137529H("https://auto.tancdn.com/v1/images/eyJpZCI6IklTNDI2NFI2R1ZaVEpWWjRWVFJDUTJEVEVQVllZRzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzEyMjQyMzAzNzQ3NTY0Nzc4N30.png");
            return;
        }
        if (CoreModule.f18276o.m132214d().mo34703I5() && NullChecker.m82486a(m143372e0().mo50158l()) && NullChecker.m82486a(m143372e0().mo50158l().f82482k) && NullChecker.m82486a(m143372e0().mo50158l().f82482k.additional) && NullChecker.m82486a(m143372e0().mo50158l().f82482k.additional.greetingInfo) && m143372e0().mo50158l().f82482k.additional.greetingInfo.fromGreeting) {
            ((hwy) this.viewModel).m137529H("https://auto.tancdn.com/v1/images/eyJpZCI6IklTNDI2NFI2R1ZaVEpWWjRWVFJDUTJEVEVQVllZRzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzEyMjQyMzAzNzQ3NTY0Nzc4N30.png");
            return;
        }
        if (CoreModule.m30933P().m143405a().mo34529jj() && NullChecker.m82486a(m143372e0().mo50158l()) && NullChecker.m82486a(m143372e0().mo50158l().f82482k) && m143372e0().mo50158l().f82482k.isConfessionFirstConv()) {
            ((hwy) this.viewModel).m137529H("https://auto.tancdn.com/v1/images/eyJpZCI6IklTNDI2NFI2R1ZaVEpWWjRWVFJDUTJEVEVQVllZRzE0IiwidyI6NjAsImgiOjYwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzEyMjQyMzAzNzQ3NTY0Nzc4N30.png");
        } else {
            duringCreated(new pcj() { // from class: l.svy
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.m30932N().mo61584vm(str);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.tvy
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f176324a.m127897N1((BubbleInfo) obj);
                }
            }, new y20() { // from class: l.uvy
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f181220a.m127898O1((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Q1 */
    public void m127900Q1() {
        this.f101227g = false;
    }

    /* JADX INFO: renamed from: R1 */
    public final void m127901R1(String str) {
        if (CoreModule.m30933P().m143412i().mo180557x()) {
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(str);
            if (NullChecker.m82486a(conversationM33859Xe)) {
                conversationM33859Xe.status = ConversationStatus.get("default");
            }
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m127906i1();
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m127902e1() {
        return m143372e0().mo50158l().m110896P2();
    }

    /* JADX INFO: renamed from: f1 */
    public final kcg0 m127903f1() {
        CoreAssetsSettings coreAssetsSettingsM144645g = CoreModule.f18265d.m144645g();
        int i = NullChecker.m82486a(coreAssetsSettingsM144645g) ? coreAssetsSettingsM144645g.keepConnection.chatTypingInterval : 0;
        psd0.m173633z(this.f101226f);
        return C22421c.interval(i == 0 ? 12L : i + 2, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.wvy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191120a.m127920s1((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g1 */
    public final C22421c<pf60<Integer, Boolean>> m127904g1(String str) {
        if (m143372e0().mo50158l() instanceof jlz) {
            return C22421c.just(null);
        }
        return CoreModule.m30933P().m143412i().mo180446c() ? CoreModule.f18264c.f20384f0.m34051mo(str) : C22421c.just(null);
    }

    /* JADX INFO: renamed from: h1 */
    public final boolean m127905h1(ConversationStatus conversationStatus) {
        return (conversationStatus == null || TEnum.equals(conversationStatus, "dismissed") || TEnum.equals(conversationStatus, "deleted") || TEnum.equals(conversationStatus, "blocked")) ? false : true;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m127906i1() {
        creates(new y20() { // from class: l.cvy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84081a.m127921t1((Bundle) obj);
            }
        });
        m127914o1();
        m127911l1();
        m127907j1();
        m127912m1();
        m127909k1();
        if (CoreModule.m30932N().mo61478M8()) {
            m127915p1();
            duringCreated(CoreModule.m30932N().mo61546jb()).subscribe(psd0.m173596G(new y20() { // from class: l.nvy
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f143895a.m127922u1((Boolean) obj);
                }
            }));
            duringCreated(CoreModule.m30932N().mo61535f9()).subscribe(psd0.m173596G(new y20() { // from class: l.xvy
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196443a.m127923v1((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final void m127907j1() {
        final String strMo111034r3 = m143372e0().mo50158l().mo111034r3();
        duringCreated(new pcj() { // from class: l.zvy
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f206302a.m127925x1(strMo111034r3);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.awy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73804a.m127926z1((ovb0) obj);
            }
        }));
        if (CoreModule.m30933P().m143412i().mo180357L5()) {
            duringCreated(new pcj() { // from class: l.bwy
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return CoreModule.f18264c.f20381e0.m116487La(strMo111034r3);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.cwy
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f84154a.m127888B1(strMo111034r3, (GPMemo) obj);
                }
            }));
        }
    }

    @Override // p153l.ruy
    /* JADX INFO: renamed from: k0 */
    public int mo127908k0() {
        return this.f101225e;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m127909k1() {
        if (!m127918r1() && CoreModule.m30933P().m143412i().mo180388R4()) {
            duringCreated(CoreModule.f18264c.f20381e0.m116515T6()).subscribe(psd0.m173596G(new y20() { // from class: l.dwy
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f91052a.m127889C1((String) obj);
                }
            }));
            lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.ewy
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f96220a.m127890D1((C4470c) obj);
                }
            }));
        }
    }

    @Override // p153l.ruy
    /* JADX INFO: renamed from: l0 */
    public int mo127910l0() {
        return this.f101224d;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m127911l1() {
        if (CoreModule.m30933P().m143406b().mo36110Yg()) {
            clz<? extends DbObject, ?> clzVarMo50158l = m143372e0().mo50158l();
            if (NullChecker.m82486a(clzVarMo50158l)) {
                if (CoreModule.m30933P().m143406b().mo36108Wr(clzVarMo50158l.f82482k)) {
                    this.f101225e = 100;
                    return;
                }
                if (CoreModule.m30933P().m143406b().mo36129v6(clzVarMo50158l.f82482k)) {
                    final String strMo111034r3 = clzVarMo50158l.mo111034r3();
                    duringCreated(new pcj() { // from class: l.kvy
                        @Override // p153l.pcj, java.util.concurrent.Callable
                        public final Object call() {
                            String str = strMo111034r3;
                            return psd0.m173625r(CoreModule.f18264c.f20381e0.m116483Ka(str), CoreModule.m30933P().m143406b().mo36096Da(str), new rcj() { // from class: l.vvy
                                @Override // p153l.rcj
                                public final Object call(Object obj, Object obj2) {
                                    return jyb.m147494Y((User) obj, (pf60) obj2);
                                }
                            });
                        }
                    }).filter(new qcj() { // from class: l.lvy
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(((User) ((pf60) obj).f152156a).isLoveBuzz());
                        }
                    }).doOnNext(new y20() { // from class: l.mvy
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f138984a.m127891E1((pf60) obj);
                        }
                    }).subscribe(psd0.m173596G(new y20() { // from class: l.ovy
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f149411a.m127892F1((pf60) obj);
                        }
                    }));
                } else if (CoreModule.m30933P().m143406b().mo36136zo(clzVarMo50158l.f82482k)) {
                    this.f101225e = 100;
                }
            }
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final void m127912m1() {
        final String strMo111034r3 = m143372e0().mo50158l().mo111034r3();
        duringCreated(new pcj() { // from class: l.ivy
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f18264c.f20381e0.m116483Ka(strMo111034r3);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.jvy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122857a.m127893H1((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n1 */
    public void m127913n1() {
        if (CoreModule.m30933P().m143412i().mo180446c() || CoreModule.m30933P().m143406b().mo36110Yg()) {
            final clz<? extends DbObject, ?> clzVarMo50158l = m143372e0().mo50158l();
            if (CoreModule.m30933P().m143405a().mo34534kb() && clzVarMo50158l.m110990i4()) {
                clzVarMo50158l.m111048t7().m178960m0().setLeftIconResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113845L3 : ibc0.f113789F1);
            }
            clzVarMo50158l.m111048t7().m178960m0().setLeftIconOnClick(new View.OnClickListener() { // from class: l.yvy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f201771a.m127894I1(clzVarMo50158l, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m127914o1() {
        final String strMo111034r3 = m143372e0().mo50158l().mo111034r3();
        if (!CoreModule.m30933P().m143412i().mo180446c() || m127916q1(strMo111034r3)) {
            return;
        }
        duringCreated(new pcj() { // from class: l.dvy
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                String str = strMo111034r3;
                return psd0.m173626s(CoreModule.f18264c.f20381e0.m116483Ka(str), CoreModule.f18264c.f20384f0.m34051mo(str), CoreModule.f18264c.f20384f0.m33823Ue(str), new qvy());
            }
        }).filter(new qcj() { // from class: l.evy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) ((bkj0) obj).f77081a).onlineMatch());
            }
        }).doOnNext(new y20() { // from class: l.fvy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101110a.m127895J1((bkj0) obj);
            }
        }).distinctUntilChanged(new qcj() { // from class: l.gvy
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return fwy.m127883a1((bkj0) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.hvy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111857a.m127896L1((bkj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p1 */
    public final void m127915p1() {
        final String strMo111034r3 = m143372e0().mo50158l().mo111034r3();
        if (((hwy) this.viewModel).m137527F(m143372e0().mo50158l().m111057w3(strMo111034r3))) {
            return;
        }
        User userM111057w3 = m143372e0().mo50158l().m111057w3(strMo111034r3);
        if (NullChecker.m82486a(userM111057w3) && userM111057w3.isTeamAccount()) {
            return;
        }
        duringCreated(CoreModule.m30930K().mo31747ab(strMo111034r3)).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.pvy
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154347a.m127899P1(strMo111034r3, (ConversationStatus) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q1 */
    public final boolean m127916q1(String str) {
        Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(str);
        return NullChecker.m82486a(conversationM34219zp) && NullChecker.m82486a(conversationM34219zp.property) && NullChecker.m82486a(conversationM34219zp.property.quickchat) && TextUtils.equals(conversationM34219zp.convType, "default") && TextUtils.equals(conversationM34219zp.property.quickchat.bellType, "male");
    }

    @Override // p153l.ruy
    /* JADX INFO: renamed from: r0 */
    public void mo127917r0() {
        clz<? extends DbObject, ?> clzVarMo50158l = m143372e0().mo50158l();
        i4g0.m138520r("e_getback_match", clzVarMo50158l.pageId());
        if (CoreModule.f18264c.f20297C0.m146415L3()) {
            CoreModule.f18264c.f20384f0.m33763Op(clzVarMo50158l.m110994j3().f56859id);
        } else {
            CoreModule.m30933P().m143412i().mo180568y4(act(), "p_unmatch,getback_match", Privilege.recover_unmatches);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public boolean m127918r1() {
        return m143372e0().mo50158l().m111000k4(m143372e0().mo50158l().mo111034r3());
    }

    @Override // p153l.ruy
    /* JADX INFO: renamed from: s0 */
    public void mo127919s0() {
        m127901R1(m143372e0().mo50158l().mo111034r3());
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m127920s1(Long l2) {
        ((hwy) this.viewModel).m137533L();
        this.f101227g = false;
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m127921t1(Bundle bundle) {
        ((hwy) this.viewModel).m137541y(this);
        m127913n1();
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m127922u1(Boolean bool) {
        m127915p1();
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m127923v1(Boolean bool) {
        m127915p1();
    }

    @Override // p153l.ruy
    /* JADX INFO: renamed from: x0 */
    public void mo127924x0(User user) {
        ((hwy) this.viewModel).m137531J(user);
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ C22421c m127925x1(String str) {
        return psd0.m173627t(CoreModule.f18264c.f20381e0.m116483Ka(str), C22421c.just(Boolean.FALSE), m127904g1(str), m143372e0().mo50158l().mo110915T2(), new tcj() { // from class: l.rvy
            @Override // p153l.tcj
            /* JADX INFO: renamed from: b */
            public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                return new ovb0((User) obj, (Boolean) obj2, (pf60) obj3, (Conversation) obj4);
            }
        });
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m127926z1(ovb0 ovb0Var) {
        ((hwy) this.viewModel).m137523A(ovb0Var);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
