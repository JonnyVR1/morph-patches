package cn.shuzilm.core;

import android.content.Context;

/* JADX INFO: renamed from: cn.shuzilm.core.j */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0822j implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f3825a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Listener f3826b;

    public RunnableC0822j(Context context, Listener listener) {
        this.f3825a = context;
        this.f3826b = listener;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!DUHelper.f3733d.f3757D) {
                System.loadLibrary("du");
            }
        } catch (Throwable unused) {
        }
        C0816dl.m4794ia(this.f3825a);
        if (this.f3826b != null) {
            String strM4730c = DUHelper.m4730c(this.f3825a, 301, (String) null);
            if (strM4730c == null) {
                this.f3826b.handler("");
            } else {
                try {
                    strM4730c = strM4730c.replace('+', '-').replace('/', '_').replace("=", "");
                } catch (Exception unused2) {
                }
                this.f3826b.handler(strM4730c);
            }
        }
    }
}
