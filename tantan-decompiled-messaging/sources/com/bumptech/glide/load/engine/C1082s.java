package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p149l.rvc0;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.s */
/* JADX INFO: loaded from: classes.dex */
class C1082s {

    /* JADX INFO: renamed from: a */
    private boolean f4573a;

    /* JADX INFO: renamed from: b */
    private final Handler f4574b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.s$a */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((rvc0) message.obj).recycle();
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m5493a(rvc0<?> rvc0Var, boolean z) {
        try {
            if (this.f4573a || z) {
                this.f4574b.obtainMessage(1, rvc0Var).sendToTarget();
            } else {
                this.f4573a = true;
                rvc0Var.recycle();
                this.f4573a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
