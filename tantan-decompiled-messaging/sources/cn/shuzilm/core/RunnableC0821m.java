package cn.shuzilm.core;

/* JADX INFO: renamed from: cn.shuzilm.core.m */
/* JADX INFO: loaded from: classes.dex */
class RunnableC0821m implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f3828a;

    public RunnableC0821m(int i) {
        this.f3828a = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (DUHelper.f3737h.tryLock()) {
            try {
                if (DUHelper.f3732c == null) {
                    AIClient unused = DUHelper.f3732c = new AIClient(DUHelper.mContext);
                }
                DUHelper.f3732c.asynAI(this.f3828a);
            } catch (Exception unused2) {
            } finally {
                DUHelper.f3737h.unlock();
            }
        }
    }
}
