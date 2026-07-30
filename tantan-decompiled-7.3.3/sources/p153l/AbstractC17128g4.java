package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p051p1.mobile.putong.live.livingroom.common.bubble.LiveBubbleView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: renamed from: l.g4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17128g4<D extends oo2> extends i6t<D, LiveBubbleView> {

    /* JADX INFO: renamed from: i */
    public int f102036i;

    /* JADX INFO: renamed from: j */
    public int f102037j;

    /* JADX INFO: renamed from: k */
    public int f102038k;

    /* JADX INFO: renamed from: l */
    public int f102039l;

    /* JADX INFO: renamed from: m */
    public long f102040m;

    /* JADX INFO: renamed from: n */
    public String f102041n;

    /* JADX INFO: renamed from: o */
    public ws40 f102042o;

    /* JADX INFO: renamed from: p */
    public HashMap<String, BLiveBubbleConfig> f102043p;

    /* JADX INFO: renamed from: q */
    public final List<String> f102044q;

    /* JADX INFO: renamed from: r */
    public final HashMap<String, gg3> f102045r;

    /* JADX INFO: renamed from: s */
    public vxd0 f102046s;

    /* JADX INFO: renamed from: t */
    public vxd0 f102047t;

    /* JADX INFO: renamed from: u */
    public byd0 f102048u;

    /* JADX INFO: renamed from: v */
    public List<String> f102049v;

    /* JADX INFO: renamed from: l.g4$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public View f102050a;

        public a(View view) {
            this.f102050a = view;
        }
    }

    public AbstractC17128g4(dum<D> dumVar) {
        super(dumVar);
        this.f102043p = new HashMap<>();
        this.f102044q = new ArrayList();
        this.f102045r = new HashMap<>();
        this.f102046s = new vxd0("total_user_count" + zrv.f205799a.m207631D0(), 0);
        this.f102047t = new vxd0("total_everyday_count" + zrv.f205799a.m207631D0(), 0);
        this.f102048u = new byd0("latest_show_time" + zrv.f205799a.m207631D0(), 0L);
        this.f102049v = new ArrayList();
    }

    /* JADX INFO: renamed from: M4 */
    private void m128767M4() {
        BLiveBubbleConfig bLiveBubbleConfig;
        gg3 gg3Var;
        if (jyb.m147479J(this.f102049v) && C4470c.f16267i.equals(lifecycle_()) && !m128798J4() && !m128800L4()) {
            if (!pzi0.m174439D(this.f102048u.get().longValue())) {
                m128803P4();
            }
            if (m128799K4() || this.f102044q.isEmpty() || (bLiveBubbleConfig = this.f102043p.get(this.f102044q.get(0))) == null || mo128812j4(bLiveBubbleConfig.type) || m128797H4(bLiveBubbleConfig) || (gg3Var = this.f102045r.get(bLiveBubbleConfig.f45188id)) == null) {
                return;
            }
            this.f102041n = bLiveBubbleConfig.type;
            this.f102044q.remove(0);
            if (mo95418k4(bLiveBubbleConfig, gg3Var)) {
                a aVarMo128818r4 = mo128818r4(bLiveBubbleConfig.type, TextUtils.isEmpty(bLiveBubbleConfig.buttonId) ? -1 : Integer.parseInt(bLiveBubbleConfig.buttonId));
                if (aVarMo128818r4 == null || aVarMo128818r4.f102050a == null) {
                    return;
                }
                mo128802O4(bLiveBubbleConfig.type, aVarMo128818r4, bLiveBubbleConfig, gg3Var);
            }
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static /* synthetic */ BLiveBubbleConfig m128774U3(BLiveBubbleConfig bLiveBubbleConfig) {
        return bLiveBubbleConfig;
    }

    /* JADX INFO: renamed from: Y4 */
    private void m128779Y4() {
        m138859I3(m213810E2().m168531k2(TimeUnit.SECONDS), true).filter(new qcj() { // from class: l.f4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() >= 2);
            }
        }).filter(new qcj() { // from class: l.g3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f101905a.m128791B4((Long) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.h3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107608a.m128792C4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ BLiveBubbleConfig m128786f4(BLiveBubbleConfig bLiveBubbleConfig) {
        return bLiveBubbleConfig;
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m128790A4(String str) {
        m128813m4();
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ Boolean m128791B4(Long l2) {
        return Boolean.valueOf(C4470c.f16267i.equals(lifecycle_()));
    }

    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ void m128792C4(Long l2) {
        this.f102040m = l2.longValue();
        m128767M4();
    }

    /* JADX INFO: renamed from: D4 */
    public final wyd0 m128793D4(String str) {
        return new wyd0("bubble_anchor_id" + str + zrv.f205799a.m207631D0(), "");
    }

    /* JADX INFO: renamed from: E4 */
    public final wyd0 m128794E4(String str) {
        return new wyd0("bubble_id" + str + zrv.f205799a.m207631D0(), "");
    }

    /* JADX INFO: renamed from: F4 */
    public final vxd0 m128795F4(String str) {
        return new vxd0("bubble_today_times" + str + zrv.f205799a.m207631D0(), 0);
    }

    /* JADX INFO: renamed from: G4 */
    public final vxd0 m128796G4(String str) {
        return new vxd0("bubble_total_times" + str + zrv.f205799a.m207631D0(), 0);
    }

    /* JADX INFO: renamed from: H4 */
    public final boolean m128797H4(BLiveBubbleConfig bLiveBubbleConfig) {
        return this.f102040m < ((long) bLiveBubbleConfig.bubbleShowAfterWatch);
    }

    /* JADX INFO: renamed from: I4 */
    public abstract void mo95417I4(String str);

    /* JADX INFO: renamed from: J4 */
    public final boolean m128798J4() {
        return this.f102039l >= this.f102038k;
    }

    /* JADX INFO: renamed from: K4 */
    public final boolean m128799K4() {
        return this.f102047t.get().intValue() >= this.f102037j;
    }

    /* JADX INFO: renamed from: L4 */
    public final boolean m128800L4() {
        return this.f102046s.get().intValue() >= this.f102036i;
    }

    /* JADX INFO: renamed from: N4 */
    public final void m128801N4() {
        this.f102045r.clear();
        jyb.m147537z(this.f102044q, new y20() { // from class: l.p3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150348a.m128822v4((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O4 */
    public abstract void mo128802O4(String str, a aVar, BLiveBubbleConfig bLiveBubbleConfig, gg3 gg3Var);

    /* JADX INFO: renamed from: P4 */
    public final void m128803P4() {
        this.f102047t.put(0);
        jyb.m147537z(this.f102044q, new y20() { // from class: l.l3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129826a.m128823w4((String) obj);
            }
        });
        this.f102048u.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: Q4 */
    public final ws40 m128804Q4() {
        ws40 ws40Var = this.f102042o;
        if (ws40Var != null) {
            m153097C2(ws40Var);
        }
        if (this.f102042o == null) {
            this.f102042o = new ws40(this.f196918e);
        }
        return this.f102042o;
    }

    /* JADX INFO: renamed from: R4 */
    public final void m128805R4(final boolean z) {
        if (jyb.m147479J(this.f102049v)) {
            return;
        }
        jyb.m147537z(this.f102049v, new y20() { // from class: l.o3
            @Override // p153l.y20
            public final void call(Object obj) {
                fwk.m127777h().m127788q((String) obj, z);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    public void m128806S4(BLiveBubbleConfig bLiveBubbleConfig, gg3 gg3Var, a aVar) {
        if (bLiveBubbleConfig.bubbleTextList.isEmpty()) {
            return;
        }
        fwk fwkVarM127777h = fwk.m127777h();
        final String[] strArr = new String[1];
        zvk zvkVarM221759d = new zvk(act()).m221776u(bLiveBubbleConfig.bubbleTextList.get(0)).m221762g(zvk.f206226C, qa00.m175859d(12.0f)).m221774s(bnl0.m105587w(16.0f), bnl0.m105587w(10.0f), bnl0.m105587w(16.0f), bnl0.m105587w(10.0f)).m221771p(bnl0.m105587w(12.0f)).m221760e(Color.parseColor("#" + bLiveBubbleConfig.bubbleStartColor), Color.parseColor("#" + bLiveBubbleConfig.bubbleEndColor)).m221766k(true).m221775t(13).m221772q(-1).m221777v(false).m221764i(zvk.f206227D).m221756a(bLiveBubbleConfig.bubbleDisappear * 1000).m221757b(new zvk.InterfaceC21905a() { // from class: l.r3
            @Override // p153l.zvk.InterfaceC21905a
            /* JADX INFO: renamed from: a */
            public final void mo102709a(String str) {
                fwk.m127777h().m127779g(str);
            }
        }).m221759d(new zvk.InterfaceC21906b() { // from class: l.s3
            @Override // p153l.zvk.InterfaceC21906b
            /* JADX INFO: renamed from: a */
            public final void mo96261a(String str) {
                this.f165946a.m128825y4(strArr, str);
            }
        });
        if (TextUtils.equals("click", bLiveBubbleConfig.disAppearMod)) {
            zvkVarM221759d.m221757b(new zvk.InterfaceC21905a() { // from class: l.t3
                @Override // p153l.zvk.InterfaceC21905a
                /* JADX INFO: renamed from: a */
                public final void mo102709a(String str) {
                    this.f171842a.m128826z4(str);
                }
            });
        } else if (TextUtils.equals("timing", bLiveBubbleConfig.disAppearMod)) {
            zvkVarM221759d.m221756a(bLiveBubbleConfig.bubbleDisappear * 1000);
        } else {
            zvkVarM221759d.m221757b(new zvk.InterfaceC21905a() { // from class: l.u3
                @Override // p153l.zvk.InterfaceC21905a
                /* JADX INFO: renamed from: a */
                public final void mo102709a(String str) {
                    this.f177273a.m128790A4(str);
                }
            }).m221756a(bLiveBubbleConfig.bubbleDisappear * 1000);
        }
        mo109357Z4(bLiveBubbleConfig, gg3Var);
        if (m128810W4(bLiveBubbleConfig)) {
            View view = aVar.f102050a;
            strArr[0] = fwkVarM127777h.m127789r(zvkVarM221759d, view, (ViewGroup) view.getRootView());
        } else {
            strArr[0] = fwkVarM127777h.m127789r(zvkVarM221759d, aVar.f102050a, (ViewGroup) this.viewModel);
        }
        this.f102049v.add(strArr[0]);
        mo95417I4(bLiveBubbleConfig.type);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(new pcj() { // from class: l.f3
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f96936a.mo128816p4();
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.q3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155404a.m128819s4((BLiveMonetizationConfig) obj);
            }
        }));
        lifecycle().filter(new qcj() { // from class: l.y3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj).equals(C4470c.f16268j));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.z3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202773a.m128820t4((C4470c) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().KeyboardEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.a4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68343a.m128821u4((KeyboardEventData) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().BootBubbleEvent.showBubbleById().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.b4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74841a.m128807T4((String) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().BootBubbleEvent.showBubbleByType().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.c4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79655a.m128808U4((String) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().BootBubbleEvent.dismissBubble().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.d4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84994a.m128814n4((String) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().BootBubbleEvent.showExtraBubble().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.e4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92021a.m128809V4((BLiveBubbleConfig) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T4 */
    public final void m128807T4(String str) {
        BLiveBubbleConfig bLiveBubbleConfig = this.f102043p.get(str);
        if (bLiveBubbleConfig == null) {
            return;
        }
        this.f102044q.add(0, bLiveBubbleConfig.f45188id);
        this.f102045r.put(bLiveBubbleConfig.f45188id, m128817q4(bLiveBubbleConfig));
        m128767M4();
    }

    @Deprecated
    /* JADX INFO: renamed from: U4 */
    public final void m128808U4(final String str) {
        BLiveBubbleConfig bLiveBubbleConfig = (BLiveBubbleConfig) jyb.m147529r(this.f102043p.values(), new qcj() { // from class: l.m3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLiveBubbleConfig) obj).type));
            }
        });
        if (bLiveBubbleConfig == null) {
            return;
        }
        this.f102044q.add(0, bLiveBubbleConfig.f45188id);
        this.f102045r.put(bLiveBubbleConfig.f45188id, m128817q4(bLiveBubbleConfig));
        m128767M4();
    }

    /* JADX INFO: renamed from: V4 */
    public void m128809V4(BLiveBubbleConfig bLiveBubbleConfig) {
        if (bLiveBubbleConfig == null) {
            return;
        }
        this.f102044q.add(0, bLiveBubbleConfig.f45188id);
        this.f102045r.put(bLiveBubbleConfig.f45188id, m128817q4(bLiveBubbleConfig));
        this.f102043p.put(bLiveBubbleConfig.f45188id, bLiveBubbleConfig);
        m128767M4();
    }

    /* JADX INFO: renamed from: W4 */
    public boolean m128810W4(BLiveBubbleConfig bLiveBubbleConfig) {
        return bLiveBubbleConfig.type.equals("firstRechargeGiftDialogBubble");
    }

    /* JADX INFO: renamed from: X4 */
    public final void m128811X4(List<BLiveBubbleConfig> list, List<String> list2) {
        if (list == null) {
            return;
        }
        this.f102044q.clear();
        HashMap mapM147502d = jyb.m147502d(list, new qcj() { // from class: l.v3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveBubbleConfig) obj).f45188id;
            }
        }, new qcj() { // from class: l.w3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return AbstractC17128g4.m128786f4((BLiveBubbleConfig) obj);
            }
        });
        for (int i = 0; i < list2.size(); i++) {
            if (mapM147502d.get(list2.get(i)) != null) {
                this.f102044q.add(list2.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public void mo109357Z4(BLiveBubbleConfig bLiveBubbleConfig, gg3 gg3Var) {
        gg3Var.f103987a.put(mo104749j3());
        vxd0 vxd0Var = gg3Var.f103989c;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        vxd0 vxd0Var2 = gg3Var.f103990d;
        vxd0Var2.put(Integer.valueOf(vxd0Var2.get().intValue() + 1));
        vxd0 vxd0Var3 = this.f102047t;
        vxd0Var3.put(Integer.valueOf(vxd0Var3.get().intValue() + 1));
        vxd0 vxd0Var4 = this.f102046s;
        vxd0Var4.put(Integer.valueOf(vxd0Var4.get().intValue() + 1));
        this.f102039l++;
    }

    @Override // p153l.i6t
    /* JADX INFO: renamed from: j3 */
    public String mo104749j3() {
        User userM168532l0 = m213810E2().m168532l0();
        return userM168532l0 == null ? "" : userM168532l0.f56859id;
    }

    /* JADX INFO: renamed from: j4 */
    public abstract boolean mo128812j4(String str);

    /* JADX INFO: renamed from: k4 */
    public boolean mo95418k4(BLiveBubbleConfig bLiveBubbleConfig, gg3 gg3Var) {
        return gg3Var.f103989c.get().intValue() < bLiveBubbleConfig.bubbleEveryDayShowMaxCount && gg3Var.f103990d.get().intValue() < bLiveBubbleConfig.bubbleUserShowMaxCount;
    }

    /* JADX INFO: renamed from: l4 */
    public boolean mo109360l4() {
        return false;
    }

    /* JADX INFO: renamed from: m4 */
    public void m128813m4() {
        if (jyb.m147479J(this.f102049v)) {
            return;
        }
        jyb.m147537z(this.f102049v, new y20() { // from class: l.n3
            @Override // p153l.y20
            public final void call(Object obj) {
                fwk.m127777h().m127779g((String) obj);
            }
        });
        this.f102049v.clear();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m128813m4();
        this.f102040m = 0L;
    }

    /* JADX INFO: renamed from: n4 */
    public final void m128814n4(String str) {
        if (TextUtils.equals(str, this.f102041n)) {
            m128813m4();
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final boolean m128815o4() {
        return !wft.m206159b(2);
    }

    /* JADX INFO: renamed from: p4 */
    public abstract C22421c<BLiveMonetizationConfig> mo128816p4();

    /* JADX INFO: renamed from: q4 */
    public final gg3 m128817q4(BLiveBubbleConfig bLiveBubbleConfig) {
        gg3 gg3Var = new gg3();
        gg3Var.f103987a = m128793D4(bLiveBubbleConfig.type);
        gg3Var.f103988b = m128794E4(bLiveBubbleConfig.type);
        gg3Var.f103989c = m128795F4(bLiveBubbleConfig.type);
        gg3Var.f103990d = m128796G4(bLiveBubbleConfig.type);
        return gg3Var;
    }

    /* JADX INFO: renamed from: r4 */
    public abstract a mo128818r4(String str, int i);

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m128819s4(BLiveMonetizationConfig bLiveMonetizationConfig) {
        this.f102036i = bLiveMonetizationConfig.totalBubbleUserShowMaxCount;
        this.f102037j = bLiveMonetizationConfig.totalBubbleEveryDayShowMaxCount;
        this.f102038k = bLiveMonetizationConfig.totalBubbleUserShowInRoomCount;
        List<BLiveBubbleConfig> listM147522n = bLiveMonetizationConfig.bubbleConfigs;
        if (listM147522n != null) {
            if (m128815o4()) {
                listM147522n = jyb.m147522n(bLiveMonetizationConfig.bubbleConfigs, new qcj() { // from class: l.i3
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals("live", ((BLiveBubbleConfig) obj).liveType));
                    }
                });
            }
            if (listM147522n != null) {
                this.f102043p = jyb.m147502d(listM147522n, new qcj() { // from class: l.j3
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((BLiveBubbleConfig) obj).f45188id;
                    }
                }, new qcj() { // from class: l.k3
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return AbstractC17128g4.m128774U3((BLiveBubbleConfig) obj);
                    }
                });
            } else {
                this.f102043p = new HashMap<>();
            }
            m128811X4(m128804Q4().m207747R3(listM147522n), m213815L2() ? bLiveMonetizationConfig.anchorBubblePriority : bLiveMonetizationConfig.audienceBubblePriority);
            m128801N4();
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m128779Y4();
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m128820t4(C4470c c4470c) {
        m128813m4();
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m128821u4(KeyboardEventData keyboardEventData) {
        m128805R4(!keyboardEventData.m73008b());
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m128822v4(String str) {
        BLiveBubbleConfig bLiveBubbleConfig = this.f102043p.get(str);
        if (bLiveBubbleConfig != null) {
            this.f102045r.put(bLiveBubbleConfig.f45188id, m128817q4(bLiveBubbleConfig));
        }
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m128823w4(String str) {
        gg3 gg3Var = this.f102045r.get(str);
        if (gg3Var != null) {
            gg3Var.f103989c.put(0);
        }
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m128824x4(String[] strArr, Long l2) {
        this.f102049v.remove(strArr[0]);
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m128825y4(final String[] strArr, String str) {
        m138859I3(m213810E2().m168528j2(2, TimeUnit.SECONDS), true).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.x3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192213a.m128824x4(strArr, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m128826z4(String str) {
        m128813m4();
    }
}
