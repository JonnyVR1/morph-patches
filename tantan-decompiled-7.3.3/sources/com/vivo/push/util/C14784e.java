package com.vivo.push.util;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.mcssdk.mode.Message;
import com.vivo.push.C14756e;
import com.vivo.push.p116b.C14706x;
import java.util.HashMap;

/* JADX INFO: renamed from: com.vivo.push.util.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C14784e {
    /* JADX INFO: renamed from: a */
    public static boolean m86146a(Context context, long j, long j2) {
        C14795p.m86192d("ClientReportUtil", "report message: " + j + ", reportType: " + j2);
        C14706x c14706x = new C14706x(j2);
        HashMap<String, String> map = new HashMap<>();
        map.put(Message.MESSAGE_ID, String.valueOf(j));
        String strM86232b = C14805z.m86232b(context, context.getPackageName());
        if (!TextUtils.isEmpty(strM86232b)) {
            map.put("remoteAppId", strM86232b);
        }
        c14706x.m85955a(map);
        C14756e.m86032a().m86049a(c14706x);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86145a(long j, HashMap<String, String> map) {
        C14706x c14706x = new C14706x(j);
        c14706x.m85955a(map);
        c14706x.m85956d();
        C14756e.m86032a().m86049a(c14706x);
        return true;
    }
}
