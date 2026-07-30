package p149l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveFollowConditions;
import com.p046p1.mobile.putong.live.base.data.BLiveFollowRateBubbleV2;
import com.p046p1.mobile.putong.live.base.data.BLiveFollowRateChatV2;
import com.p046p1.mobile.putong.live.base.data.BLiveFollowRateConfigV2;
import com.p046p1.mobile.putong.live.base.data.BLiveFollowRatePopupV2;
import com.p046p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p046p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p046p1.mobile.putong.live.base.data.BLivePostEvent;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class nvi extends pat<ho2> {

    /* JADX INFO: renamed from: A */
    public ArrayList<C18783a> f140742A;

    /* JADX INFO: renamed from: B */
    public C18783a f140743B;

    /* JADX INFO: renamed from: C */
    public C18783a f140744C;

    /* JADX INFO: renamed from: D */
    public C18783a f140745D;

    /* JADX INFO: renamed from: i */
    public String f140746i;

    /* JADX INFO: renamed from: j */
    public hpd0 f140747j;

    /* JADX INFO: renamed from: k */
    public tpd0 f140748k;

    /* JADX INFO: renamed from: l */
    public tpd0 f140749l;

    /* JADX INFO: renamed from: m */
    public tpd0 f140750m;

    /* JADX INFO: renamed from: n */
    public zpd0 f140751n;

    /* JADX INFO: renamed from: o */
    public zpd0 f140752o;

    /* JADX INFO: renamed from: p */
    public zpd0 f140753p;

    /* JADX INFO: renamed from: q */
    public zpd0 f140754q;

    /* JADX INFO: renamed from: r */
    public ArrayList<C18783a> f140755r;

    /* JADX INFO: renamed from: s */
    public long f140756s;

    /* JADX INFO: renamed from: t */
    public boolean f140757t;

    /* JADX INFO: renamed from: u */
    public int f140758u;

    /* JADX INFO: renamed from: v */
    public long f140759v;

    /* JADX INFO: renamed from: w */
    public double f140760w;

    /* JADX INFO: renamed from: x */
    public double f140761x;

    /* JADX INFO: renamed from: y */
    public ArrayList<C18783a> f140762y;

    /* JADX INFO: renamed from: z */
    public ArrayList<C18783a> f140763z;

    /* JADX INFO: renamed from: l.nvi$a */
    public static class C18783a {

        /* JADX INFO: renamed from: a */
        public int f140764a;

        /* JADX INFO: renamed from: b */
        public String f140765b;

        /* JADX INFO: renamed from: c */
        public String f140766c;

        public C18783a(String str, int i, String str2) {
            this.f140764a = i;
            this.f140765b = str;
            this.f140766c = str2;
        }

        public String toString() {
            return "ActionItem{num=" + this.f140764a + ", action='" + this.f140765b + "', type='" + this.f140766c + "'}";
        }
    }

    public nvi(bsm bsmVar) {
        super(bsmVar);
        this.f140746i = ypv.f199493a.m199309D0();
        this.f140747j = new hpd0("need_show_follow_anchor_bubble" + this.f140746i, Boolean.TRUE);
        this.f140748k = new tpd0("follow_guide_count_chat" + this.f140746i, 0);
        this.f140749l = new tpd0("follow_guide_count_bubble" + this.f140746i, 0);
        this.f140750m = new tpd0("follow_guide_count_menu" + this.f140746i, 0);
        this.f140751n = new zpd0("follow_guide_last_time" + this.f140746i, 0L);
        this.f140752o = new zpd0("follow_guide_last_bubble_time" + this.f140746i, 0L);
        this.f140753p = new zpd0("follow_guide_last_bottom_menu_time" + this.f140746i, 0L);
        this.f140754q = new zpd0("follow_guide_last_chat_time" + this.f140746i, 0L);
        this.f140755r = new ArrayList<>();
        this.f140762y = new ArrayList<>();
        this.f140763z = new ArrayList<>();
        this.f140742A = new ArrayList<>();
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m161644J3(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(Constants.SEPARATOR_COMMA);
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ int m161655V3(C18783a c18783a, C18783a c18783a2) {
        return c18783a.f140764a - c18783a2.f140764a;
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ void m161660a4(Throwable th) {
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m161662c4(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m161666A4(soj0 soj0Var) {
        m161669D4();
    }

    /* JADX INFO: renamed from: B4 */
    public final ArrayList<String> m161667B4(String str) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(str.split(Constants.SEPARATOR_COMMA)));
        vwb.m200320d0(arrayList, new w9j() { // from class: l.cvi
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.isEmpty((String) obj));
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: C4 */
    public void m161668C4() {
        this.f140756s = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: D4 */
    public void m161669D4() {
        if (vwb.m200296J(this.f140742A)) {
            return;
        }
        this.f140758u++;
        C18783a c18783a = this.f140742A.get(0);
        if (this.f140758u >= c18783a.f140764a) {
            this.f140742A.remove(c18783a);
            m161677l4(c18783a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: E4 */
    public final void m161670E4(String str) {
        BLivePostEvent bLivePostEventNew_ = BLivePostEvent.new_();
        bLivePostEventNew_.eventName = str;
        bLivePostEventNew_.anchorId = m206027E2().mo149813j().anchor.f44419id;
        BLiveFollowConditions bLiveFollowConditionsNew_ = BLiveFollowConditions.new_();
        bLiveFollowConditionsNew_.watchTime = String.valueOf(this.f140759v);
        bLiveFollowConditionsNew_.msgCount = String.valueOf(this.f140758u);
        bLiveFollowConditionsNew_.rewardPoint = String.valueOf(this.f140761x);
        bLivePostEventNew_.eventInfo = bLiveFollowConditionsNew_;
        if (w220.m201015b()) {
            bLivePostEventNew_.fakeId = w220.m201014a();
        }
        LivingNormalApiProvider.m71205D7(str, bLivePostEventNew_).subscribe(ffw.m121194e(new e30() { // from class: l.dvi
            @Override // p149l.e30
            public final void call(Object obj) {
                nvi.m161662c4((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.evi
            @Override // p149l.e30
            public final void call(Object obj) {
                nvi.m161660a4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F4 */
    public void m161671F4() {
        if (this.f140747j.get().booleanValue()) {
            this.f140747j.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final void m161672g4(final C18783a c18783a) {
        if (!m161676k4(c18783a) && ((C18783a) vwb.m200346r(this.f140755r, new w9j() { // from class: l.vui
            @Override // p149l.w9j
            public final Object call(Object obj) {
                nvi.C18783a c18783a2 = c18783a;
                nvi.C18783a c18783a3 = (nvi.C18783a) obj;
                return Boolean.valueOf(c18783a3.f140765b.equals(c18783a2.f140765b) && c18783a3.f140766c.equals(c18783a2.f140766c));
            }
        })) == null) {
            this.f140755r.add(c18783a);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m161673h4(List<String> list, final BLiveFollowConditions bLiveFollowConditions, final String str) {
        vwb.m200354z(list, new e30() { // from class: l.avi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71940a.m161680o4(str, bLiveFollowConditions, (String) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [l.ho2] */
    /* JADX INFO: renamed from: i4 */
    public final boolean m161674i4(long j) {
        return (this.f140755r.isEmpty() || this.f140757t || m206027E2().m132088R0() || SystemClock.elapsedRealtime() - this.f140756s <= ypv.m215672k().m195647I3() * 1000 || m206031K2().m182469l(LiveDialogEnum.FAST_RECHARGE, LiveDialogEnum.GIFT, LiveDialogEnum.MEMBER, LiveDialogEnum.USER_CARD, LiveDialogEnum.WEBVIEW) || ((Boolean) m129297F3(new u4d0(2100))).booleanValue() || ((Boolean) m129297F3(new zuj(2100))).booleanValue()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX INFO: renamed from: j4 */
    public final void m161675j4() {
        if (!this.f140747j.get().booleanValue() || this.f140743B == null) {
            return;
        }
        m129299H3(m206027E2().m132142j2(3, TimeUnit.SECONDS)).take(1).subscribe(ffw.m121193d(new e30() { // from class: l.rui
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161059a.m161681p4((Long) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r2v23, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v25, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r5v6, types: [l.ho2] */
    /* JADX INFO: renamed from: k4 */
    public final boolean m161676k4(C18783a c18783a) {
        byte b;
        tpd0 tpd0Var;
        int i;
        zpd0 zpd0Var;
        int i2;
        String str = c18783a.f140765b;
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
                tpd0Var = this.f140748k;
                i = ypv.m215672k().m195663K3().maxShowCount;
                zpd0Var = this.f140754q;
                i2 = 0;
                break;
            case 1:
                tpd0Var = this.f140750m;
                i = ypv.m215672k().m195695O3().maxShowCount;
                zpd0Var = this.f140753p;
                i2 = ypv.m215672k().m195695O3().minEventInterval;
                break;
            case 2:
                tpd0Var = this.f140749l;
                i = ypv.m215672k().m195655J3().maxShowCount;
                zpd0Var = this.f140752o;
                i2 = ypv.m215672k().m195655J3().minEventInterval;
                break;
            default:
                i2 = 3000;
                tpd0Var = null;
                zpd0Var = null;
                i = 0;
                break;
        }
        String str2 = c18783a.f140766c;
        str2.getClass();
        switch (str2) {
            case "followByAnchor":
                uqd0Var = new uqd0("follow_guide_anchor_follow_by_anchor" + c18783a.f140764a + this.f140746i, "");
                break;
            case "watchTime":
                uqd0Var = new uqd0("follow_guide_anchor_watch_time" + c18783a.f140764a + this.f140746i, "");
                break;
            case "chat":
                uqd0Var = new uqd0("follow_guide_anchor_chat_count" + c18783a.f140764a + this.f140746i, "");
                break;
            case "start":
                uqd0Var = new uqd0("follow_guide_anchor_first_enter" + c18783a.f140764a + this.f140746i, "");
                break;
            case "rewardPoint":
                uqd0Var = new uqd0("follow_guide_anchor_reward_point" + c18783a.f140764a + this.f140746i, "");
                break;
            case "otherFollowAnchor":
                uqd0Var = new uqd0("follow_guide_anchor_other_follow" + c18783a.f140764a + this.f140746i, "");
                break;
        }
        if (uqd0Var == null || tpd0Var == null || zpd0Var == null || System.currentTimeMillis() - zpd0Var.get().longValue() < i2 * 1000) {
            return true;
        }
        if (!mqi0.m155929D(this.f140751n.get().longValue())) {
            tpd0Var.put(0);
        }
        ArrayList<String> arrayListM161667B4 = m161667B4(uqd0Var.get());
        if (m206027E2().m132146l0() == null) {
            return true;
        }
        boolean zContains = arrayListM161667B4.contains(m206027E2().m132146l0().f56011id);
        int i3 = ypv.m215672k().m195679M3().noRepeatAnchorCount;
        if (i3 > 1) {
            if (arrayListM161667B4.size() >= i3 - 1) {
                arrayListM161667B4.remove(0);
            }
            arrayListM161667B4.add(m206027E2().m132146l0().f56011id);
            final StringBuilder sb = new StringBuilder();
            vwb.m200354z(arrayListM161667B4, new e30() { // from class: l.zui
                @Override // p149l.e30
                public final void call(Object obj) {
                    nvi.m161644J3(sb, (String) obj);
                }
            });
            uqd0Var.put(sb.toString());
        }
        if (zContains || tpd0Var.get().intValue() >= i) {
            return true;
        }
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        this.f140751n.put(Long.valueOf(System.currentTimeMillis()));
        zpd0Var.put(Long.valueOf(System.currentTimeMillis()));
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: l4 */
    public final void m161677l4(C18783a c18783a) {
        if (m206032L2() || m206027E2().m132088R0()) {
            return;
        }
        m161672g4(c18783a);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m161678m4(ArrayList<C18783a> arrayList) {
        vwb.m200354z(arrayList, new e30() { // from class: l.wui
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188135a.m161682q4((nvi.C18783a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public final void m161679n4() {
        this.f140762y.clear();
        this.f140763z.clear();
        this.f140742A.clear();
        BLiveFollowRateConfigV2 bLiveFollowRateConfigV2M195679M3 = ypv.m215672k().m195679M3();
        BLiveFollowRateBubbleV2 bLiveFollowRateBubbleV2 = bLiveFollowRateConfigV2M195679M3.bubble;
        m161673h4(bLiveFollowRateBubbleV2.triggerEvents, bLiveFollowRateBubbleV2.conditions, "action_bubble");
        BLiveFollowRatePopupV2 bLiveFollowRatePopupV2 = bLiveFollowRateConfigV2M195679M3.popup;
        m161673h4(bLiveFollowRatePopupV2.triggerEvents, bLiveFollowRatePopupV2.conditions, "action_bottom_menu");
        BLiveFollowRateChatV2 bLiveFollowRateChatV2 = bLiveFollowRateConfigV2M195679M3.chat;
        m161673h4(bLiveFollowRateChatV2.triggerEvents, bLiveFollowRateChatV2.conditions, "action_chat_message");
        Comparator comparator = new Comparator() { // from class: l.sui
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return nvi.m161655V3((nvi.C18783a) obj, (nvi.C18783a) obj2);
            }
        };
        Collections.sort(this.f140762y, comparator);
        Collections.sort(this.f140763z, comparator);
        Collections.sort(this.f140742A, comparator);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m161680o4(String str, BLiveFollowConditions bLiveFollowConditions, String str2) {
        str2.getClass();
        switch (str2) {
            case "followByAnchor":
                this.f140744C = new C18783a(str, 0, str2);
                break;
            case "watchTime":
                this.f140762y.add(new C18783a(str, w8u.m202205C(bLiveFollowConditions.watchTime), str2));
                break;
            case "chat":
                this.f140742A.add(new C18783a(str, w8u.m202205C(bLiveFollowConditions.msgCount), str2));
                break;
            case "start":
                this.f140743B = new C18783a(str, 0, str2);
                break;
            case "rewardPoint":
                this.f140763z.add(new C18783a(str, w8u.m202205C(bLiveFollowConditions.rewardPoint), str2));
                break;
            case "otherFollowAnchor":
                this.f140745D = new C18783a(str, 0, str2);
                break;
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m161681p4(Long l2) {
        m161677l4(this.f140743B);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m161682q4(C18783a c18783a) {
        String str = c18783a.f140765b;
        str.getClass();
        switch (str) {
            case "action_chat_message":
                m161670E4(c18783a.f140766c);
                if (TextUtils.equals(c18783a.f140766c, "start") && this.f140747j.get().booleanValue()) {
                    this.f140747j.put(Boolean.FALSE);
                    break;
                }
                break;
            case "action_bottom_menu":
                m206028F2().FollowDialogEvent.show().mo172463j(ypv.m215672k().m195695O3());
                if (TextUtils.equals(c18783a.f140766c, "start") && this.f140747j.get().booleanValue()) {
                    this.f140747j.put(Boolean.FALSE);
                    break;
                }
                break;
            case "action_bubble":
                BLiveMonetizationConfig bLiveMonetizationConfigM135633e = ((idv) ypv.m215673l(fld0.f98147b)).m135633e();
                if (bLiveMonetizationConfigM135633e != null && ((BLiveBubbleConfig) vwb.m200346r(bLiveMonetizationConfigM135633e.bubbleConfigs, new w9j() { // from class: l.yui
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((BLiveBubbleConfig) obj).type, ypv.m215672k().m195655J3().type));
                    }
                })) != null) {
                    m206028F2().AvatarEvent.showFollowNewUserAnim().m172467p();
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m161683r4(C18783a c18783a) {
        return Boolean.valueOf(this.f140759v >= ((long) c18783a.f140764a));
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m161684s4(Long l2) {
        this.f140759v++;
        C18783a c18783a = (C18783a) vwb.m200346r(this.f140762y, new w9j() { // from class: l.xui
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f194501a.m161683r4((nvi.C18783a) obj);
            }
        });
        if (c18783a != null) {
            m161677l4(c18783a);
            this.f140762y.remove(c18783a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v16, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v19, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (ypv.m215672k().m195687N3()) {
            this.f140759v = 0L;
            this.f140760w = -1.0d;
            this.f140755r.clear();
            this.f140756s = 0L;
            this.f140757t = false;
            this.f140758u = 0;
            this.f140762y.clear();
            this.f140763z.clear();
            this.f140742A.clear();
            m161679n4();
            ?? M206027E2 = m206027E2();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            m129299H3(M206027E2.m132142j2(1, timeUnit)).subscribe(ffw.m121193d(new e30() { // from class: l.qui
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f156512a.m161684s4((Long) obj);
                }
            }));
            m129299H3(m206027E2().m132145k2(timeUnit)).filter(new w9j() { // from class: l.bvi
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(this.f77450a.m161674i4(((Long) obj).longValue()));
                }
            }).doOnNext(new e30() { // from class: l.fvi
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f99448a.m161687v4((Long) obj);
                }
            }).doOnNext(new e30() { // from class: l.gvi
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f104575a.m161688w4((Long) obj);
                }
            }).subscribe(ffw.m121192c());
            duringCreated(m206027E2().m132153n1()).subscribe(ffw.m121193d(new e30() { // from class: l.hvi
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f109646a.m161689x4((LiveControlMessage) obj);
                }
            }));
            duringCreated(m206027E2().m132150m1()).subscribe(ffw.m121193d(new e30() { // from class: l.ivi
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f115169a.m161690y4((far) obj);
                }
            }));
            duringCreated(m206028F2().KeyboardEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.jvi
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f119942a.m161691z4((KeyboardEventData) obj);
                }
            }));
            duringCreated(m206028F2().FollowGuideEvent.onChatSendMessage().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.kvi
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f124775a.m161666A4((soj0) obj);
                }
            }));
            duringCreated(m206028F2().FollowGuideEvent.onBubbleShow().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.lvi
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f130166a.m161685t4((soj0) obj);
                }
            }));
            duringCreated(m206028F2().SendGiftEventGroup.sendGiftSuccess().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.mvi
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f135903a.m161686u4((rge0) obj);
                }
            }));
            m161675j4();
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m161685t4(soj0 soj0Var) {
        m161671F4();
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m161686u4(rge0 rge0Var) {
        m161668C4();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m161687v4(Long l2) {
        m161678m4(this.f140755r);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m161688w4(Long l2) {
        this.f140755r.clear();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m161689x4(LiveControlMessage liveControlMessage) {
        C18783a c18783a;
        String str = liveControlMessage.type;
        str.getClass();
        if (str.equals("follow")) {
            C18783a c18783a2 = this.f140745D;
            if (c18783a2 != null) {
                m161677l4(c18783a2);
                return;
            }
            return;
        }
        if (str.equals("anchor_follow") && (c18783a = this.f140744C) != null) {
            m161677l4(c18783a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2] */
    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m161690y4(far farVar) {
        if (vwb.m200296J(this.f140763z)) {
            return;
        }
        BLiveLeaderBoards bLiveLeaderBoards = (BLiveLeaderBoards) vwb.m200346r(farVar.m120300d(), new w9j() { // from class: l.tui
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveLeaderBoards) obj).owner, ypv.f199493a.m199309D0()));
            }
        });
        if (this.f140760w == -1.0d) {
            BLiveLeaderBoards bLiveLeaderBoards2 = m206027E2().m132124d2() == null ? null : (BLiveLeaderBoards) vwb.m200346r(m206027E2().m132124d2().m120300d(), new w9j() { // from class: l.uui
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveLeaderBoards) obj).owner, ypv.f199493a.m199309D0()));
                }
            });
            this.f140760w = bLiveLeaderBoards2 == null ? 0.0d : bLiveLeaderBoards2.amount;
        }
        C18783a c18783a = this.f140763z.get(0);
        double d = c18783a.f140764a;
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || bLiveLeaderBoards == null) {
            return;
        }
        double d2 = bLiveLeaderBoards.amount;
        double d3 = this.f140760w;
        if (d2 - d3 < d || this.f140761x == d2 - d3) {
            return;
        }
        this.f140761x = d2 - d3;
        this.f140763z.remove(c18783a);
        m161677l4(c18783a);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m161691z4(KeyboardEventData keyboardEventData) {
        this.f140757t = keyboardEventData.m71825b();
    }
}
