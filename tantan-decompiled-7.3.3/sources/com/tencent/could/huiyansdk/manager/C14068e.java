package com.tencent.could.huiyansdk.manager;

import android.os.Handler;
import android.os.Message;
import com.tencent.could.component.common.p084ai.log.AiLog;
import com.tencent.could.huiyansdk.callback.LoggerInfoCallBack;
import com.tencent.could.huiyansdk.utils.C14093e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.e */
/* JADX INFO: loaded from: classes12.dex */
public class C14068e {

    /* JADX INFO: renamed from: a */
    public Map<String, Integer> f58289a = new HashMap();

    /* JADX INFO: renamed from: b */
    public Object f58290b = new Object();

    /* JADX INFO: renamed from: c */
    public LoggerInfoCallBack f58291c;

    /* JADX INFO: renamed from: d */
    public volatile Handler f58292d;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C14068e f58293a = new C14068e();
    }

    /* JADX INFO: renamed from: a */
    public final void m83520a(int i, String str, String str2) {
        if (i == 1) {
            if (C14093e.a.f58356a.f58354a) {
                AiLog.debug(str, str2);
            }
        } else if (i == 2) {
            if (C14093e.a.f58356a.f58354a) {
                AiLog.error(str, str2);
            }
        } else if (C14093e.a.f58356a.f58354a) {
            AiLog.debug(str, str2);
        }
        if (this.f58291c == null || this.f58292d == null) {
            return;
        }
        Message messageObtainMessage = this.f58292d.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = str2;
        this.f58292d.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: renamed from: a */
    public void m83519a() {
        if (this.f58291c == null || this.f58292d == null) {
            return;
        }
        Message messageObtainMessage = this.f58292d.obtainMessage();
        messageObtainMessage.what = 2;
        this.f58292d.sendMessage(messageObtainMessage);
    }
}
