package cn.shuzilm.core;

import android.content.Context;

/* JADX INFO: renamed from: cn.shuzilm.core.o */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0823o implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f3832a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f3833b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f3834c;

    public RunnableC0823o(Context context, String str, String str2) {
        this.f3832a = context;
        this.f3833b = str;
        this.f3834c = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            DUHelper.setConfig("apiKey", DUHelper.f3740k);
            DUHelper.f3733d.m4700a(this.f3832a, DUHelper.f3743n, this.f3833b);
            DUHelper.f3733d.m4705a(DUHelper.f3742m, this.f3834c);
            DUHelper.reportRun(this.f3832a, DUHelper.f3743n.toString(), DUHelper.f3742m.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }
}
