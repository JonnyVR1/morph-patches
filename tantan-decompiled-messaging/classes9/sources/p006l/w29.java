package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.ExtraPrivileges;
import com.p1.mobile.putong.core.data.HeartbeatActionError;
import com.p1.mobile.putong.core.data.HeartbeatPushInfo;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.orm.Filter;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.e51;
import l.f8c;
import l.hpd0;
import l.j760;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.roj0;
import l.stc0;
import l.tpd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.x9j;
import l.zpd0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class w29 extends ax6 {

    /* JADX INFO: renamed from: R */
    public b<Message> f24766R;

    /* JADX INFO: renamed from: S */
    public b<roj0> f24767S;

    /* JADX INFO: renamed from: T */
    public a<Boolean> f24768T;

    /* JADX INFO: renamed from: U */
    public a<HeartbeatPushInfo> f24769U;

    /* JADX INFO: renamed from: V */
    public b<HeartbeatPushInfo> f24770V;

    /* JADX INFO: renamed from: W */
    public a<roj0> f24771W;

    /* JADX INFO: renamed from: X */
    public hpd0 f24772X;

    /* JADX INFO: renamed from: Y */
    public boolean f24773Y;

    /* JADX INFO: renamed from: Z */
    public String f24774Z;

    /* JADX INFO: renamed from: a0 */
    public String f24775a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f24776b0;

    /* JADX INFO: renamed from: c0 */
    public zpd0 f24777c0;

    /* JADX INFO: renamed from: d0 */
    public zpd0 f24778d0;

    /* JADX INFO: renamed from: e0 */
    public zpd0 f24779e0;

    /* JADX INFO: renamed from: f0 */
    public tpd0 f24780f0;

    /* JADX INFO: renamed from: g0 */
    public hpd0 f24781g0;

    /* JADX INFO: renamed from: h0 */
    public long f24782h0;

    /* JADX INFO: renamed from: i0 */
    public int f24783i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f24784j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f24785k0;

    public w29(C0158c c0158c) {
        super(c0158c);
        this.f24766R = b.b();
        this.f24767S = b.b();
        this.f24768T = a.b();
        this.f24769U = a.b();
        this.f24770V = b.b();
        this.f24771W = a.b();
        String str = "heartbeat_privilege_notify_flag_" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.FALSE;
        this.f24772X = new hpd0(str, bool);
        this.f24773Y = false;
        this.f24774Z = "27754";
        this.f24775a0 = "search_idle";
        this.f24776b0 = false;
        this.f24777c0 = new zpd0("last_op_heartbeat_push" + CoreModule.m1850H().userId(), 0L);
        this.f24778d0 = new zpd0("heart_signal_new_anim_time_" + CoreModule.m1850H().userId(), 0L);
        this.f24779e0 = new zpd0("heart_beart_last_repor_time_" + CoreModule.m1850H().userId(), 0L);
        this.f24780f0 = new tpd0("heart_beart_report_count_" + CoreModule.m1850H().userId(), 0);
        this.f24781g0 = new hpd0("inore_heartbeat_limit_debug", bool);
        this.f24782h0 = 0L;
        this.f24785k0 = false;
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m26094a3(Throwable th) {
    }

    /* JADX INFO: renamed from: c3 */
    public static /* synthetic */ j760 m26096c3(j760 j760Var, j760 j760Var2) {
        return j760Var;
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ HeartbeatPushInfo m26097d3(PushMessageCustom pushMessageCustom, boolean z, j760 j760Var) {
        List<CoreMomentInfo> list = (List) j760Var.b;
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(list)) {
            int i = 0;
            for (CoreMomentInfo coreMomentInfo : list) {
                if (!vwb.J(coreMomentInfo.media)) {
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
        HeartbeatPushInfo heartbeatPushInfo = new HeartbeatPushInfo(pushMessageCustom, arrayList, mqi0.o());
        heartbeatPushInfo.setFake(z);
        return heartbeatPushInfo;
    }

    /* JADX INFO: renamed from: g3 */
    public static /* synthetic */ stc0 m26100g3(String str, JSONObject jSONObject) {
        stc0.a aVarAuth = C0154a.f3483P.auth();
        StringBuilder sb = new StringBuilder("/heartbeat-match/me");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        sb.append(str);
        return aVarAuth.q(C0154a.m3130G(sb.toString())).l(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ void m26103j3(String str, a aVar, boolean z) {
        if (CoreModule.f1542k.f11195c.m26917r0(str, "heartbeat_notify").e() > 0) {
            aVar.onNext(roj0.a);
            return;
        }
        MessageType messageType = MessageType.get("heartbeat_notify");
        if (z) {
            int iE = CoreModule.f1542k.f11195c.m26900a0(str).e();
            int iE2 = CoreModule.f1542k.f11195c.m26905f0(str).e();
            if (iE == 0 && iE2 == 0) {
                CoreModule.f1534c.f3631f0.m4860dh(str, messageType);
            }
        } else if (CoreModule.f1542k.f11195c.m26905f0(str).e() == 0) {
            CoreModule.f1534c.f3631f0.m4860dh(str, messageType);
        }
        aVar.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m26105l3(boolean z, String str) {
        if (z && CoreModule.f1542k.f11195c.m26917r0(str, "heartbeat_success").e() == 0) {
            CoreModule.f1534c.f3631f0.m4860dh(str, MessageType.get("heartbeat_success"));
        }
    }

    /* JADX INFO: renamed from: u3 */
    public static /* synthetic */ void m26114u3(Throwable th) {
    }

    /* JADX INFO: renamed from: A3 */
    public void m26115A3(final String str, final boolean z) {
        e51.y(new Runnable() { // from class: l.u29
            @Override // java.lang.Runnable
            public final void run() {
                f8c.o().B(new d30() { // from class: l.b29
                    public final void call() {
                        w29.m26105l3(z, str);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public String m26116B3() {
        return this.f24784j0 ? "1" : "0";
    }

    /* JADX INFO: renamed from: C3 */
    public final String m26117C3() {
        User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
        if (NullChecker.a(userM21483na)) {
            return userM21483na.isFemale() ? RemoteConfig.x().F("heartbeat_push_show_limit_female") : RemoteConfig.x().F("heartbeat_push_show_limit_male");
        }
        return "";
    }

    /* JADX INFO: renamed from: D3 */
    public c<Message> m26118D3() {
        return this.f24766R.asObservable().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: E3 */
    public final String m26119E3(long j) {
        return String.valueOf((mqi0.o() - j) / 60000);
    }

    /* JADX INFO: renamed from: F3 */
    public String m26120F3() {
        return this.f24775a0;
    }

    /* JADX INFO: renamed from: G3 */
    public final long m26121G3() {
        int iY;
        try {
            if (ura.m25555e().m25559d().m5894yt()) {
                String strM26117C3 = m26117C3();
                if (TextUtils.isEmpty(strM26117C3)) {
                    return 1800000L;
                }
                iY = new JSONObject(strM26117C3).optInt("time");
            } else {
                User userM21483na = CoreModule.f1534c.f3628e0.m21483na();
                if (!NullChecker.a(userM21483na)) {
                    return 1800000L;
                }
                if (userM21483na.isFemale()) {
                    iY = RemoteConfig.x().y("heartbeat_push_limit_female");
                    if (iY <= 0) {
                        return 1800000L;
                    }
                } else {
                    iY = RemoteConfig.x().y("heartbeat_push_limit_male");
                    if (iY <= 0) {
                        return 1800000L;
                    }
                }
            }
            return ((long) (iY * 60)) * 1000;
        } catch (Exception unused) {
            return 1800000L;
        }
    }

    /* JADX INFO: renamed from: H3 */
    public int m26122H3() {
        return this.f24783i0;
    }

    /* JADX INFO: renamed from: I3 */
    public final String m26123I3(PushMessageCustom pushMessageCustom) {
        if (!TextUtils.isEmpty(pushMessageCustom.triggeredUserId)) {
            return "search";
        }
        if (pushMessageCustom.noRecommended) {
            return "timeout";
        }
        return pushMessageCustom.isPassive ? "passive" : "active";
    }

    /* JADX INFO: renamed from: J3 */
    public boolean m26124J3() {
        return this.f24776b0;
    }

    /* JADX INFO: renamed from: K3 */
    public boolean m26125K3(PushMessageCustom pushMessageCustom) {
        return NullChecker.a(pushMessageCustom) && TextUtils.equals(pushMessageCustom.triggeredUserId, CoreModule.m1850H().userId());
    }

    /* JADX INFO: renamed from: L3 */
    public boolean m26126L3() {
        return (TextUtils.isEmpty(this.f24775a0) || TextUtils.equals(this.f24775a0, "search_start") || TextUtils.equals(this.f24775a0, "search_idle") || TextUtils.equals(this.f24775a0, "search_cancel")) ? false : true;
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m26127M3(Envelope envelope) {
        if (ura.m25555e().m25559d().m5659Mo()) {
            this.f8580Q.f3544C0.m27420u4();
        }
        if (ura.m25555e().m25559d().m5769gb()) {
            this.f8580Q.f3560H1.m26140Z3();
        }
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ c m26128N3(String str, String str2, String str3, final String str4) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
            jSONObject.put("tracker", str2);
            if (TextUtils.equals(str, "report")) {
                if (TextUtils.isEmpty(str3)) {
                    str3 = "monetization";
                }
                jSONObject.put("reportType", str3);
            }
        } catch (JSONException unused) {
        }
        return ia20.m16567a(new v9j() { // from class: l.d29
            public final Object call() {
                return w29.m26100g3(str4, jSONObject);
            }
        }).doOnNext(new e30() { // from class: l.e29
            public final void call(Object obj) {
                this.f10732a.m26127M3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ c m26129O3(PushMessageCustom pushMessageCustom, boolean z, final j760 j760Var) {
        return c.combineLatest(this.f8580Q.f3628e0.m21385Na(pushMessageCustom.userId), z ? this.f8580Q.f3631f0.m4832ap(pushMessageCustom.userId) : c.just(roj0.a), new x9j() { // from class: l.f29
            public final Object call(Object obj, Object obj2) {
                return new j760((roj0) obj, (roj0) obj2);
            }
        }).map(new w9j() { // from class: l.g29
            public final Object call(Object obj) {
                return w29.m26096c3(j760Var, (j760) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m26130P3(HeartbeatPushInfo heartbeatPushInfo) {
        ura.m25555e().m25559d().m5740bh(heartbeatPushInfo);
        this.f24769U.onNext(heartbeatPushInfo);
        this.f24770V.onNext(heartbeatPushInfo);
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ void m26131Q3(Envelope envelope) {
        ExtraPrivileges extraPrivileges = envelope.getModuleData(CoreData.class).extraPrivileges;
        if (NullChecker.a(extraPrivileges) && NullChecker.a(extraPrivileges.heartbeatMatch) && extraPrivileges.heartbeatMatch.expiredTime > qib0.f19784H.guessedCurrentServerTime()) {
            this.f24783i0 = extraPrivileges.heartbeatMatch.remaining;
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m26132R3(String str) {
        if (CoreModule.f1542k.f11195c.m26917r0(str, "heartbeat_notify").e() > 0) {
            CoreModule.f1542k.f11195c.delete(Filter.AND(new Filter[]{Message.CID.EQ(str), Message.MESSAGETYPE.EQ("heartbeat_notify")}));
        }
        if (CoreModule.f1542k.f11195c.m26917r0(str, "heartbeat_waiting_response").e() == 0) {
            this.f8580Q.f3631f0.m4871eh(this.f8580Q.f3631f0.m4995of(str, MessageType.get("heartbeat_waiting_response")));
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m26133S3(final String str) {
        f8c.o().B(new d30() { // from class: l.c29
            public final void call() {
                this.f9294a.m26132R3(str);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m26134T3(Throwable th) {
        this.f24775a0 = "search_idle";
        ura.m25555e().m25559d().m5775gs();
        osi0.g("网络异常！");
        this.f8580Q.f3544C0.m27420u4();
        this.f8580Q.f3559H0.m27536k5();
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m26135U3(Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        if (!NullChecker.a(moduleData.heartbeatMatch)) {
            this.f24775a0 = "search_idle";
            ura.m25555e().m25559d().m5775gs();
            return;
        }
        if (!NullChecker.a(moduleData.heartbeatMatch.error) || TextUtils.isEmpty(moduleData.heartbeatMatch.error.subcode)) {
            this.f24775a0 = moduleData.heartbeatMatch.tracker;
            ura.m25555e().m25559d().m5760f7();
            ura.m25555e().m25559d().m5815lj(moduleData.heartbeatMatch.waitSeconds);
            return;
        }
        HeartbeatActionError heartbeatActionError = moduleData.heartbeatMatch.error;
        if (TextUtils.equals(heartbeatActionError.subcode, "40399") && !TextUtils.isEmpty(heartbeatActionError.message)) {
            lsi0.y(heartbeatActionError.message);
            this.f8580Q.f3544C0.m27420u4();
            this.f8580Q.f3559H0.m27536k5();
        }
        this.f24775a0 = "search_idle";
        ura.m25555e().m25559d().m5775gs();
    }

    /* JADX INFO: renamed from: V3 */
    public c<Envelope> m26136V3(String str) {
        return m26150w3("match", str);
    }

    /* JADX INFO: renamed from: W3 */
    public void m26137W3(PushMessageCustom pushMessageCustom, boolean z) {
        m26138X3(pushMessageCustom, z, false);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002d  */
    /* JADX INFO: renamed from: X3 */
    public void m26138X3(final PushMessageCustom pushMessageCustom, final boolean z, boolean z2) {
        boolean z3;
        if (NullChecker.a(pushMessageCustom)) {
            boolean z4 = TextUtils.isEmpty(pushMessageCustom.triggeredUserId) && !pushMessageCustom.noRecommended;
            if (z4) {
                double dO = mqi0.o();
                double d = pushMessageCustom.expire;
                if (dO < d || d <= 0.0d) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                z3 = false;
            }
            m26148h4(pushMessageCustom, z3, z4 && mqi0.o() - ((Long) this.f24777c0.get()).longValue() < m26121G3(), z4, z2);
            if (TextUtils.isEmpty(pushMessageCustom.triggeredUserId)) {
                double dO2 = mqi0.o();
                double d2 = pushMessageCustom.expire;
                if (dO2 >= d2 && d2 > 0.0d) {
                    zvf0.B("e_heartbeat_push_expired", "", new j760[]{vwb.Y("otheruserID", pushMessageCustom.userId), vwb.Y("expired_time", m26119E3((long) pushMessageCustom.expire))});
                    return;
                } else {
                    if (mqi0.o() - ((Long) this.f24777c0.get()).longValue() < m26121G3()) {
                        zvf0.B("e_heartbeat_push_limit", "", new j760[]{vwb.Y("otheruserID", pushMessageCustom.userId), vwb.Y("intercal_time", Long.valueOf(m26121G3() / 60000)), vwb.Y("timeout", m26119E3(((Long) this.f24777c0.get()).longValue()))});
                        return;
                    }
                    this.f24777c0.put(Long.valueOf(mqi0.o()));
                }
            }
            c cVarOnErrorReturn = ura.m25555e().m25559d().m5868u() ? CoreModule.m1853N().personalMediaMomentsFeedPrevious(pushMessageCustom.userId, false, CoreMomentInfo.JSON_ADAPTER).onErrorReturn(new w9j() { // from class: l.o29
                public final Object call(Object obj) {
                    return j760.a(Links.new_(), new ArrayList());
                }
            }) : c.just(j760.a(Links.new_(), new ArrayList()));
            final boolean z5 = ura.m25555e().m25559d().m5659Mo() && m26125K3(pushMessageCustom);
            cVarOnErrorReturn.flatMap(new w9j() { // from class: l.p29
                public final Object call(Object obj) {
                    return this.f18561a.m26129O3(pushMessageCustom, z5, (j760) obj);
                }
            }).observeOn(Schedulers.io()).map(new w9j() { // from class: l.q29
                public final Object call(Object obj) {
                    return w29.m26097d3(pushMessageCustom, z, (j760) obj);
                }
            }).observeOn(jo0.a()).subscribe(new e30() { // from class: l.r29
                public final void call(Object obj) {
                    this.f20265a.m26130P3((HeartbeatPushInfo) obj);
                }
            }, new e30() { // from class: l.s29
                public final void call(Object obj) {
                    w29.m26114u3((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public c<Envelope> m26139Y3(String str) {
        return m26150w3("reject", str);
    }

    /* JADX INFO: renamed from: Z3 */
    public void m26140Z3() {
        this.f8580Q.scheduled("getHeartBeatPrivilegesTimes", 0, new v9j() { // from class: l.h29
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.k29
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/heartbeat-match/me/privileges")).f().b();
                    }
                });
            }
        }).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.i29
            public final void call(Object obj) {
                this.f14207a.m26131Q3((Envelope) obj);
            }
        }, new e30() { // from class: l.j29
            public final void call(Object obj) {
                w29.m26094a3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public void m26141a4() {
        this.f24777c0.put(0L);
    }

    /* JADX INFO: renamed from: b4 */
    public void m26142b4(boolean z) {
        this.f24784j0 = z;
    }

    /* JADX INFO: renamed from: c4 */
    public void m26143c4(String str) {
        this.f24775a0 = str;
    }

    /* JADX INFO: renamed from: d4 */
    public void m26144d4() {
        this.f24776b0 = true;
    }

    /* JADX INFO: renamed from: e4 */
    public void m26145e4() {
        this.f24768T.onNext(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: f4 */
    public void m26146f4(final String str) {
        e51.y(new Runnable() { // from class: l.l29
            @Override // java.lang.Runnable
            public final void run() {
                this.f16190a.m26133S3(str);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public c<Envelope> m26147g4() {
        ura.m25555e().m25559d().m5760f7();
        this.f24775a0 = "search_start";
        return m26151x3("start", "", null).doOnError(new e30() { // from class: l.m29
            public final void call(Object obj) {
                this.f16758a.m26134T3((Throwable) obj);
            }
        }).doOnNext(new e30() { // from class: l.n29
            public final void call(Object obj) {
                this.f17449a.m26135U3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h4 */
    public final void m26148h4(PushMessageCustom pushMessageCustom, boolean z, boolean z2, boolean z3, boolean z4) {
        zvf0.B("e_heartbeat_push_arrived", "", new j760[]{vwb.Y("otheruserID", pushMessageCustom.userId), vwb.Y("expired", Boolean.valueOf(z)), vwb.Y("type", m26123I3(pushMessageCustom)), vwb.Y("limit", Boolean.valueOf(z2)), vwb.Y("expired_time", Double.valueOf(z3 ? pushMessageCustom.expire : -1.0d)), vwb.Y("source", pushMessageCustom.tracker), vwb.Y("count_limit", Boolean.valueOf(!z4))});
    }

    /* JADX INFO: renamed from: v3 */
    public c<Envelope> m26149v3(String str) {
        return m26150w3("accept", str);
    }

    /* JADX INFO: renamed from: w3 */
    public c<Envelope> m26150w3(String str, String str2) {
        return m26151x3(str, str2, null);
    }

    /* JADX INFO: renamed from: x3 */
    public c<Envelope> m26151x3(String str, String str2, String str3) {
        return m26152y3(str, str2, str3, "");
    }

    /* JADX INFO: renamed from: y3 */
    public c<Envelope> m26152y3(final String str, final String str2, final String str3, final String str4) {
        return this.f8580Q.scheduled(str + "_heartbeat-match", -1, new v9j() { // from class: l.t29
            public final Object call() {
                return this.f21837a.m26128N3(str, str2, str4, str3);
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public void m26153z3(final boolean z, final String str, final a<roj0> aVar) {
        e51.y(new Runnable() { // from class: l.a29
            @Override // java.lang.Runnable
            public final void run() {
                f8c.o().B(new d30() { // from class: l.v29
                    public final void call() {
                        w29.m26103j3(str, aVar, z);
                    }
                });
            }
        });
    }
}
