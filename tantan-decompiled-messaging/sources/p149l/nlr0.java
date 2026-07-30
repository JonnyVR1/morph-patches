package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class nlr0 implements j5r0 {

    /* JADX INFO: renamed from: a */
    public final v6w0 f139579a = new v6w0(4);

    /* JADX INFO: renamed from: b */
    public final x6r0 f139580b = new x6r0(-1, -1, "image/webp");

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        this.f139580b.mo100820c(j, j2);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        this.f139579a.m197259h(4);
        z4r0 z4r0Var = (z4r0) k5r0Var;
        z4r0Var.mo140051c(this.f139579a.m197264m(), 0, 4, false);
        if (this.f139579a.m197246J() == 1380533830) {
            z4r0Var.m217118j(4, false);
            this.f139579a.m197259h(4);
            z4r0Var.mo140051c(this.f139579a.m197264m(), 0, 4, false);
            if (this.f139579a.m197246J() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f139580b.mo100822e(m5r0Var);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        return this.f139580b.mo100823f(k5r0Var, s6r0Var);
    }
}
