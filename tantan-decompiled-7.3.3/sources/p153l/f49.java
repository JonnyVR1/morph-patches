package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.ExtraPrivileges;
import com.p051p1.mobile.putong.core.data.HeartbeatActionError;
import com.p051p1.mobile.putong.core.data.HeartbeatPushInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes9.dex */
public class f49 extends dy6 {

    /* JADX INFO: renamed from: R */
    public C22508b<Message> f97064R;

    /* JADX INFO: renamed from: S */
    public C22508b<uxj0> f97065S;

    /* JADX INFO: renamed from: T */
    public C22507a<Boolean> f97066T;

    /* JADX INFO: renamed from: U */
    public C22507a<HeartbeatPushInfo> f97067U;

    /* JADX INFO: renamed from: V */
    public C22508b<HeartbeatPushInfo> f97068V;

    /* JADX INFO: renamed from: W */
    public C22507a<uxj0> f97069W;

    /* JADX INFO: renamed from: X */
    public jxd0 f97070X;

    /* JADX INFO: renamed from: Y */
    public boolean f97071Y;

    /* JADX INFO: renamed from: Z */
    public String f97072Z;

    /* JADX INFO: renamed from: a0 */
    public String f97073a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f97074b0;

    /* JADX INFO: renamed from: c0 */
    public byd0 f97075c0;

    /* JADX INFO: renamed from: d0 */
    public byd0 f97076d0;

    /* JADX INFO: renamed from: e0 */
    public byd0 f97077e0;

    /* JADX INFO: renamed from: f0 */
    public vxd0 f97078f0;

    /* JADX INFO: renamed from: g0 */
    public jxd0 f97079g0;

    /* JADX INFO: renamed from: h0 */
    public long f97080h0;

    /* JADX INFO: renamed from: i0 */
    public int f97081i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f97082j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f97083k0;

    public f49(C4883c c4883c) {
        super(c4883c);
        this.f97064R = C22508b.m222767b();
        this.f97065S = C22508b.m222767b();
        this.f97066T = C22507a.m222758b();
        this.f97067U = C22507a.m222758b();
        this.f97068V = C22508b.m222767b();
        this.f97069W = C22507a.m222758b();
        String str = "heartbeat_privilege_notify_flag_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f97070X = new jxd0(str, bool);
        this.f97071Y = false;
        this.f97072Z = "27754";
        this.f97073a0 = "search_idle";
        this.f97074b0 = false;
        this.f97075c0 = new byd0("last_op_heartbeat_push" + CoreModule.m30929H().userId(), 0L);
        this.f97076d0 = new byd0("heart_signal_new_anim_time_" + CoreModule.m30929H().userId(), 0L);
        this.f97077e0 = new byd0("heart_beart_last_repor_time_" + CoreModule.m30929H().userId(), 0L);
        this.f97078f0 = new vxd0("heart_beart_report_count_" + CoreModule.m30929H().userId(), 0);
        this.f97079g0 = new jxd0("inore_heartbeat_limit_debug", bool);
        this.f97080h0 = 0L;
        this.f97083k0 = false;
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m123874a3(Throwable th) {
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ pf60 m123876c3(pf60 pf60Var, pf60 pf60Var2) {
        return pf60Var;
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ HeartbeatPushInfo m123877d3(PushMessageCustom pushMessageCustom, boolean z, pf60 pf60Var) {
        List<CoreMomentInfo> list = (List) pf60Var.f152157b;
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(list)) {
            int i = 0;
            for (CoreMomentInfo coreMomentInfo : list) {
                if (!jyb.m147479J(coreMomentInfo.media)) {
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
        HeartbeatPushInfo heartbeatPushInfo = new HeartbeatPushInfo(pushMessageCustom, arrayList, pzi0.m174454o());
        heartbeatPushInfo.setFake(z);
        return heartbeatPushInfo;
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ x1d0 m123880g3(String str, JSONObject jSONObject) {
        x1d0.C21228a c21228aAuth = C4879a.f20236P.auth();
        StringBuilder sb = new StringBuilder("/heartbeat-match/me");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        sb.append(str);
        return c21228aAuth.m209043q(C4879a.m32203G(sb.toString())).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ void m123883j3(String str, C22507a c22507a, boolean z) {
        if (CoreModule.f18272k.f115535c.m189482r0(str, MessageType.heartbeat_notify).m208669e() > 0) {
            c22507a.m137019l(uxj0.f181467a);
            return;
        }
        MessageType messageType = MessageType.get(MessageType.heartbeat_notify);
        if (z) {
            int iM208669e = CoreModule.f18272k.f115535c.m189465a0(str).m208669e();
            int iM208669e2 = CoreModule.f18272k.f115535c.m189470f0(str).m208669e();
            if (iM208669e == 0 && iM208669e2 == 0) {
                CoreModule.f18264c.f20384f0.m33933dh(str, messageType);
            }
        } else if (CoreModule.f18272k.f115535c.m189470f0(str).m208669e() == 0) {
            CoreModule.f18264c.f20384f0.m33933dh(str, messageType);
        }
        c22507a.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m123885l3(boolean z, String str) {
        if (z && CoreModule.f18272k.f115535c.m189482r0(str, MessageType.heartbeat_success).m208669e() == 0) {
            CoreModule.f18264c.f20384f0.m33933dh(str, MessageType.get(MessageType.heartbeat_success));
        }
    }

    /* JADX INFO: renamed from: u3 */
    public static /* synthetic */ void m123894u3(Throwable th) {
    }

    /* JADX INFO: renamed from: A3 */
    public void m123895A3(final String str, final boolean z) {
        l51.m152919y(new Runnable() { // from class: l.d49
            @Override // java.lang.Runnable
            public final void run() {
                l9c.m153394o().m153397B(new x20() { // from class: l.k39
                    @Override // p153l.x20
                    public final void call() {
                        f49.m123885l3(z, str);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public String m123896B3() {
        return this.f97082j0 ? "1" : "0";
    }

    /* JADX INFO: renamed from: C3 */
    public final String m123897C3() {
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        if (NullChecker.m82486a(userM116593na)) {
            return userM116593na.isFemale() ? RemoteConfig.m80481x().m80485F("heartbeat_push_show_limit_female") : RemoteConfig.m80481x().m80485F("heartbeat_push_show_limit_male");
        }
        return "";
    }

    /* JADX INFO: renamed from: D3 */
    public C22421c<Message> m123898D3() {
        return this.f97064R.asObservable().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: E3 */
    public final String m123899E3(long j) {
        return String.valueOf((pzi0.m174454o() - j) / Constants.ONE_MIN_IN_MILLIS);
    }

    /* JADX INFO: renamed from: F3 */
    public String m123900F3() {
        return this.f97073a0;
    }

    /* JADX INFO: renamed from: G3 */
    public final long m123901G3() {
        int iM80518y;
        try {
            if (gta.m132210e().m132214d().mo34960yt()) {
                String strM123897C3 = m123897C3();
                if (TextUtils.isEmpty(strM123897C3)) {
                    return 1800000L;
                }
                iM80518y = new JSONObject(strM123897C3).optInt("time");
            } else {
                User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
                if (!NullChecker.m82486a(userM116593na)) {
                    return 1800000L;
                }
                if (userM116593na.isFemale()) {
                    iM80518y = RemoteConfig.m80481x().m80518y("heartbeat_push_limit_female");
                    if (iM80518y <= 0) {
                        return 1800000L;
                    }
                } else {
                    iM80518y = RemoteConfig.m80481x().m80518y("heartbeat_push_limit_male");
                    if (iM80518y <= 0) {
                        return 1800000L;
                    }
                }
            }
            return ((long) (iM80518y * 60)) * 1000;
        } catch (Exception unused) {
            return 1800000L;
        }
    }

    /* JADX INFO: renamed from: H3 */
    public int m123902H3() {
        return this.f97081i0;
    }

    /* JADX INFO: renamed from: I3 */
    public final String m123903I3(PushMessageCustom pushMessageCustom) {
        if (!TextUtils.isEmpty(pushMessageCustom.triggeredUserId)) {
            return FirebaseAnalytics.Event.SEARCH;
        }
        if (pushMessageCustom.noRecommended) {
            return "timeout";
        }
        return pushMessageCustom.isPassive ? "passive" : Active.TYPE;
    }

    /* JADX INFO: renamed from: J3 */
    public boolean m123904J3() {
        return this.f97074b0;
    }

    /* JADX INFO: renamed from: K3 */
    public boolean m123905K3(PushMessageCustom pushMessageCustom) {
        return NullChecker.m82486a(pushMessageCustom) && TextUtils.equals(pushMessageCustom.triggeredUserId, CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: L3 */
    public boolean m123906L3() {
        return (TextUtils.isEmpty(this.f97073a0) || TextUtils.equals(this.f97073a0, "search_start") || TextUtils.equals(this.f97073a0, "search_idle") || TextUtils.equals(this.f97073a0, "search_cancel")) ? false : true;
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m123907M3(Envelope envelope) {
        if (gta.m132210e().m132214d().mo34725Mo()) {
            this.f91137Q.f20297C0.m146425v4();
        }
        if (gta.m132210e().m132214d().mo34835gb()) {
            this.f91137Q.f20313H1.m123920Z3();
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ C22421c m123908N3(String str, String str2, String str3, final String str4) {
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
        return qi20.m176654a(new pcj() { // from class: l.m39
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return f49.m123880g3(str4, jSONObject);
            }
        }).doOnNext(new y20() { // from class: l.n39
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139953a.m123907M3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ C22421c m123909O3(PushMessageCustom pushMessageCustom, boolean z, final pf60 pf60Var) {
        return C22421c.combineLatest(this.f91137Q.f20381e0.m116495Na(pushMessageCustom.userId), z ? this.f91137Q.f20384f0.m33905ap(pushMessageCustom.userId) : C22421c.just(uxj0.f181467a), new rcj() { // from class: l.o39
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new pf60((uxj0) obj, (uxj0) obj2);
            }
        }).map(new qcj() { // from class: l.p39
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return f49.m123876c3(pf60Var, (pf60) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m123910P3(HeartbeatPushInfo heartbeatPushInfo) {
        gta.m132210e().m132214d().mo34806bh(heartbeatPushInfo);
        this.f97067U.m137019l(heartbeatPushInfo);
        this.f97068V.m137019l(heartbeatPushInfo);
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ void m123911Q3(Envelope envelope) {
        ExtraPrivileges extraPrivileges = ((CoreData) envelope.getModuleData(CoreData.class)).extraPrivileges;
        if (NullChecker.m82486a(extraPrivileges) && NullChecker.m82486a(extraPrivileges.heartbeatMatch) && extraPrivileges.heartbeatMatch.expiredTime > uqb0.f180376H.guessedCurrentServerTime()) {
            this.f97081i0 = extraPrivileges.heartbeatMatch.remaining;
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m123912R3(String str) {
        if (CoreModule.f18272k.f115535c.m189482r0(str, MessageType.heartbeat_notify).m208669e() > 0) {
            CoreModule.f18272k.f115535c.delete(Filter.AND(Message.CID.mo61359EQ(str), Message.MESSAGETYPE.m61360EQ(MessageType.heartbeat_notify)));
        }
        if (CoreModule.f18272k.f115535c.m189482r0(str, "heartbeat_waiting_response").m208669e() == 0) {
            this.f91137Q.f20384f0.m33944eh(this.f91137Q.f20384f0.m34068of(str, MessageType.get("heartbeat_waiting_response")));
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m123913S3(final String str) {
        l9c.m153394o().m153397B(new x20() { // from class: l.l39
            @Override // p153l.x20
            public final void call() {
                this.f129854a.m123912R3(str);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m123914T3(Throwable th) {
        this.f97073a0 = "search_idle";
        gta.m132210e().m132214d().mo34841gs();
        r1j0.m179420g("网络异常！");
        this.f91137Q.f20297C0.m146425v4();
        this.f91137Q.f20312H0.m155449k5();
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m123915U3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (!NullChecker.m82486a(coreData.heartbeatMatch)) {
            this.f97073a0 = "search_idle";
            gta.m132210e().m132214d().mo34841gs();
            return;
        }
        if (!NullChecker.m82486a(coreData.heartbeatMatch.error) || TextUtils.isEmpty(coreData.heartbeatMatch.error.subcode)) {
            this.f97073a0 = coreData.heartbeatMatch.tracker;
            gta.m132210e().m132214d().mo34826f7();
            gta.m132210e().m132214d().mo34881lj(coreData.heartbeatMatch.waitSeconds);
            return;
        }
        HeartbeatActionError heartbeatActionError = coreData.heartbeatMatch.error;
        if (TextUtils.equals(heartbeatActionError.subcode, "40399") && !TextUtils.isEmpty(heartbeatActionError.message)) {
            o1j0.m165651y(heartbeatActionError.message);
            this.f91137Q.f20297C0.m146425v4();
            this.f91137Q.f20312H0.m155449k5();
        }
        this.f97073a0 = "search_idle";
        gta.m132210e().m132214d().mo34841gs();
    }

    /* JADX INFO: renamed from: V3 */
    public C22421c<Envelope> m123916V3(String str) {
        return m123930w3("match", str);
    }

    /* JADX INFO: renamed from: W3 */
    public void m123917W3(PushMessageCustom pushMessageCustom, boolean z) {
        m123918X3(pushMessageCustom, z, false);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002d  */
    /* JADX INFO: renamed from: X3 */
    public void m123918X3(final PushMessageCustom pushMessageCustom, final boolean z, boolean z2) {
        boolean z3;
        if (NullChecker.m82486a(pushMessageCustom)) {
            boolean z4 = TextUtils.isEmpty(pushMessageCustom.triggeredUserId) && !pushMessageCustom.noRecommended;
            if (z4) {
                double dM174454o = pzi0.m174454o();
                double d = pushMessageCustom.expire;
                if (dM174454o < d || d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                z3 = false;
            }
            m123928h4(pushMessageCustom, z3, z4 && pzi0.m174454o() - this.f97075c0.get().longValue() < m123901G3(), z4, z2);
            if (TextUtils.isEmpty(pushMessageCustom.triggeredUserId)) {
                double dM174454o2 = pzi0.m174454o();
                double d2 = pushMessageCustom.expire;
                if (dM174454o2 >= d2 && d2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    i4g0.m138493B("e_heartbeat_push_expired", "", jyb.m147494Y("otheruserID", pushMessageCustom.userId), jyb.m147494Y("expired_time", m123899E3((long) pushMessageCustom.expire)));
                    return;
                } else {
                    if (pzi0.m174454o() - this.f97075c0.get().longValue() < m123901G3()) {
                        i4g0.m138493B("e_heartbeat_push_limit", "", jyb.m147494Y("otheruserID", pushMessageCustom.userId), jyb.m147494Y("intercal_time", Long.valueOf(m123901G3() / Constants.ONE_MIN_IN_MILLIS)), jyb.m147494Y("timeout", m123899E3(this.f97075c0.get().longValue())));
                        return;
                    }
                    this.f97075c0.put(Long.valueOf(pzi0.m174454o()));
                }
            }
            C22421c c22421cOnErrorReturn = gta.m132210e().m132214d().mo34934u() ? CoreModule.m30932N().personalMediaMomentsFeedPrevious(pushMessageCustom.userId, false, CoreMomentInfo.JSON_ADAPTER).onErrorReturn(new qcj() { // from class: l.x39
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return pf60.m172085a(Links.new_(), new ArrayList());
                }
            }) : C22421c.just(pf60.m172085a(Links.new_(), new ArrayList()));
            final boolean z5 = gta.m132210e().m132214d().mo34725Mo() && m123905K3(pushMessageCustom);
            c22421cOnErrorReturn.flatMap(new qcj() { // from class: l.y39
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f197330a.m123909O3(pushMessageCustom, z5, (pf60) obj);
                }
            }).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.z39
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return f49.m123877d3(pushMessageCustom, z, (pf60) obj);
                }
            }).observeOn(fo0.m126432a()).subscribe(new y20() { // from class: l.a49
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f68366a.m123910P3((HeartbeatPushInfo) obj);
                }
            }, new y20() { // from class: l.b49
                @Override // p153l.y20
                public final void call(Object obj) {
                    f49.m123894u3((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public C22421c<Envelope> m123919Y3(String str) {
        return m123930w3("reject", str);
    }

    /* JADX INFO: renamed from: Z3 */
    public void m123920Z3() {
        this.f91137Q.scheduled("getHeartBeatPrivilegesTimes", 0, new pcj() { // from class: l.q39
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.t39
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/heartbeat-match/me/privileges")).m209032f().m209028b();
                    }
                });
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.r39
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161017a.m123911Q3((Envelope) obj);
            }
        }, new y20() { // from class: l.s39
            @Override // p153l.y20
            public final void call(Object obj) {
                f49.m123874a3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public void m123921a4() {
        this.f97075c0.put(0L);
    }

    /* JADX INFO: renamed from: b4 */
    public void m123922b4(boolean z) {
        this.f97082j0 = z;
    }

    /* JADX INFO: renamed from: c4 */
    public void m123923c4(String str) {
        this.f97073a0 = str;
    }

    /* JADX INFO: renamed from: d4 */
    public void m123924d4() {
        this.f97074b0 = true;
    }

    /* JADX INFO: renamed from: e4 */
    public void m123925e4() {
        this.f97066T.m137019l(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: f4 */
    public void m123926f4(final String str) {
        l51.m152919y(new Runnable() { // from class: l.u39
            @Override // java.lang.Runnable
            public final void run() {
                this.f177318a.m123913S3(str);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public C22421c<Envelope> m123927g4() {
        gta.m132210e().m132214d().mo34826f7();
        this.f97073a0 = "search_start";
        return m123931x3("start", "", null).doOnError(new y20() { // from class: l.v39
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182172a.m123914T3((Throwable) obj);
            }
        }).doOnNext(new y20() { // from class: l.w39
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187112a.m123915U3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public final void m123928h4(PushMessageCustom pushMessageCustom, boolean z, boolean z2, boolean z3, boolean z4) {
        i4g0.m138493B("e_heartbeat_push_arrived", "", jyb.m147494Y("otheruserID", pushMessageCustom.userId), jyb.m147494Y("expired", Boolean.valueOf(z)), jyb.m147494Y("type", m123903I3(pushMessageCustom)), jyb.m147494Y(Constants.KEY_LIMIT, Boolean.valueOf(z2)), jyb.m147494Y("expired_time", Double.valueOf(z3 ? pushMessageCustom.expire : -1.0d)), jyb.m147494Y("source", pushMessageCustom.tracker), jyb.m147494Y("count_limit", Boolean.valueOf(!z4)));
    }

    /* JADX INFO: renamed from: v3 */
    public C22421c<Envelope> m123929v3(String str) {
        return m123930w3("accept", str);
    }

    /* JADX INFO: renamed from: w3 */
    public C22421c<Envelope> m123930w3(String str, String str2) {
        return m123931x3(str, str2, null);
    }

    /* JADX INFO: renamed from: x3 */
    public C22421c<Envelope> m123931x3(String str, String str2, String str3) {
        return m123932y3(str, str2, str3, "");
    }

    /* JADX INFO: renamed from: y3 */
    public C22421c<Envelope> m123932y3(final String str, final String str2, final String str3, final String str4) {
        return this.f91137Q.scheduled(str + "_heartbeat-match", -1, new pcj() { // from class: l.c49
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f79680a.m123908N3(str, str2, str4, str3);
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public void m123933z3(final boolean z, final String str, final C22507a<uxj0> c22507a) {
        l51.m152919y(new Runnable() { // from class: l.j39
            @Override // java.lang.Runnable
            public final void run() {
                l9c.m153394o().m153397B(new x20() { // from class: l.e49
                    @Override // p153l.x20
                    public final void call() {
                        f49.m123883j3(str, c22507a, z);
                    }
                });
            }
        });
    }
}
