package com.tencent.could.huiyansdk.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.g */
/* JADX INFO: loaded from: classes12.dex */
public class HandlerC14095g extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C14096h f58359a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC14095g(C14096h c14096h, Looper looper) {
        super(looper);
        this.f58359a = c14096h;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what == 1) {
            this.f58359a.m83589a();
            this.f58359a.m83591b();
        }
    }
}
