package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class yru0 extends dru0 implements ggu0 {

    /* JADX INFO: renamed from: f */
    public ggu0 f201356f;

    /* JADX INFO: renamed from: k */
    public final synchronized void m217234k(har0 har0Var, yns0 yns0Var, joy0 joy0Var, aos0 aos0Var, rar0 rar0Var, ggu0 ggu0Var) {
        super.m117709i(har0Var, yns0Var, joy0Var, aos0Var, rar0Var);
        this.f201356f = ggu0Var;
    }

    @Override // p153l.ggu0
    public final synchronized void zzbo() {
        ggu0 ggu0Var = this.f201356f;
        if (ggu0Var != null) {
            ggu0Var.zzbo();
        }
    }

    @Override // p153l.ggu0
    public final synchronized void zzs() {
        ggu0 ggu0Var = this.f201356f;
        if (ggu0Var != null) {
            ggu0Var.zzs();
        }
    }
}
