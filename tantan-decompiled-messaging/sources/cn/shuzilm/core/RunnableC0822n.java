package cn.shuzilm.core;

import android.content.Context;

/* JADX INFO: renamed from: cn.shuzilm.core.n */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0822n implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f3829a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f3830b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f3831c;

    public RunnableC0822n(Context context, String str, String str2) {
        this.f3829a = context;
        this.f3830b = str;
        this.f3831c = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            DUHelper.setConfig("apiKey", DUHelper.f3740k);
            DUHelper.f3733d.m4700a(this.f3829a, DUHelper.f3743n, this.f3830b);
            DUHelper.f3733d.m4705a(DUHelper.f3742m, this.f3831c);
            DUHelper.run(this.f3829a, DUHelper.f3743n.toString(), DUHelper.f3742m.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }
}
