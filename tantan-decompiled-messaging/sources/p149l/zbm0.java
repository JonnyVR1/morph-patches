package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p046p1.mobile.putong.live.livingroom.voice.bubble.VoiceLiveBubbleView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zbm0<D extends ho2> extends h4t<D, VoiceLiveBubbleView> {

    /* JADX INFO: renamed from: i */
    public int f202452i;

    /* JADX INFO: renamed from: j */
    public int f202453j;

    /* JADX INFO: renamed from: k */
    public int f202454k;

    /* JADX INFO: renamed from: l */
    public int f202455l;

    /* JADX INFO: renamed from: m */
    public long f202456m;

    /* JADX INFO: renamed from: n */
    public String f202457n;

    /* JADX INFO: renamed from: o */
    public e5o0 f202458o;

    /* JADX INFO: renamed from: p */
    public HashMap<String, BLiveBubbleConfig> f202459p;

    /* JADX INFO: renamed from: q */
    public final List<String> f202460q;

    /* JADX INFO: renamed from: r */
    public final HashMap<String, kkm0> f202461r;

    /* JADX INFO: renamed from: s */
    public tpd0 f202462s;

    /* JADX INFO: renamed from: t */
    public tpd0 f202463t;

    /* JADX INFO: renamed from: u */
    public zpd0 f202464u;

    /* JADX INFO: renamed from: v */
    public List<String> f202465v;

    public zbm0(bsm<D> bsmVar) {
        super(bsmVar);
        this.f202459p = new HashMap<>();
        this.f202460q = new ArrayList();
        this.f202461r = new HashMap<>();
        this.f202462s = new tpd0("voice_total_user_count" + ypv.f199493a.m199309D0(), 0);
        this.f202463t = new tpd0("voice_total_everyday_count" + ypv.f199493a.m199309D0(), 0);
        this.f202464u = new zpd0("voice_latest_show_time" + ypv.f199493a.m199309D0(), 0L);
        this.f202465v = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m217913A4(String str) {
        m217977m4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public /* synthetic */ Boolean m217914B4(Long l2) {
        return Boolean.valueOf(C4319c.f15548i.equals(lifecycle_()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public /* synthetic */ void m217915C4(Long l2) {
        this.f202456m = l2.longValue();
        m217928M4();
    }

    /* JADX INFO: renamed from: D4 */
    private uqd0 m217916D4(String str) {
        return new uqd0("voice_bubble_anchor_id" + str + ypv.f199493a.m199309D0(), "");
    }

    /* JADX INFO: renamed from: E4 */
    private uqd0 m217917E4(String str) {
        return new uqd0("voice_bubble_id" + str + ypv.f199493a.m199309D0(), "");
    }

    /* JADX INFO: renamed from: F4 */
    private tpd0 m217918F4(String str) {
        return new tpd0("voice_bubble_today_times" + str + ypv.f199493a.m199309D0(), 0);
    }

    /* JADX INFO: renamed from: G4 */
    private tpd0 m217919G4(String str) {
        return new tpd0("voice_bubble_total_times" + str + ypv.f199493a.m199309D0(), 0);
    }

    /* JADX INFO: renamed from: H4 */
    private boolean m217920H4(BLiveBubbleConfig bLiveBubbleConfig) {
        return this.f202456m < ((long) bLiveBubbleConfig.bubbleShowAfterWatch);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ BLiveBubbleConfig m217921J3(BLiveBubbleConfig bLiveBubbleConfig) {
        return bLiveBubbleConfig;
    }

    /* JADX INFO: renamed from: J4 */
    private boolean m217922J4() {
        return this.f202455l >= this.f202454k;
    }

    /* JADX INFO: renamed from: K4 */
    private boolean m217924K4() {
        return this.f202463t.get().intValue() >= this.f202453j;
    }

    /* JADX INFO: renamed from: L4 */
    private boolean m217926L4() {
        return this.f202462s.get().intValue() >= this.f202452i;
    }

    /* JADX INFO: renamed from: M4 */
    private void m217928M4() {
        BLiveBubbleConfig bLiveBubbleConfig;
        kkm0 kkm0Var;
        if (vwb.m200296J(this.f202465v) && C4319c.f15548i.equals(lifecycle_()) && !m217922J4() && !m217926L4()) {
            if (!mqi0.m155929D(this.f202464u.get().longValue())) {
                m217933P4();
            }
            if (m217924K4() || this.f202460q.isEmpty() || (bLiveBubbleConfig = this.f202459p.get(this.f202460q.get(0))) == null || mo217974j4(bLiveBubbleConfig.type) || m217920H4(bLiveBubbleConfig) || (kkm0Var = this.f202461r.get(bLiveBubbleConfig.f44340id)) == null) {
                return;
            }
            this.f202457n = bLiveBubbleConfig.type;
            this.f202460q.remove(0);
            if (m217975k4(bLiveBubbleConfig, kkm0Var)) {
                AbstractC16991g4.a aVarMo217980r4 = mo217980r4(bLiveBubbleConfig.type, TextUtils.isEmpty(bLiveBubbleConfig.buttonId) ? -1 : Integer.parseInt(bLiveBubbleConfig.buttonId));
                if (aVarMo217980r4 == null || aVarMo217980r4.f100534a == null) {
                    return;
                }
                mo217968O4(bLiveBubbleConfig.type, aVarMo217980r4, bLiveBubbleConfig, kkm0Var);
            }
        }
    }

    /* JADX INFO: renamed from: N4 */
    private void m217930N4() {
        this.f202461r.clear();
        vwb.m200354z(this.f202460q, new e30() { // from class: l.nbm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138047a.m217962v4((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P4 */
    private void m217933P4() {
        this.f202463t.put(0);
        vwb.m200354z(this.f202460q, new e30() { // from class: l.bbm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74859a.m217963w4((String) obj);
            }
        });
        this.f202464u.put(Long.valueOf(mqi0.m155944o()));
    }

    /* JADX INFO: renamed from: R4 */
    private void m217935R4(final boolean z) {
        if (vwb.m200296J(this.f202465v)) {
            return;
        }
        vwb.m200354z(this.f202465v, new e30() { // from class: l.fbm0
            @Override // p149l.e30
            public final void call(Object obj) {
                ptk.m171332h().m171343q((String) obj, z);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ BLiveBubbleConfig m217937T3(BLiveBubbleConfig bLiveBubbleConfig) {
        return bLiveBubbleConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public void m217938T4(String str) {
        BLiveBubbleConfig bLiveBubbleConfig = this.f202459p.get(str);
        if (bLiveBubbleConfig == null) {
            return;
        }
        this.f202460q.add(0, bLiveBubbleConfig.f44340id);
        this.f202461r.put(bLiveBubbleConfig.f44340id, m217979q4(bLiveBubbleConfig));
        m217928M4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    /* JADX INFO: renamed from: U4 */
    public void m217940U4(final String str) {
        BLiveBubbleConfig bLiveBubbleConfig = (BLiveBubbleConfig) vwb.m200346r(this.f202459p.values(), new w9j() { // from class: l.hbm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLiveBubbleConfig) obj).type));
            }
        });
        if (bLiveBubbleConfig == null) {
            return;
        }
        this.f202460q.add(0, bLiveBubbleConfig.f44340id);
        this.f202461r.put(bLiveBubbleConfig.f44340id, m217979q4(bLiveBubbleConfig));
        m217928M4();
    }

    /* JADX INFO: renamed from: X4 */
    private void m217944X4(List<BLiveBubbleConfig> list, List<String> list2) {
        if (list == null) {
            return;
        }
        this.f202460q.clear();
        HashMap mapM200319d = vwb.m200319d(list, new w9j() { // from class: l.obm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveBubbleConfig) obj).f44340id;
            }
        }, new w9j() { // from class: l.pbm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zbm0.m217937T3((BLiveBubbleConfig) obj);
            }
        });
        for (int i = 0; i < list2.size(); i++) {
            if (mapM200319d.get(list2.get(i)) != null) {
                this.f202460q.add(list2.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: Y4 */
    private void m217946Y4() {
        m129300I3(m206027E2().m132145k2(TimeUnit.SECONDS), true).filter(new w9j() { // from class: l.ybm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() >= 2);
            }
        }).filter(new w9j() { // from class: l.zam0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f202380a.m217914B4((Long) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.abm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68731a.m217915C4((Long) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public void m217957n4(String str) {
        if (TextUtils.equals(str, this.f202457n)) {
            m217977m4();
        }
    }

    /* JADX INFO: renamed from: o4 */
    private boolean m217958o4() {
        return !vdt.m198092b(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public /* synthetic */ void m217959s4(BLiveMonetizationConfig bLiveMonetizationConfig) {
        this.f202452i = bLiveMonetizationConfig.totalBubbleUserShowMaxCount;
        this.f202453j = bLiveMonetizationConfig.totalBubbleEveryDayShowMaxCount;
        this.f202454k = bLiveMonetizationConfig.totalBubbleUserShowInRoomCount;
        List<BLiveBubbleConfig> listM200339n = bLiveMonetizationConfig.bubbleConfigs;
        if (listM200339n != null) {
            if (m217958o4()) {
                listM200339n = vwb.m200339n(bLiveMonetizationConfig.bubbleConfigs, new w9j() { // from class: l.cbm0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(BLiveType.voiceLive.equalsIgnoreCase(((BLiveBubbleConfig) obj).liveType));
                    }
                });
            }
            if (listM200339n != null) {
                this.f202459p = vwb.m200319d(listM200339n, new w9j() { // from class: l.dbm0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((BLiveBubbleConfig) obj).f44340id;
                    }
                }, new w9j() { // from class: l.ebm0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return zbm0.m217921J3((BLiveBubbleConfig) obj);
                    }
                });
            } else {
                this.f202459p = new HashMap<>();
            }
            m217944X4(m217969Q4().m114889R3(listM200339n), m206032L2() ? bLiveMonetizationConfig.anchorBubblePriority : bLiveMonetizationConfig.audienceBubblePriority);
            m217930N4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public /* synthetic */ void m217960t4(C4319c c4319c) {
        m217977m4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public /* synthetic */ void m217961u4(KeyboardEventData keyboardEventData) {
        m217935R4(!keyboardEventData.m71825b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m217962v4(String str) {
        BLiveBubbleConfig bLiveBubbleConfig = this.f202459p.get(str);
        if (bLiveBubbleConfig != null) {
            this.f202461r.put(bLiveBubbleConfig.f44340id, m217979q4(bLiveBubbleConfig));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m217963w4(String str) {
        kkm0 kkm0Var = this.f202461r.get(str);
        if (kkm0Var != null) {
            kkm0Var.f123575c.put(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m217964x4(String[] strArr, Long l2) {
        this.f202465v.remove(strArr[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m217965y4(final String[] strArr, String str) {
        m129300I3(m206027E2().m132142j2(2, TimeUnit.SECONDS), true).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.qbm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153680a.m217964x4(strArr, (Long) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m217966z4(String str) {
        m217977m4();
    }

    /* JADX INFO: renamed from: I4 */
    public abstract void mo217967I4(String str);

    /* JADX INFO: renamed from: O4 */
    public abstract void mo217968O4(String str, AbstractC16991g4.a aVar, BLiveBubbleConfig bLiveBubbleConfig, kkm0 kkm0Var);

    /* JADX INFO: renamed from: Q4 */
    public final e5o0 m217969Q4() {
        e5o0 e5o0Var = this.f202458o;
        if (e5o0Var != null) {
            m144506C2(e5o0Var);
        }
        if (this.f202458o == null) {
            this.f202458o = new e5o0(this.f188512e);
        }
        return this.f202458o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S4 */
    public void m217970S4(BLiveBubbleConfig bLiveBubbleConfig, kkm0 kkm0Var, AbstractC16991g4.a aVar) {
        if (bLiveBubbleConfig.bubbleTextList.isEmpty() || TextUtils.isEmpty(bLiveBubbleConfig.bubbleTextList.get(0))) {
            return;
        }
        ptk ptkVarM171332h = ptk.m171332h();
        final String[] strArr = new String[1];
        jtk jtkVarM143112d = new jtk(act()).m143129u(bLiveBubbleConfig.bubbleTextList.get(0)).m143115g(jtk.f119616C, t100.m186890d(12.0f)).m143127s(xdl0.m208407w(16.0f), xdl0.m208407w(10.0f), xdl0.m208407w(16.0f), xdl0.m208407w(10.0f)).m143124p(xdl0.m208407w(12.0f)).m143113e(Color.parseColor("#" + bLiveBubbleConfig.bubbleStartColor), Color.parseColor("#" + bLiveBubbleConfig.bubbleEndColor)).m143119k(true).m143128t(13).m143125q(-1).m143130v(false).m143117i(jtk.f119617D).m143109a(bLiveBubbleConfig.bubbleDisappear * 1000).m143110b(new jtk.InterfaceC17856a() { // from class: l.ibm0
            @Override // p149l.jtk.InterfaceC17856a
            /* JADX INFO: renamed from: a */
            public final void mo125326a(String str) {
                ptk.m171332h().m171334g(str);
            }
        }).m143112d(new jtk.InterfaceC17857b() { // from class: l.kbm0
            @Override // p149l.jtk.InterfaceC17857b
            /* JADX INFO: renamed from: a */
            public final void mo135260a(String str) {
                this.f122253a.m217965y4(strArr, str);
            }
        });
        if (TextUtils.equals("click", bLiveBubbleConfig.disAppearMod)) {
            jtkVarM143112d.m143110b(new jtk.InterfaceC17856a() { // from class: l.lbm0
                @Override // p149l.jtk.InterfaceC17856a
                /* JADX INFO: renamed from: a */
                public final void mo125326a(String str) {
                    this.f127323a.m217966z4(str);
                }
            });
        } else if (TextUtils.equals("timing", bLiveBubbleConfig.disAppearMod)) {
            jtkVarM143112d.m143109a(bLiveBubbleConfig.bubbleDisappear * 1000);
        } else {
            jtkVarM143112d.m143110b(new jtk.InterfaceC17856a() { // from class: l.mbm0
                @Override // p149l.jtk.InterfaceC17856a
                /* JADX INFO: renamed from: a */
                public final void mo125326a(String str) {
                    this.f133042a.m217913A4(str);
                }
            }).m143109a(bLiveBubbleConfig.bubbleDisappear * 1000);
        }
        m217973Z4(bLiveBubbleConfig, kkm0Var);
        if (m217972W4(bLiveBubbleConfig)) {
            View view = aVar.f100534a;
            strArr[0] = ptkVarM171332h.m171344r(jtkVarM143112d, view, (ViewGroup) view.getRootView());
        } else if (((VoiceLiveBubbleView) this.viewModel).getWidth() == 0) {
            return;
        } else {
            strArr[0] = ptkVarM171332h.m171344r(jtkVarM143112d, aVar.f100534a, (ViewGroup) this.viewModel);
        }
        this.f202465v.add(strArr[0]);
        mo217967I4(bLiveBubbleConfig.type);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(new v9j() { // from class: l.yam0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f197224a.mo217978p4();
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.jbm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117200a.m217959s4((BLiveMonetizationConfig) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.rbm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj).equals(C4319c.f15549j));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.sbm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163565a.m217960t4((C4319c) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().KeyboardEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.tbm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169280a.m217961u4((KeyboardEventData) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().BootBubbleEvent.showBubbleById().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ubm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175730a.m217938T4((String) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().BootBubbleEvent.showBubbleByType().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.vbm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180859a.m217940U4((String) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().BootBubbleEvent.dismissBubble().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.wbm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185603a.m217957n4((String) obj);
            }
        }));
        duringCreated((C22306c) m206028F2().BootBubbleEvent.showExtraBubble().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.xbm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191956a.m217971V4((BLiveBubbleConfig) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V4 */
    public void m217971V4(BLiveBubbleConfig bLiveBubbleConfig) {
        if (bLiveBubbleConfig == null) {
            return;
        }
        this.f202460q.add(0, bLiveBubbleConfig.f44340id);
        this.f202461r.put(bLiveBubbleConfig.f44340id, m217979q4(bLiveBubbleConfig));
        this.f202459p.put(bLiveBubbleConfig.f44340id, bLiveBubbleConfig);
        m217928M4();
    }

    /* JADX INFO: renamed from: W4 */
    public boolean m217972W4(BLiveBubbleConfig bLiveBubbleConfig) {
        return bLiveBubbleConfig.type.equals("firstRechargeGiftDialogBubble");
    }

    /* JADX INFO: renamed from: Z4 */
    public void m217973Z4(BLiveBubbleConfig bLiveBubbleConfig, kkm0 kkm0Var) {
        kkm0Var.f123573a.put(mo96662j3());
        tpd0 tpd0Var = kkm0Var.f123575c;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        tpd0 tpd0Var2 = kkm0Var.f123576d;
        tpd0Var2.put(Integer.valueOf(tpd0Var2.get().intValue() + 1));
        tpd0 tpd0Var3 = this.f202463t;
        tpd0Var3.put(Integer.valueOf(tpd0Var3.get().intValue() + 1));
        tpd0 tpd0Var4 = this.f202462s;
        tpd0Var4.put(Integer.valueOf(tpd0Var4.get().intValue() + 1));
        this.f202455l++;
    }

    @Override // p149l.h4t
    /* JADX INFO: renamed from: j3 */
    public String mo96662j3() {
        User userM132146l0 = m206027E2().m132146l0();
        return userM132146l0 == null ? "" : userM132146l0.f56011id;
    }

    /* JADX INFO: renamed from: j4 */
    public abstract boolean mo217974j4(String str);

    /* JADX INFO: renamed from: k4 */
    public boolean m217975k4(BLiveBubbleConfig bLiveBubbleConfig, kkm0 kkm0Var) {
        return kkm0Var.f123575c.get().intValue() < bLiveBubbleConfig.bubbleEveryDayShowMaxCount && kkm0Var.f123576d.get().intValue() < bLiveBubbleConfig.bubbleUserShowMaxCount;
    }

    /* JADX INFO: renamed from: l4 */
    public boolean m217976l4() {
        return false;
    }

    /* JADX INFO: renamed from: m4 */
    public void m217977m4() {
        if (vwb.m200296J(this.f202465v)) {
            return;
        }
        vwb.m200354z(this.f202465v, new e30() { // from class: l.gbm0
            @Override // p149l.e30
            public final void call(Object obj) {
                ptk.m171332h().m171334g((String) obj);
            }
        });
        this.f202465v.clear();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m217977m4();
        this.f202456m = 0L;
    }

    /* JADX INFO: renamed from: p4 */
    public abstract C22306c<BLiveMonetizationConfig> mo217978p4();

    /* JADX INFO: renamed from: q4 */
    public final kkm0 m217979q4(BLiveBubbleConfig bLiveBubbleConfig) {
        kkm0 kkm0Var = new kkm0();
        kkm0Var.f123573a = m217916D4(bLiveBubbleConfig.type);
        kkm0Var.f123574b = m217917E4(bLiveBubbleConfig.type);
        kkm0Var.f123575c = m217918F4(bLiveBubbleConfig.type);
        kkm0Var.f123576d = m217919G4(bLiveBubbleConfig.type);
        return kkm0Var;
    }

    /* JADX INFO: renamed from: r4 */
    public abstract AbstractC16991g4.a mo217980r4(String str, int i);

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m217946Y4();
    }
}
