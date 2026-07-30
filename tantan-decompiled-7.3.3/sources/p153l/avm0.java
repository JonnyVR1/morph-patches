package p153l;

import androidx.core.app.NotificationCompat;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class avm0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m100468a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Envelope m100471d(Envelope envelope) {
        CoreModule.f18264c.m32495w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m100472e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static void m100473f(boolean z, String str, Message message) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, z ? "rejected" : "accepted");
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            string = "";
        }
        message.msgData = string;
        CoreModule.f18264c.f20343R0.m182166q3(message);
    }

    /* JADX INFO: renamed from: g */
    public static void m100474g(PushMessageCustom pushMessageCustom, String str, String str2) {
        CoreModule.f18264c.f20343R0.m182165p3(pushMessageCustom.f39653id, pushMessageCustom.caller, pushMessageCustom.callee, pushMessageCustom.callerToken, pushMessageCustom.calleeToken, pushMessageCustom.channelName, -1L, str, pushMessageCustom.callerDeviceId, tl8.m191616M().identifier, str2, pushMessageCustom.rtcProvider, 0).subscribe(psd0.m173597H(new y20() { // from class: l.yum0
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20384f0.m33653Fo();
            }
        }, new y20() { // from class: l.zum0
            @Override // p153l.y20
            public final void call(Object obj) {
                avm0.m100472e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static C22421c<Envelope> m100475h(String str, String str2, String str3) {
        return CoreModule.f18264c.f20343R0.m182162m3(str, str2, str3).map(new qcj() { // from class: l.xum0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return avm0.m100471d((Envelope) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: i */
    public static void m100476i(azm0 azm0Var, String str) {
        CoreModule.f18264c.f20343R0.m182165p3(azm0Var.f74157e, azm0Var.f74153a, azm0Var.f74154b, azm0Var.f74159g, azm0Var.f74158f, azm0Var.f74160h, azm0Var.f74169q, str, azm0Var.f74156d, azm0Var.f74155c, azm0Var.f74165m, azm0Var.f74162j, azm0Var.f74172t).subscribe(psd0.m173597H(new y20() { // from class: l.vum0
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20384f0.m33653Fo();
            }
        }, new y20() { // from class: l.wum0
            @Override // p153l.y20
            public final void call(Object obj) {
                avm0.m100468a((Throwable) obj);
            }
        }));
    }
}
