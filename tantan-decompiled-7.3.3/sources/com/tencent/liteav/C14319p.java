package com.tencent.liteav;

import android.content.Context;
import com.tencent.liteav.basic.log.TXCLog;

/* JADX INFO: renamed from: com.tencent.liteav.p */
/* JADX INFO: loaded from: classes2.dex */
public class C14319p {
    /* JADX INFO: renamed from: a */
    public static AbstractC14284n m84942a(Context context, int i) {
        if (i != 2 && i != 4 && i != 4 && i != 6 && i != 3) {
            return new C14272f(context);
        }
        TXCLog.m84149e("TXSDKUtil", "create player error not support type : " + i);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m84943a() {
        return "";
    }
}
