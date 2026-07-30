package com.p051p1.mobile.putong.facertification;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import cn.wh.auth.WAuthService;
import cn.wh.auth.bean.CheckInstall;
import cn.wh.auth.bean.WParams;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.facertification.C10895a;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.erq;
import p153l.jyb;
import p153l.o1j0;
import p153l.psd0;
import p153l.uqb0;
import p153l.vu2;
import p153l.x20;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.facertification.a */
/* JADX INFO: loaded from: classes12.dex */
public class C10895a {

    /* JADX INFO: renamed from: a */
    public static boolean f39696a;

    /* JADX INFO: renamed from: b */
    public static final List<String> f39697b = jyb.m147507f0("C0000000", "C0401001", "C0402001", "C0405001", "C0412002", "S0400001", "C0412003", "C0412004", "C0412005", "C0412006", "C0412007", "C0412008");

    /* JADX INFO: renamed from: c */
    public static String f39698c;

    /* JADX INFO: renamed from: d */
    public static RxFacertification.C10892b f39699d;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m61398a(Runnable runnable, Throwable th) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m61399b() {
        f39699d = null;
        f39698c = null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m61400c(Runnable runnable, Envelope envelope) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m61401d(@NonNull Activity activity, @NonNull String str, @NonNull RxFacertification.C10892b c10892b) {
        f39699d = c10892b;
        f39698c = str;
        m61404g("dexvmp");
        if (!CheckInstall.isAppInstalled(activity)) {
            erq.m122257b(activity, "https://cdnrefresh.ctdidcii.cn/w1/WHClient_H5/Install/InstallGuide.html");
        } else {
            new WAuthService(activity, new WParams("00000023", "0001", f39698c, 1, (String) null)).getAuthFromIntent();
            f39696a = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m61402e(@NonNull Intent intent) {
        return f39697b.contains(intent.getStringExtra("resultCode"));
    }

    /* JADX INFO: renamed from: f */
    public static void m61403f(@NonNull Act act, @NonNull Intent intent, final Runnable runnable, final Runnable runnable2) {
        String stringExtra = intent.getStringExtra("resultCode");
        String stringExtra2 = intent.getStringExtra("resultDesc");
        String stringExtra3 = intent.getStringExtra("idCardAuthData");
        String stringExtra4 = intent.getStringExtra("certPwdData");
        intent.getStringExtra("verifyData");
        intent.getStringExtra("extrasData");
        if (!TextUtils.equals(stringExtra, "C0000000") || TextUtils.isEmpty(stringExtra3) || TextUtils.isEmpty(stringExtra4) || !NullChecker.m82486a(f39699d)) {
            if (!TextUtils.isEmpty(stringExtra2)) {
                o1j0.m165651y(stringExtra2);
            }
            if (NullChecker.m82486a(runnable2)) {
                runnable2.run();
            }
            f39699d = null;
            f39698c = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("bizSeq", f39698c);
                jSONObject.put("certPwdData", stringExtra4);
                jSONObject.put("idCardAuthData", stringExtra3);
                jSONObject.put("clientStatus", stringExtra);
            } catch (JSONException unused) {
            }
            TTFacertificationClient tTFacertificationClientM61385p = TTFacertificationClient.m61385p();
            RxFacertification.C10892b c10892b = f39699d;
            act.duringCreated(tTFacertificationClientM61385p.m61395x(c10892b, TextUtils.equals(c10892b.f39692c.productId, "7") ? "" : uqb0.f180397c0.me_().f56859id, 3, jSONObject)).doOnUnsubscribe(new x20() { // from class: l.znp0
                @Override // p153l.x20
                public final void call() {
                    C10895a.m61399b();
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.aop0
                @Override // p153l.y20
                public final void call(Object obj) {
                    C10895a.m61400c(runnable, (Envelope) obj);
                }
            }, new y20() { // from class: l.bop0
                @Override // p153l.y20
                public final void call(Object obj) {
                    C10895a.m61398a(runnable2, (Throwable) obj);
                }
            }));
        }
        vu2.m202772d("Verification", String.format("WAuth verification, code is %s, desc is %s", stringExtra, stringExtra2));
    }

    /* JADX INFO: renamed from: g */
    public static void m61404g(String str) {
        try {
            System.loadLibrary(str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
