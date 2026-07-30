package com.tencent.could.huiyansdk.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.could.huiyansdk.api.C14034a;
import com.tencent.could.huiyansdk.api.InterfaceC14040g;
import com.tencent.could.huiyansdk.manager.C14068e;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.l */
/* JADX INFO: loaded from: classes12.dex */
public class HandlerC14100l extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC14040g f58375a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC14100l(C14102n c14102n, Looper looper, InterfaceC14040g interfaceC14040g) {
        super(looper);
        this.f58375a = interfaceC14040g;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what == 1) {
            C14034a.m83402a().getClass();
            C14068e c14068e = C14068e.a.f58293a;
            c14068e.m83520a(2, "a", "do resume");
            YtSDKKitFramework.getInstance().doResume();
            C14099k c14099k = C14099k.b.f58374a;
            c14068e.m83520a(1, "TimeOutHelper", "timeout resume: " + c14099k.f58372d);
            c14099k.m83594a(c14099k.f58372d);
            InterfaceC14040g interfaceC14040g = this.f58375a;
            if (interfaceC14040g != null) {
                interfaceC14040g.onEndTransition();
            }
        }
    }
}
