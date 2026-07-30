package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p046p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: renamed from: l.g4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16991g4<D extends ho2> extends h4t<D, LiveBubbleView> {

    /* JADX INFO: renamed from: i */
    public int f100520i;

    /* JADX INFO: renamed from: j */
    public int f100521j;

    /* JADX INFO: renamed from: k */
    public int f100522k;

    /* JADX INFO: renamed from: l */
    public int f100523l;

    /* JADX INFO: renamed from: m */
    public long f100524m;

    /* JADX INFO: renamed from: n */
    public String f100525n;

    /* JADX INFO: renamed from: o */
    public ik40 f100526o;

    /* JADX INFO: renamed from: p */
    public HashMap<String, BLiveBubbleConfig> f100527p;

    /* JADX INFO: renamed from: q */
    public final List<String> f100528q;

    /* JADX INFO: renamed from: r */
    public final HashMap<String, sf3> f100529r;

    /* JADX INFO: renamed from: s */
    public tpd0 f100530s;

    /* JADX INFO: renamed from: t */
    public tpd0 f100531t;

    /* JADX INFO: renamed from: u */
    public zpd0 f100532u;

    /* JADX INFO: renamed from: v */
    public List<String> f100533v;

    /* JADX INFO: renamed from: l.g4$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public View f100534a;

        public a(View view) {
            this.f100534a = view;
        }
    }

    public AbstractC16991g4(bsm<D> bsmVar) {
        super(bsmVar);
        this.f100527p = new HashMap<>();
        this.f100528q = new ArrayList();
        this.f100529r = new HashMap<>();
        this.f100530s = new tpd0("total_user_count" + ypv.f199493a.m199309D0(), 0);
        this.f100531t = new tpd0("total_everyday_count" + ypv.f199493a.m199309D0(), 0);
        this.f100532u = new zpd0("latest_show_time" + ypv.f199493a.m199309D0(), 0L);
        this.f100533v = new ArrayList();
    }

    /* JADX INFO: renamed from: M4 */
    private void m124292M4() {
        BLiveBubbleConfig bLiveBubbleConfig;
        sf3 sf3Var;
        if (vwb.m200296J(this.f100533v) && C4319c.f15548i.equals(lifecycle_()) && !m124324J4() && !m124326L4()) {
            if (!mqi0.m155929D(this.f100532u.get().longValue())) {
                m124329P4();
            }
            if (m124325K4() || this.f100528q.isEmpty() || (bLiveBubbleConfig = this.f100527p.get(this.f100528q.get(0))) == null || mo124339j4(bLiveBubbleConfig.type) || m124322H4(bLiveBubbleConfig) || (sf3Var = this.f100529r.get(bLiveBubbleConfig.f44340id)) == null) {
                return;
            }
            this.f100525n = bLiveBubbleConfig.type;
            this.f100528q.remove(0);
            if (mo124340k4(bLiveBubbleConfig, sf3Var)) {
                a aVarMo124347r4 = mo124347r4(bLiveBubbleConfig.type, TextUtils.isEmpty(bLiveBubbleConfig.buttonId) ? -1 : Integer.parseInt(bLiveBubbleConfig.buttonId));
                if (aVarMo124347r4 == null || aVarMo124347r4.f100534a == null) {
                    return;
                }
                mo124328O4(bLiveBubbleConfig.type, aVarMo124347r4, bLiveBubbleConfig, sf3Var);
            }
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ BLiveBubbleConfig m124299U3(BLiveBubbleConfig bLiveBubbleConfig) {
        return bLiveBubbleConfig;
    }

    /* JADX INFO: renamed from: Y4 */
    private void m124304Y4() {
        m129300I3(m206027E2().m132145k2(TimeUnit.SECONDS), true).filter(new w9j() { // from class: l.f4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() >= 2);
            }
        }).filter(new w9j() { // from class: l.g3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f100316a.m124316B4((Long) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.h3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105571a.m124317C4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ BLiveBubbleConfig m124311f4(BLiveBubbleConfig bLiveBubbleConfig) {
        return bLiveBubbleConfig;
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m124315A4(String str) {
        m124342m4();
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ Boolean m124316B4(Long l2) {
        return Boolean.valueOf(C4319c.f15548i.equals(lifecycle_()));
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m124317C4(Long l2) {
        this.f100524m = l2.longValue();
        m124292M4();
    }

    /* JADX INFO: renamed from: D4 */
    public final uqd0 m124318D4(String str) {
        return new uqd0("bubble_anchor_id" + str + ypv.f199493a.m199309D0(), "");
    }

    /* JADX INFO: renamed from: E4 */
    public final uqd0 m124319E4(String str) {
        return new uqd0("bubble_id" + str + ypv.f199493a.m199309D0(), "");
    }

    /* JADX INFO: renamed from: F4 */
    public final tpd0 m124320F4(String str) {
        return new tpd0("bubble_today_times" + str + ypv.f199493a.m199309D0(), 0);
    }

    /* JADX INFO: renamed from: G4 */
    public final tpd0 m124321G4(String str) {
        return new tpd0("bubble_total_times" + str + ypv.f199493a.m199309D0(), 0);
    }

    /* JADX INFO: renamed from: H4 */
    public final boolean m124322H4(BLiveBubbleConfig bLiveBubbleConfig) {
        return this.f100524m < ((long) bLiveBubbleConfig.bubbleShowAfterWatch);
    }

    /* JADX INFO: renamed from: I4 */
    public abstract void mo124323I4(String str);

    /* JADX INFO: renamed from: J4 */
    public final boolean m124324J4() {
        return this.f100523l >= this.f100522k;
    }

    /* JADX INFO: renamed from: K4 */
    public final boolean m124325K4() {
        return this.f100531t.get().intValue() >= this.f100521j;
    }

    /* JADX INFO: renamed from: L4 */
    public final boolean m124326L4() {
        return this.f100530s.get().intValue() >= this.f100520i;
    }

    /* JADX INFO: renamed from: N4 */
    public final void m124327N4() {
        this.f100529r.clear();
        vwb.m200354z(this.f100528q, new e30() { // from class: l.p3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146943a.m124351v4((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O4 */
    public abstract void mo124328O4(String str, a aVar, BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var);

    /* JADX INFO: renamed from: P4 */
    public final void m124329P4() {
        this.f100531t.put(0);
        vwb.m200354z(this.f100528q, new e30() { // from class: l.l3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125830a.m124352w4((String) obj);
            }
        });
        this.f100532u.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: Q4 */
    public final ik40 m124330Q4() {
        ik40 ik40Var = this.f100526o;
        if (ik40Var != null) {
            m144506C2(ik40Var);
        }
        if (this.f100526o == null) {
            this.f100526o = new ik40(this.f188512e);
        }
        return this.f100526o;
    }

    /* JADX INFO: renamed from: R4 */
    public final void m124331R4(final boolean z) {
        if (vwb.m200296J(this.f100533v)) {
            return;
        }
        vwb.m200354z(this.f100533v, new e30() { // from class: l.o3
            @Override // p149l.e30
            public final void call(Object obj) {
                ptk.m171332h().m171343q((String) obj, z);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    public void m124332S4(BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var, a aVar) {
        if (bLiveBubbleConfig.bubbleTextList.isEmpty()) {
            return;
        }
        ptk ptkVarM171332h = ptk.m171332h();
        final String[] strArr = new String[1];
        jtk jtkVarM143112d = new jtk(act()).m143129u(bLiveBubbleConfig.bubbleTextList.get(0)).m143115g(jtk.f119616C, t100.m186890d(12.0f)).m143127s(xdl0.m208407w(16.0f), xdl0.m208407w(10.0f), xdl0.m208407w(16.0f), xdl0.m208407w(10.0f)).m143124p(xdl0.m208407w(12.0f)).m143113e(Color.parseColor("#" + bLiveBubbleConfig.bubbleStartColor), Color.parseColor("#" + bLiveBubbleConfig.bubbleEndColor)).m143119k(true).m143128t(13).m143125q(-1).m143130v(false).m143117i(jtk.f119617D).m143109a(bLiveBubbleConfig.bubbleDisappear * 1000).m143110b(new jtk.InterfaceC17856a() { // from class: l.r3
            @Override // p149l.jtk.InterfaceC17856a
            /* JADX INFO: renamed from: a */
            public final void mo125326a(String str) {
                ptk.m171332h().m171334g(str);
            }
        }).m143112d(new jtk.InterfaceC17857b() { // from class: l.s3
            @Override // p149l.jtk.InterfaceC17857b
            /* JADX INFO: renamed from: a */
            public final void mo135260a(String str) {
                this.f162032a.m124354y4(strArr, str);
            }
        });
        if (TextUtils.equals("click", bLiveBubbleConfig.disAppearMod)) {
            jtkVarM143112d.m143110b(new jtk.InterfaceC17856a() { // from class: l.t3
                @Override // p149l.jtk.InterfaceC17856a
                /* JADX INFO: renamed from: a */
                public final void mo125326a(String str) {
                    this.f167558a.m124355z4(str);
                }
            });
        } else if (TextUtils.equals("timing", bLiveBubbleConfig.disAppearMod)) {
            jtkVarM143112d.m143109a(bLiveBubbleConfig.bubbleDisappear * 1000);
        } else {
            jtkVarM143112d.m143110b(new jtk.InterfaceC17856a() { // from class: l.u3
                @Override // p149l.jtk.InterfaceC17856a
                /* JADX INFO: renamed from: a */
                public final void mo125326a(String str) {
                    this.f173562a.m124315A4(str);
                }
            }).m143109a(bLiveBubbleConfig.bubbleDisappear * 1000);
        }
        mo124338Z4(bLiveBubbleConfig, sf3Var);
        if (m124336W4(bLiveBubbleConfig)) {
            View view = aVar.f100534a;
            strArr[0] = ptkVarM171332h.m171344r(jtkVarM143112d, view, (ViewGroup) view.getRootView());
        } else {
            strArr[0] = ptkVarM171332h.m171344r(jtkVarM143112d, aVar.f100534a, (ViewGroup) this.viewModel);
        }
        this.f100533v.add(strArr[0]);
        mo124323I4(bLiveBubbleConfig.type);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(new v9j() { // from class: l.f3
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f94240a.mo124345p4();
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.q3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152350a.m124348s4((BLiveMonetizationConfig) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.y3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj).equals(C4319c.f15549j));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.z3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201294a.m124349t4((C4319c) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().KeyboardEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.a4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67431a.m124350u4((KeyboardEventData) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().BootBubbleEvent.showBubbleById().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.b4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73275a.m124333T4((String) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().BootBubbleEvent.showBubbleByType().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.c4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79050a.m124334U4((String) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().BootBubbleEvent.dismissBubble().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.d4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84269a.m124343n4((String) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().BootBubbleEvent.showExtraBubble().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.e4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89234a.m124335V4((BLiveBubbleConfig) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T4 */
    public final void m124333T4(String str) {
        BLiveBubbleConfig bLiveBubbleConfig = this.f100527p.get(str);
        if (bLiveBubbleConfig == null) {
            return;
        }
        this.f100528q.add(0, bLiveBubbleConfig.f44340id);
        this.f100529r.put(bLiveBubbleConfig.f44340id, m124346q4(bLiveBubbleConfig));
        m124292M4();
    }

    @Deprecated
    /* JADX INFO: renamed from: U4 */
    public final void m124334U4(final String str) {
        BLiveBubbleConfig bLiveBubbleConfig = (BLiveBubbleConfig) vwb.m200346r(this.f100527p.values(), new w9j() { // from class: l.m3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLiveBubbleConfig) obj).type));
            }
        });
        if (bLiveBubbleConfig == null) {
            return;
        }
        this.f100528q.add(0, bLiveBubbleConfig.f44340id);
        this.f100529r.put(bLiveBubbleConfig.f44340id, m124346q4(bLiveBubbleConfig));
        m124292M4();
    }

    /* JADX INFO: renamed from: V4 */
    public void m124335V4(BLiveBubbleConfig bLiveBubbleConfig) {
        if (bLiveBubbleConfig == null) {
            return;
        }
        this.f100528q.add(0, bLiveBubbleConfig.f44340id);
        this.f100529r.put(bLiveBubbleConfig.f44340id, m124346q4(bLiveBubbleConfig));
        this.f100527p.put(bLiveBubbleConfig.f44340id, bLiveBubbleConfig);
        m124292M4();
    }

    /* JADX INFO: renamed from: W4 */
    public boolean m124336W4(BLiveBubbleConfig bLiveBubbleConfig) {
        return bLiveBubbleConfig.type.equals("firstRechargeGiftDialogBubble");
    }

    /* JADX INFO: renamed from: X4 */
    public final void m124337X4(List<BLiveBubbleConfig> list, List<String> list2) {
        if (list == null) {
            return;
        }
        this.f100528q.clear();
        HashMap mapM200319d = vwb.m200319d(list, new w9j() { // from class: l.v3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveBubbleConfig) obj).f44340id;
            }
        }, new w9j() { // from class: l.w3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return AbstractC16991g4.m124311f4((BLiveBubbleConfig) obj);
            }
        });
        for (int i = 0; i < list2.size(); i++) {
            if (mapM200319d.get(list2.get(i)) != null) {
                this.f100528q.add(list2.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public void mo124338Z4(BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var) {
        sf3Var.f164193a.put(mo96662j3());
        tpd0 tpd0Var = sf3Var.f164195c;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        tpd0 tpd0Var2 = sf3Var.f164196d;
        tpd0Var2.put(Integer.valueOf(tpd0Var2.get().intValue() + 1));
        tpd0 tpd0Var3 = this.f100531t;
        tpd0Var3.put(Integer.valueOf(tpd0Var3.get().intValue() + 1));
        tpd0 tpd0Var4 = this.f100530s;
        tpd0Var4.put(Integer.valueOf(tpd0Var4.get().intValue() + 1));
        this.f100523l++;
    }

    @Override // p149l.h4t
    /* JADX INFO: renamed from: j3 */
    public String mo96662j3() {
        User userM132146l0 = m206027E2().m132146l0();
        return userM132146l0 == null ? "" : userM132146l0.f56011id;
    }

    /* JADX INFO: renamed from: j4 */
    public abstract boolean mo124339j4(String str);

    /* JADX INFO: renamed from: k4 */
    public boolean mo124340k4(BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var) {
        return sf3Var.f164195c.get().intValue() < bLiveBubbleConfig.bubbleEveryDayShowMaxCount && sf3Var.f164196d.get().intValue() < bLiveBubbleConfig.bubbleUserShowMaxCount;
    }

    /* JADX INFO: renamed from: l4 */
    public boolean mo124341l4() {
        return false;
    }

    /* JADX INFO: renamed from: m4 */
    public void m124342m4() {
        if (vwb.m200296J(this.f100533v)) {
            return;
        }
        vwb.m200354z(this.f100533v, new e30() { // from class: l.n3
            @Override // p149l.e30
            public final void call(Object obj) {
                ptk.m171332h().m171334g((String) obj);
            }
        });
        this.f100533v.clear();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m124342m4();
        this.f100524m = 0L;
    }

    /* JADX INFO: renamed from: n4 */
    public final void m124343n4(String str) {
        if (TextUtils.equals(str, this.f100525n)) {
            m124342m4();
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final boolean m124344o4() {
        return !vdt.m198092b(2);
    }

    /* JADX INFO: renamed from: p4 */
    public abstract C22306c<BLiveMonetizationConfig> mo124345p4();

    /* JADX INFO: renamed from: q4 */
    public final sf3 m124346q4(BLiveBubbleConfig bLiveBubbleConfig) {
        sf3 sf3Var = new sf3();
        sf3Var.f164193a = m124318D4(bLiveBubbleConfig.type);
        sf3Var.f164194b = m124319E4(bLiveBubbleConfig.type);
        sf3Var.f164195c = m124320F4(bLiveBubbleConfig.type);
        sf3Var.f164196d = m124321G4(bLiveBubbleConfig.type);
        return sf3Var;
    }

    /* JADX INFO: renamed from: r4 */
    public abstract a mo124347r4(String str, int i);

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m124348s4(BLiveMonetizationConfig bLiveMonetizationConfig) {
        this.f100520i = bLiveMonetizationConfig.totalBubbleUserShowMaxCount;
        this.f100521j = bLiveMonetizationConfig.totalBubbleEveryDayShowMaxCount;
        this.f100522k = bLiveMonetizationConfig.totalBubbleUserShowInRoomCount;
        List<BLiveBubbleConfig> listM200339n = bLiveMonetizationConfig.bubbleConfigs;
        if (listM200339n != null) {
            if (m124344o4()) {
                listM200339n = vwb.m200339n(bLiveMonetizationConfig.bubbleConfigs, new w9j() { // from class: l.i3
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals("live", ((BLiveBubbleConfig) obj).liveType));
                    }
                });
            }
            if (listM200339n != null) {
                this.f100527p = vwb.m200319d(listM200339n, new w9j() { // from class: l.j3
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((BLiveBubbleConfig) obj).f44340id;
                    }
                }, new w9j() { // from class: l.k3
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return AbstractC16991g4.m124299U3((BLiveBubbleConfig) obj);
                    }
                });
            } else {
                this.f100527p = new HashMap<>();
            }
            m124337X4(m124330Q4().m136764R3(listM200339n), m206032L2() ? bLiveMonetizationConfig.anchorBubblePriority : bLiveMonetizationConfig.audienceBubblePriority);
            m124327N4();
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m124304Y4();
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m124349t4(C4319c c4319c) {
        m124342m4();
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m124350u4(KeyboardEventData keyboardEventData) {
        m124331R4(!keyboardEventData.m71825b());
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m124351v4(String str) {
        BLiveBubbleConfig bLiveBubbleConfig = this.f100527p.get(str);
        if (bLiveBubbleConfig != null) {
            this.f100529r.put(bLiveBubbleConfig.f44340id, m124346q4(bLiveBubbleConfig));
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m124352w4(String str) {
        sf3 sf3Var = this.f100529r.get(str);
        if (sf3Var != null) {
            sf3Var.f164195c.put(0);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m124353x4(String[] strArr, Long l2) {
        this.f100533v.remove(strArr[0]);
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m124354y4(final String[] strArr, String str) {
        m129300I3(m206027E2().m132142j2(2, TimeUnit.SECONDS), true).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.x3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f190856a.m124353x4(strArr, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m124355z4(String str) {
        m124342m4();
    }
}
