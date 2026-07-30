package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class der0 implements bgr0 {

    /* JADX INFO: renamed from: a */
    public final int f88076a;

    /* JADX INFO: renamed from: b */
    public final int[] f88077b;

    /* JADX INFO: renamed from: c */
    public final long[] f88078c;

    /* JADX INFO: renamed from: d */
    public final long[] f88079d;

    /* JADX INFO: renamed from: e */
    public final long[] f88080e;

    /* JADX INFO: renamed from: f */
    public final long f88081f;

    public der0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f88077b = iArr;
        this.f88078c = jArr;
        this.f88079d = jArr2;
        this.f88080e = jArr3;
        int length = iArr.length;
        this.f88076a = length;
        if (length <= 0) {
            this.f88081f = 0L;
        } else {
            int i = length - 1;
            this.f88081f = jArr2[i] + jArr3[i];
        }
    }

    @Override // p153l.bgr0
    /* JADX INFO: renamed from: a */
    public final zfr0 mo97719a(long j) {
        long[] jArr = this.f88080e;
        int iM159420r = mpw0.m159420r(jArr, j, true, true);
        cgr0 cgr0Var = new cgr0(jArr[iM159420r], this.f88078c[iM159420r]);
        if (cgr0Var.f81726a >= j || iM159420r == this.f88076a - 1) {
            return new zfr0(cgr0Var, cgr0Var);
        }
        int i = iM159420r + 1;
        return new zfr0(cgr0Var, new cgr0(this.f88080e[i], this.f88078c[i]));
    }

    public final String toString() {
        long[] jArr = this.f88079d;
        long[] jArr2 = this.f88080e;
        long[] jArr3 = this.f88078c;
        return "ChunkIndex(length=" + this.f88076a + ", sizes=" + Arrays.toString(this.f88077b) + ", offsets=" + Arrays.toString(jArr3) + ", timeUs=" + Arrays.toString(jArr2) + ", durationsUs=" + Arrays.toString(jArr) + ")";
    }

    @Override // p153l.bgr0
    public final long zza() {
        return this.f88081f;
    }

    @Override // p153l.bgr0
    public final boolean zzh() {
        return true;
    }
}
