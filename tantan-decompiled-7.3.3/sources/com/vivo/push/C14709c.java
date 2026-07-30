package com.vivo.push;

import android.os.Handler;
import android.os.Message;
import com.clevertap.android.sdk.Constants;
import com.vivo.push.util.C14795p;

/* JADX INFO: renamed from: com.vivo.push.c */
/* JADX INFO: loaded from: classes2.dex */
final class C14709c implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ServiceConnectionC14682b f61796a;

    public C14709c(ServiceConnectionC14682b serviceConnectionC14682b) {
        this.f61796a = serviceConnectionC14682b;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message == null) {
            C14795p.m86179a("AidlManager", "handleMessage error : msg is null");
            return false;
        }
        int i = message.what;
        if (i == 1) {
            C14795p.m86179a("AidlManager", "In connect, bind core service time out");
            if (this.f61796a.f61745f.get() == 2) {
                this.f61796a.m85904a(1);
            }
        } else if (i != 2) {
            C14795p.m86186b("AidlManager", "unknow msg what [" + message.what + Constants.AES_SUFFIX);
        } else {
            if (this.f61796a.f61745f.get() == 4) {
                this.f61796a.m85911f();
            }
            this.f61796a.m85904a(1);
        }
        return true;
    }
}
