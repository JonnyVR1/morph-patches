package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p051p1.mobile.putong.live.livingroom.voice.bubble.VoiceLiveBubbleView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dlm0<D extends oo2> extends i6t<D, VoiceLiveBubbleView> {

    /* JADX INFO: renamed from: i */
    public int f89548i;

    /* JADX INFO: renamed from: j */
    public int f89549j;

    /* JADX INFO: renamed from: k */
    public int f89550k;

    /* JADX INFO: renamed from: l */
    public int f89551l;

    /* JADX INFO: renamed from: m */
    public long f89552m;

    /* JADX INFO: renamed from: n */
    public String f89553n;

    /* JADX INFO: renamed from: o */
    public ieo0 f89554o;

    /* JADX INFO: renamed from: p */
    public HashMap<String, BLiveBubbleConfig> f89555p;

    /* JADX INFO: renamed from: q */
    public final List<String> f89556q;

    /* JADX INFO: renamed from: r */
    public final HashMap<String, otm0> f89557r;

    /* JADX INFO: renamed from: s */
    public vxd0 f89558s;

    /* JADX INFO: renamed from: t */
    public vxd0 f89559t;

    /* JADX INFO: renamed from: u */
    public byd0 f89560u;

    /* JADX INFO: renamed from: v */
    public List<String> f89561v;

    public dlm0(dum<D> dumVar) {
        super(dumVar);
        this.f89555p = new HashMap<>();
        this.f89556q = new ArrayList();
        this.f89557r = new HashMap<>();
        this.f89558s = new vxd0("voice_total_user_count" + zrv.f205799a.m207631D0(), 0);
        this.f89559t = new vxd0("voice_total_everyday_count" + zrv.f205799a.m207631D0(), 0);
        this.f89560u = new byd0("voice_latest_show_time" + zrv.f205799a.m207631D0(), 0L);
        this.f89561v = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m116773A4(String str) {
        m116837m4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public /* synthetic */ Boolean m116774B4(Long l2) {
        return Boolean.valueOf(C4470c.f16267i.equals(lifecycle_()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public /* synthetic */ void m116775C4(Long l2) {
        this.f89552m = l2.longValue();
        m116788M4();
    }

    /* JADX INFO: renamed from: D4 */
    private wyd0 m116776D4(String str) {
        return new wyd0("voice_bubble_anchor_id" + str + zrv.f205799a.m207631D0(), "");
    }

    /* JADX INFO: renamed from: E4 */
    private wyd0 m116777E4(String str) {
        return new wyd0("voice_bubble_id" + str + zrv.f205799a.m207631D0(), "");
    }

    /* JADX INFO: renamed from: F4 */
    private vxd0 m116778F4(String str) {
        return new vxd0("voice_bubble_today_times" + str + zrv.f205799a.m207631D0(), 0);
    }

    /* JADX INFO: renamed from: G4 */
    private vxd0 m116779G4(String str) {
        return new vxd0("voice_bubble_total_times" + str + zrv.f205799a.m207631D0(), 0);
    }

    /* JADX INFO: renamed from: H4 */
    private boolean m116780H4(BLiveBubbleConfig bLiveBubbleConfig) {
        return this.f89552m < ((long) bLiveBubbleConfig.bubbleShowAfterWatch);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ BLiveBubbleConfig m116781J3(BLiveBubbleConfig bLiveBubbleConfig) {
        return bLiveBubbleConfig;
    }

    /* JADX INFO: renamed from: J4 */
    private boolean m116782J4() {
        return this.f89551l >= this.f89550k;
    }

    /* JADX INFO: renamed from: K4 */
    private boolean m116784K4() {
        return this.f89559t.get().intValue() >= this.f89549j;
    }

    /* JADX INFO: renamed from: L4 */
    private boolean m116786L4() {
        return this.f89558s.get().intValue() >= this.f89548i;
    }

    /* JADX INFO: renamed from: M4 */
    private void m116788M4() {
        BLiveBubbleConfig bLiveBubbleConfig;
        otm0 otm0Var;
        if (jyb.m147479J(this.f89561v) && C4470c.f16267i.equals(lifecycle_()) && !m116782J4() && !m116786L4()) {
            if (!pzi0.m174439D(this.f89560u.get().longValue())) {
                m116793P4();
            }
            if (m116784K4() || this.f89556q.isEmpty() || (bLiveBubbleConfig = this.f89555p.get(this.f89556q.get(0))) == null || mo116834j4(bLiveBubbleConfig.type) || m116780H4(bLiveBubbleConfig) || (otm0Var = this.f89557r.get(bLiveBubbleConfig.f45188id)) == null) {
                return;
            }
            this.f89553n = bLiveBubbleConfig.type;
            this.f89556q.remove(0);
            if (m116835k4(bLiveBubbleConfig, otm0Var)) {
                AbstractC17128g4.a aVarMo116840r4 = mo116840r4(bLiveBubbleConfig.type, TextUtils.isEmpty(bLiveBubbleConfig.buttonId) ? -1 : Integer.parseInt(bLiveBubbleConfig.buttonId));
                if (aVarMo116840r4 == null || aVarMo116840r4.f102050a == null) {
                    return;
                }
                mo116828O4(bLiveBubbleConfig.type, aVarMo116840r4, bLiveBubbleConfig, otm0Var);
            }
        }
    }

    /* JADX INFO: renamed from: N4 */
    private void m116790N4() {
        this.f89557r.clear();
        jyb.m147537z(this.f89556q, new y20() { // from class: l.rkm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163632a.m116822v4((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P4 */
    private void m116793P4() {
        this.f89559t.put(0);
        jyb.m147537z(this.f89556q, new y20() { // from class: l.fkm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99532a.m116823w4((String) obj);
            }
        });
        this.f89560u.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: R4 */
    private void m116795R4(final boolean z) {
        if (jyb.m147479J(this.f89561v)) {
            return;
        }
        jyb.m147537z(this.f89561v, new y20() { // from class: l.jkm0
            @Override // p153l.y20
            public final void call(Object obj) {
                fwk.m127777h().m127788q((String) obj, z);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ BLiveBubbleConfig m116797T3(BLiveBubbleConfig bLiveBubbleConfig) {
        return bLiveBubbleConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public void m116798T4(String str) {
        BLiveBubbleConfig bLiveBubbleConfig = this.f89555p.get(str);
        if (bLiveBubbleConfig == null) {
            return;
        }
        this.f89556q.add(0, bLiveBubbleConfig.f45188id);
        this.f89557r.put(bLiveBubbleConfig.f45188id, m116839q4(bLiveBubbleConfig));
        m116788M4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    /* JADX INFO: renamed from: U4 */
    public void m116800U4(final String str) {
        BLiveBubbleConfig bLiveBubbleConfig = (BLiveBubbleConfig) jyb.m147529r(this.f89555p.values(), new qcj() { // from class: l.lkm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLiveBubbleConfig) obj).type));
            }
        });
        if (bLiveBubbleConfig == null) {
            return;
        }
        this.f89556q.add(0, bLiveBubbleConfig.f45188id);
        this.f89557r.put(bLiveBubbleConfig.f45188id, m116839q4(bLiveBubbleConfig));
        m116788M4();
    }

    /* JADX INFO: renamed from: X4 */
    private void m116804X4(List<BLiveBubbleConfig> list, List<String> list2) {
        if (list == null) {
            return;
        }
        this.f89556q.clear();
        HashMap mapM147502d = jyb.m147502d(list, new qcj() { // from class: l.skm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveBubbleConfig) obj).f45188id;
            }
        }, new qcj() { // from class: l.tkm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return dlm0.m116797T3((BLiveBubbleConfig) obj);
            }
        });
        for (int i = 0; i < list2.size(); i++) {
            if (mapM147502d.get(list2.get(i)) != null) {
                this.f89556q.add(list2.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: Y4 */
    private void m116806Y4() {
        m138859I3(m213810E2().m168531k2(TimeUnit.SECONDS), true).filter(new qcj() { // from class: l.clm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() >= 2);
            }
        }).filter(new qcj() { // from class: l.dkm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f89420a.m116774B4((Long) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.ekm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94413a.m116775C4((Long) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public void m116817n4(String str) {
        if (TextUtils.equals(str, this.f89553n)) {
            m116837m4();
        }
    }

    /* JADX INFO: renamed from: o4 */
    private boolean m116818o4() {
        return !wft.m206159b(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m116819s4(BLiveMonetizationConfig bLiveMonetizationConfig) {
        this.f89548i = bLiveMonetizationConfig.totalBubbleUserShowMaxCount;
        this.f89549j = bLiveMonetizationConfig.totalBubbleEveryDayShowMaxCount;
        this.f89550k = bLiveMonetizationConfig.totalBubbleUserShowInRoomCount;
        List<BLiveBubbleConfig> listM147522n = bLiveMonetizationConfig.bubbleConfigs;
        if (listM147522n != null) {
            if (m116818o4()) {
                listM147522n = jyb.m147522n(bLiveMonetizationConfig.bubbleConfigs, new qcj() { // from class: l.gkm0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(BLiveType.voiceLive.equalsIgnoreCase(((BLiveBubbleConfig) obj).liveType));
                    }
                });
            }
            if (listM147522n != null) {
                this.f89555p = jyb.m147502d(listM147522n, new qcj() { // from class: l.hkm0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((BLiveBubbleConfig) obj).f45188id;
                    }
                }, new qcj() { // from class: l.ikm0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return dlm0.m116781J3((BLiveBubbleConfig) obj);
                    }
                });
            } else {
                this.f89555p = new HashMap<>();
            }
            m116804X4(m116829Q4().m139645R3(listM147522n), m213815L2() ? bLiveMonetizationConfig.anchorBubblePriority : bLiveMonetizationConfig.audienceBubblePriority);
            m116790N4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public /* synthetic */ void m116820t4(C4470c c4470c) {
        m116837m4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m116821u4(KeyboardEventData keyboardEventData) {
        m116795R4(!keyboardEventData.m73008b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m116822v4(String str) {
        BLiveBubbleConfig bLiveBubbleConfig = this.f89555p.get(str);
        if (bLiveBubbleConfig != null) {
            this.f89557r.put(bLiveBubbleConfig.f45188id, m116839q4(bLiveBubbleConfig));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m116823w4(String str) {
        otm0 otm0Var = this.f89557r.get(str);
        if (otm0Var != null) {
            otm0Var.f148991c.put(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m116824x4(String[] strArr, Long l2) {
        this.f89561v.remove(strArr[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m116825y4(final String[] strArr, String str) {
        m138859I3(m213810E2().m168528j2(2, TimeUnit.SECONDS), true).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.ukm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179438a.m116824x4(strArr, (Long) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m116826z4(String str) {
        m116837m4();
    }

    /* JADX INFO: renamed from: I4 */
    public abstract void mo116827I4(String str);

    /* JADX INFO: renamed from: O4 */
    public abstract void mo116828O4(String str, AbstractC17128g4.a aVar, BLiveBubbleConfig bLiveBubbleConfig, otm0 otm0Var);

    /* JADX INFO: renamed from: Q4 */
    public final ieo0 m116829Q4() {
        ieo0 ieo0Var = this.f89554o;
        if (ieo0Var != null) {
            m153097C2(ieo0Var);
        }
        if (this.f89554o == null) {
            this.f89554o = new ieo0(this.f196918e);
        }
        return this.f89554o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    public void m116830S4(BLiveBubbleConfig bLiveBubbleConfig, otm0 otm0Var, AbstractC17128g4.a aVar) {
        if (bLiveBubbleConfig.bubbleTextList.isEmpty() || TextUtils.isEmpty(bLiveBubbleConfig.bubbleTextList.get(0))) {
            return;
        }
        fwk fwkVarM127777h = fwk.m127777h();
        final String[] strArr = new String[1];
        zvk zvkVarM221759d = new zvk(act()).m221776u(bLiveBubbleConfig.bubbleTextList.get(0)).m221762g(zvk.f206226C, qa00.m175859d(12.0f)).m221774s(bnl0.m105587w(16.0f), bnl0.m105587w(10.0f), bnl0.m105587w(16.0f), bnl0.m105587w(10.0f)).m221771p(bnl0.m105587w(12.0f)).m221760e(Color.parseColor("#" + bLiveBubbleConfig.bubbleStartColor), Color.parseColor("#" + bLiveBubbleConfig.bubbleEndColor)).m221766k(true).m221775t(13).m221772q(-1).m221777v(false).m221764i(zvk.f206227D).m221756a(bLiveBubbleConfig.bubbleDisappear * 1000).m221757b(new zvk.InterfaceC21905a() { // from class: l.mkm0
            @Override // p153l.zvk.InterfaceC21905a
            /* JADX INFO: renamed from: a */
            public final void mo102709a(String str) {
                fwk.m127777h().m127779g(str);
            }
        }).m221759d(new zvk.InterfaceC21906b() { // from class: l.okm0
            @Override // p153l.zvk.InterfaceC21906b
            /* JADX INFO: renamed from: a */
            public final void mo96261a(String str) {
                this.f147765a.m116825y4(strArr, str);
            }
        });
        if (TextUtils.equals("click", bLiveBubbleConfig.disAppearMod)) {
            zvkVarM221759d.m221757b(new zvk.InterfaceC21905a() { // from class: l.pkm0
                @Override // p153l.zvk.InterfaceC21905a
                /* JADX INFO: renamed from: a */
                public final void mo102709a(String str) {
                    this.f152867a.m116826z4(str);
                }
            });
        } else if (TextUtils.equals("timing", bLiveBubbleConfig.disAppearMod)) {
            zvkVarM221759d.m221756a(bLiveBubbleConfig.bubbleDisappear * 1000);
        } else {
            zvkVarM221759d.m221757b(new zvk.InterfaceC21905a() { // from class: l.qkm0
                @Override // p153l.zvk.InterfaceC21905a
                /* JADX INFO: renamed from: a */
                public final void mo102709a(String str) {
                    this.f158161a.m116773A4(str);
                }
            }).m221756a(bLiveBubbleConfig.bubbleDisappear * 1000);
        }
        m116833Z4(bLiveBubbleConfig, otm0Var);
        if (m116832W4(bLiveBubbleConfig)) {
            View view = aVar.f102050a;
            strArr[0] = fwkVarM127777h.m127789r(zvkVarM221759d, view, (ViewGroup) view.getRootView());
        } else if (((VoiceLiveBubbleView) this.viewModel).getWidth() == 0) {
            return;
        } else {
            strArr[0] = fwkVarM127777h.m127789r(zvkVarM221759d, aVar.f102050a, (ViewGroup) this.viewModel);
        }
        this.f89561v.add(strArr[0]);
        mo116827I4(bLiveBubbleConfig.type);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(new pcj() { // from class: l.ckm0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f82301a.mo116838p4();
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.nkm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142471a.m116819s4((BLiveMonetizationConfig) obj);
            }
        }));
        lifecycle().filter(new qcj() { // from class: l.vkm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj).equals(C4470c.f16268j));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.wkm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189576a.m116820t4((C4470c) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().KeyboardEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.xkm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194799a.m116821u4((KeyboardEventData) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().BootBubbleEvent.showBubbleById().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ykm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200427a.m116798T4((String) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().BootBubbleEvent.showBubbleByType().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.zkm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204786a.m116800U4((String) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().BootBubbleEvent.dismissBubble().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.alm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72135a.m116817n4((String) obj);
            }
        }));
        duringCreated((C22421c) m213811F2().BootBubbleEvent.showExtraBubble().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.blm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77201a.m116831V4((BLiveBubbleConfig) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V4 */
    public void m116831V4(BLiveBubbleConfig bLiveBubbleConfig) {
        if (bLiveBubbleConfig == null) {
            return;
        }
        this.f89556q.add(0, bLiveBubbleConfig.f45188id);
        this.f89557r.put(bLiveBubbleConfig.f45188id, m116839q4(bLiveBubbleConfig));
        this.f89555p.put(bLiveBubbleConfig.f45188id, bLiveBubbleConfig);
        m116788M4();
    }

    /* JADX INFO: renamed from: W4 */
    public boolean m116832W4(BLiveBubbleConfig bLiveBubbleConfig) {
        return bLiveBubbleConfig.type.equals("firstRechargeGiftDialogBubble");
    }

    /* JADX INFO: renamed from: Z4 */
    public void m116833Z4(BLiveBubbleConfig bLiveBubbleConfig, otm0 otm0Var) {
        otm0Var.f148989a.put(mo104749j3());
        vxd0 vxd0Var = otm0Var.f148991c;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        vxd0 vxd0Var2 = otm0Var.f148992d;
        vxd0Var2.put(Integer.valueOf(vxd0Var2.get().intValue() + 1));
        vxd0 vxd0Var3 = this.f89559t;
        vxd0Var3.put(Integer.valueOf(vxd0Var3.get().intValue() + 1));
        vxd0 vxd0Var4 = this.f89558s;
        vxd0Var4.put(Integer.valueOf(vxd0Var4.get().intValue() + 1));
        this.f89551l++;
    }

    @Override // p153l.i6t
    /* JADX INFO: renamed from: j3 */
    public String mo104749j3() {
        User userM168532l0 = m213810E2().m168532l0();
        return userM168532l0 == null ? "" : userM168532l0.f56859id;
    }

    /* JADX INFO: renamed from: j4 */
    public abstract boolean mo116834j4(String str);

    /* JADX INFO: renamed from: k4 */
    public boolean m116835k4(BLiveBubbleConfig bLiveBubbleConfig, otm0 otm0Var) {
        return otm0Var.f148991c.get().intValue() < bLiveBubbleConfig.bubbleEveryDayShowMaxCount && otm0Var.f148992d.get().intValue() < bLiveBubbleConfig.bubbleUserShowMaxCount;
    }

    /* JADX INFO: renamed from: l4 */
    public boolean m116836l4() {
        return false;
    }

    /* JADX INFO: renamed from: m4 */
    public void m116837m4() {
        if (jyb.m147479J(this.f89561v)) {
            return;
        }
        jyb.m147537z(this.f89561v, new y20() { // from class: l.kkm0
            @Override // p153l.y20
            public final void call(Object obj) {
                fwk.m127777h().m127779g((String) obj);
            }
        });
        this.f89561v.clear();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m116837m4();
        this.f89552m = 0L;
    }

    /* JADX INFO: renamed from: p4 */
    public abstract C22421c<BLiveMonetizationConfig> mo116838p4();

    /* JADX INFO: renamed from: q4 */
    public final otm0 m116839q4(BLiveBubbleConfig bLiveBubbleConfig) {
        otm0 otm0Var = new otm0();
        otm0Var.f148989a = m116776D4(bLiveBubbleConfig.type);
        otm0Var.f148990b = m116777E4(bLiveBubbleConfig.type);
        otm0Var.f148991c = m116778F4(bLiveBubbleConfig.type);
        otm0Var.f148992d = m116779G4(bLiveBubbleConfig.type);
        return otm0Var;
    }

    /* JADX INFO: renamed from: r4 */
    public abstract AbstractC17128g4.a mo116840r4(String str, int i);

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m116806Y4();
    }
}
