package p002l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveFollowConditions;
import com.p1.mobile.putong.live.base.data.BLiveFollowRateBubbleV2;
import com.p1.mobile.putong.live.base.data.BLiveFollowRateChatV2;
import com.p1.mobile.putong.live.base.data.BLiveFollowRateConfigV2;
import com.p1.mobile.putong.live.base.data.BLiveFollowRatePopupV2;
import com.p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p1.mobile.putong.live.base.data.BLivePostEvent;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.ffw;
import l.fld0;
import l.hpd0;
import l.idv;
import l.mqi0;
import l.soj0;
import l.tpd0;
import l.uqd0;
import l.vwb;
import l.w8u;
import l.w9j;
import l.ypv;
import l.yqd0;
import l.zpd0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nvi extends pat<ho2> {

    /* JADX INFO: renamed from: A */
    public ArrayList<C0709a> f16223A;

    /* JADX INFO: renamed from: B */
    public C0709a f16224B;

    /* JADX INFO: renamed from: C */
    public C0709a f16225C;

    /* JADX INFO: renamed from: D */
    public C0709a f16226D;

    /* JADX INFO: renamed from: i */
    public String f16227i;

    /* JADX INFO: renamed from: j */
    public hpd0 f16228j;

    /* JADX INFO: renamed from: k */
    public tpd0 f16229k;

    /* JADX INFO: renamed from: l */
    public tpd0 f16230l;

    /* JADX INFO: renamed from: m */
    public tpd0 f16231m;

    /* JADX INFO: renamed from: n */
    public zpd0 f16232n;

    /* JADX INFO: renamed from: o */
    public zpd0 f16233o;

    /* JADX INFO: renamed from: p */
    public zpd0 f16234p;

    /* JADX INFO: renamed from: q */
    public zpd0 f16235q;

    /* JADX INFO: renamed from: r */
    public ArrayList<C0709a> f16236r;

    /* JADX INFO: renamed from: s */
    public long f16237s;

    /* JADX INFO: renamed from: t */
    public boolean f16238t;

    /* JADX INFO: renamed from: u */
    public int f16239u;

    /* JADX INFO: renamed from: v */
    public long f16240v;

    /* JADX INFO: renamed from: w */
    public double f16241w;

    /* JADX INFO: renamed from: x */
    public double f16242x;

    /* JADX INFO: renamed from: y */
    public ArrayList<C0709a> f16243y;

    /* JADX INFO: renamed from: z */
    public ArrayList<C0709a> f16244z;

    /* JADX INFO: renamed from: l.nvi$a */
    public static class C0709a {

        /* JADX INFO: renamed from: a */
        public int f16245a;

        /* JADX INFO: renamed from: b */
        public String f16246b;

        /* JADX INFO: renamed from: c */
        public String f16247c;

        public C0709a(String str, int i, String str2) {
            this.f16245a = i;
            this.f16246b = str;
            this.f16247c = str2;
        }

        public String toString() {
            return "ActionItem{num=" + this.f16245a + ", action='" + this.f16246b + "', type='" + this.f16247c + "'}";
        }
    }

    public nvi(bsm bsmVar) {
        super(bsmVar);
        this.f16227i = ypv.a.D0();
        this.f16228j = new hpd0("need_show_follow_anchor_bubble" + this.f16227i, Boolean.TRUE);
        this.f16229k = new tpd0("follow_guide_count_chat" + this.f16227i, 0);
        this.f16230l = new tpd0("follow_guide_count_bubble" + this.f16227i, 0);
        this.f16231m = new tpd0("follow_guide_count_menu" + this.f16227i, 0);
        this.f16232n = new zpd0("follow_guide_last_time" + this.f16227i, 0L);
        this.f16233o = new zpd0("follow_guide_last_bubble_time" + this.f16227i, 0L);
        this.f16234p = new zpd0("follow_guide_last_bottom_menu_time" + this.f16227i, 0L);
        this.f16235q = new zpd0("follow_guide_last_chat_time" + this.f16227i, 0L);
        this.f16236r = new ArrayList<>();
        this.f16243y = new ArrayList<>();
        this.f16244z = new ArrayList<>();
        this.f16223A = new ArrayList<>();
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m19055J3(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(",");
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ int m19066V3(C0709a c0709a, C0709a c0709a2) {
        return c0709a.f16245a - c0709a2.f16245a;
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ void m19071a4(Throwable th) {
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m19073c4(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m19077A4(soj0 soj0Var) {
        m19080D4();
    }

    /* JADX INFO: renamed from: B4 */
    public final ArrayList<String> m19078B4(String str) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(str.split(",")));
        vwb.d0(arrayList, new w9j() { // from class: l.cvi
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.isEmpty((String) obj));
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: C4 */
    public void m19079C4() {
        this.f16237s = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: D4 */
    public void m19080D4() {
        if (vwb.J(this.f16223A)) {
            return;
        }
        this.f16239u++;
        C0709a c0709a = this.f16223A.get(0);
        if (this.f16239u >= c0709a.f16245a) {
            this.f16223A.remove(c0709a);
            m19088l4(c0709a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: E4 */
    public final void m19081E4(String str) {
        BLivePostEvent bLivePostEventNew_ = BLivePostEvent.new_();
        bLivePostEventNew_.eventName = str;
        bLivePostEventNew_.anchorId = m25547E2().m17234j().anchor.id;
        BLiveFollowConditions bLiveFollowConditionsNew_ = BLiveFollowConditions.new_();
        bLiveFollowConditionsNew_.watchTime = String.valueOf(this.f16240v);
        bLiveFollowConditionsNew_.msgCount = String.valueOf(this.f16239u);
        bLiveFollowConditionsNew_.rewardPoint = String.valueOf(this.f16242x);
        bLivePostEventNew_.eventInfo = bLiveFollowConditionsNew_;
        if (w220.m24291b()) {
            bLivePostEventNew_.fakeId = w220.m24290a();
        }
        LivingNormalApiProvider.m4571D7(str, bLivePostEventNew_).subscribe(ffw.e(new e30() { // from class: l.dvi
            public final void call(Object obj) {
                nvi.m19073c4((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.evi
            public final void call(Object obj) {
                nvi.m19071a4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F4 */
    public void m19082F4() {
        if (((Boolean) this.f16228j.get()).booleanValue()) {
            this.f16228j.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final void m19083g4(final C0709a c0709a) {
        if (!m19087k4(c0709a) && ((C0709a) vwb.r(this.f16236r, new w9j() { // from class: l.vui
            public final Object call(Object obj) {
                nvi.C0709a c0709a2 = c0709a;
                nvi.C0709a c0709a3 = (nvi.C0709a) obj;
                return Boolean.valueOf(c0709a3.f16246b.equals(c0709a2.f16246b) && c0709a3.f16247c.equals(c0709a2.f16247c));
            }
        })) == null) {
            this.f16236r.add(c0709a);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m19084h4(List<String> list, final BLiveFollowConditions bLiveFollowConditions, final String str) {
        vwb.z(list, new e30() { // from class: l.avi
            public final void call(Object obj) {
                this.f7896a.m19091o4(str, bLiveFollowConditions, (String) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [l.ho2] */
    /* JADX INFO: renamed from: i4 */
    public final boolean m19085i4(long j) {
        return (this.f16236r.isEmpty() || this.f16238t || m25547E2().m14524R0() || SystemClock.elapsedRealtime() - this.f16237s <= ypv.k().I3() * 1000 || m25551K2().m22224l(LiveDialogEnum.FAST_RECHARGE, LiveDialogEnum.GIFT, LiveDialogEnum.MEMBER, LiveDialogEnum.USER_CARD, LiveDialogEnum.WEBVIEW) || ((Boolean) m14184F3(new u4d0(2100))).booleanValue() || ((Boolean) m14184F3(new zuj(2100))).booleanValue()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX INFO: renamed from: j4 */
    public final void m19086j4() {
        if (!((Boolean) this.f16228j.get()).booleanValue() || this.f16224B == null) {
            return;
        }
        m14186H3(m25547E2().m14578j2(3, TimeUnit.SECONDS)).take(1).subscribe(ffw.d(new e30() { // from class: l.rui
            public final void call(Object obj) {
                this.f18685a.m19092p4((Long) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r2v23, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v25, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r5v6, types: [l.ho2] */
    /* JADX INFO: renamed from: k4 */
    public final boolean m19087k4(C0709a c0709a) {
        byte b;
        yqd0 yqd0Var;
        int i;
        yqd0 yqd0Var2;
        int i2;
        String str = c0709a.f16246b;
        str.getClass();
        switch (str) {
            case "action_chat_message":
                b = 0;
                break;
            case "action_bottom_menu":
                b = 1;
                break;
            case "action_bubble":
                b = 2;
                break;
            default:
                b = -1;
                break;
        }
        uqd0 uqd0Var = null;
        switch (b) {
            case 0:
                yqd0Var = this.f16229k;
                i = ypv.k().K3().maxShowCount;
                yqd0Var2 = this.f16235q;
                i2 = 0;
                break;
            case 1:
                yqd0Var = this.f16231m;
                i = ypv.k().O3().maxShowCount;
                yqd0Var2 = this.f16234p;
                i2 = ypv.k().O3().minEventInterval;
                break;
            case 2:
                yqd0Var = this.f16230l;
                i = ypv.k().J3().maxShowCount;
                yqd0Var2 = this.f16233o;
                i2 = ypv.k().J3().minEventInterval;
                break;
            default:
                i2 = 3000;
                yqd0Var = null;
                yqd0Var2 = null;
                i = 0;
                break;
        }
        String str2 = c0709a.f16247c;
        str2.getClass();
        switch (str2) {
            case "followByAnchor":
                uqd0Var = new uqd0("follow_guide_anchor_follow_by_anchor" + c0709a.f16245a + this.f16227i, "");
                break;
            case "watchTime":
                uqd0Var = new uqd0("follow_guide_anchor_watch_time" + c0709a.f16245a + this.f16227i, "");
                break;
            case "chat":
                uqd0Var = new uqd0("follow_guide_anchor_chat_count" + c0709a.f16245a + this.f16227i, "");
                break;
            case "start":
                uqd0Var = new uqd0("follow_guide_anchor_first_enter" + c0709a.f16245a + this.f16227i, "");
                break;
            case "rewardPoint":
                uqd0Var = new uqd0("follow_guide_anchor_reward_point" + c0709a.f16245a + this.f16227i, "");
                break;
            case "otherFollowAnchor":
                uqd0Var = new uqd0("follow_guide_anchor_other_follow" + c0709a.f16245a + this.f16227i, "");
                break;
        }
        if (uqd0Var == null || yqd0Var == null || yqd0Var2 == null || System.currentTimeMillis() - ((Long) yqd0Var2.get()).longValue() < i2 * 1000) {
            return true;
        }
        if (!mqi0.D(((Long) this.f16232n.get()).longValue())) {
            yqd0Var.put(0);
        }
        ArrayList<String> arrayListM19078B4 = m19078B4((String) uqd0Var.get());
        if (m25547E2().m14582l0() == null) {
            return true;
        }
        boolean zContains = arrayListM19078B4.contains(((DbObject) m25547E2().m14582l0()).id);
        int i3 = ypv.k().M3().noRepeatAnchorCount;
        if (i3 > 1) {
            if (arrayListM19078B4.size() >= i3 - 1) {
                arrayListM19078B4.remove(0);
            }
            arrayListM19078B4.add(((DbObject) m25547E2().m14582l0()).id);
            final StringBuilder sb = new StringBuilder();
            vwb.z(arrayListM19078B4, new e30() { // from class: l.zui
                public final void call(Object obj) {
                    nvi.m19055J3(sb, (String) obj);
                }
            });
            uqd0Var.put(sb.toString());
        }
        if (zContains || ((Integer) yqd0Var.get()).intValue() >= i) {
            return true;
        }
        yqd0Var.put(Integer.valueOf(((Integer) yqd0Var.get()).intValue() + 1));
        this.f16232n.put(Long.valueOf(System.currentTimeMillis()));
        yqd0Var2.put(Long.valueOf(System.currentTimeMillis()));
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: l4 */
    public final void m19088l4(C0709a c0709a) {
        if (m25552L2() || m25547E2().m14524R0()) {
            return;
        }
        m19083g4(c0709a);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m19089m4(ArrayList<C0709a> arrayList) {
        vwb.z(arrayList, new e30() { // from class: l.wui
            public final void call(Object obj) {
                this.f21993a.m19093q4((nvi.C0709a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public final void m19090n4() {
        this.f16243y.clear();
        this.f16244z.clear();
        this.f16223A.clear();
        BLiveFollowRateConfigV2 bLiveFollowRateConfigV2M3 = ypv.k().M3();
        BLiveFollowRateBubbleV2 bLiveFollowRateBubbleV2 = bLiveFollowRateConfigV2M3.bubble;
        m19084h4(bLiveFollowRateBubbleV2.triggerEvents, bLiveFollowRateBubbleV2.conditions, "action_bubble");
        BLiveFollowRatePopupV2 bLiveFollowRatePopupV2 = bLiveFollowRateConfigV2M3.popup;
        m19084h4(bLiveFollowRatePopupV2.triggerEvents, bLiveFollowRatePopupV2.conditions, "action_bottom_menu");
        BLiveFollowRateChatV2 bLiveFollowRateChatV2 = bLiveFollowRateConfigV2M3.chat;
        m19084h4(bLiveFollowRateChatV2.triggerEvents, bLiveFollowRateChatV2.conditions, "action_chat_message");
        Comparator comparator = new Comparator() { // from class: l.sui
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return nvi.m19066V3((nvi.C0709a) obj, (nvi.C0709a) obj2);
            }
        };
        Collections.sort(this.f16243y, comparator);
        Collections.sort(this.f16244z, comparator);
        Collections.sort(this.f16223A, comparator);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m19091o4(String str, BLiveFollowConditions bLiveFollowConditions, String str2) {
        str2.getClass();
        switch (str2) {
            case "followByAnchor":
                this.f16225C = new C0709a(str, 0, str2);
                break;
            case "watchTime":
                this.f16243y.add(new C0709a(str, w8u.C(bLiveFollowConditions.watchTime), str2));
                break;
            case "chat":
                this.f16223A.add(new C0709a(str, w8u.C(bLiveFollowConditions.msgCount), str2));
                break;
            case "start":
                this.f16224B = new C0709a(str, 0, str2);
                break;
            case "rewardPoint":
                this.f16244z.add(new C0709a(str, w8u.C(bLiveFollowConditions.rewardPoint), str2));
                break;
            case "otherFollowAnchor":
                this.f16226D = new C0709a(str, 0, str2);
                break;
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m19092p4(Long l2) {
        m19088l4(this.f16224B);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m19093q4(C0709a c0709a) {
        String str = c0709a.f16246b;
        str.getClass();
        switch (str) {
            case "action_chat_message":
                m19081E4(c0709a.f16247c);
                if (TextUtils.equals(c0709a.f16247c, "start") && ((Boolean) this.f16228j.get()).booleanValue()) {
                    this.f16228j.put(Boolean.FALSE);
                    break;
                }
                break;
            case "action_bottom_menu":
                m25548F2().FollowDialogEvent.show().j(ypv.k().O3());
                if (TextUtils.equals(c0709a.f16247c, "start") && ((Boolean) this.f16228j.get()).booleanValue()) {
                    this.f16228j.put(Boolean.FALSE);
                    break;
                }
                break;
            case "action_bubble":
                BLiveMonetizationConfig bLiveMonetizationConfigE = ((idv) ypv.l(fld0.b)).e();
                if (bLiveMonetizationConfigE != null && ((BLiveBubbleConfig) vwb.r(bLiveMonetizationConfigE.bubbleConfigs, new w9j() { // from class: l.yui
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((BLiveBubbleConfig) obj).type, ypv.k().J3().type));
                    }
                })) != null) {
                    m25548F2().AvatarEvent.showFollowNewUserAnim().p();
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m19094r4(C0709a c0709a) {
        return Boolean.valueOf(this.f16240v >= ((long) c0709a.f16245a));
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m19095s4(Long l2) {
        this.f16240v++;
        C0709a c0709a = (C0709a) vwb.r(this.f16243y, new w9j() { // from class: l.xui
            public final Object call(Object obj) {
                return this.f22471a.m19094r4((nvi.C0709a) obj);
            }
        });
        if (c0709a != null) {
            m19088l4(c0709a);
            this.f16243y.remove(c0709a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v16, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v19, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m19096t() {
        super.t();
        if (ypv.k().N3()) {
            this.f16240v = 0L;
            this.f16241w = -1.0d;
            this.f16236r.clear();
            this.f16237s = 0L;
            this.f16238t = false;
            this.f16239u = 0;
            this.f16243y.clear();
            this.f16244z.clear();
            this.f16223A.clear();
            m19090n4();
            ?? M25547E2 = m25547E2();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            m14186H3(M25547E2.m14578j2(1, timeUnit)).subscribe(ffw.d(new e30() { // from class: l.qui
                public final void call(Object obj) {
                    this.f18238a.m19095s4((Long) obj);
                }
            }));
            m14186H3(m25547E2().m14581k2(timeUnit)).filter(new w9j() { // from class: l.bvi
                public final Object call(Object obj) {
                    return Boolean.valueOf(this.f8374a.m19085i4(((Long) obj).longValue()));
                }
            }).doOnNext(new e30() { // from class: l.fvi
                public final void call(Object obj) {
                    this.f10643a.m19099v4((Long) obj);
                }
            }).doOnNext(new e30() { // from class: l.gvi
                public final void call(Object obj) {
                    this.f11638a.m19100w4((Long) obj);
                }
            }).subscribe(ffw.c());
            duringCreated(m25547E2().m14589n1()).subscribe(ffw.d(new e30() { // from class: l.hvi
                public final void call(Object obj) {
                    this.f12278a.m19101x4((LiveControlMessage) obj);
                }
            }));
            duringCreated(m25547E2().m14586m1()).subscribe(ffw.d(new e30() { // from class: l.ivi
                public final void call(Object obj) {
                    this.f13434a.m19102y4((far) obj);
                }
            }));
            duringCreated((c) m25548F2().KeyboardEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.jvi
                public final void call(Object obj) {
                    this.f14052a.m19103z4((KeyboardEventData) obj);
                }
            }));
            duringCreated((c) m25548F2().FollowGuideEvent.onChatSendMessage().g()).subscribe(ffw.d(new e30() { // from class: l.kvi
                public final void call(Object obj) {
                    this.f14553a.m19077A4((soj0) obj);
                }
            }));
            duringCreated((c) m25548F2().FollowGuideEvent.onBubbleShow().g()).subscribe(ffw.d(new e30() { // from class: l.lvi
                public final void call(Object obj) {
                    this.f15087a.m19097t4((soj0) obj);
                }
            }));
            duringCreated((c) m25548F2().SendGiftEventGroup.sendGiftSuccess().g()).subscribe(ffw.d(new e30() { // from class: l.mvi
                public final void call(Object obj) {
                    this.f15671a.m19098u4((rge0) obj);
                }
            }));
            m19086j4();
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m19097t4(soj0 soj0Var) {
        m19082F4();
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m19098u4(rge0 rge0Var) {
        m19079C4();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m19099v4(Long l2) {
        m19089m4(this.f16236r);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m19100w4(Long l2) {
        this.f16236r.clear();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m19101x4(LiveControlMessage liveControlMessage) {
        C0709a c0709a;
        String str = liveControlMessage.type;
        str.getClass();
        if (str.equals("follow")) {
            C0709a c0709a2 = this.f16226D;
            if (c0709a2 != null) {
                m19088l4(c0709a2);
                return;
            }
            return;
        }
        if (str.equals("anchor_follow") && (c0709a = this.f16225C) != null) {
            m19088l4(c0709a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2] */
    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m19102y4(far farVar) {
        if (vwb.J(this.f16244z)) {
            return;
        }
        BLiveLeaderBoards bLiveLeaderBoards = (BLiveLeaderBoards) vwb.r(farVar.m13042d(), new w9j() { // from class: l.tui
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveLeaderBoards) obj).owner, ypv.a.D0()));
            }
        });
        if (this.f16241w == -1.0d) {
            BLiveLeaderBoards bLiveLeaderBoards2 = m25547E2().m14560d2() == null ? null : (BLiveLeaderBoards) vwb.r(m25547E2().m14560d2().m13042d(), new w9j() { // from class: l.uui
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveLeaderBoards) obj).owner, ypv.a.D0()));
                }
            });
            this.f16241w = bLiveLeaderBoards2 == null ? 0.0d : bLiveLeaderBoards2.amount;
        }
        C0709a c0709a = this.f16244z.get(0);
        double d = c0709a.f16245a;
        if (d <= 0.0d || bLiveLeaderBoards == null) {
            return;
        }
        double d2 = bLiveLeaderBoards.amount;
        double d3 = this.f16241w;
        if (d2 - d3 < d || this.f16242x == d2 - d3) {
            return;
        }
        this.f16242x = d2 - d3;
        this.f16244z.remove(c0709a);
        m19088l4(c0709a);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m19103z4(KeyboardEventData keyboardEventData) {
        this.f16238t = keyboardEventData.m5201b();
    }
}
