package com.xiaomi.push;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.push.service.C14835af;
import p149l.ilq0;
import p149l.mjq0;

/* JADX INFO: renamed from: com.xiaomi.push.m */
/* JADX INFO: loaded from: classes2.dex */
public class C14788m {
    /* JADX INFO: renamed from: a */
    private static int m86273a(Context context, String str, String str2) {
        C14835af c14835afM86428a;
        NotificationChannel notificationChannelM86440a;
        if (Build.VERSION.SDK_INT < 26 || context == null || TextUtils.isEmpty(str) || (c14835afM86428a = C14835af.m86428a(context, str)) == null || (notificationChannelM86440a = c14835afM86428a.m86440a(c14835afM86428a.m86443a(str2))) == null) {
            return 0;
        }
        return notificationChannelM86440a.getImportance() != 0 ? 32 : 64;
    }

    /* JADX INFO: renamed from: b */
    public static short m86274b(Context context, C14763hb c14763hb) {
        C14753gs c14753gsM85906a = c14763hb.m85906a();
        return m86275c(context, c14763hb.f62353b, (c14753gsM85906a == null || c14753gsM85906a.m85729a() == null) ? null : c14753gsM85906a.m85729a().get("channel_id"));
    }

    /* JADX INFO: renamed from: c */
    public static short m86275c(Context context, String str, String str2) {
        return (short) (C14739g.m85586f(context, str, false).m85598a() + (mjq0.m154900b(context) ? 4 : 0) + (mjq0.m154899a(context) ? 8 : 0) + (C14835af.m86436a(context) ? 16 : 0) + m86273a(context, str, str2));
    }

    /* JADX INFO: renamed from: d */
    public static <T extends InterfaceC14777hq<T, ?>> void m86276d(T t, byte[] bArr) {
        if (bArr == null) {
            throw new C14778hu("the message byte is empty.");
        }
        new C14790o(new C14783ig.a(true, true, bArr.length)).m86278a(t, bArr);
    }

    /* JADX INFO: renamed from: e */
    public static <T extends InterfaceC14777hq<T, ?>> byte[] m86277e(T t) {
        if (t == null) {
            return null;
        }
        try {
            return new C14791p(new C14779hw.a()).m86279a(t);
        } catch (C14778hu e) {
            ilq0.m137042o("convertThriftObjectToBytes catch TException.", e);
            return null;
        }
    }
}
