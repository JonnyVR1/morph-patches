package com.tencent.could.huiyansdk.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.could.huiyansdk.api.C13871a;
import com.tencent.could.huiyansdk.api.InterfaceC13877g;
import com.tencent.could.huiyansdk.manager.C13905e;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.l */
/* JADX INFO: loaded from: classes2.dex */
public class HandlerC13937l extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC13877g f57527a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC13937l(C13939n c13939n, Looper looper, InterfaceC13877g interfaceC13877g) {
        super(looper);
        this.f57527a = interfaceC13877g;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what == 1) {
            C13871a.m82219a().getClass();
            C13905e c13905e = C13905e.a.f57445a;
            c13905e.m82337a(2, "a", "do resume");
            YtSDKKitFramework.getInstance().doResume();
            C13936k c13936k = C13936k.b.f57526a;
            c13905e.m82337a(1, "TimeOutHelper", "timeout resume: " + c13936k.f57524d);
            c13936k.m82411a(c13936k.f57524d);
            InterfaceC13877g interfaceC13877g = this.f57527a;
            if (interfaceC13877g != null) {
                interfaceC13877g.onEndTransition();
            }
        }
    }
}
