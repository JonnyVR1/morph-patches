package p149l;

/* JADX INFO: renamed from: l.j4 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC17684j4 extends us2 implements r7m {

    /* JADX INFO: renamed from: D */
    private long f116124D = -1;

    /* JADX INFO: renamed from: E */
    private long f116125E = -1;

    @Override // p149l.us2, p149l.kcj
    /* JADX INFO: renamed from: c */
    public void mo102037c(int i, ncj ncjVar, boolean z) {
        super.mo102037c(i, ncjVar, z);
        if (this.f116124D > -1 && this.f116125E != -1) {
            System.currentTimeMillis();
        }
        if (this.f116125E == -1) {
            this.f116125E = System.currentTimeMillis();
        }
    }

    @Override // p149l.r7m
    public void setTimeStamp(long j) {
    }
}
