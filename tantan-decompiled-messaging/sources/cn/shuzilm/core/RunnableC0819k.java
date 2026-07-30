package cn.shuzilm.core;

/* JADX INFO: renamed from: cn.shuzilm.core.k */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0819k implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            System.loadLibrary("du");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
