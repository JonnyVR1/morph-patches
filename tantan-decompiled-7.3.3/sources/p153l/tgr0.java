package p153l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class tgr0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f174124a = new byte[10];

    /* JADX INFO: renamed from: b */
    public boolean f174125b;

    /* JADX INFO: renamed from: c */
    public int f174126c;

    /* JADX INFO: renamed from: d */
    public long f174127d;

    /* JADX INFO: renamed from: e */
    public int f174128e;

    /* JADX INFO: renamed from: f */
    public int f174129f;

    /* JADX INFO: renamed from: g */
    public int f174130g;

    /* JADX INFO: renamed from: a */
    public final void m191067a(sgr0 sgr0Var, @Nullable ggr0 ggr0Var) {
        if (this.f174126c > 0) {
            sgr0Var.mo99372c(this.f174127d, this.f174128e, this.f174129f, this.f174130g, ggr0Var);
            this.f174126c = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m191068b() {
        this.f174125b = false;
        this.f174126c = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m191069c(sgr0 sgr0Var, long j, int i, int i2, int i3, @Nullable ggr0 ggr0Var) {
        if (this.f174130g > i2 + i3) {
            wtq0.m207906a("TrueHD chunk samples must be contiguous in the sample queue.");
            return;
        }
        if (this.f174125b) {
            int i4 = this.f174126c;
            int i5 = i4 + 1;
            this.f174126c = i5;
            if (i4 == 0) {
                this.f174127d = j;
                this.f174128e = i;
                this.f174129f = 0;
            }
            this.f174129f += i2;
            this.f174130g = i3;
            if (i5 >= 16) {
                m191067a(sgr0Var, ggr0Var);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m191070d(qer0 qer0Var) throws IOException {
        if (this.f174125b) {
            return;
        }
        qer0Var.mo125317i(this.f174124a, 0, 10);
        qer0Var.zzj();
        byte[] bArr = this.f174124a;
        int[] iArr = fdr0.f98494a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f174125b = true;
        }
    }
}
