package com.p000p1.mobile.putong.facertification;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import cn.wh.auth.WAuthService;
import cn.wh.auth.bean.CheckInstall;
import cn.wh.auth.bean.WParams;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.facertification.C1576a;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.e30;
import l.epq;
import l.fu2;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.vwb;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.p1.mobile.putong.facertification.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C1576a {

    /* JADX INFO: renamed from: a */
    public static boolean f309a;

    /* JADX INFO: renamed from: b */
    public static final List<String> f310b = vwb.f0(new String[]{"C0000000", "C0401001", "C0402001", "C0405001", "C0412002", "S0400001", "C0412003", "C0412004", "C0412005", "C0412006", "C0412007", "C0412008"});

    /* JADX INFO: renamed from: c */
    public static String f311c;

    /* JADX INFO: renamed from: d */
    public static RxFacertification.C1573b f312d;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1132a(Runnable runnable, Throwable th) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1133b() {
        f312d = null;
        f311c = null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1134c(Runnable runnable, Envelope envelope) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1135d(@NonNull Activity activity, @NonNull String str, @NonNull RxFacertification.C1573b c1573b) {
        f312d = c1573b;
        f311c = str;
        m1138g("dexvmp");
        if (!CheckInstall.isAppInstalled(activity)) {
            epq.b(activity, "https://cdnrefresh.ctdidcii.cn/w1/WHClient_H5/Install/InstallGuide.html");
        } else {
            new WAuthService(activity, new WParams("00000023", "0001", f311c, 1, (String) null)).getAuthFromIntent();
            f309a = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1136e(@NonNull Intent intent) {
        return f310b.contains(intent.getStringExtra("resultCode"));
    }

    /* JADX INFO: renamed from: f */
    public static void m1137f(@NonNull Act act, @NonNull Intent intent, final Runnable runnable, final Runnable runnable2) {
        String stringExtra = intent.getStringExtra("resultCode");
        String stringExtra2 = intent.getStringExtra("resultDesc");
        String stringExtra3 = intent.getStringExtra("idCardAuthData");
        String stringExtra4 = intent.getStringExtra("certPwdData");
        intent.getStringExtra("verifyData");
        intent.getStringExtra("extrasData");
        if (!TextUtils.equals(stringExtra, "C0000000") || TextUtils.isEmpty(stringExtra3) || TextUtils.isEmpty(stringExtra4) || !NullChecker.a(f312d)) {
            if (!TextUtils.isEmpty(stringExtra2)) {
                lsi0.y(stringExtra2);
            }
            if (NullChecker.a(runnable2)) {
                runnable2.run();
            }
            f312d = null;
            f311c = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("bizSeq", f311c);
                jSONObject.put("certPwdData", stringExtra4);
                jSONObject.put("idCardAuthData", stringExtra3);
                jSONObject.put("clientStatus", stringExtra);
            } catch (JSONException unused) {
            }
            TTFacertificationClient tTFacertificationClientM1119p = TTFacertificationClient.m1119p();
            RxFacertification.C1573b c1573b = f312d;
            act.duringCreated(tTFacertificationClientM1119p.m1129x(c1573b, TextUtils.equals(c1573b.f305c.productId, "7") ? "" : ((DbObject) qib0.c0.me_()).id, 3, jSONObject)).doOnUnsubscribe(new d30() { // from class: l.vep0
                public final void call() {
                    C1576a.m1133b();
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.wep0
                public final void call(Object obj) {
                    C1576a.m1134c(runnable, (Envelope) obj);
                }
            }, new e30() { // from class: l.xep0
                public final void call(Object obj) {
                    C1576a.m1132a(runnable2, (Throwable) obj);
                }
            }));
        }
        fu2.d("Verification", String.format("WAuth verification, code is %s, desc is %s", stringExtra, stringExtra2));
    }

    /* JADX INFO: renamed from: g */
    public static void m1138g(String str) {
        try {
            System.loadLibrary(str);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
