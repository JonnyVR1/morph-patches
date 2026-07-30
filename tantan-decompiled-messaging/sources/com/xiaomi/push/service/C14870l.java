package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.push.C14763hb;
import com.xiaomi.push.C14768hg;
import com.xiaomi.push.C14778hu;
import com.xiaomi.push.C14788m;
import p149l.auq0;
import p149l.ilq0;
import p149l.jkq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.l */
/* JADX INFO: loaded from: classes2.dex */
public class C14870l {
    /* JADX INFO: renamed from: a */
    public static void m86676a(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("ext_fcm_container_buffer");
        String stringExtra2 = intent.getStringExtra("mipush_app_package");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            return;
        }
        try {
            byte[] bArrM86679b = m86679b(Base64.decode(stringExtra, 2), context.getSharedPreferences("mipush_apps_scrt", 0).getString(stringExtra2, null));
            if (bArrM86679b != null) {
                C14883x.m86864a(context, C14880u.m86797a(bArrM86679b), bArrM86679b);
            } else {
                ilq0.m137040m("notify fcm notification error ：dencrypt failed");
            }
        } catch (Throwable th) {
            ilq0.m137042o("notify fcm notification error ", th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m86679b(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            ilq0.m137040m("secret is empty, return null");
            return null;
        }
        try {
            return auq0.m99035b(jkq0.m141908b(str), bArr);
        } catch (Exception e) {
            ilq0.m137042o("dencryption error. ", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m86678a(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            ilq0.m137040m("secret is empty, return null");
            return null;
        }
        try {
            return auq0.m99036c(jkq0.m141908b(str), bArr);
        } catch (Exception e) {
            ilq0.m137042o("encryption error. ", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14768hg m86675a(C14763hb c14763hb) {
        byte[] bArrM85918a = c14763hb.m85918a();
        C14768hg c14768hg = new C14768hg();
        try {
            C14788m.m86276d(c14768hg, bArrM85918a);
            return c14768hg;
        } catch (C14778hu unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86677a(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        context.getSharedPreferences("mipush_apps_scrt", 0).edit().putString(str, str2).apply();
    }
}
