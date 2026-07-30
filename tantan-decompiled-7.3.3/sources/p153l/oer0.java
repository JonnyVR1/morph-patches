package p153l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class oer0 implements sgr0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f147011a = new byte[4096];

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: a */
    public final void mo99370a(bgw0 bgw0Var, int i, int i2) {
        bgw0Var.m104270l(i);
    }

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: b */
    public final int mo99371b(nyy0 nyy0Var, int i, boolean z, int i2) throws IOException {
        int iMo12781a = nyy0Var.mo12781a(this.f147011a, 0, Math.min(4096, i));
        if (iMo12781a != -1) {
            return iMo12781a;
        }
        if (z) {
            return -1;
        }
        vg3.m201207a();
        return 0;
    }

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int mo99374e(nyy0 nyy0Var, int i, boolean z) {
        return fgr0.m125514a(this, nyy0Var, i, z);
    }

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo99375f(bgw0 bgw0Var, int i) {
        fgr0.m125515b(this, bgw0Var, i);
    }

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: d */
    public final void mo99373d(sqr0 sqr0Var) {
    }

    @Override // p153l.sgr0
    /* JADX INFO: renamed from: c */
    public final void mo99372c(long j, int i, int i2, int i3, @Nullable ggr0 ggr0Var) {
    }
}
