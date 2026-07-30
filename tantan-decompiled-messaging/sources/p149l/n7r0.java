package p149l;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class n7r0 {

    /* JADX INFO: renamed from: a */
    public final byte[] f137543a = new byte[10];

    /* JADX INFO: renamed from: b */
    public boolean f137544b;

    /* JADX INFO: renamed from: c */
    public int f137545c;

    /* JADX INFO: renamed from: d */
    public long f137546d;

    /* JADX INFO: renamed from: e */
    public int f137547e;

    /* JADX INFO: renamed from: f */
    public int f137548f;

    /* JADX INFO: renamed from: g */
    public int f137549g;

    /* JADX INFO: renamed from: a */
    public final void m158157a(m7r0 m7r0Var, @Nullable a7r0 a7r0Var) {
        if (this.f137545c > 0) {
            m7r0Var.mo134530c(this.f137546d, this.f137547e, this.f137548f, this.f137549g, a7r0Var);
            this.f137545c = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m158158b() {
        this.f137544b = false;
        this.f137545c = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m158159c(m7r0 m7r0Var, long j, int i, int i2, int i3, @Nullable a7r0 a7r0Var) {
        if (this.f137549g > i2 + i3) {
            qkq0.m175383a("TrueHD chunk samples must be contiguous in the sample queue.");
            return;
        }
        if (this.f137544b) {
            int i4 = this.f137545c;
            int i5 = i4 + 1;
            this.f137545c = i5;
            if (i4 == 0) {
                this.f137546d = j;
                this.f137547e = i;
                this.f137548f = 0;
            }
            this.f137548f += i2;
            this.f137549g = i3;
            if (i5 >= 16) {
                m158157a(m7r0Var, a7r0Var);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m158160d(k5r0 k5r0Var) throws IOException {
        if (this.f137544b) {
            return;
        }
        k5r0Var.mo140055i(this.f137543a, 0, 10);
        k5r0Var.zzj();
        byte[] bArr = this.f137543a;
        int[] iArr = z3r0.f201396a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f137544b = true;
        }
    }
}
