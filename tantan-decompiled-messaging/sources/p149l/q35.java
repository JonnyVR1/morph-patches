package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class q35 implements hce0 {

    /* JADX INFO: renamed from: a */
    public final int f152375a;

    /* JADX INFO: renamed from: b */
    public final int[] f152376b;

    /* JADX INFO: renamed from: c */
    public final long[] f152377c;

    /* JADX INFO: renamed from: d */
    public final long[] f152378d;

    /* JADX INFO: renamed from: e */
    public final long[] f152379e;

    /* JADX INFO: renamed from: f */
    public final long f152380f;

    public q35(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f152376b = iArr;
        this.f152377c = jArr;
        this.f152378d = jArr2;
        this.f152379e = jArr3;
        int length = iArr.length;
        this.f152375a = length;
        if (length > 0) {
            this.f152380f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f152380f = 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m172741a(long j) {
        return vck0.m197863i(this.f152379e, j, true, true);
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: d */
    public hce0.C17274a mo98121d(long j) {
        int iM172741a = m172741a(j);
        jce0 jce0Var = new jce0(this.f152379e[iM172741a], this.f152377c[iM172741a]);
        if (jce0Var.f117295a >= j || iM172741a == this.f152375a - 1) {
            return new hce0.C17274a(jce0Var);
        }
        int i = iM172741a + 1;
        return new hce0.C17274a(jce0Var, new jce0(this.f152379e[i], this.f152377c[i]));
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: e */
    public boolean mo98122e() {
        return true;
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: i */
    public long mo98123i() {
        return this.f152380f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f152375a + ", sizes=" + Arrays.toString(this.f152376b) + ", offsets=" + Arrays.toString(this.f152377c) + ", timeUs=" + Arrays.toString(this.f152379e) + ", durationsUs=" + Arrays.toString(this.f152378d) + ")";
    }
}
