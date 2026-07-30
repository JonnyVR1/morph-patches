package cn.shuzilm.core;

import android.content.Context;
import android.os.Build;

/* JADX INFO: renamed from: cn.shuzilm.core.e */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0813e implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f3815a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f3816b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ int f3817c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Listener f3818d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ Context f3819e;

    public RunnableC0813e(Context context, boolean z, int i, Listener listener, Context context2) {
        this.f3815a = context;
        this.f3816b = z;
        this.f3817c = i;
        this.f3818d = listener;
        this.f3819e = context2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            DUHelper.f3737h.lock();
            if (DUHelper.f3732c == null) {
                AIClient unused = DUHelper.f3732c = new AIClient(this.f3815a);
                if (this.f3816b) {
                    DUHelper.f3732c.asynAI(2);
                }
            }
            AIClient unused2 = DUHelper.f3732c;
            if (!AIClient.isf && this.f3816b) {
                DUHelper.f3732c.asynAI(2);
            }
            AIClient unused3 = DUHelper.f3732c;
            if (AIClient.isf || !this.f3816b) {
                String upperCase = Build.MANUFACTURER.toUpperCase();
                if (this.f3817c == 1) {
                    upperCase = "HUAWEI";
                }
                String strZZVTFJRA = DUHelper.zZVTFJRA(this.f3815a, DUHelper.f3732c.m4672cm(upperCase));
                if (strZZVTFJRA == null) {
                    strZZVTFJRA = "NA";
                }
                boolean zIsOaidCollectAllowed = DUHelper.f3732c.isOaidCollectAllowed(3);
                Listener listener = this.f3818d;
                if (zIsOaidCollectAllowed) {
                    listener.handler(strZZVTFJRA);
                } else {
                    listener.handler("NA");
                }
            } else {
                this.f3818d.handler("NA");
            }
            DUHelper.f3737h.unlock();
            DUHelper.m4740k(this.f3819e);
        } catch (Throwable th) {
            try {
                Listener listener2 = this.f3818d;
                if (listener2 != null) {
                    listener2.handler("NA");
                }
                th.printStackTrace();
            } finally {
                DUHelper.f3737h.unlock();
                DUHelper.m4740k(this.f3819e);
            }
        }
    }
}
