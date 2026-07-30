package cn.shuzilm.core;

import android.content.Context;

/* JADX INFO: renamed from: cn.shuzilm.core.a */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0812a implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f3760a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f3761b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f3762c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f3763d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ Listener f3764e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ DUHelper f3765f;

    public RunnableC0812a(DUHelper dUHelper, Context context, String str, String str2, int i, Listener listener) {
        this.f3765f = dUHelper;
        this.f3760a = context;
        this.f3761b = str;
        this.f3762c = str2;
        this.f3763d = i;
        this.f3764e = listener;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            DUHelper unused = DUHelper.f3733d;
            DUHelper.m4742g();
            String strM4695a = DUHelper.f3733d.m4695a(this.f3760a, this.f3761b, this.f3762c, this.f3763d);
            if (this.f3764e != null) {
                if (strM4695a == null) {
                    strM4695a = this.f3765f.m4747i(this.f3760a);
                }
                this.f3764e.handler(strM4695a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
