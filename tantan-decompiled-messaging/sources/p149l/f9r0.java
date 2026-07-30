package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class f9r0 implements j5r0 {

    /* JADX INFO: renamed from: a */
    public final v6w0 f96519a = new v6w0(4);

    /* JADX INFO: renamed from: b */
    public final x6r0 f96520b = new x6r0(-1, -1, "image/heif");

    /* JADX INFO: renamed from: a */
    public final boolean m120118a(k5r0 k5r0Var, int i) throws IOException {
        this.f96519a.m197259h(4);
        ((z4r0) k5r0Var).mo140051c(this.f96519a.m197264m(), 0, 4, false);
        return this.f96519a.m197246J() == ((long) i);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        this.f96520b.mo100820c(j, j2);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        ((z4r0) k5r0Var).m217118j(4, false);
        return m120118a(k5r0Var, 1718909296) && m120118a(k5r0Var, 1751476579);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f96520b.mo100822e(m5r0Var);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        return this.f96520b.mo100823f(k5r0Var, s6r0Var);
    }
}
