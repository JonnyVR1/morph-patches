package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p153l.u3d0;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.s */
/* JADX INFO: loaded from: classes.dex */
class C1092s {

    /* JADX INFO: renamed from: a */
    private boolean f4585a;

    /* JADX INFO: renamed from: b */
    private final Handler f4586b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.s$a */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((u3d0) message.obj).recycle();
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m5519a(u3d0<?> u3d0Var, boolean z) {
        try {
            if (this.f4585a || z) {
                this.f4586b.obtainMessage(1, u3d0Var).sendToTarget();
            } else {
                this.f4585a = true;
                u3d0Var.recycle();
                this.f4585a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
