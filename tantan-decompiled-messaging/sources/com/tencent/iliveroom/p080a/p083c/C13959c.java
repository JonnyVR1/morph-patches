package com.tencent.iliveroom.p080a.p083c;

import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.c.c */
/* JADX INFO: loaded from: classes2.dex */
public class C13959c {
    /* JADX INFO: renamed from: a */
    public static void m82636a(boolean z, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("startCDN: url = ");
            try {
                int iIndexOf = str.indexOf("=");
                if (iIndexOf != -1) {
                    sb.append(str.substring(0, iIndexOf + 12));
                }
            } catch (Exception e) {
                TXCLog.m82967e("TRTCReportEvent", "build cdn url failed.", e);
            }
        } else {
            sb.append("stopCDN:");
        }
        Monitor.m82978a(2, sb.toString(), "", 12);
    }
}
