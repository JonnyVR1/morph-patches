package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class k8r0 extends v4r0 {
    public k8r0(final i6r0 i6r0Var, int i, long j, long j2) {
        long j3;
        Objects.requireNonNull(i6r0Var);
        s4r0 s4r0Var = new s4r0() { // from class: l.h8r0
            @Override // p149l.s4r0
            public final long zza(long j4) {
                return i6r0Var.m134637b(j4);
            }
        };
        j8r0 j8r0Var = new j8r0(i6r0Var, i, null);
        long jM134636a = i6r0Var.m134636a();
        long j4 = i6r0Var.f111768j;
        int i2 = i6r0Var.f111762d;
        if (i2 > 0) {
            j3 = ((((long) i2) + ((long) i6r0Var.f111761c)) / 2) + 1;
        } else {
            int i3 = i6r0Var.f111759a;
            long j5 = 4096;
            if (i3 == i6r0Var.f111760b && i3 > 0) {
                j5 = i3;
            }
            j3 = 64 + (((j5 * ((long) i6r0Var.f111765g)) * ((long) i6r0Var.f111766h)) / 8);
        }
        super(s4r0Var, j8r0Var, jM134636a, 0L, j4, j, j2, j3, Math.max(6, i6r0Var.f111761c));
    }
}
