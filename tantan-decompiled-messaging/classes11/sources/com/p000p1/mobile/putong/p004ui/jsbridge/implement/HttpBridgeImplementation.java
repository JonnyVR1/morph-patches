package com.p000p1.mobile.putong.p004ui.jsbridge.implement;

import androidx.annotation.NonNull;
import com.immomo.mmutil.task.c;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.concurrent.Callable;
import l.bs5;
import l.liw;
import l.mkd0;
import l.roj0;
import org.json.JSONObject;
import p009l.boq;
import p009l.ef2;
import p009l.liq;
import p009l.r4i0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HttpBridgeImplementation extends ef2 {

    /* JADX INFO: renamed from: a */
    public bs5 f8145a = new bs5();

    @Override // p009l.ef2
    /* JADX INFO: renamed from: a */
    public synchronized void mo10039a() {
        this.f8145a.c();
        super.mo10039a();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m10049e(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j, boq boqVar, String str3) {
        try {
            boqVar.mo12185d().mo15130b(str3, liw.k(r4i0.m21404F(str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, j)));
        } catch (Throwable th) {
            CrashHelper.c(new RuntimeException("HttpBridgeImplementation runHttpRequest error url=" + str + " ,method=" + str2, th));
            m10051g(boqVar, str3, null, th);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ roj0 m10050f(String str, String str2, String str3, boq boqVar) throws Exception {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject(str2);
            if (NullChecker.a(jSONObject2)) {
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
                m10052h(boqVar, str, jSONObject2.optString("method", "get"), jSONObject2, jSONObjectOptJSONObject, jSONObject2.optJSONObject("params"), jSONObject, jSONObject2.optLong("timeout", -1L), str3);
            }
        } catch (Throwable th) {
            CrashHelper.c(th);
            m10051g(boqVar, str3, null, th);
        }
        return roj0.a;
    }

    /* JADX INFO: renamed from: g */
    public void m10051g(boq boqVar, String str, String str2, Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", 1);
            jSONObject.put("msg", th.getMessage());
            jSONObject.put("response", str2);
            boqVar.mo12185d().mo15130b(str, liw.k(jSONObject.toString()));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    public void m10052h(@NonNull final boq boqVar, final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final JSONObject jSONObject4, final long j, final String str3) {
        c.d(2, new Runnable() { // from class: l.ujl
            @Override // java.lang.Runnable
            public final void run() {
                this.f21222a.m10049e(str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, j, boqVar, str3);
            }
        });
    }

    @liq(key = "tantanHttpRequest")
    public void tantanHttpRequest(@NonNull final boq boqVar, final String str, final String str2, final String str3) {
        this.f8145a.a(rx.c.fromCallable(new Callable() { // from class: l.tjl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20739a.m10050f(str, str2, str3, boqVar);
            }
        }).compose(mkd0.C()).subscribe(mkd0.F()));
    }
}
