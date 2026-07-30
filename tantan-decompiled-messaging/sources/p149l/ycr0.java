package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class ycr0 implements wcr0 {

    /* JADX INFO: renamed from: a */
    public final int f197477a;

    /* JADX INFO: renamed from: b */
    public final int f197478b;

    /* JADX INFO: renamed from: c */
    public final v6w0 f197479c;

    public ycr0(scr0 scr0Var, mhr0 mhr0Var) {
        v6w0 v6w0Var = scr0Var.f163765b;
        this.f197479c = v6w0Var;
        v6w0Var.m197262k(12);
        int iM197241E = v6w0Var.m197241E();
        if ("audio/raw".equals(mhr0Var.f133892l)) {
            int iM126044A = ggw0.m126044A(mhr0Var.f133874A, mhr0Var.f133905y);
            if (iM197241E == 0 || iM197241E % iM126044A != 0) {
                svv0.m186111f("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iM126044A + ", stsz sample size: " + iM197241E);
                iM197241E = iM126044A;
            }
        }
        this.f197477a = iM197241E == 0 ? -1 : iM197241E;
        this.f197478b = v6w0Var.m197241E();
    }

    @Override // p149l.wcr0
    public final int zza() {
        return this.f197477a;
    }

    @Override // p149l.wcr0
    public final int zzb() {
        return this.f197478b;
    }

    @Override // p149l.wcr0
    public final int zzc() {
        int i = this.f197477a;
        return i == -1 ? this.f197479c.m197241E() : i;
    }
}
