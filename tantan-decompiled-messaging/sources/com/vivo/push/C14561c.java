package com.vivo.push;

import android.os.Handler;
import android.os.Message;
import com.clevertap.android.sdk.Constants;
import com.vivo.push.util.C14647p;

/* JADX INFO: renamed from: com.vivo.push.c */
/* JADX INFO: loaded from: classes2.dex */
final class C14561c implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ServiceConnectionC14534b f60949a;

    public C14561c(ServiceConnectionC14534b serviceConnectionC14534b) {
        this.f60949a = serviceConnectionC14534b;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message == null) {
            C14647p.m85008a("AidlManager", "handleMessage error : msg is null");
            return false;
        }
        int i = message.what;
        if (i == 1) {
            C14647p.m85008a("AidlManager", "In connect, bind core service time out");
            if (this.f60949a.f60898f.get() == 2) {
                this.f60949a.m84733a(1);
            }
        } else if (i != 2) {
            C14647p.m85015b("AidlManager", "unknow msg what [" + message.what + Constants.AES_SUFFIX);
        } else {
            if (this.f60949a.f60898f.get() == 4) {
                this.f60949a.m84740f();
            }
            this.f60949a.m84733a(1);
        }
        return true;
    }
}
