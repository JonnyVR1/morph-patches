package com.tencent.could.huiyansdk.manager;

import android.os.Handler;
import android.os.Message;
import com.tencent.could.component.common.p079ai.log.AiLog;
import com.tencent.could.huiyansdk.callback.LoggerInfoCallBack;
import com.tencent.could.huiyansdk.utils.C13930e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.e */
/* JADX INFO: loaded from: classes2.dex */
public class C13905e {

    /* JADX INFO: renamed from: a */
    public Map<String, Integer> f57441a = new HashMap();

    /* JADX INFO: renamed from: b */
    public Object f57442b = new Object();

    /* JADX INFO: renamed from: c */
    public LoggerInfoCallBack f57443c;

    /* JADX INFO: renamed from: d */
    public volatile Handler f57444d;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C13905e f57445a = new C13905e();
    }

    /* JADX INFO: renamed from: a */
    public final void m82337a(int i, String str, String str2) {
        if (i == 1) {
            if (C13930e.a.f57508a.f57506a) {
                AiLog.debug(str, str2);
            }
        } else if (i == 2) {
            if (C13930e.a.f57508a.f57506a) {
                AiLog.error(str, str2);
            }
        } else if (C13930e.a.f57508a.f57506a) {
            AiLog.debug(str, str2);
        }
        if (this.f57443c == null || this.f57444d == null) {
            return;
        }
        Message messageObtainMessage = this.f57444d.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = str2;
        this.f57444d.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: renamed from: a */
    public void m82336a() {
        if (this.f57443c == null || this.f57444d == null) {
            return;
        }
        Message messageObtainMessage = this.f57444d.obtainMessage();
        messageObtainMessage.what = 2;
        this.f57444d.sendMessage(messageObtainMessage);
    }
}
