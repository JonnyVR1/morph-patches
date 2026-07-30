package com.tencent.could.huiyansdk.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.g */
/* JADX INFO: loaded from: classes2.dex */
public class HandlerC13932g extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C13933h f57511a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC13932g(C13933h c13933h, Looper looper) {
        super(looper);
        this.f57511a = c13933h;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what == 1) {
            this.f57511a.m82406a();
            this.f57511a.m82408b();
        }
    }
}
