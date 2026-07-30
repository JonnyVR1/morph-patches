package com.xiaomi.push;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.push.service.C14983af;
import p153l.ouq0;
import p153l.ssq0;

/* JADX INFO: renamed from: com.xiaomi.push.m */
/* JADX INFO: loaded from: classes2.dex */
public class C14936m {
    /* JADX INFO: renamed from: a */
    private static int m87444a(Context context, String str, String str2) {
        C14983af c14983afM87599a;
        NotificationChannel notificationChannelM87611a;
        if (Build.VERSION.SDK_INT < 26 || context == null || TextUtils.isEmpty(str) || (c14983afM87599a = C14983af.m87599a(context, str)) == null || (notificationChannelM87611a = c14983afM87599a.m87611a(c14983afM87599a.m87614a(str2))) == null) {
            return 0;
        }
        return notificationChannelM87611a.getImportance() != 0 ? 32 : 64;
    }

    /* JADX INFO: renamed from: b */
    public static short m87445b(Context context, C14911hb c14911hb) {
        C14901gs c14901gsM87077a = c14911hb.m87077a();
        return m87446c(context, c14911hb.f63200b, (c14901gsM87077a == null || c14901gsM87077a.m86900a() == null) ? null : c14901gsM87077a.m86900a().get("channel_id"));
    }

    /* JADX INFO: renamed from: c */
    public static short m87446c(Context context, String str, String str2) {
        return (short) (C14887g.m86757f(context, str, false).m86769a() + (ssq0.m187795b(context) ? 4 : 0) + (ssq0.m187794a(context) ? 8 : 0) + (C14983af.m87607a(context) ? 16 : 0) + m87444a(context, str, str2));
    }

    /* JADX INFO: renamed from: d */
    public static <T extends InterfaceC14925hq<T, ?>> void m87447d(T t, byte[] bArr) {
        if (bArr == null) {
            throw new C14926hu("the message byte is empty.");
        }
        new C14938o(new C14931ig.a(true, true, bArr.length)).m87449a(t, bArr);
    }

    /* JADX INFO: renamed from: e */
    public static <T extends InterfaceC14925hq<T, ?>> byte[] m87448e(T t) {
        if (t == null) {
            return null;
        }
        try {
            return new C14939p(new C14927hw.a()).m87450a(t);
        } catch (C14926hu e) {
            ouq0.m169395o("convertThriftObjectToBytes catch TException.", e);
            return null;
        }
    }
}
