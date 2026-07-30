package com.tencent.liteav.basic.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.tencent.liteav.basic.util.h */
/* JADX INFO: loaded from: classes2.dex */
public class HandlerC14217h extends Handler {

    /* JADX INFO: renamed from: a */
    private int f59372a;

    /* JADX INFO: renamed from: b */
    private boolean f59373b;

    /* JADX INFO: renamed from: c */
    private a f59374c;

    /* JADX INFO: renamed from: com.tencent.liteav.basic.util.h$a */
    public interface a {
        void onTimeout();
    }

    public HandlerC14217h(Looper looper, a aVar) {
        super(looper);
        this.f59373b = false;
        this.f59374c = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m84248a(int i, int i2) {
        m84247a();
        this.f59372a = i2;
        this.f59373b = true;
        sendEmptyMessageDelayed(0, i);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar = this.f59374c;
        if (aVar != null) {
            aVar.onTimeout();
        }
        if (this.f59373b) {
            sendEmptyMessageDelayed(0, this.f59372a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84247a() {
        while (hasMessages(0)) {
            removeMessages(0);
        }
        this.f59373b = false;
    }
}
