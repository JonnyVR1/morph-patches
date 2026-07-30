package p002l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p000p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.bwr;
import l.e30;
import l.ffw;
import l.jtk;
import l.mqi0;
import l.ptk;
import l.t100;
import l.tpd0;
import l.uqd0;
import l.v9j;
import l.vdt;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.ypv;
import l.zpd0;
import p002l.ho2;

/* JADX INFO: renamed from: l.g4 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class AbstractC0583g4<D extends ho2> extends h4t<D, LiveBubbleView> {

    /* JADX INFO: renamed from: i */
    public int f10750i;

    /* JADX INFO: renamed from: j */
    public int f10751j;

    /* JADX INFO: renamed from: k */
    public int f10752k;

    /* JADX INFO: renamed from: l */
    public int f10753l;

    /* JADX INFO: renamed from: m */
    public long f10754m;

    /* JADX INFO: renamed from: n */
    public String f10755n;

    /* JADX INFO: renamed from: o */
    public ik40 f10756o;

    /* JADX INFO: renamed from: p */
    public HashMap<String, BLiveBubbleConfig> f10757p;

    /* JADX INFO: renamed from: q */
    public final List<String> f10758q;

    /* JADX INFO: renamed from: r */
    public final HashMap<String, sf3> f10759r;

    /* JADX INFO: renamed from: s */
    public tpd0 f10760s;

    /* JADX INFO: renamed from: t */
    public tpd0 f10761t;

    /* JADX INFO: renamed from: u */
    public zpd0 f10762u;

    /* JADX INFO: renamed from: v */
    public List<String> f10763v;

    /* JADX INFO: renamed from: l.g4$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public View f10764a;

        public a(View view) {
            this.f10764a = view;
        }
    }

    public AbstractC0583g4(bsm<D> bsmVar) {
        super(bsmVar);
        this.f10757p = new HashMap<>();
        this.f10758q = new ArrayList();
        this.f10759r = new HashMap<>();
        this.f10760s = new tpd0("total_user_count" + ypv.a.D0(), 0);
        this.f10761t = new tpd0("total_everyday_count" + ypv.a.D0(), 0);
        this.f10762u = new zpd0("latest_show_time" + ypv.a.D0(), 0L);
        this.f10763v = new ArrayList();
    }

    /* JADX INFO: renamed from: M4 */
    private void m13554M4() {
        BLiveBubbleConfig bLiveBubbleConfig;
        sf3 sf3Var;
        if (vwb.J(this.f10763v) && c.i.equals(lifecycle_()) && !m13586J4() && !m13588L4()) {
            if (!mqi0.D(((Long) this.f10762u.get()).longValue())) {
                m13591P4();
            }
            if (m13587K4() || this.f10758q.isEmpty() || (bLiveBubbleConfig = this.f10757p.get(this.f10758q.get(0))) == null || mo13602j4(bLiveBubbleConfig.type) || m13584H4(bLiveBubbleConfig) || (sf3Var = this.f10759r.get(bLiveBubbleConfig.id)) == null) {
                return;
            }
            this.f10755n = bLiveBubbleConfig.type;
            this.f10758q.remove(0);
            if (mo13603k4(bLiveBubbleConfig, sf3Var)) {
                a aVarMo13610r4 = mo13610r4(bLiveBubbleConfig.type, TextUtils.isEmpty(bLiveBubbleConfig.buttonId) ? -1 : Integer.parseInt(bLiveBubbleConfig.buttonId));
                if (aVarMo13610r4 == null || aVarMo13610r4.f10764a == null) {
                    return;
                }
                mo13590O4(bLiveBubbleConfig.type, aVarMo13610r4, bLiveBubbleConfig, sf3Var);
            }
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ BLiveBubbleConfig m13561U3(BLiveBubbleConfig bLiveBubbleConfig) {
        return bLiveBubbleConfig;
    }

    /* JADX INFO: renamed from: Y4 */
    private void m13566Y4() {
        m14187I3(m25547E2().m14581k2(TimeUnit.SECONDS), true).filter(new w9j() { // from class: l.f4
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() >= 2);
            }
        }).filter(new w9j() { // from class: l.g3
            public final Object call(Object obj) {
                return this.f10737a.m13578B4((Long) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.h3
            public final void call(Object obj) {
                this.f11860a.m13579C4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ BLiveBubbleConfig m13573f4(BLiveBubbleConfig bLiveBubbleConfig) {
        return bLiveBubbleConfig;
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m13577A4(String str) {
        m13605m4();
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ Boolean m13578B4(Long l2) {
        return Boolean.valueOf(c.i.equals(lifecycle_()));
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m13579C4(Long l2) {
        this.f10754m = l2.longValue();
        m13554M4();
    }

    /* JADX INFO: renamed from: D4 */
    public final uqd0 m13580D4(String str) {
        return new uqd0("bubble_anchor_id" + str + ypv.a.D0(), "");
    }

    /* JADX INFO: renamed from: E4 */
    public final uqd0 m13581E4(String str) {
        return new uqd0("bubble_id" + str + ypv.a.D0(), "");
    }

    /* JADX INFO: renamed from: F4 */
    public final tpd0 m13582F4(String str) {
        return new tpd0("bubble_today_times" + str + ypv.a.D0(), 0);
    }

    /* JADX INFO: renamed from: G4 */
    public final tpd0 m13583G4(String str) {
        return new tpd0("bubble_total_times" + str + ypv.a.D0(), 0);
    }

    /* JADX INFO: renamed from: H4 */
    public final boolean m13584H4(BLiveBubbleConfig bLiveBubbleConfig) {
        return this.f10754m < ((long) bLiveBubbleConfig.bubbleShowAfterWatch);
    }

    /* JADX INFO: renamed from: I4 */
    public abstract void mo13585I4(String str);

    /* JADX INFO: renamed from: J4 */
    public final boolean m13586J4() {
        return this.f10753l >= this.f10752k;
    }

    /* JADX INFO: renamed from: K4 */
    public final boolean m13587K4() {
        return ((Integer) this.f10761t.get()).intValue() >= this.f10751j;
    }

    /* JADX INFO: renamed from: L4 */
    public final boolean m13588L4() {
        return ((Integer) this.f10760s.get()).intValue() >= this.f10750i;
    }

    /* JADX INFO: renamed from: N4 */
    public final void m13589N4() {
        this.f10759r.clear();
        vwb.z(this.f10758q, new e30() { // from class: l.p3
            public final void call(Object obj) {
                this.f16992a.m13615v4((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O4 */
    public abstract void mo13590O4(String str, a aVar, BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var);

    /* JADX INFO: renamed from: P4 */
    public final void m13591P4() {
        this.f10761t.put(0);
        vwb.z(this.f10758q, new e30() { // from class: l.l3
            public final void call(Object obj) {
                this.f14662a.m13616w4((String) obj);
            }
        });
        this.f10762u.put(Long.valueOf(mqi0.o()));
    }

    /* JADX INFO: renamed from: Q4 */
    public final ik40 m13592Q4() {
        ik40 ik40Var = this.f10756o;
        if (ik40Var != null) {
            C2(ik40Var);
        }
        if (this.f10756o == null) {
            this.f10756o = new ik40(this.f22036e);
        }
        return this.f10756o;
    }

    /* JADX INFO: renamed from: R4 */
    public final void m13593R4(final boolean z) {
        if (vwb.J(this.f10763v)) {
            return;
        }
        vwb.z(this.f10763v, new e30() { // from class: l.o3
            public final void call(Object obj) {
                ptk.h().q((String) obj, z);
            }
        });
    }

    /* JADX INFO: renamed from: S4 */
    public void m13594S4(BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var, a aVar) {
        if (bLiveBubbleConfig.bubbleTextList.isEmpty()) {
            return;
        }
        ptk ptkVarH = ptk.h();
        final String[] strArr = new String[1];
        jtk jtkVarD = new jtk(act()).u((String) bLiveBubbleConfig.bubbleTextList.get(0)).g(jtk.C, t100.d(12.0f)).s(xdl0.w(16.0f), xdl0.w(10.0f), xdl0.w(16.0f), xdl0.w(10.0f)).p(xdl0.w(12.0f)).e(new int[]{Color.parseColor("#" + bLiveBubbleConfig.bubbleStartColor), Color.parseColor("#" + bLiveBubbleConfig.bubbleEndColor)}).k(true).t(13).q(-1).v(false).i(jtk.D).a(bLiveBubbleConfig.bubbleDisappear * 1000).b(new jtk.a() { // from class: l.r3
            /* JADX INFO: renamed from: a */
            public final void m21754a(String str) {
                ptk.h().g(str);
            }
        }).d(new jtk.b() { // from class: l.s3
            /* JADX INFO: renamed from: a */
            public final void m22190a(String str) {
                this.f18770a.m13618y4(strArr, str);
            }
        });
        if (TextUtils.equals("click", bLiveBubbleConfig.disAppearMod)) {
            jtkVarD.b(new jtk.a() { // from class: l.t3
                /* JADX INFO: renamed from: a */
                public final void m22787a(String str) {
                    this.f19407a.m13619z4(str);
                }
            });
        } else if (TextUtils.equals("timing", bLiveBubbleConfig.disAppearMod)) {
            jtkVarD.a(bLiveBubbleConfig.bubbleDisappear * 1000);
        } else {
            jtkVarD.b(new jtk.a() { // from class: l.u3
                /* JADX INFO: renamed from: a */
                public final void m23273a(String str) {
                    this.f20474a.m13577A4(str);
                }
            }).a(bLiveBubbleConfig.bubbleDisappear * 1000);
        }
        mo13601Z4(bLiveBubbleConfig, sf3Var);
        if (m13599W4(bLiveBubbleConfig)) {
            View view = aVar.f10764a;
            strArr[0] = ptkVarH.r(jtkVarD, view, (ViewGroup) view.getRootView());
        } else {
            strArr[0] = ptkVarH.r(jtkVarD, aVar.f10764a, ((bwr) this).viewModel);
        }
        this.f10763v.add(strArr[0]);
        mo13585I4(bLiveBubbleConfig.type);
    }

    /* JADX INFO: renamed from: T */
    public void m13595T() {
        super.T();
        duringCreated(new v9j() { // from class: l.f3
            public final Object call() {
                return this.f10111a.mo13608p4();
            }
        }).subscribe(ffw.d(new e30() { // from class: l.q3
            public final void call(Object obj) {
                this.f17790a.m13611s4((BLiveMonetizationConfig) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.y3
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj).equals(c.j));
            }
        }).subscribe(ffw.d(new e30() { // from class: l.z3
            public final void call(Object obj) {
                this.f23195a.m13613t4((c) obj);
            }
        }));
        duringCreated((rx.c) m25548F2().KeyboardEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.a4
            public final void call(Object obj) {
                this.f7359a.m13614u4((KeyboardEventData) obj);
            }
        }));
        duringCreated((rx.c) m25548F2().BootBubbleEvent.showBubbleById().g()).subscribe(ffw.d(new e30() { // from class: l.b4
            public final void call(Object obj) {
                this.f7974a.m13596T4((String) obj);
            }
        }));
        duringCreated((rx.c) m25548F2().BootBubbleEvent.showBubbleByType().g()).subscribe(ffw.d(new e30() { // from class: l.c4
            public final void call(Object obj) {
                this.f8476a.m13597U4((String) obj);
            }
        }));
        duringCreated((rx.c) m25548F2().BootBubbleEvent.dismissBubble().g()).subscribe(ffw.d(new e30() { // from class: l.d4
            public final void call(Object obj) {
                this.f9054a.m13606n4((String) obj);
            }
        }));
        duringCreated((rx.c) m25548F2().BootBubbleEvent.showExtraBubble().g()).subscribe(ffw.d(new e30() { // from class: l.e4
            public final void call(Object obj) {
                this.f9564a.m13598V4((BLiveBubbleConfig) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T4 */
    public final void m13596T4(String str) {
        BLiveBubbleConfig bLiveBubbleConfig = this.f10757p.get(str);
        if (bLiveBubbleConfig == null) {
            return;
        }
        this.f10758q.add(0, bLiveBubbleConfig.id);
        this.f10759r.put(bLiveBubbleConfig.id, m13609q4(bLiveBubbleConfig));
        m13554M4();
    }

    @Deprecated
    /* JADX INFO: renamed from: U4 */
    public final void m13597U4(final String str) {
        BLiveBubbleConfig bLiveBubbleConfig = (BLiveBubbleConfig) vwb.r(this.f10757p.values(), new w9j() { // from class: l.m3
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLiveBubbleConfig) obj).type));
            }
        });
        if (bLiveBubbleConfig == null) {
            return;
        }
        this.f10758q.add(0, bLiveBubbleConfig.id);
        this.f10759r.put(bLiveBubbleConfig.id, m13609q4(bLiveBubbleConfig));
        m13554M4();
    }

    /* JADX INFO: renamed from: V4 */
    public void m13598V4(BLiveBubbleConfig bLiveBubbleConfig) {
        if (bLiveBubbleConfig == null) {
            return;
        }
        this.f10758q.add(0, bLiveBubbleConfig.id);
        this.f10759r.put(bLiveBubbleConfig.id, m13609q4(bLiveBubbleConfig));
        this.f10757p.put(bLiveBubbleConfig.id, bLiveBubbleConfig);
        m13554M4();
    }

    /* JADX INFO: renamed from: W4 */
    public boolean m13599W4(BLiveBubbleConfig bLiveBubbleConfig) {
        return bLiveBubbleConfig.type.equals("firstRechargeGiftDialogBubble");
    }

    /* JADX INFO: renamed from: X4 */
    public final void m13600X4(List<BLiveBubbleConfig> list, List<String> list2) {
        if (list == null) {
            return;
        }
        this.f10758q.clear();
        HashMap mapD = vwb.d(list, new w9j() { // from class: l.v3
            public final Object call(Object obj) {
                return ((BLiveBubbleConfig) obj).id;
            }
        }, new w9j() { // from class: l.w3
            public final Object call(Object obj) {
                return AbstractC0583g4.m13573f4((BLiveBubbleConfig) obj);
            }
        });
        for (int i = 0; i < list2.size(); i++) {
            if (mapD.get(list2.get(i)) != null) {
                this.f10758q.add(list2.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public void mo13601Z4(BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var) {
        sf3Var.f18980a.put(mo9759j3());
        tpd0 tpd0Var = sf3Var.f18982c;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        tpd0 tpd0Var2 = sf3Var.f18983d;
        tpd0Var2.put(Integer.valueOf(((Integer) tpd0Var2.get()).intValue() + 1));
        tpd0 tpd0Var3 = this.f10761t;
        tpd0Var3.put(Integer.valueOf(((Integer) tpd0Var3.get()).intValue() + 1));
        tpd0 tpd0Var4 = this.f10760s;
        tpd0Var4.put(Integer.valueOf(((Integer) tpd0Var4.get()).intValue() + 1));
        this.f10753l++;
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: j3 */
    public String mo9759j3() {
        User userM14582l0 = m25547E2().m14582l0();
        return userM14582l0 == null ? "" : ((DbObject) userM14582l0).id;
    }

    /* JADX INFO: renamed from: j4 */
    public abstract boolean mo13602j4(String str);

    /* JADX INFO: renamed from: k4 */
    public boolean mo13603k4(BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var) {
        return ((Integer) sf3Var.f18982c.get()).intValue() < bLiveBubbleConfig.bubbleEveryDayShowMaxCount && ((Integer) sf3Var.f18983d.get()).intValue() < bLiveBubbleConfig.bubbleUserShowMaxCount;
    }

    /* JADX INFO: renamed from: l4 */
    public boolean mo13604l4() {
        return false;
    }

    /* JADX INFO: renamed from: m4 */
    public void m13605m4() {
        if (vwb.J(this.f10763v)) {
            return;
        }
        vwb.z(this.f10763v, new e30() { // from class: l.n3
            public final void call(Object obj) {
                ptk.h().g((String) obj);
            }
        });
        this.f10763v.clear();
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        m13605m4();
        this.f10754m = 0L;
    }

    /* JADX INFO: renamed from: n4 */
    public final void m13606n4(String str) {
        if (TextUtils.equals(str, this.f10755n)) {
            m13605m4();
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final boolean m13607o4() {
        return !vdt.b(2);
    }

    /* JADX INFO: renamed from: p4 */
    public abstract rx.c<BLiveMonetizationConfig> mo13608p4();

    /* JADX INFO: renamed from: q4 */
    public final sf3 m13609q4(BLiveBubbleConfig bLiveBubbleConfig) {
        sf3 sf3Var = new sf3();
        sf3Var.f18980a = m13580D4(bLiveBubbleConfig.type);
        sf3Var.f18981b = m13581E4(bLiveBubbleConfig.type);
        sf3Var.f18982c = m13582F4(bLiveBubbleConfig.type);
        sf3Var.f18983d = m13583G4(bLiveBubbleConfig.type);
        return sf3Var;
    }

    /* JADX INFO: renamed from: r4 */
    public abstract a mo13610r4(String str, int i);

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m13611s4(BLiveMonetizationConfig bLiveMonetizationConfig) {
        this.f10750i = bLiveMonetizationConfig.totalBubbleUserShowMaxCount;
        this.f10751j = bLiveMonetizationConfig.totalBubbleEveryDayShowMaxCount;
        this.f10752k = bLiveMonetizationConfig.totalBubbleUserShowInRoomCount;
        List<BLiveBubbleConfig> listN = bLiveMonetizationConfig.bubbleConfigs;
        if (listN != null) {
            if (m13607o4()) {
                listN = vwb.n(bLiveMonetizationConfig.bubbleConfigs, new w9j() { // from class: l.i3
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals("live", ((BLiveBubbleConfig) obj).liveType));
                    }
                });
            }
            if (listN != null) {
                this.f10757p = vwb.d(listN, new w9j() { // from class: l.j3
                    public final Object call(Object obj) {
                        return ((BLiveBubbleConfig) obj).id;
                    }
                }, new w9j() { // from class: l.k3
                    public final Object call(Object obj) {
                        return AbstractC0583g4.m13561U3((BLiveBubbleConfig) obj);
                    }
                });
            } else {
                this.f10757p = new HashMap<>();
            }
            m13600X4(m13592Q4().m15222R3(listN), m25552L2() ? bLiveMonetizationConfig.anchorBubblePriority : bLiveMonetizationConfig.audienceBubblePriority);
            m13589N4();
        }
    }

    /* JADX INFO: renamed from: t */
    public void mo13612t() {
        super.t();
        m13566Y4();
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m13613t4(c cVar) {
        m13605m4();
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m13614u4(KeyboardEventData keyboardEventData) {
        m13593R4(!keyboardEventData.m5201b());
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m13615v4(String str) {
        BLiveBubbleConfig bLiveBubbleConfig = this.f10757p.get(str);
        if (bLiveBubbleConfig != null) {
            this.f10759r.put(bLiveBubbleConfig.id, m13609q4(bLiveBubbleConfig));
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m13616w4(String str) {
        sf3 sf3Var = this.f10759r.get(str);
        if (sf3Var != null) {
            sf3Var.f18982c.put(0);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m13617x4(String[] strArr, Long l2) {
        this.f10763v.remove(strArr[0]);
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m13618y4(final String[] strArr, String str) {
        m14187I3(m25547E2().m14578j2(2, TimeUnit.SECONDS), true).take(1).subscribe(ffw.d(new e30() { // from class: l.x3
            public final void call(Object obj) {
                this.f22100a.m13617x4(strArr, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m13619z4(String str) {
        m13605m4();
    }
}
