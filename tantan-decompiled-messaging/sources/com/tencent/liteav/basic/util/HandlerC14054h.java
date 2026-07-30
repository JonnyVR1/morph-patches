package com.tencent.liteav.basic.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.tencent.liteav.basic.util.h */
/* JADX INFO: loaded from: classes2.dex */
public class HandlerC14054h extends Handler {

    /* JADX INFO: renamed from: a */
    private int f58524a;

    /* JADX INFO: renamed from: b */
    private boolean f58525b;

    /* JADX INFO: renamed from: c */
    private a f58526c;

    /* JADX INFO: renamed from: com.tencent.liteav.basic.util.h$a */
    public interface a {
        void onTimeout();
    }

    public HandlerC14054h(Looper looper, a aVar) {
        super(looper);
        this.f58525b = false;
        this.f58526c = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m83065a(int i, int i2) {
        m83064a();
        this.f58524a = i2;
        this.f58525b = true;
        sendEmptyMessageDelayed(0, i);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar = this.f58526c;
        if (aVar != null) {
            aVar.onTimeout();
        }
        if (this.f58525b) {
            sendEmptyMessageDelayed(0, this.f58524a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83064a() {
        while (hasMessages(0)) {
            removeMessages(0);
        }
        this.f58525b = false;
    }
}
