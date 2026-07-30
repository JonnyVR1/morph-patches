package p149l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class i5r0 implements m7r0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f111632a = new byte[4096];

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: a */
    public final void mo134528a(v6w0 v6w0Var, int i, int i2) {
        v6w0Var.m197263l(i);
    }

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: b */
    public final int mo134529b(hpy0 hpy0Var, int i, boolean z, int i2) throws IOException {
        int iMo12727a = hpy0Var.mo12727a(this.f111632a, 0, Math.min(4096, i));
        if (iMo12727a != -1) {
            return iMo12727a;
        }
        if (z) {
            return -1;
        }
        hg3.m130807a();
        return 0;
    }

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int mo134532e(hpy0 hpy0Var, int i, boolean z) {
        return z6r0.m217415a(this, hpy0Var, i, z);
    }

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo134533f(v6w0 v6w0Var, int i) {
        z6r0.m217416b(this, v6w0Var, i);
    }

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: d */
    public final void mo134531d(mhr0 mhr0Var) {
    }

    @Override // p149l.m7r0
    /* JADX INFO: renamed from: c */
    public final void mo134530c(long j, int i, int i2, int i3, @Nullable a7r0 a7r0Var) {
    }
}
