package com.xiaomi.push.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.C14739g;
import java.util.Locale;
import p149l.fvq0;
import p149l.nwq0;
import p149l.qwq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.p */
/* JADX INFO: loaded from: classes2.dex */
public class C14874p {

    /* JADX INFO: renamed from: a */
    public final int f63090a;

    /* JADX INFO: renamed from: a */
    public final String f63091a;

    /* JADX INFO: renamed from: b */
    public final String f63092b;

    /* JADX INFO: renamed from: c */
    public final String f63093c;

    /* JADX INFO: renamed from: d */
    public final String f63094d;

    /* JADX INFO: renamed from: e */
    public final String f63095e;

    /* JADX INFO: renamed from: f */
    public final String f63096f;

    public C14874p(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.f63091a = str;
        this.f63092b = str2;
        this.f63093c = str3;
        this.f63094d = str4;
        this.f63095e = str5;
        this.f63096f = str6;
        this.f63090a = i;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m86761b(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    /* JADX INFO: renamed from: a */
    public C14842am.b m86763a(C14842am.b bVar, Context context, C14866h c14866h, String str) {
        bVar.f62890a = context.getPackageName();
        bVar.f62894b = this.f63091a;
        bVar.f62901h = this.f63093c;
        bVar.f62896c = this.f63092b;
        bVar.f62900g = "5";
        bVar.f62897d = "XMPUSH-PASS";
        bVar.f62892a = false;
        qwq0.C19600a c19600a = new qwq0.C19600a();
        c19600a.m176895a(Constants.PARAM_SDK_VER, 48).m176895a("cpvn", "5_9_9-C").m176895a("cpvc", 50909).m176895a("country_code", C14856b.m86604a(context).m86609b()).m176895a("region", C14856b.m86604a(context).m86607a()).m176895a("miui_vn", fvq0.m123363q()).m176895a("miui_vc", Integer.valueOf(fvq0.m123348b(context))).m176895a("xmsf_vc", Integer.valueOf(C14739g.m85582b(context, "com.xiaomi.xmsf"))).m176895a("android_ver", Integer.valueOf(Build.VERSION.SDK_INT)).m176895a("n_belong_to_app", Boolean.valueOf(C14835af.m86436a(context))).m176895a("systemui_vc", Integer.valueOf(C14739g.m85581a(context)));
        String strM86758a = m86758a(context);
        if (!TextUtils.isEmpty(strM86758a)) {
            c19600a.m176895a("latest_country_code", strM86758a);
        }
        String strM123365s = fvq0.m123365s();
        if (!TextUtils.isEmpty(strM123365s)) {
            c19600a.m176895a("device_ch", strM123365s);
        }
        String strM123367u = fvq0.m123367u();
        if (!TextUtils.isEmpty(strM123367u)) {
            c19600a.m176895a("device_mfr", strM123367u);
        }
        bVar.f62898e = c19600a.toString();
        String str2 = m86761b(context) ? "1000271" : this.f63094d;
        qwq0.C19600a c19600a2 = new qwq0.C19600a();
        c19600a2.m176895a("appid", str2).m176895a("locale", Locale.getDefault().toString()).m176895a("sync", 1);
        if (m86760a(context)) {
            c19600a2.m176895a("ab", str);
        }
        bVar.f62899f = c19600a2.toString();
        bVar.f62889a = c14866h;
        return bVar;
    }

    /* JADX INFO: renamed from: a */
    public C14842am.b m86762a(XMPushService xMPushService) {
        C14842am.b bVar = new C14842am.b(xMPushService);
        m86763a(bVar, xMPushService, xMPushService.m86357b(), "c");
        return bVar;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86760a(Context context) {
        return "com.xiaomi.xmsf".equals(context.getPackageName()) && m86759a();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86759a() {
        try {
            return nwq0.m161880c(null, "miui.os.Build").getField("IS_ALPHA_BUILD").getBoolean(null);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m86758a(Context context) {
        if ("com.xiaomi.xmsf".equals(context)) {
            if (!TextUtils.isEmpty(null)) {
                return null;
            }
            String strM123353g = fvq0.m123353g("ro.miui.region");
            return TextUtils.isEmpty(strM123353g) ? fvq0.m123353g("ro.product.locale.region") : strM123353g;
        }
        return fvq0.m123360n();
    }
}
