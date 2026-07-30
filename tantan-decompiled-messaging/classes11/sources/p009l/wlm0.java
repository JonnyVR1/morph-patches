package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.CrashHelper;
import l.d30;
import l.e30;
import l.jo0;
import l.mkd0;
import l.pk8;
import l.w9j;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wlm0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m24330a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Envelope m24333d(Envelope envelope) {
        CoreModule.c.w3(envelope, (d30) null);
        return envelope;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m24334e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static void m24335f(boolean z, String str, Message message) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", z ? "rejected" : "accepted");
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            string = "";
        }
        message.msgData = string;
        CoreModule.c.R0.q3(message);
    }

    /* JADX INFO: renamed from: g */
    public static void m24336g(PushMessageCustom pushMessageCustom, String str, String str2) {
        CoreModule.c.R0.p3(pushMessageCustom.id, pushMessageCustom.caller, pushMessageCustom.callee, pushMessageCustom.callerToken, pushMessageCustom.calleeToken, pushMessageCustom.channelName, -1L, str, pushMessageCustom.callerDeviceId, pk8.M().identifier, str2, pushMessageCustom.rtcProvider, 0).subscribe(mkd0.H(new e30() { // from class: l.ulm0
            public final void call(Object obj) {
                CoreModule.c.f0.Fo();
            }
        }, new e30() { // from class: l.vlm0
            public final void call(Object obj) {
                wlm0.m24334e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static c<Envelope> m24337h(String str, String str2, String str3) {
        return CoreModule.c.R0.m3(str, str2, str3).map(new w9j() { // from class: l.tlm0
            public final Object call(Object obj) {
                return wlm0.m24333d((Envelope) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: i */
    public static void m24338i(wpm0 wpm0Var, String str) {
        CoreModule.c.R0.p3(wpm0Var.f22263e, wpm0Var.f22259a, wpm0Var.f22260b, wpm0Var.f22265g, wpm0Var.f22264f, wpm0Var.f22266h, wpm0Var.f22275q, str, wpm0Var.f22262d, wpm0Var.f22261c, wpm0Var.f22271m, wpm0Var.f22268j, wpm0Var.f22278t).subscribe(mkd0.H(new e30() { // from class: l.rlm0
            public final void call(Object obj) {
                CoreModule.c.f0.Fo();
            }
        }, new e30() { // from class: l.slm0
            public final void call(Object obj) {
                wlm0.m24330a((Throwable) obj);
            }
        }));
    }
}
