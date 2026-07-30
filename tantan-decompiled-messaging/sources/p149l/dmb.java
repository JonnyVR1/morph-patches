package p149l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.HeartBeat;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.VoiceCallStatus;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveRole;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class dmb extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f86912R;

    public dmb(C4732c c4732c) {
        super(c4732c);
        this.f86912R = new zpd0("first_in_voice_call_ab_time_" + CoreModule.m29931H().userId(), -1L);
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ stc0 m112436a3(String str, String str2, String str3, String str4, String str5, int i, long j, String str6, String str7, String str8, String str9, String str10, String str11) {
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
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
        if (TextUtils.equals(str3, CoreModule.m29931H().userId())) {
            str3 = str4;
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/calls/" + str3)).m185892k(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ stc0 m112443h3(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, VoiceCallStatus.calling);
            jSONObject.put("callerDeviceId", str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("scene", str2);
            }
        } catch (JSONException unused) {
        }
        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/calls/" + str3)).m185892k(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ HeartBeat m112444i3(Envelope envelope) {
        if (!vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).heartbeats)) {
            return ((CoreData) envelope.getModuleData(CoreData.class)).heartbeats.get(0);
        }
        HeartBeat heartBeatNew_ = HeartBeat.new_();
        heartBeatNew_.interval = 45;
        return heartBeatNew_;
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ void m112447l3(Message message, Envelope envelope) {
        CoreModule.f17545c.m31492w3(envelope, null);
        CoreModule.f17545c.f19642f0.m32902ap(message.cid);
    }

    /* JADX INFO: renamed from: m3 */
    public C22306c<Envelope> m112448m3(final String str, final String str2, final String str3) {
        return this.f72126Q.scheduled(str + "/calls/patch", -1, new v9j() { // from class: l.amb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135121e(new v9j() { // from class: l.tlb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return dmb.m112443h3(str, str, str);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public C22306c<Envelope> m112449n3(final String str, final String str2) {
        return this.f72126Q.scheduled(str + "/calls/get/" + str2, 0, new v9j() { // from class: l.xlb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.slb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/calls/" + str + "?channel_name=" + str)).m185887f().m185883b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: o3 */
    public C22306c<HeartBeat> m112450o3(final String str, Long l2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(BLiveOperationTitleShowType.duration, l2);
        } catch (JSONException unused) {
        }
        return this.f72126Q.scheduled("/calls/" + str + "/heartbeats", 0, new v9j() { // from class: l.wlb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.bmb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/calls/" + str + "/heartbeats")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
                    }
                }).map(new w9j() { // from class: l.cmb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return dmb.m112444i3((Envelope) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: p3 */
    public C22306c<Envelope> m112451p3(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final long j, final String str7, final String str8, final String str9, final String str10, final String str11, final int i) {
        return this.f72126Q.scheduled(str + "/calls/patch", -1, new v9j() { // from class: l.rlb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.ulb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return dmb.m112436a3(str, str, str, str, str, i, j, str, str, str, str, str, str);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public C22306c<Envelope> m112452q3(final Message message) {
        return this.f72126Q.scheduled(message.f56011id + "/calls/invitation/patch", -1, new v9j() { // from class: l.vlb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                Message message2 = message;
                return ia20.m135121e(new v9j() { // from class: l.ylb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        Message message3 = message2;
                        return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/conversations/" + message3.cid + "/messages/" + message3.f56011id)).m185892k(utc0.create(Network.JSON, message3.toJson())).m185883b();
                    }
                }).doOnNext(new e30() { // from class: l.zlb
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        dmb.m112447l3(message2, (Envelope) obj);
                    }
                });
            }
        });
    }
}
