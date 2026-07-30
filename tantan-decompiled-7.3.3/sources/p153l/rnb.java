package p153l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.HeartBeat;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.VoiceCallStatus;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveRole;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class rnb extends dy6 {

    /* JADX INFO: renamed from: R */
    public byd0 f163984R;

    public rnb(C4883c c4883c) {
        super(c4883c);
        this.f163984R = new byd0("first_in_voice_call_ab_time_" + CoreModule.m30929H().userId(), -1L);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ x1d0 m182150a3(String str, String str2, String str3, String str4, String str5, int i, long j, String str6, String str7, String str8, String str9, String str10, String str11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, str);
            jSONObject.put("id", str2);
            jSONObject.put(BLiveRole.caller, str3);
            jSONObject.put("callee", str4);
            jSONObject.put("scene", str5);
            jSONObject.put("type", "voice");
            jSONObject.put("errorCode", i);
            if (j >= 0) {
                jSONObject.put(BLiveOperationTitleShowType.duration, j);
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
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
        if (TextUtils.equals(str3, CoreModule.m30929H().userId())) {
            str3 = str4;
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/calls/" + str3)).m209037k(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ x1d0 m182157h3(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, VoiceCallStatus.calling);
            jSONObject.put("callerDeviceId", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("scene", str2);
            }
        } catch (JSONException unused) {
        }
        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/calls/" + str3)).m209037k(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ HeartBeat m182158i3(Envelope envelope) {
        if (!jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).heartbeats)) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).heartbeats.get(0);
        }
        HeartBeat heartBeatNew_ = HeartBeat.new_();
        heartBeatNew_.interval = 45;
        return heartBeatNew_;
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m182161l3(Message message, Envelope envelope) {
        CoreModule.f18264c.m32495w3(envelope, null);
        CoreModule.f18264c.f20384f0.m33905ap(message.cid);
    }

    /* JADX INFO: renamed from: m3 */
    public C22421c<Envelope> m182162m3(final String str, final String str2, final String str3) {
        return this.f91137Q.scheduled(str + "/calls/patch", -1, new pcj() { // from class: l.onb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176658e(new pcj() { // from class: l.hnb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return rnb.m182157h3(str, str, str);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public C22421c<Envelope> m182163n3(final String str, final String str2) {
        return this.f91137Q.scheduled(str + "/calls/get/" + str2, 0, new pcj() { // from class: l.lnb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.gnb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/calls/" + str + "?channel_name=" + str)).m209032f().m209028b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public C22421c<HeartBeat> m182164o3(final String str, Long l2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(BLiveOperationTitleShowType.duration, l2);
        } catch (JSONException unused) {
        }
        return this.f91137Q.scheduled("/calls/" + str + "/heartbeats", 0, new pcj() { // from class: l.knb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.pnb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/calls/" + str + "/heartbeats")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
                    }
                }).map(new qcj() { // from class: l.qnb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return rnb.m182158i3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public C22421c<Envelope> m182165p3(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final long j, final String str7, final String str8, final String str9, final String str10, final String str11, final int i) {
        return this.f91137Q.scheduled(str + "/calls/patch", -1, new pcj() { // from class: l.fnb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.inb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return rnb.m182150a3(str, str, str, str, str, i, j, str, str, str, str, str, str);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public C22421c<Envelope> m182166q3(final Message message) {
        return this.f91137Q.scheduled(message.f56859id + "/calls/invitation/patch", -1, new pcj() { // from class: l.jnb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                Message message2 = message;
                return qi20.m176658e(new pcj() { // from class: l.mnb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        Message message3 = message2;
                        return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/conversations/" + message3.cid + "/messages/" + message3.f56859id)).m209037k(z1d0.create(Network.JSON, message3.toJson())).m209028b();
                    }
                }).doOnNext(new y20() { // from class: l.nnb
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        rnb.m182161l3(message2, (Envelope) obj);
                    }
                });
            }
        });
    }
}
