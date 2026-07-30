package p153l;

/* JADX INFO: renamed from: l.j4 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC17867j4 extends kt2 implements ham {

    /* JADX INFO: renamed from: D */
    private long f118227D = -1;

    /* JADX INFO: renamed from: E */
    private long f118228E = -1;

    @Override // p153l.kt2, p153l.efj
    /* JADX INFO: renamed from: c */
    public void mo96079c(int i, hfj hfjVar, boolean z) {
        super.mo96079c(i, hfjVar, z);
        if (this.f118227D > -1 && this.f118228E != -1) {
            System.currentTimeMillis();
        }
        if (this.f118228E == -1) {
            this.f118228E = System.currentTimeMillis();
        }
    }

    @Override // p153l.ham
    public void setTimeStamp(long j) {
    }
}
