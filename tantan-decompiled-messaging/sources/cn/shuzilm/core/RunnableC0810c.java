package cn.shuzilm.core;

import android.content.Context;

/* JADX INFO: renamed from: cn.shuzilm.core.c */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0810c implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f3769a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f3770b;

    public RunnableC0810c(String str, Context context) {
        this.f3769a = str;
        this.f3770b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            DUHelper.setConfig("f_pkg", this.f3769a);
            DUHelper.onIEvent(this.f3770b, DUHelper.f3743n.toString(), null, null);
        } catch (Exception e) {
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
    }
}
