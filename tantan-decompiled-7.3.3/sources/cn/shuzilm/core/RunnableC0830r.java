package cn.shuzilm.core;

/* JADX INFO: renamed from: cn.shuzilm.core.r */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0830r implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f3843a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ DUHelper f3844b;

    public RunnableC0830r(DUHelper dUHelper, int i) {
        this.f3844b = dUHelper;
        this.f3843a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            DUHelper.getQueryID(DUHelper.mContext, "NA", "", false, 1, null, this.f3843a + 100);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
