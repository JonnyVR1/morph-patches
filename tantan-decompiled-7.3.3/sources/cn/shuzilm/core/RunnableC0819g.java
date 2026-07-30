package cn.shuzilm.core;

import android.content.Context;

/* JADX INFO: renamed from: cn.shuzilm.core.g */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0819g implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f3820a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f3821b;

    public RunnableC0819g(Context context, String str) {
        this.f3820a = context;
        this.f3821b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            DUHelper.dGZvcmRQ(this.f3820a, DUHelper.f3743n.toString(), this.f3821b);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }
}
