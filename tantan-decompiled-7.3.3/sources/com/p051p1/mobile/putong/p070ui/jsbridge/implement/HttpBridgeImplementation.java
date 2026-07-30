package com.p051p1.mobile.putong.p070ui.jsbridge.implement;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.mmutil.task.C3949c;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.adi0;
import p153l.aqq;
import p153l.ft5;
import p153l.glw;
import p153l.lf2;
import p153l.lkq;
import p153l.psd0;
import p153l.uxj0;

/* JADX INFO: loaded from: classes10.dex */
public class HttpBridgeImplementation extends lf2 {

    /* JADX INFO: renamed from: a */
    public ft5 f55387a = new ft5();

    @Override // p153l.lf2
    /* JADX INFO: renamed from: a */
    public synchronized void mo47711a() {
        this.f55387a.m127299c();
        super.mo47711a();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m80910e(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j, aqq aqqVar, String str3) {
        try {
            aqqVar.mo99544d().mo97004b(str3, glw.m130718o(adi0.m97071N(str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, j)));
        } catch (Throwable th) {
            CrashHelper.m82479c(new RuntimeException("HttpBridgeImplementation runHttpRequest error url=" + str + " ,method=" + str2, th));
            m80912g(aqqVar, str3, null, th);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ uxj0 m80911f(String str, String str2, String str3, aqq aqqVar) throws Exception {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject(str2);
            if (NullChecker.m82486a(jSONObject2)) {
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("body");
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("header");
                if (jSONObjectOptJSONObject2 != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strDecode = URLDecoder.decode(next);
                        if (strDecode != null) {
                            jSONObject3.put(strDecode, URLDecoder.decode(jSONObjectOptJSONObject2.getString(next)));
                        }
                    }
                    jSONObject = jSONObject3;
                } else {
                    jSONObject = jSONObjectOptJSONObject2;
                }
                m80913h(aqqVar, str, jSONObject2.optString(FirebaseAnalytics.Param.METHOD, "get"), jSONObject2, jSONObjectOptJSONObject, jSONObject2.optJSONObject(CommandMessage.PARAMS), jSONObject, jSONObject2.optLong("timeout", -1L), str3);
            }
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
            m80912g(aqqVar, str3, null, th);
        }
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: g */
    public void m80912g(aqq aqqVar, String str, String str2, Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
            jSONObject.put("msg", th.getMessage());
            jSONObject.put("response", str2);
            aqqVar.mo99544d().mo97004b(str, glw.m130718o(jSONObject.toString()));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public void m80913h(@NonNull final aqq aqqVar, final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final JSONObject jSONObject4, final long j, final String str3) {
        C3949c.m19427d(2, new Runnable() { // from class: l.kml
            @Override // java.lang.Runnable
            public final void run() {
                this.f127511a.m80910e(str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, j, aqqVar, str3);
            }
        });
    }

    @lkq(key = "tantanHttpRequest")
    public void tantanHttpRequest(@NonNull final aqq aqqVar, final String str, final String str2, final String str3) {
        this.f55387a.m127297a(C22421c.fromCallable(new Callable() { // from class: l.jml
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f121683a.m80911f(str, str2, str3, aqqVar);
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173595F()));
    }
}
