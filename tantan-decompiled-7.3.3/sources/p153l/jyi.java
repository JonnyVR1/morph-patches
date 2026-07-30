package p153l;

import android.os.SystemClock;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveFollowConditions;
import com.p051p1.mobile.putong.live.base.data.BLiveFollowRateBubbleV2;
import com.p051p1.mobile.putong.live.base.data.BLiveFollowRateChatV2;
import com.p051p1.mobile.putong.live.base.data.BLiveFollowRateConfigV2;
import com.p051p1.mobile.putong.live.base.data.BLiveFollowRatePopupV2;
import com.p051p1.mobile.putong.live.base.data.BLiveLeaderBoards;
import com.p051p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p051p1.mobile.putong.live.base.data.BLivePostEvent;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class jyi extends qct<oo2> {

    /* JADX INFO: renamed from: A */
    public ArrayList<C18060a> f123151A;

    /* JADX INFO: renamed from: B */
    public C18060a f123152B;

    /* JADX INFO: renamed from: C */
    public C18060a f123153C;

    /* JADX INFO: renamed from: D */
    public C18060a f123154D;

    /* JADX INFO: renamed from: i */
    public String f123155i;

    /* JADX INFO: renamed from: j */
    public jxd0 f123156j;

    /* JADX INFO: renamed from: k */
    public vxd0 f123157k;

    /* JADX INFO: renamed from: l */
    public vxd0 f123158l;

    /* JADX INFO: renamed from: m */
    public vxd0 f123159m;

    /* JADX INFO: renamed from: n */
    public byd0 f123160n;

    /* JADX INFO: renamed from: o */
    public byd0 f123161o;

    /* JADX INFO: renamed from: p */
    public byd0 f123162p;

    /* JADX INFO: renamed from: q */
    public byd0 f123163q;

    /* JADX INFO: renamed from: r */
    public ArrayList<C18060a> f123164r;

    /* JADX INFO: renamed from: s */
    public long f123165s;

    /* JADX INFO: renamed from: t */
    public boolean f123166t;

    /* JADX INFO: renamed from: u */
    public int f123167u;

    /* JADX INFO: renamed from: v */
    public long f123168v;

    /* JADX INFO: renamed from: w */
    public double f123169w;

    /* JADX INFO: renamed from: x */
    public double f123170x;

    /* JADX INFO: renamed from: y */
    public ArrayList<C18060a> f123171y;

    /* JADX INFO: renamed from: z */
    public ArrayList<C18060a> f123172z;

    /* JADX INFO: renamed from: l.jyi$a */
    public static class C18060a {

        /* JADX INFO: renamed from: a */
        public int f123173a;

        /* JADX INFO: renamed from: b */
        public String f123174b;

        /* JADX INFO: renamed from: c */
        public String f123175c;

        public C18060a(String str, int i, String str2) {
            this.f123173a = i;
            this.f123174b = str;
            this.f123175c = str2;
        }

        public String toString() {
            return "ActionItem{num=" + this.f123173a + ", action='" + this.f123174b + "', type='" + this.f123175c + "'}";
        }
    }

    public jyi(dum dumVar) {
        super(dumVar);
        this.f123155i = zrv.f205799a.m207631D0();
        this.f123156j = new jxd0("need_show_follow_anchor_bubble" + this.f123155i, Boolean.TRUE);
        this.f123157k = new vxd0("follow_guide_count_chat" + this.f123155i, 0);
        this.f123158l = new vxd0("follow_guide_count_bubble" + this.f123155i, 0);
        this.f123159m = new vxd0("follow_guide_count_menu" + this.f123155i, 0);
        this.f123160n = new byd0("follow_guide_last_time" + this.f123155i, 0L);
        this.f123161o = new byd0("follow_guide_last_bubble_time" + this.f123155i, 0L);
        this.f123162p = new byd0("follow_guide_last_bottom_menu_time" + this.f123155i, 0L);
        this.f123163q = new byd0("follow_guide_last_chat_time" + this.f123155i, 0L);
        this.f123164r = new ArrayList<>();
        this.f123171y = new ArrayList<>();
        this.f123172z = new ArrayList<>();
        this.f123151A = new ArrayList<>();
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m147544J3(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(Constants.SEPARATOR_COMMA);
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ int m147555V3(C18060a c18060a, C18060a c18060a2) {
        return c18060a.f123173a - c18060a2.f123173a;
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ void m147560a4(Throwable th) {
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ void m147562c4(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m147566A4(vxj0 vxj0Var) {
        m147569D4();
    }

    /* JADX INFO: renamed from: B4 */
    public final ArrayList<String> m147567B4(String str) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(str.split(Constants.SEPARATOR_COMMA)));
        jyb.m147503d0(arrayList, new qcj() { // from class: l.yxi
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.isEmpty((String) obj));
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: C4 */
    public void m147568C4() {
        this.f123165s = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: D4 */
    public void m147569D4() {
        if (jyb.m147479J(this.f123151A)) {
            return;
        }
        this.f123167u++;
        C18060a c18060a = this.f123151A.get(0);
        if (this.f123167u >= c18060a.f123173a) {
            this.f123151A.remove(c18060a);
            m147577l4(c18060a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: E4 */
    public final void m147570E4(String str) {
        BLivePostEvent bLivePostEventNew_ = BLivePostEvent.new_();
        bLivePostEventNew_.eventName = str;
        bLivePostEventNew_.anchorId = m213810E2().mo183435j().anchor.f45267id;
        BLiveFollowConditions bLiveFollowConditionsNew_ = BLiveFollowConditions.new_();
        bLiveFollowConditionsNew_.watchTime = String.valueOf(this.f123168v);
        bLiveFollowConditionsNew_.msgCount = String.valueOf(this.f123167u);
        bLiveFollowConditionsNew_.rewardPoint = String.valueOf(this.f123170x);
        bLivePostEventNew_.eventInfo = bLiveFollowConditionsNew_;
        if (eb20.m120149b()) {
            bLivePostEventNew_.fakeId = eb20.m120148a();
        }
        LivingNormalApiProvider.m72388D7(str, bLivePostEventNew_).subscribe(dhw.m115826e(new y20() { // from class: l.zxi
            @Override // p153l.y20
            public final void call(Object obj) {
                jyi.m147562c4((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.ayi
            @Override // p153l.y20
            public final void call(Object obj) {
                jyi.m147560a4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F4 */
    public void m147571F4() {
        if (this.f123156j.get().booleanValue()) {
            this.f123156j.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final void m147572g4(final C18060a c18060a) {
        if (!m147576k4(c18060a) && ((C18060a) jyb.m147529r(this.f123164r, new qcj() { // from class: l.rxi
            @Override // p153l.qcj
            public final Object call(Object obj) {
                jyi.C18060a c18060a2 = c18060a;
                jyi.C18060a c18060a3 = (jyi.C18060a) obj;
                return Boolean.valueOf(c18060a3.f123174b.equals(c18060a2.f123174b) && c18060a3.f123175c.equals(c18060a2.f123175c));
            }
        })) == null) {
            this.f123164r.add(c18060a);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m147573h4(List<String> list, final BLiveFollowConditions bLiveFollowConditions, final String str) {
        jyb.m147537z(list, new y20() { // from class: l.wxi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191494a.m147580o4(str, bLiveFollowConditions, (String) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [l.oo2] */
    /* JADX INFO: renamed from: i4 */
    public final boolean m147574i4(long j) {
        return (this.f123164r.isEmpty() || this.f123166t || m213810E2().m168474R0() || SystemClock.elapsedRealtime() - this.f123165s <= zrv.m221193k().m203434I3() * 1000 || m213814K2().m189705l(LiveDialogEnum.FAST_RECHARGE, LiveDialogEnum.GIFT, LiveDialogEnum.MEMBER, LiveDialogEnum.USER_CARD, LiveDialogEnum.WEBVIEW) || ((Boolean) m138856F3(new xcd0(2100))).booleanValue() || ((Boolean) m138856F3(new pxj(2100))).booleanValue()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2] */
    /* JADX INFO: renamed from: j4 */
    public final void m147575j4() {
        if (!this.f123156j.get().booleanValue() || this.f123152B == null) {
            return;
        }
        m138858H3(m213810E2().m168528j2(3, TimeUnit.SECONDS)).take(1).subscribe(dhw.m115825d(new y20() { // from class: l.nxi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144125a.m147581p4((Long) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r2v23, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v25, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r5v6, types: [l.oo2] */
    /* JADX INFO: renamed from: k4 */
    public final boolean m147576k4(C18060a c18060a) {
        byte b;
        vxd0 vxd0Var;
        int i;
        byd0 byd0Var;
        int i2;
        String str = c18060a.f123174b;
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
        wyd0 wyd0Var = null;
        switch (b) {
            case 0:
                vxd0Var = this.f123157k;
                i = zrv.m221193k().m203450K3().maxShowCount;
                byd0Var = this.f123163q;
                i2 = 0;
                break;
            case 1:
                vxd0Var = this.f123159m;
                i = zrv.m221193k().m203482O3().maxShowCount;
                byd0Var = this.f123162p;
                i2 = zrv.m221193k().m203482O3().minEventInterval;
                break;
            case 2:
                vxd0Var = this.f123158l;
                i = zrv.m221193k().m203442J3().maxShowCount;
                byd0Var = this.f123161o;
                i2 = zrv.m221193k().m203442J3().minEventInterval;
                break;
            default:
                i2 = 3000;
                vxd0Var = null;
                byd0Var = null;
                i = 0;
                break;
        }
        String str2 = c18060a.f123175c;
        str2.getClass();
        switch (str2) {
            case "followByAnchor":
                wyd0Var = new wyd0("follow_guide_anchor_follow_by_anchor" + c18060a.f123173a + this.f123155i, "");
                break;
            case "watchTime":
                wyd0Var = new wyd0("follow_guide_anchor_watch_time" + c18060a.f123173a + this.f123155i, "");
                break;
            case "chat":
                wyd0Var = new wyd0("follow_guide_anchor_chat_count" + c18060a.f123173a + this.f123155i, "");
                break;
            case "start":
                wyd0Var = new wyd0("follow_guide_anchor_first_enter" + c18060a.f123173a + this.f123155i, "");
                break;
            case "rewardPoint":
                wyd0Var = new wyd0("follow_guide_anchor_reward_point" + c18060a.f123173a + this.f123155i, "");
                break;
            case "otherFollowAnchor":
                wyd0Var = new wyd0("follow_guide_anchor_other_follow" + c18060a.f123173a + this.f123155i, "");
                break;
        }
        if (wyd0Var == null || vxd0Var == null || byd0Var == null || System.currentTimeMillis() - byd0Var.get().longValue() < i2 * 1000) {
            return true;
        }
        if (!pzi0.m174439D(this.f123160n.get().longValue())) {
            vxd0Var.put(0);
        }
        ArrayList<String> arrayListM147567B4 = m147567B4(wyd0Var.get());
        if (m213810E2().m168532l0() == null) {
            return true;
        }
        boolean zContains = arrayListM147567B4.contains(m213810E2().m168532l0().f56859id);
        int i3 = zrv.m221193k().m203466M3().noRepeatAnchorCount;
        if (i3 > 1) {
            if (arrayListM147567B4.size() >= i3 - 1) {
                arrayListM147567B4.remove(0);
            }
            arrayListM147567B4.add(m213810E2().m168532l0().f56859id);
            final StringBuilder sb = new StringBuilder();
            jyb.m147537z(arrayListM147567B4, new y20() { // from class: l.vxi
                @Override // p153l.y20
                public final void call(Object obj) {
                    jyi.m147544J3(sb, (String) obj);
                }
            });
            wyd0Var.put(sb.toString());
        }
        if (zContains || vxd0Var.get().intValue() >= i) {
            return true;
        }
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        this.f123160n.put(Long.valueOf(System.currentTimeMillis()));
        byd0Var.put(Long.valueOf(System.currentTimeMillis()));
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: l4 */
    public final void m147577l4(C18060a c18060a) {
        if (m213815L2() || m213810E2().m168474R0()) {
            return;
        }
        m147572g4(c18060a);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m147578m4(ArrayList<C18060a> arrayList) {
        jyb.m147537z(arrayList, new y20() { // from class: l.sxi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171139a.m147582q4((jyi.C18060a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public final void m147579n4() {
        this.f123171y.clear();
        this.f123172z.clear();
        this.f123151A.clear();
        BLiveFollowRateConfigV2 bLiveFollowRateConfigV2M203466M3 = zrv.m221193k().m203466M3();
        BLiveFollowRateBubbleV2 bLiveFollowRateBubbleV2 = bLiveFollowRateConfigV2M203466M3.bubble;
        m147573h4(bLiveFollowRateBubbleV2.triggerEvents, bLiveFollowRateBubbleV2.conditions, "action_bubble");
        BLiveFollowRatePopupV2 bLiveFollowRatePopupV2 = bLiveFollowRateConfigV2M203466M3.popup;
        m147573h4(bLiveFollowRatePopupV2.triggerEvents, bLiveFollowRatePopupV2.conditions, "action_bottom_menu");
        BLiveFollowRateChatV2 bLiveFollowRateChatV2 = bLiveFollowRateConfigV2M203466M3.chat;
        m147573h4(bLiveFollowRateChatV2.triggerEvents, bLiveFollowRateChatV2.conditions, "action_chat_message");
        Comparator comparator = new Comparator() { // from class: l.oxi
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return jyi.m147555V3((jyi.C18060a) obj, (jyi.C18060a) obj2);
            }
        };
        Collections.sort(this.f123171y, comparator);
        Collections.sort(this.f123172z, comparator);
        Collections.sort(this.f123151A, comparator);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m147580o4(String str, BLiveFollowConditions bLiveFollowConditions, String str2) {
        str2.getClass();
        switch (str2) {
            case "followByAnchor":
                this.f123153C = new C18060a(str, 0, str2);
                break;
            case "watchTime":
                this.f123171y.add(new C18060a(str, xau.m209898C(bLiveFollowConditions.watchTime), str2));
                break;
            case "chat":
                this.f123151A.add(new C18060a(str, xau.m209898C(bLiveFollowConditions.msgCount), str2));
                break;
            case "start":
                this.f123152B = new C18060a(str, 0, str2);
                break;
            case "rewardPoint":
                this.f123172z.add(new C18060a(str, xau.m209898C(bLiveFollowConditions.rewardPoint), str2));
                break;
            case "otherFollowAnchor":
                this.f123154D = new C18060a(str, 0, str2);
                break;
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m147581p4(Long l2) {
        m147577l4(this.f123152B);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m147582q4(C18060a c18060a) {
        String str = c18060a.f123174b;
        str.getClass();
        switch (str) {
            case "action_chat_message":
                m147570E4(c18060a.f123175c);
                if (TextUtils.equals(c18060a.f123175c, "start") && this.f123156j.get().booleanValue()) {
                    this.f123156j.put(Boolean.FALSE);
                    break;
                }
                break;
            case "action_bottom_menu":
                m213811F2().FollowDialogEvent.show().mo199273j(zrv.m221193k().m203482O3());
                if (TextUtils.equals(c18060a.f123175c, "start") && this.f123156j.get().booleanValue()) {
                    this.f123156j.put(Boolean.FALSE);
                    break;
                }
                break;
            case "action_bubble":
                BLiveMonetizationConfig bLiveMonetizationConfigM144718e = ((jfv) zrv.m221194l(htd0.f111520b)).m144718e();
                if (bLiveMonetizationConfigM144718e != null && ((BLiveBubbleConfig) jyb.m147529r(bLiveMonetizationConfigM144718e.bubbleConfigs, new qcj() { // from class: l.uxi
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((BLiveBubbleConfig) obj).type, zrv.m221193k().m203442J3().type));
                    }
                })) != null) {
                    m213811F2().AvatarEvent.showFollowNewUserAnim().m199277p();
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m147583r4(C18060a c18060a) {
        return Boolean.valueOf(this.f123168v >= ((long) c18060a.f123173a));
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m147584s4(Long l2) {
        this.f123168v++;
        C18060a c18060a = (C18060a) jyb.m147529r(this.f123171y, new qcj() { // from class: l.txi
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f176562a.m147583r4((jyi.C18060a) obj);
            }
        });
        if (c18060a != null) {
            m147577l4(c18060a);
            this.f123171y.remove(c18060a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v16, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v19, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (zrv.m221193k().m203474N3()) {
            this.f123168v = 0L;
            this.f123169w = -1.0d;
            this.f123164r.clear();
            this.f123165s = 0L;
            this.f123166t = false;
            this.f123167u = 0;
            this.f123171y.clear();
            this.f123172z.clear();
            this.f123151A.clear();
            m147579n4();
            ?? M213810E2 = m213810E2();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            m138858H3(M213810E2.m168528j2(1, timeUnit)).subscribe(dhw.m115825d(new y20() { // from class: l.mxi
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f139251a.m147584s4((Long) obj);
                }
            }));
            m138858H3(m213810E2().m168531k2(timeUnit)).filter(new qcj() { // from class: l.xxi
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(this.f196641a.m147574i4(((Long) obj).longValue()));
                }
            }).doOnNext(new y20() { // from class: l.byi
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f79024a.m147587v4((Long) obj);
                }
            }).doOnNext(new y20() { // from class: l.cyi
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f84379a.m147588w4((Long) obj);
                }
            }).subscribe(dhw.m115824c());
            duringCreated(m213810E2().m168539n1()).subscribe(dhw.m115825d(new y20() { // from class: l.dyi
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f91252a.m147589x4((LiveControlMessage) obj);
                }
            }));
            duringCreated(m213810E2().m168536m1()).subscribe(dhw.m115825d(new y20() { // from class: l.eyi
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f96437a.m147590y4((hcr) obj);
                }
            }));
            duringCreated(m213811F2().KeyboardEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.fyi
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f101383a.m147591z4((KeyboardEventData) obj);
                }
            }));
            duringCreated(m213811F2().FollowGuideEvent.onChatSendMessage().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.gyi
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f107055a.m147566A4((vxj0) obj);
                }
            }));
            duringCreated(m213811F2().FollowGuideEvent.onBubbleShow().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.hyi
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f112119a.m147585t4((vxj0) obj);
                }
            }));
            duringCreated(m213811F2().SendGiftEventGroup.sendGiftSuccess().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.iyi
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f117579a.m147586u4((woe0) obj);
                }
            }));
            m147575j4();
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ void m147585t4(vxj0 vxj0Var) {
        m147571F4();
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m147586u4(woe0 woe0Var) {
        m147568C4();
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m147587v4(Long l2) {
        m147578m4(this.f123164r);
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m147588w4(Long l2) {
        this.f123164r.clear();
    }

    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m147589x4(LiveControlMessage liveControlMessage) {
        C18060a c18060a;
        String str = liveControlMessage.type;
        str.getClass();
        if (str.equals("follow")) {
            C18060a c18060a2 = this.f123154D;
            if (c18060a2 != null) {
                m147577l4(c18060a2);
                return;
            }
            return;
        }
        if (str.equals("anchor_follow") && (c18060a = this.f123153C) != null) {
            m147577l4(c18060a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.oo2] */
    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m147590y4(hcr hcrVar) {
        if (jyb.m147479J(this.f123172z)) {
            return;
        }
        BLiveLeaderBoards bLiveLeaderBoards = (BLiveLeaderBoards) jyb.m147529r(hcrVar.m134494d(), new qcj() { // from class: l.pxi
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveLeaderBoards) obj).owner, zrv.f205799a.m207631D0()));
            }
        });
        if (this.f123169w == -1.0d) {
            BLiveLeaderBoards bLiveLeaderBoards2 = m213810E2().m168510d2() == null ? null : (BLiveLeaderBoards) jyb.m147529r(m213810E2().m168510d2().m134494d(), new qcj() { // from class: l.qxi
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((BLiveLeaderBoards) obj).owner, zrv.f205799a.m207631D0()));
                }
            });
            this.f123169w = bLiveLeaderBoards2 == null ? 0.0d : bLiveLeaderBoards2.amount;
        }
        C18060a c18060a = this.f123172z.get(0);
        double d = c18060a.f123173a;
        if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || bLiveLeaderBoards == null) {
            return;
        }
        double d2 = bLiveLeaderBoards.amount;
        double d3 = this.f123169w;
        if (d2 - d3 < d || this.f123170x == d2 - d3) {
            return;
        }
        this.f123170x = d2 - d3;
        this.f123172z.remove(c18060a);
        m147577l4(c18060a);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m147591z4(KeyboardEventData keyboardEventData) {
        this.f123166t = keyboardEventData.m73008b();
    }
}
