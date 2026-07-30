package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.HeartBeat;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import l.e30;
import l.stc0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dmb extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f10478R;

    public dmb(C0158c c0158c) {
        super(c0158c);
        this.f10478R = new zpd0("first_in_voice_call_ab_time_" + CoreModule.m1850H().userId(), -1L);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ stc0 m14090a3(String str, String str2, String str3, String str4, String str5, int i, long j, String str6, String str7, String str8, String str9, String str10, String str11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", str);
            jSONObject.put("id", str2);
            jSONObject.put("caller", str3);
            jSONObject.put("callee", str4);
            jSONObject.put("scene", str5);
            jSONObject.put("type", "voice");
            jSONObject.put("errorCode", i);
            if (j >= 0) {
                jSONObject.put("duration", j);
            }
            if (!TextUtils.isEmpty(str6)) {
                jSONObject.put("callerToken", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                jSONObject.put("calleeToken", str7);
            }
            if (!TextUtils.isEmpty(str8)) {
                jSONObject.put("channelName", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put("calleeDeviceId", str9);
            }
            if (!TextUtils.isEmpty(str10)) {
                jSONObject.put("callerDeviceId", str10);
            }
            if (!TextUtils.isEmpty(str11)) {
                jSONObject.put("rtcProvider", str11);
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
            e.printStackTrace();
        }
        if (TextUtils.equals(str3, CoreModule.m1850H().userId())) {
            str3 = str4;
        }
        return C0154a.f3483P.auth().q(C0154a.m3143J0("/calls/" + str3)).k(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ stc0 m14097h3(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "calling");
            jSONObject.put("callerDeviceId", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("scene", str2);
            }
        } catch (JSONException unused) {
        }
        return C0154a.f3483P.auth().q(C0154a.m3143J0("/calls/" + str3)).k(utc0.create(Network.JSON, jSONObject.toString())).b();
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ HeartBeat m14098i3(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CoreData.class).heartbeats)) {
            return (HeartBeat) envelope.getModuleData(CoreData.class).heartbeats.get(0);
        }
        HeartBeat heartBeatNew_ = HeartBeat.new_();
        heartBeatNew_.interval = 45;
        return heartBeatNew_;
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m14101l3(Message message, Envelope envelope) {
        CoreModule.f1534c.m3422w3(envelope, null);
        CoreModule.f1534c.f3631f0.m4832ap(message.cid);
    }

    /* JADX INFO: renamed from: m3 */
    public c<Envelope> m14102m3(final String str, final String str2, final String str3) {
        return this.f8580Q.scheduled(str + "/calls/patch", -1, new v9j() { // from class: l.amb
            public final Object call() {
                return ia20.m16571e(new v9j() { // from class: l.tlb
                    public final Object call() {
                        return dmb.m14097h3(str, str, str);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public c<Envelope> m14103n3(final String str, final String str2) {
        return this.f8580Q.scheduled(str + "/calls/get/" + str2, 0, new v9j() { // from class: l.xlb
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.slb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/calls/" + str + "?channel_name=" + str)).f().b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public c<HeartBeat> m14104o3(final String str, Long l2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", l2);
        } catch (JSONException unused) {
        }
        return this.f8580Q.scheduled("/calls/" + str + "/heartbeats", 0, new v9j() { // from class: l.wlb
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.bmb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/calls/" + str + "/heartbeats")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
                    }
                }).map(new w9j() { // from class: l.cmb
                    public final Object call(Object obj) {
                        return dmb.m14098i3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public c<Envelope> m14105p3(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final long j, final String str7, final String str8, final String str9, final String str10, final String str11, final int i) {
        return this.f8580Q.scheduled(str + "/calls/patch", -1, new v9j() { // from class: l.rlb
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.ulb
                    public final Object call() {
                        return dmb.m14090a3(str, str, str, str, str, i, j, str, str, str, str, str, str);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public c<Envelope> m14106q3(final Message message) {
        return this.f8580Q.scheduled(((DbObject) message).id + "/calls/invitation/patch", -1, new v9j() { // from class: l.vlb
            public final Object call() {
                Message message2 = message;
                return ia20.m16571e(new v9j() { // from class: l.ylb
                    public final Object call() {
                        Message message3 = message2;
                        return C0154a.f3483P.auth().q(C0154a.m3143J0("/conversations/" + message3.cid + "/messages/" + ((DbObject) message3).id)).k(utc0.create(Network.JSON, message3.toJson())).b();
                    }
                }).doOnNext(new e30() { // from class: l.zlb
                    public final void call(Object obj) {
                        dmb.m14101l3(message2, (Envelope) obj);
                    }
                });
            }
        });
    }
}
