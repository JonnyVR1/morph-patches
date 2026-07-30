package com.p046p1.mobile.putong.p065ui.jsbridge.implement;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.immomo.mmutil.task.C3804c;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.boq;
import p149l.bs5;
import p149l.ef2;
import p149l.liq;
import p149l.liw;
import p149l.mkd0;
import p149l.r4i0;
import p149l.roj0;

/* JADX INFO: loaded from: classes11.dex */
public class HttpBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: a */
    public bs5 f54539a = new bs5();

    @Override // p149l.ef2
    /* JADX INFO: renamed from: a */
    public synchronized void mo46528a() {
        this.f54539a.m103657c();
        super.mo46528a();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m79727e(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j, boq boqVar, String str3) {
        try {
            boqVar.mo102962d().mo127285b(str3, liw.m149950k(r4i0.m177809F(str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, j)));
        } catch (Throwable th) {
            CrashHelper.m81296c(new RuntimeException("HttpBridgeImplementation runHttpRequest error url=" + str + " ,method=" + str2, th));
            m79729g(boqVar, str3, null, th);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ roj0 m79728f(String str, String str2, String str3, boq boqVar) throws Exception {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject(str2);
            if (NullChecker.m81303a(jSONObject2)) {
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
                m79730h(boqVar, str, jSONObject2.optString(FirebaseAnalytics.Param.METHOD, "get"), jSONObject2, jSONObjectOptJSONObject, jSONObject2.optJSONObject(CommandMessage.PARAMS), jSONObject, jSONObject2.optLong("timeout", -1L), str3);
            }
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
            m79729g(boqVar, str3, null, th);
        }
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: g */
    public void m79729g(boq boqVar, String str, String str2, Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
            jSONObject.put("msg", th.getMessage());
            jSONObject.put("response", str2);
            boqVar.mo102962d().mo127285b(str, liw.m149950k(jSONObject.toString()));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public void m79730h(@NonNull final boq boqVar, final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final JSONObject jSONObject4, final long j, final String str3) {
        C3804c.m18444d(2, new Runnable() { // from class: l.ujl
            @Override // java.lang.Runnable
            public final void run() {
                this.f176770a.m79727e(str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, j, boqVar, str3);
            }
        });
    }

    @liq(key = "tantanHttpRequest")
    public void tantanHttpRequest(@NonNull final boq boqVar, final String str, final String str2, final String str3) {
        this.f54539a.m103655a(C22306c.fromCallable(new Callable() { // from class: l.tjl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f170759a.m79728f(str, str2, str3, boqVar);
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154954F()));
    }
}
