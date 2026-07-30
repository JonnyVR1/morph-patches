package cn.shuzilm.core;

import android.content.Context;
import android.os.SystemClock;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: cn.shuzilm.core.d */
/* JADX INFO: loaded from: classes.dex */
class C0815d extends TimerTask {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f3771a;

    public C0815d(Context context) {
        this.f3771a = context;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        try {
            DUHelper unused = DUHelper.f3733d;
            if (DUHelper.f3734e <= 0) {
                DUHelper.f3733d.m4708a(this.f3771a, "DefaultChannel", "ZVTFJRA", (Listener) null, 2);
                SystemClock.sleep(20L);
            }
            if (DUHelper.f3754y != null) {
                DUHelper.f3754y.cancel();
                Timer unused2 = DUHelper.f3754y = null;
            }
        } catch (Throwable unused3) {
        }
    }
}
