package com.vivo.push.util;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.mcssdk.mode.Message;
import com.vivo.push.C14608e;
import com.vivo.push.p111b.C14558x;
import java.util.HashMap;

/* JADX INFO: renamed from: com.vivo.push.util.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C14636e {
    /* JADX INFO: renamed from: a */
    public static boolean m84975a(Context context, long j, long j2) {
        C14647p.m85021d("ClientReportUtil", "report message: " + j + ", reportType: " + j2);
        C14558x c14558x = new C14558x(j2);
        HashMap<String, String> map = new HashMap<>();
        map.put(Message.MESSAGE_ID, String.valueOf(j));
        String strM85061b = C14657z.m85061b(context, context.getPackageName());
        if (!TextUtils.isEmpty(strM85061b)) {
            map.put("remoteAppId", strM85061b);
        }
        c14558x.m84784a(map);
        C14608e.m84861a().m84878a(c14558x);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84974a(long j, HashMap<String, String> map) {
        C14558x c14558x = new C14558x(j);
        c14558x.m84784a(map);
        c14558x.m84785d();
        C14608e.m84861a().m84878a(c14558x);
        return true;
    }
}
