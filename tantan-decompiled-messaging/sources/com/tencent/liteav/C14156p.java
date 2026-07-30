package com.tencent.liteav;

import android.content.Context;
import com.tencent.liteav.basic.log.TXCLog;

/* JADX INFO: renamed from: com.tencent.liteav.p */
/* JADX INFO: loaded from: classes2.dex */
public class C14156p {
    /* JADX INFO: renamed from: a */
    public static AbstractC14121n m83759a(Context context, int i) {
        if (i != 2 && i != 4 && i != 4 && i != 6 && i != 3) {
            return new C14109f(context);
        }
        TXCLog.m82966e("TXSDKUtil", "create player error not support type : " + i);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m83760a() {
        return "";
    }
}
