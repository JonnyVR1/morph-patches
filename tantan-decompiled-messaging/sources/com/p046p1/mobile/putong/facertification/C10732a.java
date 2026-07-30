package com.p046p1.mobile.putong.facertification;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import cn.wh.auth.WAuthService;
import cn.wh.auth.bean.CheckInstall;
import cn.wh.auth.bean.WParams;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.facertification.C10732a;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.d30;
import p149l.e30;
import p149l.epq;
import p149l.fu2;
import p149l.lsi0;
import p149l.mkd0;
import p149l.qib0;
import p149l.vwb;

/* JADX INFO: renamed from: com.p1.mobile.putong.facertification.a */
/* JADX INFO: loaded from: classes12.dex */
public class C10732a {

    /* JADX INFO: renamed from: a */
    public static boolean f38848a;

    /* JADX INFO: renamed from: b */
    public static final List<String> f38849b = vwb.m200324f0("C0000000", "C0401001", "C0402001", "C0405001", "C0412002", "S0400001", "C0412003", "C0412004", "C0412005", "C0412006", "C0412007", "C0412008");

    /* JADX INFO: renamed from: c */
    public static String f38850c;

    /* JADX INFO: renamed from: d */
    public static RxFacertification.C10729b f38851d;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m60214a(Runnable runnable, Throwable th) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m60215b() {
        f38851d = null;
        f38850c = null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m60216c(Runnable runnable, Envelope envelope) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m60217d(@NonNull Activity activity, @NonNull String str, @NonNull RxFacertification.C10729b c10729b) {
        f38851d = c10729b;
        f38850c = str;
        m60220g("dexvmp");
        if (!CheckInstall.isAppInstalled(activity)) {
            epq.m117671b(activity, "https://cdnrefresh.ctdidcii.cn/w1/WHClient_H5/Install/InstallGuide.html");
        } else {
            new WAuthService(activity, new WParams("00000023", "0001", f38850c, 1, (String) null)).getAuthFromIntent();
            f38848a = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m60218e(@NonNull Intent intent) {
        return f38849b.contains(intent.getStringExtra("resultCode"));
    }

    /* JADX INFO: renamed from: f */
    public static void m60219f(@NonNull Act act, @NonNull Intent intent, final Runnable runnable, final Runnable runnable2) {
        String stringExtra = intent.getStringExtra("resultCode");
        String stringExtra2 = intent.getStringExtra("resultDesc");
        String stringExtra3 = intent.getStringExtra("idCardAuthData");
        String stringExtra4 = intent.getStringExtra("certPwdData");
        intent.getStringExtra("verifyData");
        intent.getStringExtra("extrasData");
        if (!TextUtils.equals(stringExtra, "C0000000") || TextUtils.isEmpty(stringExtra3) || TextUtils.isEmpty(stringExtra4) || !NullChecker.m81303a(f38851d)) {
            if (!TextUtils.isEmpty(stringExtra2)) {
                lsi0.m151595y(stringExtra2);
            }
            if (NullChecker.m81303a(runnable2)) {
                runnable2.run();
            }
            f38851d = null;
            f38850c = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("bizSeq", f38850c);
                jSONObject.put("certPwdData", stringExtra4);
                jSONObject.put("idCardAuthData", stringExtra3);
                jSONObject.put("clientStatus", stringExtra);
            } catch (JSONException unused) {
            }
            TTFacertificationClient tTFacertificationClientM60201p = TTFacertificationClient.m60201p();
            RxFacertification.C10729b c10729b = f38851d;
            act.duringCreated(tTFacertificationClientM60201p.m60211x(c10729b, TextUtils.equals(c10729b.f38844c.productId, "7") ? "" : qib0.f154714c0.me_().f56011id, 3, jSONObject)).doOnUnsubscribe(new d30() { // from class: l.vep0
                @Override // p149l.d30
                public final void call() {
                    C10732a.m60215b();
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.wep0
                @Override // p149l.e30
                public final void call(Object obj) {
                    C10732a.m60216c(runnable, (Envelope) obj);
                }
            }, new e30() { // from class: l.xep0
                @Override // p149l.e30
                public final void call(Object obj) {
                    C10732a.m60214a(runnable2, (Throwable) obj);
                }
            }));
        }
        fu2.m123134d("Verification", String.format("WAuth verification, code is %s, desc is %s", stringExtra, stringExtra2));
    }

    /* JADX INFO: renamed from: g */
    public static void m60220g(String str) {
        try {
            System.loadLibrary(str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
