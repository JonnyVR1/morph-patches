package cn.shuzilm.core;

import android.content.Context;

/* JADX INFO: renamed from: cn.shuzilm.core.q */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0825q implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f3837a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f3838b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f3839c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f3840d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ Listener f3841e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ DUHelper f3842f;

    public RunnableC0825q(DUHelper dUHelper, Context context, String str, String str2, String str3, Listener listener) {
        this.f3842f = dUHelper;
        this.f3837a = context;
        this.f3838b = str;
        this.f3839c = str2;
        this.f3840d = str3;
        this.f3841e = listener;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String strM4712b = DUHelper.f3733d.m4712b(this.f3837a, this.f3838b, this.f3839c, this.f3840d);
            Listener listener = this.f3841e;
            if (listener != null) {
                listener.handler(strM4712b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
