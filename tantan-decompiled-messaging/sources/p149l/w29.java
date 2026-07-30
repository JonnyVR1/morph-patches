package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.ExtraPrivileges;
import com.p046p1.mobile.putong.core.data.HeartbeatActionError;
import com.p046p1.mobile.putong.core.data.HeartbeatPushInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes9.dex */
public class w29 extends ax6 {

    /* JADX INFO: renamed from: R */
    public C22393b<Message> f184098R;

    /* JADX INFO: renamed from: S */
    public C22393b<roj0> f184099S;

    /* JADX INFO: renamed from: T */
    public C22392a<Boolean> f184100T;

    /* JADX INFO: renamed from: U */
    public C22392a<HeartbeatPushInfo> f184101U;

    /* JADX INFO: renamed from: V */
    public C22393b<HeartbeatPushInfo> f184102V;

    /* JADX INFO: renamed from: W */
    public C22392a<roj0> f184103W;

    /* JADX INFO: renamed from: X */
    public hpd0 f184104X;

    /* JADX INFO: renamed from: Y */
    public boolean f184105Y;

    /* JADX INFO: renamed from: Z */
    public String f184106Z;

    /* JADX INFO: renamed from: a0 */
    public String f184107a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f184108b0;

    /* JADX INFO: renamed from: c0 */
    public zpd0 f184109c0;

    /* JADX INFO: renamed from: d0 */
    public zpd0 f184110d0;

    /* JADX INFO: renamed from: e0 */
    public zpd0 f184111e0;

    /* JADX INFO: renamed from: f0 */
    public tpd0 f184112f0;

    /* JADX INFO: renamed from: g0 */
    public hpd0 f184113g0;

    /* JADX INFO: renamed from: h0 */
    public long f184114h0;

    /* JADX INFO: renamed from: i0 */
    public int f184115i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f184116j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f184117k0;

    public w29(C4732c c4732c) {
        super(c4732c);
        this.f184098R = C22393b.m221521b();
        this.f184099S = C22393b.m221521b();
        this.f184100T = C22392a.m221512b();
        this.f184101U = C22392a.m221512b();
        this.f184102V = C22393b.m221521b();
        this.f184103W = C22392a.m221512b();
        String str = "heartbeat_privilege_notify_flag_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f184104X = new hpd0(str, bool);
        this.f184105Y = false;
        this.f184106Z = "27754";
        this.f184107a0 = "search_idle";
        this.f184108b0 = false;
        this.f184109c0 = new zpd0("last_op_heartbeat_push" + CoreModule.m29931H().userId(), 0L);
        this.f184110d0 = new zpd0("heart_signal_new_anim_time_" + CoreModule.m29931H().userId(), 0L);
        this.f184111e0 = new zpd0("heart_beart_last_repor_time_" + CoreModule.m29931H().userId(), 0L);
        this.f184112f0 = new tpd0("heart_beart_report_count_" + CoreModule.m29931H().userId(), 0);
        this.f184113g0 = new hpd0("inore_heartbeat_limit_debug", bool);
        this.f184114h0 = 0L;
        this.f184117k0 = false;
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m201021a3(Throwable th) {
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ j760 m201023c3(j760 j760Var, j760 j760Var2) {
        return j760Var;
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ HeartbeatPushInfo m201024d3(PushMessageCustom pushMessageCustom, boolean z, j760 j760Var) {
        List<CoreMomentInfo> list = (List) j760Var.f116565b;
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(list)) {
            int i = 0;
            for (CoreMomentInfo coreMomentInfo : list) {
                if (!vwb.m200296J(coreMomentInfo.media)) {
                    for (Media media : coreMomentInfo.media) {
                        if ((media instanceof Picture) || (media instanceof Video)) {
                            arrayList.add(media);
                            i++;
                        }
                        if (i >= 3) {
                            break;
                        }
                    }
                }
                if (i >= 3) {
                    break;
                }
            }
        }
        HeartbeatPushInfo heartbeatPushInfo = new HeartbeatPushInfo(pushMessageCustom, arrayList, mqi0.m155944o());
        heartbeatPushInfo.setFake(z);
        return heartbeatPushInfo;
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ stc0 m201027g3(String str, JSONObject jSONObject) {
        stc0.C20027a c20027aAuth = C4728a.f19494P.auth();
        StringBuilder sb = new StringBuilder("/heartbeat-match/me");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        sb.append(str);
        return c20027aAuth.m185898q(C4728a.m31200G(sb.toString())).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ void m201030j3(String str, C22392a c22392a, boolean z) {
        if (CoreModule.f17553k.f91940c.m206086r0(str, MessageType.heartbeat_notify).m165612e() > 0) {
            c22392a.m132487l(roj0.f160388a);
            return;
        }
        MessageType messageType = MessageType.get(MessageType.heartbeat_notify);
        if (z) {
            int iM165612e = CoreModule.f17553k.f91940c.m206069a0(str).m165612e();
            int iM165612e2 = CoreModule.f17553k.f91940c.m206074f0(str).m165612e();
            if (iM165612e == 0 && iM165612e2 == 0) {
                CoreModule.f17545c.f19642f0.m32930dh(str, messageType);
            }
        } else if (CoreModule.f17553k.f91940c.m206074f0(str).m165612e() == 0) {
            CoreModule.f17545c.f19642f0.m32930dh(str, messageType);
        }
        c22392a.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m201032l3(boolean z, String str) {
        if (z && CoreModule.f17553k.f91940c.m206086r0(str, MessageType.heartbeat_success).m165612e() == 0) {
            CoreModule.f17545c.f19642f0.m32930dh(str, MessageType.get(MessageType.heartbeat_success));
        }
    }

    /* JADX INFO: renamed from: u3 */
    public static /* synthetic */ void m201041u3(Throwable th) {
    }

    /* JADX INFO: renamed from: A3 */
    public void m201042A3(final String str, final boolean z) {
        e51.m114774y(new Runnable() { // from class: l.u29
            @Override // java.lang.Runnable
            public final void run() {
                f8c.m119878o().m119881B(new d30() { // from class: l.b29
                    @Override // p149l.d30
                    public final void call() {
                        w29.m201032l3(z, str);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public String m201043B3() {
        return this.f184116j0 ? "1" : "0";
    }

    /* JADX INFO: renamed from: C3 */
    public final String m201044C3() {
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        if (NullChecker.m81303a(userM169520na)) {
            return userM169520na.isFemale() ? RemoteConfig.m79298x().m79302F("heartbeat_push_show_limit_female") : RemoteConfig.m79298x().m79302F("heartbeat_push_show_limit_male");
        }
        return "";
    }

    /* JADX INFO: renamed from: D3 */
    public C22306c<Message> m201045D3() {
        return this.f184098R.asObservable().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: E3 */
    public final String m201046E3(long j) {
        return String.valueOf((mqi0.m155944o() - j) / Constants.ONE_MIN_IN_MILLIS);
    }

    /* JADX INFO: renamed from: F3 */
    public String m201047F3() {
        return this.f184107a0;
    }

    /* JADX INFO: renamed from: G3 */
    public final long m201048G3() {
        int iM79335y;
        try {
            if (ura.m195053e().m195057d().mo33957yt()) {
                String strM201044C3 = m201044C3();
                if (TextUtils.isEmpty(strM201044C3)) {
                    return 1800000L;
                }
                iM79335y = new JSONObject(strM201044C3).optInt("time");
            } else {
                User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
                if (!NullChecker.m81303a(userM169520na)) {
                    return 1800000L;
                }
                if (userM169520na.isFemale()) {
                    iM79335y = RemoteConfig.m79298x().m79335y("heartbeat_push_limit_female");
                    if (iM79335y <= 0) {
                        return 1800000L;
                    }
                } else {
                    iM79335y = RemoteConfig.m79298x().m79335y("heartbeat_push_limit_male");
                    if (iM79335y <= 0) {
                        return 1800000L;
                    }
                }
            }
            return ((long) (iM79335y * 60)) * 1000;
        } catch (Exception unused) {
            return 1800000L;
        }
    }

    /* JADX INFO: renamed from: H3 */
    public int m201049H3() {
        return this.f184115i0;
    }

    /* JADX INFO: renamed from: I3 */
    public final String m201050I3(PushMessageCustom pushMessageCustom) {
        if (!TextUtils.isEmpty(pushMessageCustom.triggeredUserId)) {
            return FirebaseAnalytics.Event.SEARCH;
        }
        if (pushMessageCustom.noRecommended) {
            return "timeout";
        }
        return pushMessageCustom.isPassive ? "passive" : Active.TYPE;
    }

    /* JADX INFO: renamed from: J3 */
    public boolean m201051J3() {
        return this.f184108b0;
    }

    /* JADX INFO: renamed from: K3 */
    public boolean m201052K3(PushMessageCustom pushMessageCustom) {
        return NullChecker.m81303a(pushMessageCustom) && TextUtils.equals(pushMessageCustom.triggeredUserId, CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: L3 */
    public boolean m201053L3() {
        return (TextUtils.isEmpty(this.f184107a0) || TextUtils.equals(this.f184107a0, "search_start") || TextUtils.equals(this.f184107a0, "search_idle") || TextUtils.equals(this.f184107a0, "search_cancel")) ? false : true;
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m201054M3(Envelope envelope) {
        if (ura.m195053e().m195057d().mo33722Mo()) {
            this.f72126Q.f19555C0.m210112u4();
        }
        if (ura.m195053e().m195057d().mo33832gb()) {
            this.f72126Q.f19571H1.m201067Z3();
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ C22306c m201055N3(String str, String str2, String str3, final String str4) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
            jSONObject.put("tracker", str2);
            if (TextUtils.equals(str, "report")) {
                if (TextUtils.isEmpty(str3)) {
                    str3 = SchemeKey.monetization;
                }
                jSONObject.put("reportType", str3);
            }
        } catch (JSONException unused) {
        }
        return ia20.m135117a(new v9j() { // from class: l.d29
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return w29.m201027g3(str4, jSONObject);
            }
        }).doOnNext(new e30() { // from class: l.e29
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88901a.m201054M3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ C22306c m201056O3(PushMessageCustom pushMessageCustom, boolean z, final j760 j760Var) {
        return C22306c.combineLatest(this.f72126Q.f19639e0.m169422Na(pushMessageCustom.userId), z ? this.f72126Q.f19642f0.m32902ap(pushMessageCustom.userId) : C22306c.just(roj0.f160388a), new x9j() { // from class: l.f29
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new j760((roj0) obj, (roj0) obj2);
            }
        }).map(new w9j() { // from class: l.g29
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return w29.m201023c3(j760Var, (j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m201057P3(HeartbeatPushInfo heartbeatPushInfo) {
        ura.m195053e().m195057d().mo33803bh(heartbeatPushInfo);
        this.f184101U.m132487l(heartbeatPushInfo);
        this.f184102V.m132487l(heartbeatPushInfo);
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ void m201058Q3(Envelope envelope) {
        ExtraPrivileges extraPrivileges = ((CoreData) envelope.getModuleData(CoreData.class)).extraPrivileges;
        if (NullChecker.m81303a(extraPrivileges) && NullChecker.m81303a(extraPrivileges.heartbeatMatch) && extraPrivileges.heartbeatMatch.expiredTime > qib0.f154693H.guessedCurrentServerTime()) {
            this.f184115i0 = extraPrivileges.heartbeatMatch.remaining;
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m201059R3(String str) {
        if (CoreModule.f17553k.f91940c.m206086r0(str, MessageType.heartbeat_notify).m165612e() > 0) {
            CoreModule.f17553k.f91940c.delete(Filter.AND(Message.CID.mo60175EQ(str), Message.MESSAGETYPE.m60176EQ(MessageType.heartbeat_notify)));
        }
        if (CoreModule.f17553k.f91940c.m206086r0(str, "heartbeat_waiting_response").m165612e() == 0) {
            this.f72126Q.f19642f0.m32941eh(this.f72126Q.f19642f0.m33065of(str, MessageType.get("heartbeat_waiting_response")));
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m201060S3(final String str) {
        f8c.m119878o().m119881B(new d30() { // from class: l.c29
            @Override // p149l.d30
            public final void call() {
                this.f78339a.m201059R3(str);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m201061T3(Throwable th) {
        this.f184107a0 = "search_idle";
        ura.m195053e().m195057d().mo33838gs();
        osi0.m165783g("网络异常！");
        this.f72126Q.f19555C0.m210112u4();
        this.f72126Q.f19570H0.m210361k5();
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m201062U3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (!NullChecker.m81303a(coreData.heartbeatMatch)) {
            this.f184107a0 = "search_idle";
            ura.m195053e().m195057d().mo33838gs();
            return;
        }
        if (!NullChecker.m81303a(coreData.heartbeatMatch.error) || TextUtils.isEmpty(coreData.heartbeatMatch.error.subcode)) {
            this.f184107a0 = coreData.heartbeatMatch.tracker;
            ura.m195053e().m195057d().mo33823f7();
            ura.m195053e().m195057d().mo33878lj(coreData.heartbeatMatch.waitSeconds);
            return;
        }
        HeartbeatActionError heartbeatActionError = coreData.heartbeatMatch.error;
        if (TextUtils.equals(heartbeatActionError.subcode, "40399") && !TextUtils.isEmpty(heartbeatActionError.message)) {
            lsi0.m151595y(heartbeatActionError.message);
            this.f72126Q.f19555C0.m210112u4();
            this.f72126Q.f19570H0.m210361k5();
        }
        this.f184107a0 = "search_idle";
        ura.m195053e().m195057d().mo33838gs();
    }

    /* JADX INFO: renamed from: V3 */
    public C22306c<Envelope> m201063V3(String str) {
        return m201077w3("match", str);
    }

    /* JADX INFO: renamed from: W3 */
    public void m201064W3(PushMessageCustom pushMessageCustom, boolean z) {
        m201065X3(pushMessageCustom, z, false);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002d  */
    /* JADX INFO: renamed from: X3 */
    public void m201065X3(final PushMessageCustom pushMessageCustom, final boolean z, boolean z2) {
        boolean z3;
        if (NullChecker.m81303a(pushMessageCustom)) {
            boolean z4 = TextUtils.isEmpty(pushMessageCustom.triggeredUserId) && !pushMessageCustom.noRecommended;
            if (z4) {
                double dM155944o = mqi0.m155944o();
                double d = pushMessageCustom.expire;
                if (dM155944o < d || d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                z3 = false;
            }
            m201075h4(pushMessageCustom, z3, z4 && mqi0.m155944o() - this.f184109c0.get().longValue() < m201048G3(), z4, z2);
            if (TextUtils.isEmpty(pushMessageCustom.triggeredUserId)) {
                double dM155944o2 = mqi0.m155944o();
                double d2 = pushMessageCustom.expire;
                if (dM155944o2 >= d2 && d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    zvf0.m220369B("e_heartbeat_push_expired", "", vwb.m200311Y("otheruserID", pushMessageCustom.userId), vwb.m200311Y("expired_time", m201046E3((long) pushMessageCustom.expire)));
                    return;
                } else {
                    if (mqi0.m155944o() - this.f184109c0.get().longValue() < m201048G3()) {
                        zvf0.m220369B("e_heartbeat_push_limit", "", vwb.m200311Y("otheruserID", pushMessageCustom.userId), vwb.m200311Y("intercal_time", Long.valueOf(m201048G3() / Constants.ONE_MIN_IN_MILLIS)), vwb.m200311Y("timeout", m201046E3(this.f184109c0.get().longValue())));
                        return;
                    }
                    this.f184109c0.put(Long.valueOf(mqi0.m155944o()));
                }
            }
            C22306c c22306cOnErrorReturn = ura.m195053e().m195057d().mo33931u() ? CoreModule.m29934N().personalMediaMomentsFeedPrevious(pushMessageCustom.userId, false, CoreMomentInfo.JSON_ADAPTER).onErrorReturn(new w9j() { // from class: l.o29
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return j760.m140076a(Links.new_(), new ArrayList());
                }
            }) : C22306c.just(j760.m140076a(Links.new_(), new ArrayList()));
            final boolean z5 = ura.m195053e().m195057d().mo33722Mo() && m201052K3(pushMessageCustom);
            c22306cOnErrorReturn.flatMap(new w9j() { // from class: l.p29
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f146821a.m201056O3(pushMessageCustom, z5, (j760) obj);
                }
            }).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.q29
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return w29.m201024d3(pushMessageCustom, z, (j760) obj);
                }
            }).observeOn(jo0.m142408a()).subscribe(new e30() { // from class: l.r29
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f157391a.m201057P3((HeartbeatPushInfo) obj);
                }
            }, new e30() { // from class: l.s29
                @Override // p149l.e30
                public final void call(Object obj) {
                    w29.m201041u3((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public C22306c<Envelope> m201066Y3(String str) {
        return m201077w3("reject", str);
    }

    /* JADX INFO: renamed from: Z3 */
    public void m201067Z3() {
        this.f72126Q.scheduled("getHeartBeatPrivilegesTimes", 0, new v9j() { // from class: l.h29
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.k29
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/heartbeat-match/me/privileges")).m185887f().m185883b();
                    }
                });
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.i29
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110542a.m201058Q3((Envelope) obj);
            }
        }, new e30() { // from class: l.j29
            @Override // p149l.e30
            public final void call(Object obj) {
                w29.m201021a3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public void m201068a4() {
        this.f184109c0.put(0L);
    }

    /* JADX INFO: renamed from: b4 */
    public void m201069b4(boolean z) {
        this.f184116j0 = z;
    }

    /* JADX INFO: renamed from: c4 */
    public void m201070c4(String str) {
        this.f184107a0 = str;
    }

    /* JADX INFO: renamed from: d4 */
    public void m201071d4() {
        this.f184108b0 = true;
    }

    /* JADX INFO: renamed from: e4 */
    public void m201072e4() {
        this.f184100T.m132487l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: f4 */
    public void m201073f4(final String str) {
        e51.m114774y(new Runnable() { // from class: l.l29
            @Override // java.lang.Runnable
            public final void run() {
                this.f125759a.m201060S3(str);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public C22306c<Envelope> m201074g4() {
        ura.m195053e().m195057d().mo33823f7();
        this.f184107a0 = "search_start";
        return m201078x3("start", "", null).doOnError(new e30() { // from class: l.m29
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130902a.m201061T3((Throwable) obj);
            }
        }).doOnNext(new e30() { // from class: l.n29
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136775a.m201062U3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public final void m201075h4(PushMessageCustom pushMessageCustom, boolean z, boolean z2, boolean z3, boolean z4) {
        zvf0.m220369B("e_heartbeat_push_arrived", "", vwb.m200311Y("otheruserID", pushMessageCustom.userId), vwb.m200311Y("expired", Boolean.valueOf(z)), vwb.m200311Y("type", m201050I3(pushMessageCustom)), vwb.m200311Y(Constants.KEY_LIMIT, Boolean.valueOf(z2)), vwb.m200311Y("expired_time", Double.valueOf(z3 ? pushMessageCustom.expire : -1.0d)), vwb.m200311Y("source", pushMessageCustom.tracker), vwb.m200311Y("count_limit", Boolean.valueOf(!z4)));
    }

    /* JADX INFO: renamed from: v3 */
    public C22306c<Envelope> m201076v3(String str) {
        return m201077w3("accept", str);
    }

    /* JADX INFO: renamed from: w3 */
    public C22306c<Envelope> m201077w3(String str, String str2) {
        return m201078x3(str, str2, null);
    }

    /* JADX INFO: renamed from: x3 */
    public C22306c<Envelope> m201078x3(String str, String str2, String str3) {
        return m201079y3(str, str2, str3, "");
    }

    /* JADX INFO: renamed from: y3 */
    public C22306c<Envelope> m201079y3(final String str, final String str2, final String str3, final String str4) {
        return this.f72126Q.scheduled(str + "_heartbeat-match", -1, new v9j() { // from class: l.t29
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f167447a.m201055N3(str, str2, str4, str3);
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public void m201080z3(final boolean z, final String str, final C22392a<roj0> c22392a) {
        e51.m114774y(new Runnable() { // from class: l.a29
            @Override // java.lang.Runnable
            public final void run() {
                f8c.m119878o().m119881B(new d30() { // from class: l.v29
                    @Override // p149l.d30
                    public final void call() {
                        w29.m201030j3(str, c22392a, z);
                    }
                });
            }
        });
    }
}
