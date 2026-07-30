package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.push.C14911hb;
import com.xiaomi.push.C14916hg;
import com.xiaomi.push.C14926hu;
import com.xiaomi.push.C14936m;
import p153l.g3r0;
import p153l.ouq0;
import p153l.ptq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.l */
/* JADX INFO: loaded from: classes2.dex */
public class C15018l {
    /* JADX INFO: renamed from: a */
    public static void m87847a(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("ext_fcm_container_buffer");
        String stringExtra2 = intent.getStringExtra("mipush_app_package");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            return;
        }
        try {
            byte[] bArrM87850b = m87850b(Base64.decode(stringExtra, 2), context.getSharedPreferences("mipush_apps_scrt", 0).getString(stringExtra2, null));
            if (bArrM87850b != null) {
                C15031x.m88035a(context, C15028u.m87968a(bArrM87850b), bArrM87850b);
            } else {
                ouq0.m169393m("notify fcm notification error ：dencrypt failed");
            }
        } catch (Throwable th) {
            ouq0.m169395o("notify fcm notification error ", th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m87850b(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            ouq0.m169393m("secret is empty, return null");
            return null;
        }
        try {
            return g3r0.m128757b(ptq0.m173774b(str), bArr);
        } catch (Exception e) {
            ouq0.m169395o("dencryption error. ", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m87849a(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            ouq0.m169393m("secret is empty, return null");
            return null;
        }
        try {
            return g3r0.m128758c(ptq0.m173774b(str), bArr);
        } catch (Exception e) {
            ouq0.m169395o("encryption error. ", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14916hg m87846a(C14911hb c14911hb) {
        byte[] bArrM87089a = c14911hb.m87089a();
        C14916hg c14916hg = new C14916hg();
        try {
            C14936m.m87447d(c14916hg, bArrM87089a);
            return c14916hg;
        } catch (C14926hu unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m87848a(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        context.getSharedPreferences("mipush_apps_scrt", 0).edit().putString(str, str2).apply();
    }
}
