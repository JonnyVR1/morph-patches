package p149l;

import androidx.core.app.NotificationCompat;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class wlm0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m203834a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Envelope m203837d(Envelope envelope) {
        CoreModule.f17545c.m31492w3(envelope, null);
        return envelope;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m203838e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static void m203839f(boolean z, String str, Message message) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, z ? "rejected" : "accepted");
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            string = "";
        }
        message.msgData = string;
        CoreModule.f17545c.f19601R0.m112452q3(message);
    }

    /* JADX INFO: renamed from: g */
    public static void m203840g(PushMessageCustom pushMessageCustom, String str, String str2) {
        CoreModule.f17545c.f19601R0.m112451p3(pushMessageCustom.f38805id, pushMessageCustom.caller, pushMessageCustom.callee, pushMessageCustom.callerToken, pushMessageCustom.calleeToken, pushMessageCustom.channelName, -1L, str, pushMessageCustom.callerDeviceId, pk8.m169980M().identifier, str2, pushMessageCustom.rtcProvider, 0).subscribe(mkd0.m154956H(new e30() { // from class: l.ulm0
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19642f0.m32650Fo();
            }
        }, new e30() { // from class: l.vlm0
            @Override // p149l.e30
            public final void call(Object obj) {
                wlm0.m203838e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public static C22306c<Envelope> m203841h(String str, String str2, String str3) {
        return CoreModule.f17545c.f19601R0.m112448m3(str, str2, str3).map(new w9j() { // from class: l.tlm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return wlm0.m203837d((Envelope) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: i */
    public static void m203842i(wpm0 wpm0Var, String str) {
        CoreModule.f17545c.f19601R0.m112451p3(wpm0Var.f187548e, wpm0Var.f187544a, wpm0Var.f187545b, wpm0Var.f187550g, wpm0Var.f187549f, wpm0Var.f187551h, wpm0Var.f187560q, str, wpm0Var.f187547d, wpm0Var.f187546c, wpm0Var.f187556m, wpm0Var.f187553j, wpm0Var.f187563t).subscribe(mkd0.m154956H(new e30() { // from class: l.rlm0
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19642f0.m32650Fo();
            }
        }, new e30() { // from class: l.slm0
            @Override // p149l.e30
            public final void call(Object obj) {
                wlm0.m203834a((Throwable) obj);
            }
        }));
    }
}
