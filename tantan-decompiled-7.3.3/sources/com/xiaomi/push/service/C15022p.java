package com.xiaomi.push.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.C14887g;
import java.util.Locale;
import p153l.l4r0;
import p153l.t5r0;
import p153l.w5r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.p */
/* JADX INFO: loaded from: classes2.dex */
public class C15022p {

    /* JADX INFO: renamed from: a */
    public final int f63937a;

    /* JADX INFO: renamed from: a */
    public final String f63938a;

    /* JADX INFO: renamed from: b */
    public final String f63939b;

    /* JADX INFO: renamed from: c */
    public final String f63940c;

    /* JADX INFO: renamed from: d */
    public final String f63941d;

    /* JADX INFO: renamed from: e */
    public final String f63942e;

    /* JADX INFO: renamed from: f */
    public final String f63943f;

    public C15022p(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.f63938a = str;
        this.f63939b = str2;
        this.f63940c = str3;
        this.f63941d = str4;
        this.f63942e = str5;
        this.f63943f = str6;
        this.f63937a = i;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m87932b(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    /* JADX INFO: renamed from: a */
    public C14990am.b m87934a(C14990am.b bVar, Context context, C15014h c15014h, String str) {
        bVar.f63737a = context.getPackageName();
        bVar.f63741b = this.f63938a;
        bVar.f63748h = this.f63940c;
        bVar.f63743c = this.f63939b;
        bVar.f63747g = "5";
        bVar.f63744d = "XMPUSH-PASS";
        bVar.f63739a = false;
        w5r0.C21029a c21029a = new w5r0.C21029a();
        c21029a.m204987a(Constants.PARAM_SDK_VER, 48).m204987a("cpvn", "5_9_9-C").m204987a("cpvc", 50909).m204987a("country_code", C15004b.m87775a(context).m87780b()).m204987a("region", C15004b.m87775a(context).m87778a()).m204987a("miui_vn", l4r0.m152832q()).m204987a("miui_vc", Integer.valueOf(l4r0.m152817b(context))).m204987a("xmsf_vc", Integer.valueOf(C14887g.m86753b(context, "com.xiaomi.xmsf"))).m204987a("android_ver", Integer.valueOf(Build.VERSION.SDK_INT)).m204987a("n_belong_to_app", Boolean.valueOf(C14983af.m87607a(context))).m204987a("systemui_vc", Integer.valueOf(C14887g.m86752a(context)));
        String strM87929a = m87929a(context);
        if (!TextUtils.isEmpty(strM87929a)) {
            c21029a.m204987a("latest_country_code", strM87929a);
        }
        String strM152834s = l4r0.m152834s();
        if (!TextUtils.isEmpty(strM152834s)) {
            c21029a.m204987a("device_ch", strM152834s);
        }
        String strM152836u = l4r0.m152836u();
        if (!TextUtils.isEmpty(strM152836u)) {
            c21029a.m204987a("device_mfr", strM152836u);
        }
        bVar.f63745e = c21029a.toString();
        String str2 = m87932b(context) ? "1000271" : this.f63941d;
        w5r0.C21029a c21029a2 = new w5r0.C21029a();
        c21029a2.m204987a("appid", str2).m204987a("locale", Locale.getDefault().toString()).m204987a("sync", 1);
        if (m87931a(context)) {
            c21029a2.m204987a("ab", str);
        }
        bVar.f63746f = c21029a2.toString();
        bVar.f63736a = c15014h;
        return bVar;
    }

    /* JADX INFO: renamed from: a */
    public C14990am.b m87933a(XMPushService xMPushService) {
        C14990am.b bVar = new C14990am.b(xMPushService);
        m87934a(bVar, xMPushService, xMPushService.m87528b(), "c");
        return bVar;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87931a(Context context) {
        return "com.xiaomi.xmsf".equals(context.getPackageName()) && m87930a();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87930a() {
        try {
            return t5r0.m189419c(null, "miui.os.Build").getField("IS_ALPHA_BUILD").getBoolean(null);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m87929a(Context context) {
        if ("com.xiaomi.xmsf".equals(context)) {
            if (!TextUtils.isEmpty(null)) {
                return null;
            }
            String strM152822g = l4r0.m152822g("ro.miui.region");
            return TextUtils.isEmpty(strM152822g) ? l4r0.m152822g("ro.product.locale.region") : strM152822g;
        }
        return l4r0.m152829n();
    }
}
