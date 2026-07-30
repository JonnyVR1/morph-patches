package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class x4r0 implements v6r0 {

    /* JADX INFO: renamed from: a */
    public final int f191047a;

    /* JADX INFO: renamed from: b */
    public final int[] f191048b;

    /* JADX INFO: renamed from: c */
    public final long[] f191049c;

    /* JADX INFO: renamed from: d */
    public final long[] f191050d;

    /* JADX INFO: renamed from: e */
    public final long[] f191051e;

    /* JADX INFO: renamed from: f */
    public final long f191052f;

    public x4r0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f191048b = iArr;
        this.f191049c = jArr;
        this.f191050d = jArr2;
        this.f191051e = jArr3;
        int length = iArr.length;
        this.f191047a = length;
        if (length <= 0) {
            this.f191052f = 0L;
        } else {
            int i = length - 1;
            this.f191052f = jArr2[i] + jArr3[i];
        }
    }

    @Override // p149l.v6r0
    /* JADX INFO: renamed from: a */
    public final t6r0 mo124628a(long j) {
        long[] jArr = this.f191051e;
        int iM126076r = ggw0.m126076r(jArr, j, true, true);
        w6r0 w6r0Var = new w6r0(jArr[iM126076r], this.f191049c[iM126076r]);
        if (w6r0Var.f184990a >= j || iM126076r == this.f191047a - 1) {
            return new t6r0(w6r0Var, w6r0Var);
        }
        int i = iM126076r + 1;
        return new t6r0(w6r0Var, new w6r0(this.f191051e[i], this.f191049c[i]));
    }

    public final String toString() {
        long[] jArr = this.f191050d;
        long[] jArr2 = this.f191051e;
        long[] jArr3 = this.f191049c;
        return "ChunkIndex(length=" + this.f191047a + ", sizes=" + Arrays.toString(this.f191048b) + ", offsets=" + Arrays.toString(jArr3) + ", timeUs=" + Arrays.toString(jArr2) + ", durationsUs=" + Arrays.toString(jArr) + ")";
    }

    @Override // p149l.v6r0
    public final long zza() {
        return this.f191052f;
    }

    @Override // p149l.v6r0
    public final boolean zzh() {
        return true;
    }
}
